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
 * This class is a wrapper for {@link AvailablePersonalizedTheme}.
 * </p>
 *
 * @author    Samir Bhatt
 * @see       AvailablePersonalizedTheme
 * @generated
 */
public class AvailablePersonalizedThemeWrapper
    implements AvailablePersonalizedTheme,
        ModelWrapper<AvailablePersonalizedTheme> {
    private AvailablePersonalizedTheme _availablePersonalizedTheme;

    public AvailablePersonalizedThemeWrapper(
        AvailablePersonalizedTheme availablePersonalizedTheme) {
        _availablePersonalizedTheme = availablePersonalizedTheme;
    }

    public Class<?> getModelClass() {
        return AvailablePersonalizedTheme.class;
    }

    public String getModelClassName() {
        return AvailablePersonalizedTheme.class.getName();
    }

    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("companyId", getCompanyId());
        attributes.put("themeId", getThemeId());

        return attributes;
    }

    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        String themeId = (String) attributes.get("themeId");

        if (themeId != null) {
            setThemeId(themeId);
        }
    }

    /**
    * Returns the primary key of this available personalized theme.
    *
    * @return the primary key of this available personalized theme
    */
    public long getPrimaryKey() {
        return _availablePersonalizedTheme.getPrimaryKey();
    }

    /**
    * Sets the primary key of this available personalized theme.
    *
    * @param primaryKey the primary key of this available personalized theme
    */
    public void setPrimaryKey(long primaryKey) {
        _availablePersonalizedTheme.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this available personalized theme.
    *
    * @return the ID of this available personalized theme
    */
    public long getId() {
        return _availablePersonalizedTheme.getId();
    }

    /**
    * Sets the ID of this available personalized theme.
    *
    * @param id the ID of this available personalized theme
    */
    public void setId(long id) {
        _availablePersonalizedTheme.setId(id);
    }

    /**
    * Returns the company ID of this available personalized theme.
    *
    * @return the company ID of this available personalized theme
    */
    public long getCompanyId() {
        return _availablePersonalizedTheme.getCompanyId();
    }

    /**
    * Sets the company ID of this available personalized theme.
    *
    * @param companyId the company ID of this available personalized theme
    */
    public void setCompanyId(long companyId) {
        _availablePersonalizedTheme.setCompanyId(companyId);
    }

    /**
    * Returns the theme ID of this available personalized theme.
    *
    * @return the theme ID of this available personalized theme
    */
    public java.lang.String getThemeId() {
        return _availablePersonalizedTheme.getThemeId();
    }

    /**
    * Sets the theme ID of this available personalized theme.
    *
    * @param themeId the theme ID of this available personalized theme
    */
    public void setThemeId(java.lang.String themeId) {
        _availablePersonalizedTheme.setThemeId(themeId);
    }

    public boolean isNew() {
        return _availablePersonalizedTheme.isNew();
    }

    public void setNew(boolean n) {
        _availablePersonalizedTheme.setNew(n);
    }

    public boolean isCachedModel() {
        return _availablePersonalizedTheme.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _availablePersonalizedTheme.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _availablePersonalizedTheme.isEscapedModel();
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _availablePersonalizedTheme.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _availablePersonalizedTheme.setPrimaryKeyObj(primaryKeyObj);
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _availablePersonalizedTheme.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _availablePersonalizedTheme.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AvailablePersonalizedThemeWrapper((AvailablePersonalizedTheme) _availablePersonalizedTheme.clone());
    }

    public int compareTo(AvailablePersonalizedTheme availablePersonalizedTheme) {
        return _availablePersonalizedTheme.compareTo(availablePersonalizedTheme);
    }

    @Override
    public int hashCode() {
        return _availablePersonalizedTheme.hashCode();
    }

    public com.liferay.portal.model.CacheModel<AvailablePersonalizedTheme> toCacheModel() {
        return _availablePersonalizedTheme.toCacheModel();
    }

    public AvailablePersonalizedTheme toEscapedModel() {
        return new AvailablePersonalizedThemeWrapper(_availablePersonalizedTheme.toEscapedModel());
    }

    public AvailablePersonalizedTheme toUnescapedModel() {
        return new AvailablePersonalizedThemeWrapper(_availablePersonalizedTheme.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _availablePersonalizedTheme.toString();
    }

    public java.lang.String toXmlString() {
        return _availablePersonalizedTheme.toXmlString();
    }

    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _availablePersonalizedTheme.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AvailablePersonalizedThemeWrapper)) {
            return false;
        }

        AvailablePersonalizedThemeWrapper availablePersonalizedThemeWrapper = (AvailablePersonalizedThemeWrapper) obj;

        if (Validator.equals(_availablePersonalizedTheme,
                    availablePersonalizedThemeWrapper._availablePersonalizedTheme)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated Renamed to {@link #getWrappedModel}
     */
    public AvailablePersonalizedTheme getWrappedAvailablePersonalizedTheme() {
        return _availablePersonalizedTheme;
    }

    public AvailablePersonalizedTheme getWrappedModel() {
        return _availablePersonalizedTheme;
    }

    public void resetOriginalValues() {
        _availablePersonalizedTheme.resetOriginalValues();
    }
}
