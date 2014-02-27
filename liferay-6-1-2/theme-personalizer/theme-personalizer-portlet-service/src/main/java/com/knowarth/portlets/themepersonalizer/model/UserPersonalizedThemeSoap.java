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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    Samir Bhatt
 * @generated
 */
public class UserPersonalizedThemeSoap implements Serializable {
    private long _id;
    private long _userId;
    private long _layoutId;
    private String _themeId;
    private String _colorSchemeId;
    private boolean _applyForAllPages;

    public UserPersonalizedThemeSoap() {
    }

    public static UserPersonalizedThemeSoap toSoapModel(
        UserPersonalizedTheme model) {
        UserPersonalizedThemeSoap soapModel = new UserPersonalizedThemeSoap();

        soapModel.setId(model.getId());
        soapModel.setUserId(model.getUserId());
        soapModel.setLayoutId(model.getLayoutId());
        soapModel.setThemeId(model.getThemeId());
        soapModel.setColorSchemeId(model.getColorSchemeId());
        soapModel.setApplyForAllPages(model.getApplyForAllPages());

        return soapModel;
    }

    public static UserPersonalizedThemeSoap[] toSoapModels(
        UserPersonalizedTheme[] models) {
        UserPersonalizedThemeSoap[] soapModels = new UserPersonalizedThemeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static UserPersonalizedThemeSoap[][] toSoapModels(
        UserPersonalizedTheme[][] models) {
        UserPersonalizedThemeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new UserPersonalizedThemeSoap[models.length][models[0].length];
        } else {
            soapModels = new UserPersonalizedThemeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static UserPersonalizedThemeSoap[] toSoapModels(
        List<UserPersonalizedTheme> models) {
        List<UserPersonalizedThemeSoap> soapModels = new ArrayList<UserPersonalizedThemeSoap>(models.size());

        for (UserPersonalizedTheme model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new UserPersonalizedThemeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public long getLayoutId() {
        return _layoutId;
    }

    public void setLayoutId(long layoutId) {
        _layoutId = layoutId;
    }

    public String getThemeId() {
        return _themeId;
    }

    public void setThemeId(String themeId) {
        _themeId = themeId;
    }

    public String getColorSchemeId() {
        return _colorSchemeId;
    }

    public void setColorSchemeId(String colorSchemeId) {
        _colorSchemeId = colorSchemeId;
    }

    public boolean getApplyForAllPages() {
        return _applyForAllPages;
    }

    public boolean isApplyForAllPages() {
        return _applyForAllPages;
    }

    public void setApplyForAllPages(boolean applyForAllPages) {
        _applyForAllPages = applyForAllPages;
    }
}
