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
public class AvailablePersonalizedThemeSoap implements Serializable {
    private long _id;
    private long _companyId;
    private String _themeId;

    public AvailablePersonalizedThemeSoap() {
    }

    public static AvailablePersonalizedThemeSoap toSoapModel(
        AvailablePersonalizedTheme model) {
        AvailablePersonalizedThemeSoap soapModel = new AvailablePersonalizedThemeSoap();

        soapModel.setId(model.getId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setThemeId(model.getThemeId());

        return soapModel;
    }

    public static AvailablePersonalizedThemeSoap[] toSoapModels(
        AvailablePersonalizedTheme[] models) {
        AvailablePersonalizedThemeSoap[] soapModels = new AvailablePersonalizedThemeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AvailablePersonalizedThemeSoap[][] toSoapModels(
        AvailablePersonalizedTheme[][] models) {
        AvailablePersonalizedThemeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AvailablePersonalizedThemeSoap[models.length][models[0].length];
        } else {
            soapModels = new AvailablePersonalizedThemeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AvailablePersonalizedThemeSoap[] toSoapModels(
        List<AvailablePersonalizedTheme> models) {
        List<AvailablePersonalizedThemeSoap> soapModels = new ArrayList<AvailablePersonalizedThemeSoap>(models.size());

        for (AvailablePersonalizedTheme model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AvailablePersonalizedThemeSoap[soapModels.size()]);
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

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public String getThemeId() {
        return _themeId;
    }

    public void setThemeId(String themeId) {
        _themeId = themeId;
    }
}
