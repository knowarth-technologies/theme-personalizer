package com.knowarth.portlets.themepersonalizer.service.persistence;

import com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme;
import com.knowarth.portlets.themepersonalizer.service.AvailablePersonalizedThemeLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Samir Bhatt
 * @generated
 */
public abstract class AvailablePersonalizedThemeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AvailablePersonalizedThemeActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(AvailablePersonalizedThemeLocalServiceUtil.getService());
        setClass(AvailablePersonalizedTheme.class);

        setClassLoader(com.knowarth.portlets.themepersonalizer.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
