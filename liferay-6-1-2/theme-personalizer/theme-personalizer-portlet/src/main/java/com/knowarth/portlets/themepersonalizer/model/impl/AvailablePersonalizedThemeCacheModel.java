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
package com.knowarth.portlets.themepersonalizer.model.impl;

import com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing AvailablePersonalizedTheme in entity cache.
 *
 * @author Samir Bhatt
 * @see AvailablePersonalizedTheme
 * @generated
 */
public class AvailablePersonalizedThemeCacheModel implements CacheModel<AvailablePersonalizedTheme>,
    Serializable {
    public long id;
    public long companyId;
    public String themeId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{id=");
        sb.append(id);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", themeId=");
        sb.append(themeId);
        sb.append("}");

        return sb.toString();
    }

    public AvailablePersonalizedTheme toEntityModel() {
        AvailablePersonalizedThemeImpl availablePersonalizedThemeImpl = new AvailablePersonalizedThemeImpl();

        availablePersonalizedThemeImpl.setId(id);
        availablePersonalizedThemeImpl.setCompanyId(companyId);

        if (themeId == null) {
            availablePersonalizedThemeImpl.setThemeId(StringPool.BLANK);
        } else {
            availablePersonalizedThemeImpl.setThemeId(themeId);
        }

        availablePersonalizedThemeImpl.resetOriginalValues();

        return availablePersonalizedThemeImpl;
    }
}
