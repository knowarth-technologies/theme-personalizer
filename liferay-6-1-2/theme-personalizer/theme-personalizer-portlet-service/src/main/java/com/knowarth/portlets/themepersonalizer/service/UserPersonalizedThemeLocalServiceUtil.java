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
package com.knowarth.portlets.themepersonalizer.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the user personalized theme local service. This utility wraps {@link com.knowarth.portlets.themepersonalizer.service.impl.UserPersonalizedThemeLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Samir Bhatt
 * @see UserPersonalizedThemeLocalService
 * @see com.knowarth.portlets.themepersonalizer.service.base.UserPersonalizedThemeLocalServiceBaseImpl
 * @see com.knowarth.portlets.themepersonalizer.service.impl.UserPersonalizedThemeLocalServiceImpl
 * @generated
 */
public class UserPersonalizedThemeLocalServiceUtil {
    private static UserPersonalizedThemeLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.knowarth.portlets.themepersonalizer.service.impl.UserPersonalizedThemeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the user personalized theme to the database. Also notifies the appropriate model listeners.
    *
    * @param userPersonalizedTheme the user personalized theme
    * @return the user personalized theme that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme addUserPersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme userPersonalizedTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addUserPersonalizedTheme(userPersonalizedTheme);
    }

    /**
    * Creates a new user personalized theme with the primary key. Does not add the user personalized theme to the database.
    *
    * @param id the primary key for the new user personalized theme
    * @return the new user personalized theme
    */
    public static com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme createUserPersonalizedTheme(
        long id) {
        return getService().createUserPersonalizedTheme(id);
    }

    /**
    * Deletes the user personalized theme with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the user personalized theme
    * @return the user personalized theme that was removed
    * @throws PortalException if a user personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme deleteUserPersonalizedTheme(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteUserPersonalizedTheme(id);
    }

    /**
    * Deletes the user personalized theme from the database. Also notifies the appropriate model listeners.
    *
    * @param userPersonalizedTheme the user personalized theme
    * @return the user personalized theme that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme deleteUserPersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme userPersonalizedTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteUserPersonalizedTheme(userPersonalizedTheme);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    public static com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme fetchUserPersonalizedTheme(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchUserPersonalizedTheme(id);
    }

    /**
    * Returns the user personalized theme with the primary key.
    *
    * @param id the primary key of the user personalized theme
    * @return the user personalized theme
    * @throws PortalException if a user personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme getUserPersonalizedTheme(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getUserPersonalizedTheme(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the user personalized themes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of user personalized themes
    * @param end the upper bound of the range of user personalized themes (not inclusive)
    * @return the range of user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> getUserPersonalizedThemes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getUserPersonalizedThemes(start, end);
    }

    /**
    * Returns the number of user personalized themes.
    *
    * @return the number of user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static int getUserPersonalizedThemesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getUserPersonalizedThemesCount();
    }

    /**
    * Updates the user personalized theme in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param userPersonalizedTheme the user personalized theme
    * @return the user personalized theme that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme updateUserPersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme userPersonalizedTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateUserPersonalizedTheme(userPersonalizedTheme);
    }

    /**
    * Updates the user personalized theme in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param userPersonalizedTheme the user personalized theme
    * @param merge whether to merge the user personalized theme with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the user personalized theme that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme updateUserPersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme userPersonalizedTheme,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateUserPersonalizedTheme(userPersonalizedTheme, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme addUserPersonalizedTheme(
        long userId, long layoutId, java.lang.String themeId,
        java.lang.String colorSchemeId, boolean applyForAllPages)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addUserPersonalizedTheme(userId, layoutId, themeId,
            colorSchemeId, applyForAllPages);
    }

    public static com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme findByUserIDAndLayoutId(
        long companyId, long userId, long layoutId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByUserIDAndLayoutId(companyId, userId, layoutId);
    }

    public static void clearService() {
        _service = null;
    }

    public static UserPersonalizedThemeLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    UserPersonalizedThemeLocalService.class.getName());

            if (invokableLocalService instanceof UserPersonalizedThemeLocalService) {
                _service = (UserPersonalizedThemeLocalService) invokableLocalService;
            } else {
                _service = new UserPersonalizedThemeLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(UserPersonalizedThemeLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated
     */
    public void setService(UserPersonalizedThemeLocalService service) {
    }
}
