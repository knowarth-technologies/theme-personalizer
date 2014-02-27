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

import com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing UserPersonalizedTheme in entity cache.
 *
 * @author Samir Bhatt
 * @see UserPersonalizedTheme
 * @generated
 */
public class UserPersonalizedThemeCacheModel implements CacheModel<UserPersonalizedTheme>,
    Serializable {
    public long id;
    public long userId;
    public long layoutId;
    public String themeId;
    public String colorSchemeId;
    public boolean applyForAllPages;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{id=");
        sb.append(id);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", layoutId=");
        sb.append(layoutId);
        sb.append(", themeId=");
        sb.append(themeId);
        sb.append(", colorSchemeId=");
        sb.append(colorSchemeId);
        sb.append(", applyForAllPages=");
        sb.append(applyForAllPages);
        sb.append("}");

        return sb.toString();
    }

    public UserPersonalizedTheme toEntityModel() {
        UserPersonalizedThemeImpl userPersonalizedThemeImpl = new UserPersonalizedThemeImpl();

        userPersonalizedThemeImpl.setId(id);
        userPersonalizedThemeImpl.setUserId(userId);
        userPersonalizedThemeImpl.setLayoutId(layoutId);

        if (themeId == null) {
            userPersonalizedThemeImpl.setThemeId(StringPool.BLANK);
        } else {
            userPersonalizedThemeImpl.setThemeId(themeId);
        }

        if (colorSchemeId == null) {
            userPersonalizedThemeImpl.setColorSchemeId(StringPool.BLANK);
        } else {
            userPersonalizedThemeImpl.setColorSchemeId(colorSchemeId);
        }

        userPersonalizedThemeImpl.setApplyForAllPages(applyForAllPages);

        userPersonalizedThemeImpl.resetOriginalValues();

        return userPersonalizedThemeImpl;
    }
}
