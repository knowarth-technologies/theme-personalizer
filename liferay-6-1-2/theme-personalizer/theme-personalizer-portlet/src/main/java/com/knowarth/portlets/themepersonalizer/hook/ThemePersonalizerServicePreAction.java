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
package com.knowarth.portlets.themepersonalizer.hook;

import com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme;
import com.knowarth.portlets.themepersonalizer.service.UserPersonalizedThemeLocalServiceUtil;
import com.liferay.portal.kernel.events.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.ThemeLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.kernel.servlet.BrowserSnifferUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.ColorScheme;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.Theme;

public class ThemePersonalizerServicePreAction extends Action {
	/*
	 * (non-Java-doc)
	 * 
	 * @see com.liferay.portal.kernel.events.Action#Action()
	 */
	public ThemePersonalizerServicePreAction() {
		super();
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see com.liferay.portal.kernel.events.Action#run(HttpServletRequest
	 * request, HttpServletResponse response)
	 */
	public void run(HttpServletRequest request, HttpServletResponse response)
			throws ActionException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);
		if (themeDisplay.isSignedIn()) {
			Layout layout = themeDisplay.getLayout();
		

			try {

				boolean wapTheme = BrowserSnifferUtil.isWap(request);
				if (layout != null && !layout.isTypeControlPanel() && !wapTheme) {
					
					long userId = themeDisplay.getUserId();
					Theme theme = themeDisplay.getTheme();
					ColorScheme colorScheme = themeDisplay.getColorScheme();

					UserPersonalizedTheme userPersonalTheme;

					userPersonalTheme = UserPersonalizedThemeLocalServiceUtil
							.findByUserIDAndLayoutId(
									themeDisplay.getCompanyId(), userId,
									layout.getLayoutId());
					if (Validator.isNotNull(userPersonalTheme)) {
						theme = ThemeLocalServiceUtil.fetchTheme(
								themeDisplay.getCompanyId(),
								userPersonalTheme.getThemeId());
						if (Validator.isNotNull(theme)) {
							colorScheme = ThemeLocalServiceUtil.getColorScheme(
									themeDisplay.getCompanyId(),
									theme.getThemeId(),
									userPersonalTheme.getColorSchemeId(),
									wapTheme);

							request.setAttribute(WebKeys.THEME, theme);
							request.setAttribute("COLOR_SCHEME", colorScheme);
							themeDisplay.setLookAndFeel(theme, colorScheme);
						}
					}
				}

			} catch (SystemException e) {
				_log.error("Error setting personalized theme information", e);
			}

		}

	}

	private static Log _log = LogFactoryUtil
			.getLog(ThemePersonalizerServicePreAction.class);
}