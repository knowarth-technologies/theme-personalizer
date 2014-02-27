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

import com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme;
import com.knowarth.portlets.themepersonalizer.service.base.AvailablePersonalizedThemeLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the available personalized theme local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.knowarth.portlets.themepersonalizer.service.AvailablePersonalizedThemeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Samir Bhatt
 * @see com.knowarth.portlets.themepersonalizer.service.base.AvailablePersonalizedThemeLocalServiceBaseImpl
 * @see com.knowarth.portlets.themepersonalizer.service.AvailablePersonalizedThemeLocalServiceUtil
 */
public class AvailablePersonalizedThemeLocalServiceImpl
	extends AvailablePersonalizedThemeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.knowarth.portlets.themepersonalizer.service.AvailablePersonalizedThemeLocalServiceUtil} to access the available personalized theme local service.
	 */
	public AvailablePersonalizedTheme addAvailablePersonalizedTheme(
			long companyId,String themeId)
			throws SystemException {
		long id= counterLocalService.increment();
		AvailablePersonalizedTheme availablePersonalizedTheme= availablePersonalizedThemePersistence.create(id);
		availablePersonalizedTheme.setCompanyId(companyId);
		availablePersonalizedTheme.setThemeId(themeId);
		availablePersonalizedThemePersistence.update(availablePersonalizedTheme,false);
		return availablePersonalizedTheme;		
	}
	
	public void removeAllByCompanyId(long companyId) throws SystemException {
		availablePersonalizedThemePersistence.removeByCompanyId(companyId);
	}
	
	public List<AvailablePersonalizedTheme> findAllByCompanyId(long companyId) throws SystemException {
		return availablePersonalizedThemePersistence.findByCompanyId(companyId);
	}
}