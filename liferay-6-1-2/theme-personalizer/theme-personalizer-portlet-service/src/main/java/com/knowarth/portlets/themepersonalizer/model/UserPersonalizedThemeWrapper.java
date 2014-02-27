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
package com.knowarth.portlets.themepersonalizer.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserPersonalizedTheme}.
 * </p>
 *
 * @author    Samir Bhatt
 * @see       UserPersonalizedTheme
 * @generated
 */
public class UserPersonalizedThemeWrapper implements UserPersonalizedTheme,
    ModelWrapper<UserPersonalizedTheme> {
    private UserPersonalizedTheme _userPersonalizedTheme;

    public UserPersonalizedThemeWrapper(
        UserPersonalizedTheme userPersonalizedTheme) {
        _userPersonalizedTheme = userPersonalizedTheme;
    }

    public Class<?> getModelClass() {
        return UserPersonalizedTheme.class;
    }

    public String getModelClassName() {
        return UserPersonalizedTheme.class.getName();
    }

    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("userId", getUserId());
        attributes.put("layoutId", getLayoutId());
        attributes.put("themeId", getThemeId());
        attributes.put("colorSchemeId", getColorSchemeId());
        attributes.put("applyForAllPages", getApplyForAllPages());

        return attributes;
    }

    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Long layoutId = (Long) attributes.get("layoutId");

        if (layoutId != null) {
            setLayoutId(layoutId);
        }

        String themeId = (String) attributes.get("themeId");

        if (themeId != null) {
            setThemeId(themeId);
        }

        String colorSchemeId = (String) attributes.get("colorSchemeId");

        if (colorSchemeId != null) {
            setColorSchemeId(colorSchemeId);
        }

        Boolean applyForAllPages = (Boolean) attributes.get("applyForAllPages");

        if (applyForAllPages != null) {
            setApplyForAllPages(applyForAllPages);
        }
    }

    /**
    * Returns the primary key of this user personalized theme.
    *
    * @return the primary key of this user personalized theme
    */
    public long getPrimaryKey() {
        return _userPersonalizedTheme.getPrimaryKey();
    }

    /**
    * Sets the primary key of this user personalized theme.
    *
    * @param primaryKey the primary key of this user personalized theme
    */
    public void setPrimaryKey(long primaryKey) {
        _userPersonalizedTheme.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this user personalized theme.
    *
    * @return the ID of this user personalized theme
    */
    public long getId() {
        return _userPersonalizedTheme.getId();
    }

    /**
    * Sets the ID of this user personalized theme.
    *
    * @param id the ID of this user personalized theme
    */
    public void setId(long id) {
        _userPersonalizedTheme.setId(id);
    }

    /**
    * Returns the user ID of this user personalized theme.
    *
    * @return the user ID of this user personalized theme
    */
    public long getUserId() {
        return _userPersonalizedTheme.getUserId();
    }

    /**
    * Sets the user ID of this user personalized theme.
    *
    * @param userId the user ID of this user personalized theme
    */
    public void setUserId(long userId) {
        _userPersonalizedTheme.setUserId(userId);
    }

    /**
    * Returns the user uuid of this user personalized theme.
    *
    * @return the user uuid of this user personalized theme
    * @throws SystemException if a system exception occurred
    */
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedTheme.getUserUuid();
    }

    /**
    * Sets the user uuid of this user personalized theme.
    *
    * @param userUuid the user uuid of this user personalized theme
    */
    public void setUserUuid(java.lang.String userUuid) {
        _userPersonalizedTheme.setUserUuid(userUuid);
    }

    /**
    * Returns the layout ID of this user personalized theme.
    *
    * @return the layout ID of this user personalized theme
    */
    public long getLayoutId() {
        return _userPersonalizedTheme.getLayoutId();
    }

    /**
    * Sets the layout ID of this user personalized theme.
    *
    * @param layoutId the layout ID of this user personalized theme
    */
    public void setLayoutId(long layoutId) {
        _userPersonalizedTheme.setLayoutId(layoutId);
    }

    /**
    * Returns the theme ID of this user personalized theme.
    *
    * @return the theme ID of this user personalized theme
    */
    public java.lang.String getThemeId() {
        return _userPersonalizedTheme.getThemeId();
    }

    /**
    * Sets the theme ID of this user personalized theme.
    *
    * @param themeId the theme ID of this user personalized theme
    */
    public void setThemeId(java.lang.String themeId) {
        _userPersonalizedTheme.setThemeId(themeId);
    }

    /**
    * Returns the color scheme ID of this user personalized theme.
    *
    * @return the color scheme ID of this user personalized theme
    */
    public java.lang.String getColorSchemeId() {
        return _userPersonalizedTheme.getColorSchemeId();
    }

    /**
    * Sets the color scheme ID of this user personalized theme.
    *
    * @param colorSchemeId the color scheme ID of this user personalized theme
    */
    public void setColorSchemeId(java.lang.String colorSchemeId) {
        _userPersonalizedTheme.setColorSchemeId(colorSchemeId);
    }

    /**
    * Returns the apply for all pages of this user personalized theme.
    *
    * @return the apply for all pages of this user personalized theme
    */
    public boolean getApplyForAllPages() {
        return _userPersonalizedTheme.getApplyForAllPages();
    }

    /**
    * Returns <code>true</code> if this user personalized theme is apply for all pages.
    *
    * @return <code>true</code> if this user personalized theme is apply for all pages; <code>false</code> otherwise
    */
    public boolean isApplyForAllPages() {
        return _userPersonalizedTheme.isApplyForAllPages();
    }

    /**
    * Sets whether this user personalized theme is apply for all pages.
    *
    * @param applyForAllPages the apply for all pages of this user personalized theme
    */
    public void setApplyForAllPages(boolean applyForAllPages) {
        _userPersonalizedTheme.setApplyForAllPages(applyForAllPages);
    }

    public boolean isNew() {
        return _userPersonalizedTheme.isNew();
    }

    public void setNew(boolean n) {
        _userPersonalizedTheme.setNew(n);
    }

    public boolean isCachedModel() {
        return _userPersonalizedTheme.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _userPersonalizedTheme.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _userPersonalizedTheme.isEscapedModel();
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _userPersonalizedTheme.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _userPersonalizedTheme.setPrimaryKeyObj(primaryKeyObj);
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _userPersonalizedTheme.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _userPersonalizedTheme.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new UserPersonalizedThemeWrapper((UserPersonalizedTheme) _userPersonalizedTheme.clone());
    }

    public int compareTo(UserPersonalizedTheme userPersonalizedTheme) {
        return _userPersonalizedTheme.compareTo(userPersonalizedTheme);
    }

    @Override
    public int hashCode() {
        return _userPersonalizedTheme.hashCode();
    }

    public com.liferay.portal.model.CacheModel<UserPersonalizedTheme> toCacheModel() {
        return _userPersonalizedTheme.toCacheModel();
    }

    public UserPersonalizedTheme toEscapedModel() {
        return new UserPersonalizedThemeWrapper(_userPersonalizedTheme.toEscapedModel());
    }

    public UserPersonalizedTheme toUnescapedModel() {
        return new UserPersonalizedThemeWrapper(_userPersonalizedTheme.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _userPersonalizedTheme.toString();
    }

    public java.lang.String toXmlString() {
        return _userPersonalizedTheme.toXmlString();
    }

    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _userPersonalizedTheme.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UserPersonalizedThemeWrapper)) {
            return false;
        }

        UserPersonalizedThemeWrapper userPersonalizedThemeWrapper = (UserPersonalizedThemeWrapper) obj;

        if (Validator.equals(_userPersonalizedTheme,
                    userPersonalizedThemeWrapper._userPersonalizedTheme)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated Renamed to {@link #getWrappedModel}
     */
    public UserPersonalizedTheme getWrappedUserPersonalizedTheme() {
        return _userPersonalizedTheme;
    }

    public UserPersonalizedTheme getWrappedModel() {
        return _userPersonalizedTheme;
    }

    public void resetOriginalValues() {
        _userPersonalizedTheme.resetOriginalValues();
    }
}
