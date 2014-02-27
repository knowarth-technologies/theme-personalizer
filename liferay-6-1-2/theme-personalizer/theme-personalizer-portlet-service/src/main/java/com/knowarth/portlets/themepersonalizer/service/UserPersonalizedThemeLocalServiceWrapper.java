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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link UserPersonalizedThemeLocalService}.
 * </p>
 *
 * @author    Samir Bhatt
 * @see       UserPersonalizedThemeLocalService
 * @generated
 */
public class UserPersonalizedThemeLocalServiceWrapper
    implements UserPersonalizedThemeLocalService,
        ServiceWrapper<UserPersonalizedThemeLocalService> {
    private UserPersonalizedThemeLocalService _userPersonalizedThemeLocalService;

    public UserPersonalizedThemeLocalServiceWrapper(
        UserPersonalizedThemeLocalService userPersonalizedThemeLocalService) {
        _userPersonalizedThemeLocalService = userPersonalizedThemeLocalService;
    }

    /**
    * Adds the user personalized theme to the database. Also notifies the appropriate model listeners.
    *
    * @param userPersonalizedTheme the user personalized theme
    * @return the user personalized theme that was added
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme addUserPersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme userPersonalizedTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.addUserPersonalizedTheme(userPersonalizedTheme);
    }

    /**
    * Creates a new user personalized theme with the primary key. Does not add the user personalized theme to the database.
    *
    * @param id the primary key for the new user personalized theme
    * @return the new user personalized theme
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme createUserPersonalizedTheme(
        long id) {
        return _userPersonalizedThemeLocalService.createUserPersonalizedTheme(id);
    }

    /**
    * Deletes the user personalized theme with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the user personalized theme
    * @return the user personalized theme that was removed
    * @throws PortalException if a user personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme deleteUserPersonalizedTheme(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.deleteUserPersonalizedTheme(id);
    }

    /**
    * Deletes the user personalized theme from the database. Also notifies the appropriate model listeners.
    *
    * @param userPersonalizedTheme the user personalized theme
    * @return the user personalized theme that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme deleteUserPersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme userPersonalizedTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.deleteUserPersonalizedTheme(userPersonalizedTheme);
    }

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _userPersonalizedThemeLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.dynamicQuery(dynamicQuery);
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.dynamicQuery(dynamicQuery,
            start, end);
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme fetchUserPersonalizedTheme(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.fetchUserPersonalizedTheme(id);
    }

    /**
    * Returns the user personalized theme with the primary key.
    *
    * @param id the primary key of the user personalized theme
    * @return the user personalized theme
    * @throws PortalException if a user personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme getUserPersonalizedTheme(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.getUserPersonalizedTheme(id);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.getPersistedModel(primaryKeyObj);
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
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> getUserPersonalizedThemes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.getUserPersonalizedThemes(start,
            end);
    }

    /**
    * Returns the number of user personalized themes.
    *
    * @return the number of user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public int getUserPersonalizedThemesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.getUserPersonalizedThemesCount();
    }

    /**
    * Updates the user personalized theme in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param userPersonalizedTheme the user personalized theme
    * @return the user personalized theme that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme updateUserPersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme userPersonalizedTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.updateUserPersonalizedTheme(userPersonalizedTheme);
    }

    /**
    * Updates the user personalized theme in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param userPersonalizedTheme the user personalized theme
    * @param merge whether to merge the user personalized theme with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the user personalized theme that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme updateUserPersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme userPersonalizedTheme,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.updateUserPersonalizedTheme(userPersonalizedTheme,
            merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _userPersonalizedThemeLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _userPersonalizedThemeLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _userPersonalizedThemeLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme addUserPersonalizedTheme(
        long userId, long layoutId, java.lang.String themeId,
        java.lang.String colorSchemeId, boolean applyForAllPages)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.addUserPersonalizedTheme(userId,
            layoutId, themeId, colorSchemeId, applyForAllPages);
    }

    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme findByUserIDAndLayoutId(
        long companyId, long userId, long layoutId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userPersonalizedThemeLocalService.findByUserIDAndLayoutId(companyId,
            userId, layoutId);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public UserPersonalizedThemeLocalService getWrappedUserPersonalizedThemeLocalService() {
        return _userPersonalizedThemeLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedUserPersonalizedThemeLocalService(
        UserPersonalizedThemeLocalService userPersonalizedThemeLocalService) {
        _userPersonalizedThemeLocalService = userPersonalizedThemeLocalService;
    }

    public UserPersonalizedThemeLocalService getWrappedService() {
        return _userPersonalizedThemeLocalService;
    }

    public void setWrappedService(
        UserPersonalizedThemeLocalService userPersonalizedThemeLocalService) {
        _userPersonalizedThemeLocalService = userPersonalizedThemeLocalService;
    }
}
