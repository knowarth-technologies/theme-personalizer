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
 * The utility for the available personalized theme local service. This utility wraps {@link com.knowarth.portlets.themepersonalizer.service.impl.AvailablePersonalizedThemeLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Samir Bhatt
 * @see AvailablePersonalizedThemeLocalService
 * @see com.knowarth.portlets.themepersonalizer.service.base.AvailablePersonalizedThemeLocalServiceBaseImpl
 * @see com.knowarth.portlets.themepersonalizer.service.impl.AvailablePersonalizedThemeLocalServiceImpl
 * @generated
 */
public class AvailablePersonalizedThemeLocalServiceUtil {
    private static AvailablePersonalizedThemeLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.knowarth.portlets.themepersonalizer.service.impl.AvailablePersonalizedThemeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the available personalized theme to the database. Also notifies the appropriate model listeners.
    *
    * @param availablePersonalizedTheme the available personalized theme
    * @return the available personalized theme that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme addAvailablePersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme availablePersonalizedTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addAvailablePersonalizedTheme(availablePersonalizedTheme);
    }

    /**
    * Creates a new available personalized theme with the primary key. Does not add the available personalized theme to the database.
    *
    * @param id the primary key for the new available personalized theme
    * @return the new available personalized theme
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme createAvailablePersonalizedTheme(
        long id) {
        return getService().createAvailablePersonalizedTheme(id);
    }

    /**
    * Deletes the available personalized theme with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the available personalized theme
    * @return the available personalized theme that was removed
    * @throws PortalException if a available personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme deleteAvailablePersonalizedTheme(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteAvailablePersonalizedTheme(id);
    }

    /**
    * Deletes the available personalized theme from the database. Also notifies the appropriate model listeners.
    *
    * @param availablePersonalizedTheme the available personalized theme
    * @return the available personalized theme that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme deleteAvailablePersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme availablePersonalizedTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .deleteAvailablePersonalizedTheme(availablePersonalizedTheme);
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

    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme fetchAvailablePersonalizedTheme(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchAvailablePersonalizedTheme(id);
    }

    /**
    * Returns the available personalized theme with the primary key.
    *
    * @param id the primary key of the available personalized theme
    * @return the available personalized theme
    * @throws PortalException if a available personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme getAvailablePersonalizedTheme(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getAvailablePersonalizedTheme(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the available personalized themes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of available personalized themes
    * @param end the upper bound of the range of available personalized themes (not inclusive)
    * @return the range of available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> getAvailablePersonalizedThemes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAvailablePersonalizedThemes(start, end);
    }

    /**
    * Returns the number of available personalized themes.
    *
    * @return the number of available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static int getAvailablePersonalizedThemesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAvailablePersonalizedThemesCount();
    }

    /**
    * Updates the available personalized theme in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param availablePersonalizedTheme the available personalized theme
    * @return the available personalized theme that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme updateAvailablePersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme availablePersonalizedTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateAvailablePersonalizedTheme(availablePersonalizedTheme);
    }

    /**
    * Updates the available personalized theme in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param availablePersonalizedTheme the available personalized theme
    * @param merge whether to merge the available personalized theme with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the available personalized theme that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme updateAvailablePersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme availablePersonalizedTheme,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateAvailablePersonalizedTheme(availablePersonalizedTheme,
            merge);
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

    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme addAvailablePersonalizedTheme(
        long companyId, java.lang.String themeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addAvailablePersonalizedTheme(companyId, themeId);
    }

    public static void removeAllByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().removeAllByCompanyId(companyId);
    }

    public static java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findAllByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findAllByCompanyId(companyId);
    }

    public static void clearService() {
        _service = null;
    }

    public static AvailablePersonalizedThemeLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    AvailablePersonalizedThemeLocalService.class.getName());

            if (invokableLocalService instanceof AvailablePersonalizedThemeLocalService) {
                _service = (AvailablePersonalizedThemeLocalService) invokableLocalService;
            } else {
                _service = new AvailablePersonalizedThemeLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(AvailablePersonalizedThemeLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated
     */
    public void setService(AvailablePersonalizedThemeLocalService service) {
    }
}
