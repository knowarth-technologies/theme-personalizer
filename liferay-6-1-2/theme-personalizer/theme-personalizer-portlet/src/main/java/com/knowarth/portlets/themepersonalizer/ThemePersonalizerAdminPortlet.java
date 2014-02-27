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
import java.util.ArrayList;
import java.util.List;

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

import com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme;
import com.knowarth.portlets.themepersonalizer.service.AvailablePersonalizedThemeLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.KeyValuePairComparator;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Theme;
import com.liferay.portal.service.ThemeLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;

public class ThemePersonalizerAdminPortlet extends GenericPortlet {

	private String viewJSP;

	@Override
	public void init() throws PortletException {

		viewJSP = getInitParameter("view-jsp");
	}

	@Override
	protected void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws PortletException, IOException {

		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest
					.getAttribute(WebKeys.THEME_DISPLAY);

			List selectedThemeIdList = new ArrayList();

			List<AvailablePersonalizedTheme> selectedPersonalizedThemes = AvailablePersonalizedThemeLocalServiceUtil
					.findAllByCompanyId(themeDisplay.getCompanyId());
			List<String> selectedThemeIds = new ArrayList<String>();
			for (AvailablePersonalizedTheme selectedPersonalizedTheme : selectedPersonalizedThemes) {
				Theme themeObject = ThemeLocalServiceUtil.fetchTheme(
						themeDisplay.getCompanyId(),
						selectedPersonalizedTheme.getThemeId());
				if(Validator.isNotNull(themeObject)){
					selectedThemeIdList.add(new KeyValuePair(themeObject
							.getThemeId(), themeObject.getName()));
					selectedThemeIds.add(themeObject.getThemeId());
				}
			}
			List availableThemeIdsList = new ArrayList();

			List<Theme> themes = ThemeLocalServiceUtil.getThemes(themeDisplay
					.getCompanyId());

			for (Theme themeObject : themes) {
				if (!selectedThemeIds.contains(themeObject.getThemeId())
						&& !themeObject.isWapTheme()) {
					availableThemeIdsList.add(new KeyValuePair(themeObject
							.getThemeId(), themeObject.getName()));
				}
			}

			availableThemeIdsList = ListUtil.sort(availableThemeIdsList,
					new KeyValuePairComparator(false, true));
			renderRequest.setAttribute("selectedThemeIdList",
					selectedThemeIdList);
			renderRequest.setAttribute("availableThemeIdsList",
					availableThemeIdsList);
		} catch (SystemException e) {
			SessionErrors.add(renderRequest,
					"system-error-please-contact-adminstrator");
			_log.error("Error retriving available theme information", e);
		}
		include(viewJSP, renderRequest, renderResponse);

	}

	@ProcessAction(name = "saveAvailableThemes")
	public void saveAction(ActionRequest request, ActionResponse response) {
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) request
					.getAttribute(WebKeys.THEME_DISPLAY);

			String themesIdsString = ParamUtil.getString(request,
					"selectedThemeIds");

			AvailablePersonalizedThemeLocalServiceUtil
					.removeAllByCompanyId(themeDisplay.getCompanyId());

			if(Validator.isNotNull(themesIdsString)){
				String[] themeIds = themesIdsString.split(",");			
				for (String themeId : themeIds) {
					AvailablePersonalizedThemeLocalServiceUtil
							.addAvailablePersonalizedTheme(
									themeDisplay.getCompanyId(), themeId);
				}
			}
			SessionMessages.add(request,
					"available-theme-changes-saved-successfully");
		} catch (SystemException e) {
			SessionErrors.add(request,
					"system-error-please-contact-adminstrator");
			_log.error("Error persisting available theme information", e);
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

	private static Log _log = LogFactoryUtil
			.getLog(ThemePersonalizerAdminPortlet.class);
}
