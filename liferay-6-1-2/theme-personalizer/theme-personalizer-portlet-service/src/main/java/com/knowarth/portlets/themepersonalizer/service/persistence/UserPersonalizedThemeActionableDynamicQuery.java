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
package com.knowarth.portlets.themepersonalizer.service.persistence;

import com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme;
import com.knowarth.portlets.themepersonalizer.service.UserPersonalizedThemeLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Samir Bhatt
 * @generated
 */
public abstract class UserPersonalizedThemeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserPersonalizedThemeActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(UserPersonalizedThemeLocalServiceUtil.getService());
        setClass(UserPersonalizedTheme.class);

        setClassLoader(com.knowarth.portlets.themepersonalizer.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
