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
