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

package com.knowarth.portlets.themepersonalizer.service.impl;

import java.util.List;

import com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme;
import com.knowarth.portlets.themepersonalizer.service.base.UserPersonalizedThemeLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the user personalized theme local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.knowarth.portlets.themepersonalizer.service.UserPersonalizedThemeLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Samir Bhatt
 * @see com.knowarth.portlets.themepersonalizer.service.base.UserPersonalizedThemeLocalServiceBaseImpl
 * @see com.knowarth.portlets.themepersonalizer.service.UserPersonalizedThemeLocalServiceUtil
 */
public class UserPersonalizedThemeLocalServiceImpl extends
		UserPersonalizedThemeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.knowarth.portlets
	 * .themepersonalizer.service.UserPersonalizedThemeLocalServiceUtil} to
	 * access the user personalized theme local service.
	 */

	public UserPersonalizedTheme addUserPersonalizedTheme(long userId,
			long layoutId, String themeId, String colorSchemeId,
			boolean applyForAllPages) throws SystemException {
		UserPersonalizedTheme userPersonalizedTheme = null;

		if (applyForAllPages) {
			userPersonalizedThemePersistence.removeByUserIdAndApplyForAllPages(
					userId, false);
			List<UserPersonalizedTheme> userPersonalizedThemes = userPersonalizedThemePersistence
					.findByUserIdAndApplyForAllPages(userId, applyForAllPages);
			if (userPersonalizedThemes.size() > 0) {
				userPersonalizedTheme = userPersonalizedThemes.get(0);
			} else {
				long id = counterLocalService.increment();
				userPersonalizedTheme = userPersonalizedThemePersistence
						.create(id);
			}
		} else {
			List<UserPersonalizedTheme> userPersonalizedThemes = userPersonalizedThemePersistence
					.findByUserIdAndLayoutId(userId, layoutId);
			if (userPersonalizedThemes.size() > 0) {
				userPersonalizedTheme = userPersonalizedThemes.get(0);
			} else {
				long id = counterLocalService.increment();
				userPersonalizedTheme = userPersonalizedThemePersistence
						.create(id);
			}
		}
		userPersonalizedTheme.setUserId(userId);
		userPersonalizedTheme.setLayoutId(layoutId);
		userPersonalizedTheme.setThemeId(themeId);
		userPersonalizedTheme.setColorSchemeId(colorSchemeId);
		userPersonalizedTheme.setApplyForAllPages(applyForAllPages);
		userPersonalizedThemePersistence.update(userPersonalizedTheme, false);
		return userPersonalizedTheme;
	}

	public UserPersonalizedTheme findByUserIDAndLayoutId(long companyId,
			long userId, long layoutId) throws SystemException {
		List<UserPersonalizedTheme> userPersonalizedThemes = userPersonalizedThemePersistence
				.findByUserIdAndLayoutId(userId, layoutId);
		if (userPersonalizedThemes.isEmpty()) {
			userPersonalizedThemes = userPersonalizedThemePersistence
					.findByUserIdAndApplyForAllPages(userId, true);
		}
		if (!userPersonalizedThemes.isEmpty()
				&& availablePersonalizedThemePersistence
						.countByCompanyIdAndThemeId(companyId,
								userPersonalizedThemes.get(0).getThemeId()) > 0) {
			return userPersonalizedThemes.get(0);

		} else {
			return null;
		}
	}
}