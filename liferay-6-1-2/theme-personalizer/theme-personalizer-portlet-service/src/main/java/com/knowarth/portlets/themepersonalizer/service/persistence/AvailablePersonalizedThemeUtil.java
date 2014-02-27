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
package com.knowarth.portlets.themepersonalizer.service.persistence;

import com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the available personalized theme service. This utility wraps {@link AvailablePersonalizedThemePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Samir Bhatt
 * @see AvailablePersonalizedThemePersistence
 * @see AvailablePersonalizedThemePersistenceImpl
 * @generated
 */
public class AvailablePersonalizedThemeUtil {
    private static AvailablePersonalizedThemePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(
        AvailablePersonalizedTheme availablePersonalizedTheme) {
        getPersistence().clearCache(availablePersonalizedTheme);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<AvailablePersonalizedTheme> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<AvailablePersonalizedTheme> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<AvailablePersonalizedTheme> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static AvailablePersonalizedTheme update(
        AvailablePersonalizedTheme availablePersonalizedTheme, boolean merge)
        throws SystemException {
        return getPersistence().update(availablePersonalizedTheme, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static AvailablePersonalizedTheme update(
        AvailablePersonalizedTheme availablePersonalizedTheme, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence()
                   .update(availablePersonalizedTheme, merge, serviceContext);
    }

    /**
    * Caches the available personalized theme in the entity cache if it is enabled.
    *
    * @param availablePersonalizedTheme the available personalized theme
    */
    public static void cacheResult(
        com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme availablePersonalizedTheme) {
        getPersistence().cacheResult(availablePersonalizedTheme);
    }

    /**
    * Caches the available personalized themes in the entity cache if it is enabled.
    *
    * @param availablePersonalizedThemes the available personalized themes
    */
    public static void cacheResult(
        java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> availablePersonalizedThemes) {
        getPersistence().cacheResult(availablePersonalizedThemes);
    }

    /**
    * Creates a new available personalized theme with the primary key. Does not add the available personalized theme to the database.
    *
    * @param id the primary key for the new available personalized theme
    * @return the new available personalized theme
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the available personalized theme with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the available personalized theme
    * @return the available personalized theme that was removed
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a available personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme remove(
        long id)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme updateImpl(
        com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme availablePersonalizedTheme,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(availablePersonalizedTheme, merge);
    }

    /**
    * Returns the available personalized theme with the primary key or throws a {@link com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException} if it could not be found.
    *
    * @param id the primary key of the available personalized theme
    * @return the available personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a available personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme findByPrimaryKey(
        long id)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the available personalized theme with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the available personalized theme
    * @return the available personalized theme, or <code>null</code> if a available personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the available personalized themes where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCompanyId(companyId);
    }

    /**
    * Returns a range of all the available personalized themes where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of available personalized themes
    * @param end the upper bound of the range of available personalized themes (not inclusive)
    * @return the range of matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findByCompanyId(
        long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCompanyId(companyId, start, end);
    }

    /**
    * Returns an ordered range of all the available personalized themes where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of available personalized themes
    * @param end the upper bound of the range of available personalized themes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findByCompanyId(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId(companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first available personalized theme in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching available personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a matching available personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme findByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_First(companyId, orderByComparator);
    }

    /**
    * Returns the first available personalized theme in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching available personalized theme, or <code>null</code> if a matching available personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme fetchByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCompanyId_First(companyId, orderByComparator);
    }

    /**
    * Returns the last available personalized theme in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching available personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a matching available personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme findByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_Last(companyId, orderByComparator);
    }

    /**
    * Returns the last available personalized theme in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching available personalized theme, or <code>null</code> if a matching available personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme fetchByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCompanyId_Last(companyId, orderByComparator);
    }

    /**
    * Returns the available personalized themes before and after the current available personalized theme in the ordered set where companyId = &#63;.
    *
    * @param id the primary key of the current available personalized theme
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next available personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a available personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme[] findByCompanyId_PrevAndNext(
        long id, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_PrevAndNext(id, companyId, orderByComparator);
    }

    /**
    * Returns all the available personalized themes where companyId = &#63; and themeId = &#63;.
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @return the matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findByCompanyIdAndThemeId(
        long companyId, java.lang.String themeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCompanyIdAndThemeId(companyId, themeId);
    }

    /**
    * Returns a range of all the available personalized themes where companyId = &#63; and themeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @param start the lower bound of the range of available personalized themes
    * @param end the upper bound of the range of available personalized themes (not inclusive)
    * @return the range of matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findByCompanyIdAndThemeId(
        long companyId, java.lang.String themeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyIdAndThemeId(companyId, themeId, start, end);
    }

    /**
    * Returns an ordered range of all the available personalized themes where companyId = &#63; and themeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @param start the lower bound of the range of available personalized themes
    * @param end the upper bound of the range of available personalized themes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findByCompanyIdAndThemeId(
        long companyId, java.lang.String themeId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyIdAndThemeId(companyId, themeId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first available personalized theme in the ordered set where companyId = &#63; and themeId = &#63;.
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching available personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a matching available personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme findByCompanyIdAndThemeId_First(
        long companyId, java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyIdAndThemeId_First(companyId, themeId,
            orderByComparator);
    }

    /**
    * Returns the first available personalized theme in the ordered set where companyId = &#63; and themeId = &#63;.
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching available personalized theme, or <code>null</code> if a matching available personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme fetchByCompanyIdAndThemeId_First(
        long companyId, java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCompanyIdAndThemeId_First(companyId, themeId,
            orderByComparator);
    }

    /**
    * Returns the last available personalized theme in the ordered set where companyId = &#63; and themeId = &#63;.
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching available personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a matching available personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme findByCompanyIdAndThemeId_Last(
        long companyId, java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyIdAndThemeId_Last(companyId, themeId,
            orderByComparator);
    }

    /**
    * Returns the last available personalized theme in the ordered set where companyId = &#63; and themeId = &#63;.
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching available personalized theme, or <code>null</code> if a matching available personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme fetchByCompanyIdAndThemeId_Last(
        long companyId, java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCompanyIdAndThemeId_Last(companyId, themeId,
            orderByComparator);
    }

    /**
    * Returns the available personalized themes before and after the current available personalized theme in the ordered set where companyId = &#63; and themeId = &#63;.
    *
    * @param id the primary key of the current available personalized theme
    * @param companyId the company ID
    * @param themeId the theme ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next available personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a available personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme[] findByCompanyIdAndThemeId_PrevAndNext(
        long id, long companyId, java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyIdAndThemeId_PrevAndNext(id, companyId,
            themeId, orderByComparator);
    }

    /**
    * Returns all the available personalized themes.
    *
    * @return the available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the available personalized themes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of available personalized themes
    * @param end the upper bound of the range of available personalized themes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the available personalized themes where companyId = &#63; from the database.
    *
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByCompanyId(companyId);
    }

    /**
    * Removes all the available personalized themes where companyId = &#63; and themeId = &#63; from the database.
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCompanyIdAndThemeId(long companyId,
        java.lang.String themeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByCompanyIdAndThemeId(companyId, themeId);
    }

    /**
    * Removes all the available personalized themes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of available personalized themes where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the number of matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static int countByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCompanyId(companyId);
    }

    /**
    * Returns the number of available personalized themes where companyId = &#63; and themeId = &#63;.
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @return the number of matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static int countByCompanyIdAndThemeId(long companyId,
        java.lang.String themeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCompanyIdAndThemeId(companyId, themeId);
    }

    /**
    * Returns the number of available personalized themes.
    *
    * @return the number of available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static AvailablePersonalizedThemePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (AvailablePersonalizedThemePersistence) PortletBeanLocatorUtil.locate(com.knowarth.portlets.themepersonalizer.service.ClpSerializer.getServletContextName(),
                    AvailablePersonalizedThemePersistence.class.getName());

            ReferenceRegistry.registerReference(AvailablePersonalizedThemeUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated
     */
    public void setPersistence(
        AvailablePersonalizedThemePersistence persistence) {
    }
}
