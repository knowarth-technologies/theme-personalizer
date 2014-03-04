package com.knowarth.portlets.themepersonalizer.model;

import com.knowarth.portlets.themepersonalizer.service.AvailablePersonalizedThemeLocalServiceUtil;
import com.knowarth.portlets.themepersonalizer.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class AvailablePersonalizedThemeClp extends BaseModelImpl<AvailablePersonalizedTheme>
    implements AvailablePersonalizedTheme {
    private long _id;
    private long _companyId;
    private String _themeId;
    private BaseModel<?> _availablePersonalizedThemeRemoteModel;

    public AvailablePersonalizedThemeClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return AvailablePersonalizedTheme.class;
    }

    @Override
    public String getModelClassName() {
        return AvailablePersonalizedTheme.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("companyId", getCompanyId());
        attributes.put("themeId", getThemeId());

        return attributes;
    }

    @Override
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

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_availablePersonalizedThemeRemoteModel != null) {
            try {
                Class<?> clazz = _availablePersonalizedThemeRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_availablePersonalizedThemeRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_availablePersonalizedThemeRemoteModel != null) {
            try {
                Class<?> clazz = _availablePersonalizedThemeRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_availablePersonalizedThemeRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getThemeId() {
        return _themeId;
    }

    @Override
    public void setThemeId(String themeId) {
        _themeId = themeId;

        if (_availablePersonalizedThemeRemoteModel != null) {
            try {
                Class<?> clazz = _availablePersonalizedThemeRemoteModel.getClass();

                Method method = clazz.getMethod("setThemeId", String.class);

                method.invoke(_availablePersonalizedThemeRemoteModel, themeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getAvailablePersonalizedThemeRemoteModel() {
        return _availablePersonalizedThemeRemoteModel;
    }

    public void setAvailablePersonalizedThemeRemoteModel(
        BaseModel<?> availablePersonalizedThemeRemoteModel) {
        _availablePersonalizedThemeRemoteModel = availablePersonalizedThemeRemoteModel;
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

        Class<?> remoteModelClass = _availablePersonalizedThemeRemoteModel.getClass();

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

        Object returnValue = method.invoke(_availablePersonalizedThemeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AvailablePersonalizedThemeLocalServiceUtil.addAvailablePersonalizedTheme(this);
        } else {
            AvailablePersonalizedThemeLocalServiceUtil.updateAvailablePersonalizedTheme(this);
        }
    }

    @Override
    public AvailablePersonalizedTheme toEscapedModel() {
        return (AvailablePersonalizedTheme) ProxyUtil.newProxyInstance(AvailablePersonalizedTheme.class.getClassLoader(),
            new Class[] { AvailablePersonalizedTheme.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AvailablePersonalizedThemeClp clone = new AvailablePersonalizedThemeClp();

        clone.setId(getId());
        clone.setCompanyId(getCompanyId());
        clone.setThemeId(getThemeId());

        return clone;
    }

    @Override
    public int compareTo(AvailablePersonalizedTheme availablePersonalizedTheme) {
        long primaryKey = availablePersonalizedTheme.getPrimaryKey();

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

        if (!(obj instanceof AvailablePersonalizedThemeClp)) {
            return false;
        }

        AvailablePersonalizedThemeClp availablePersonalizedTheme = (AvailablePersonalizedThemeClp) obj;

        long primaryKey = availablePersonalizedTheme.getPrimaryKey();

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
        StringBundler sb = new StringBundler(7);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", themeId=");
        sb.append(getThemeId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append(
            "com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>themeId</column-name><column-value><![CDATA[");
        sb.append(getThemeId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
