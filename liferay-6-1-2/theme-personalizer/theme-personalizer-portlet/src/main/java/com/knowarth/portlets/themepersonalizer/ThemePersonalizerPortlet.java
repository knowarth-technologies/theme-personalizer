/**
 * Copyright (c) 2014 KNOWARTH Technologies Pvt. Ltd. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.knowarth.portlets.themepersonalizer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletResponse;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme;
import com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme;
import com.knowarth.portlets.themepersonalizer.service.AvailablePersonalizedThemeLocalServiceUtil;
import com.knowarth.portlets.themepersonalizer.service.UserPersonalizedThemeLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.ColorScheme;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.Theme;
import com.liferay.portal.service.ThemeLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.PortletURLUtil;

public class ThemePersonalizerPortlet extends GenericPortlet {

	private String viewJSP;

	@Override
	public void init() throws PortletException {

		viewJSP = getInitParameter("view-jsp");
	}

	private Map<String, String> retrieveAvailableThemesMap(long companyId)
			throws SystemException {
		Map<String, String> availableThemesMap = new HashMap<String, String>();
		List<AvailablePersonalizedTheme> availablePersonalizedThemes = AvailablePersonalizedThemeLocalServiceUtil
				.findAllByCompanyId(companyId);
		for (AvailablePersonalizedTheme availablePersonalizedTheme : availablePersonalizedThemes) {
			Theme themeObject = ThemeLocalServiceUtil.fetchTheme(companyId,
					availablePersonalizedTheme.getThemeId());
			if (Validator.isNotNull(themeObject)) {
				availableThemesMap.put(themeObject.getThemeId(),
						themeObject.getName());
			}
		}
		return availableThemesMap;
	}

	private void setDefaults(PortletRequest portletRequest, long companyId,
			Map<String, String> availableThemes) {
		String selectedThemeId = "";
		String selectedColorSchemeId = "";
		boolean applyForAllPages = false;
		if (Validator.isNotNull(availableThemes) && !availableThemes.isEmpty()) {
			selectedThemeId = availableThemes.keySet().iterator().next();
			Theme themeObject = ThemeLocalServiceUtil.fetchTheme(companyId,
					selectedThemeId);
			portletRequest.setAttribute(PARAM_AVAILABLE_THEMES,
					availableThemes);			
			if (Validator.isNotNull(themeObject)) {

				if (themeObject.getColorSchemesMap().keySet().size() > 0) {
					selectedColorSchemeId = themeObject.getColorSchemesMap()
							.keySet().iterator().next();
					portletRequest.setAttribute(
							PARAM_SELECTED_COLOR_SCHEME_ID,
							themeObject.getColorSchemesMap().get(
									selectedColorSchemeId));
				}
				portletRequest.setAttribute(PARAM_SELECTED_THEME_ID,
						themeObject.getThemeId());

				portletRequest.setAttribute(PARAM_APPLY_FOR_ALL_PAGES,
						String.valueOf(applyForAllPages));
				portletRequest.setAttribute(PARAM_AVAILABLE_COLOR_SCHEMES,
						themeObject.getColorSchemesMap());
			}
		}
	}

	private void setPersonalizedThemeParams(PortletRequest portletRequest,
			long companyId, Map<String, String> availableThemes,
			UserPersonalizedTheme userPersonalTheme) {

		String selectedThemeId = userPersonalTheme.getThemeId();
		String selectedColorSchemeId = userPersonalTheme.getColorSchemeId();
		boolean applyForAllPages = userPersonalTheme.getApplyForAllPages();
		Theme themeObject = ThemeLocalServiceUtil.fetchTheme(companyId,
				selectedThemeId);
		portletRequest
		.setAttribute(PARAM_AVAILABLE_THEMES, availableThemes);		
		if (Validator.isNotNull(themeObject)) {
			portletRequest.setAttribute(PARAM_SELECTED_THEME_ID,
					themeObject.getThemeId());
			if (themeObject.getColorSchemesMap().containsKey(
					selectedColorSchemeId)) {
				portletRequest.setAttribute(
						PARAM_SELECTED_COLOR_SCHEME_ID,
						themeObject.getColorSchemesMap().get(
								selectedColorSchemeId));
			}
			portletRequest.setAttribute(PARAM_APPLY_FOR_ALL_PAGES,
					String.valueOf(applyForAllPages));
			portletRequest.setAttribute(PARAM_AVAILABLE_COLOR_SCHEMES,
					themeObject.getColorSchemesMap());
		}

	}

	@Override
	protected void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws PortletException, IOException {

		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest
					.getAttribute(WebKeys.THEME_DISPLAY);

			if (!themeDisplay.isSignedIn()) {
				renderRequest.setAttribute(
						WebKeys.PORTLET_CONFIGURATOR_VISIBILITY, Boolean.FALSE);
			} else {
				Map<String, String> availableThemesMap = retrieveAvailableThemesMap(themeDisplay
						.getCompanyId());
				Layout layout = themeDisplay.getLayout();
				UserPersonalizedTheme userPersonalTheme = UserPersonalizedThemeLocalServiceUtil
						.findByUserIDAndLayoutId(themeDisplay.getCompanyId(),
								themeDisplay.getUserId(), layout.getLayoutId());
				if (Validator.isNotNull(userPersonalTheme)) {
					setPersonalizedThemeParams(renderRequest,
							themeDisplay.getCompanyId(), availableThemesMap,
							userPersonalTheme);
				} else {
					setDefaults(renderRequest, themeDisplay.getCompanyId(),
							availableThemesMap);
				}

			}

		} catch (SystemException e) {
			SessionErrors.add(renderRequest,
					"system-error-please-contact-adminstrator");
			_log.error("Error retrieving personalized theme information", e);
		}
		include(viewJSP, renderRequest, renderResponse);

	}

	@ProcessAction(name = "savePersonalizedTheme")
	public void saveAction(ActionRequest request, ActionResponse response)
			throws IOException {
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) request
					.getAttribute(WebKeys.THEME_DISPLAY);

			String selectedThemeId = ParamUtil.getString(request, PARAM_SELECTED_THEME_ID);

			String selectedColorSchemeId = ParamUtil.getString(request,
					PARAM_SELECTED_COLOR_SCHEME_ID);
			boolean applyForAllPages = ParamUtil.getBoolean(request,
					PARAM_APPLY_FOR_ALL_PAGES);

			UserPersonalizedThemeLocalServiceUtil.addUserPersonalizedTheme(
					themeDisplay.getUserId(), themeDisplay.getLayout()
							.getLayoutId(), selectedThemeId,
					selectedColorSchemeId, applyForAllPages);
			SessionMessages.add(request,
					"theme-personalization-changes-saved-scucessfully");
			sendRedirect(request, response);

		} catch (SystemException e) {
			SessionErrors.add(request,
					"system-error-please-contact-adminstrator");
			_log.error("Error persisting personalized theme information", e);
		}
	}

	@ProcessAction(name = "resetPersonalizedTheme")
	public void resetAction(ActionRequest request, ActionResponse response)
			throws IOException {
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) request
					.getAttribute(WebKeys.THEME_DISPLAY);

			UserPersonalizedTheme userPersonalizedTheme = UserPersonalizedThemeLocalServiceUtil
					.findByUserIDAndLayoutId(themeDisplay.getCompanyId(),
							themeDisplay.getUserId(), themeDisplay.getLayout()
									.getLayoutId());
			UserPersonalizedThemeLocalServiceUtil
					.deleteUserPersonalizedTheme(userPersonalizedTheme);
			SessionMessages.add(request,
					"theme-personalization-restored-to-default");
			sendRedirect(request, response);

		} catch (SystemException e) {
			SessionErrors.add(request,
					"system-error-please-contact-adminstrator");
			_log.error("Error removing personalized theme information", e);
		}
	}

	protected void include(String path, PortletRequest portletRequest,
			PortletResponse portletResponse) throws IOException,
			PortletException {

		PortletContext portletContext = getPortletContext();

		PortletRequestDispatcher portletRequestDispatcher = portletContext
				.getRequestDispatcher(path);

		if (portletRequestDispatcher == null) {
			_log.error(path + " is not a valid include");
		} else {
			portletRequestDispatcher.include(portletRequest, portletResponse);
		}
	}

	@Override
	public void serveResource(ResourceRequest request, ResourceResponse response)
			throws PortletException, IOException {
		response.setContentType("text/html");
		JSONArray array = JSONFactoryUtil.createJSONArray();
		String themeId = request.getParameter(PARAM_SELECTED_THEME_ID);
		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		Theme themeObject = ThemeLocalServiceUtil.fetchTheme(
				themeDisplay.getCompanyId(), themeId);
		if (Validator.isNotNull(themeObject)) {
			Map<String, ColorScheme> colorSchemeMap = themeObject
					.getColorSchemesMap();
			for (String colorSchemeId : colorSchemeMap.keySet()) {
				JSONObject colorScheme = JSONFactoryUtil.createJSONObject();
				colorScheme.put("colorSchemeId", colorSchemeId);
				colorScheme.put("colorSchemeName",
						colorSchemeMap.get(colorSchemeId).getName());
				array.put(colorScheme);
			}
		}
		PrintWriter writer = response.getWriter();
		writer.write(array.toString());
	}

	protected String getRedirect(ActionRequest actionRequest,
			ActionResponse actionResponse) {

		String redirect = (String) actionRequest.getAttribute(WebKeys.REDIRECT);

		if (Validator.isNull(redirect)) {
			redirect = ParamUtil.getString(actionRequest, "redirect");
		}

		return redirect;
	}

	protected void sendRedirect(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {

		String redirect = getRedirect(actionRequest, actionResponse);

		if (Validator.isNotNull(redirect)) {
			actionResponse.sendRedirect(redirect);
		}
	}

	public static final String PARAM_SELECTED_THEME_ID = "selectedThemeId";
	public static final String PARAM_SELECTED_COLOR_SCHEME_ID = "selectedColorSchemeId";
	public static final String PARAM_APPLY_FOR_ALL_PAGES = "applyForAllPages";
	public static final String PARAM_AVAILABLE_COLOR_SCHEMES = "availableColorSchemes";
	public static final String PARAM_AVAILABLE_THEMES = "availableThems";

	private static Log _log = LogFactoryUtil
			.getLog(ThemePersonalizerPortlet.class);
}
