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

import com.knowarth.portlets.themepersonalizer.service.ClpSerializer;
import com.knowarth.portlets.themepersonalizer.service.UserPersonalizedThemeLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class UserPersonalizedThemeClp extends BaseModelImpl<UserPersonalizedTheme>
    implements UserPersonalizedTheme {
    private long _id;
    private long _userId;
    private String _userUuid;
    private long _layoutId;
    private String _themeId;
    private String _colorSchemeId;
    private boolean _applyForAllPages;
    private BaseModel<?> _userPersonalizedThemeRemoteModel;

    public UserPersonalizedThemeClp() {
    }

    public Class<?> getModelClass() {
        return UserPersonalizedTheme.class;
    }

    public String getModelClassName() {
        return UserPersonalizedTheme.class.getName();
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_id);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
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

    @Override
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

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;

        if (_userPersonalizedThemeRemoteModel != null) {
            try {
                Class<?> clazz = _userPersonalizedThemeRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_userPersonalizedThemeRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;

        if (_userPersonalizedThemeRemoteModel != null) {
            try {
                Class<?> clazz = _userPersonalizedThemeRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_userPersonalizedThemeRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    public long getLayoutId() {
        return _layoutId;
    }

    public void setLayoutId(long layoutId) {
        _layoutId = layoutId;

        if (_userPersonalizedThemeRemoteModel != null) {
            try {
                Class<?> clazz = _userPersonalizedThemeRemoteModel.getClass();

                Method method = clazz.getMethod("setLayoutId", long.class);

                method.invoke(_userPersonalizedThemeRemoteModel, layoutId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getThemeId() {
        return _themeId;
    }

    public void setThemeId(String themeId) {
        _themeId = themeId;

        if (_userPersonalizedThemeRemoteModel != null) {
            try {
                Class<?> clazz = _userPersonalizedThemeRemoteModel.getClass();

                Method method = clazz.getMethod("setThemeId", String.class);

                method.invoke(_userPersonalizedThemeRemoteModel, themeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getColorSchemeId() {
        return _colorSchemeId;
    }

    public void setColorSchemeId(String colorSchemeId) {
        _colorSchemeId = colorSchemeId;

        if (_userPersonalizedThemeRemoteModel != null) {
            try {
                Class<?> clazz = _userPersonalizedThemeRemoteModel.getClass();

                Method method = clazz.getMethod("setColorSchemeId", String.class);

                method.invoke(_userPersonalizedThemeRemoteModel, colorSchemeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public boolean getApplyForAllPages() {
        return _applyForAllPages;
    }

    public boolean isApplyForAllPages() {
        return _applyForAllPages;
    }

    public void setApplyForAllPages(boolean applyForAllPages) {
        _applyForAllPages = applyForAllPages;

        if (_userPersonalizedThemeRemoteModel != null) {
            try {
                Class<?> clazz = _userPersonalizedThemeRemoteModel.getClass();

                Method method = clazz.getMethod("setApplyForAllPages",
                        boolean.class);

                method.invoke(_userPersonalizedThemeRemoteModel,
                    applyForAllPages);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getUserPersonalizedThemeRemoteModel() {
        return _userPersonalizedThemeRemoteModel;
    }

    public void setUserPersonalizedThemeRemoteModel(
        BaseModel<?> userPersonalizedThemeRemoteModel) {
        _userPersonalizedThemeRemoteModel = userPersonalizedThemeRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _userPersonalizedThemeRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_userPersonalizedThemeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    public void persist() throws SystemException {
        if (this.isNew()) {
            UserPersonalizedThemeLocalServiceUtil.addUserPersonalizedTheme(this);
        } else {
            UserPersonalizedThemeLocalServiceUtil.updateUserPersonalizedTheme(this);
        }
    }

    @Override
    public UserPersonalizedTheme toEscapedModel() {
        return (UserPersonalizedTheme) ProxyUtil.newProxyInstance(UserPersonalizedTheme.class.getClassLoader(),
            new Class[] { UserPersonalizedTheme.class },
            new AutoEscapeBeanHandler(this));
    }

    public UserPersonalizedTheme toUnescapedModel() {
        return this;
    }

    @Override
    public Object clone() {
        UserPersonalizedThemeClp clone = new UserPersonalizedThemeClp();

        clone.setId(getId());
        clone.setUserId(getUserId());
        clone.setLayoutId(getLayoutId());
        clone.setThemeId(getThemeId());
        clone.setColorSchemeId(getColorSchemeId());
        clone.setApplyForAllPages(getApplyForAllPages());

        return clone;
    }

    public int compareTo(UserPersonalizedTheme userPersonalizedTheme) {
        long primaryKey = userPersonalizedTheme.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UserPersonalizedThemeClp)) {
            return false;
        }

        UserPersonalizedThemeClp userPersonalizedTheme = (UserPersonalizedThemeClp) obj;

        long primaryKey = userPersonalizedTheme.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", layoutId=");
        sb.append(getLayoutId());
        sb.append(", themeId=");
        sb.append(getThemeId());
        sb.append(", colorSchemeId=");
        sb.append(getColorSchemeId());
        sb.append(", applyForAllPages=");
        sb.append(getApplyForAllPages());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append(
            "com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>layoutId</column-name><column-value><![CDATA[");
        sb.append(getLayoutId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>themeId</column-name><column-value><![CDATA[");
        sb.append(getThemeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>colorSchemeId</column-name><column-value><![CDATA[");
        sb.append(getColorSchemeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>applyForAllPages</column-name><column-value><![CDATA[");
        sb.append(getApplyForAllPages());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
