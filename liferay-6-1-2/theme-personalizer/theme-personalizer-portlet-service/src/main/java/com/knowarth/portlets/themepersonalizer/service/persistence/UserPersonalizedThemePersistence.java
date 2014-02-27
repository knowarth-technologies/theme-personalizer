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

import com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the user personalized theme service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Samir Bhatt
 * @see UserPersonalizedThemePersistenceImpl
 * @see UserPersonalizedThemeUtil
 * @generated
 */
public interface UserPersonalizedThemePersistence extends BasePersistence<UserPersonalizedTheme> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link UserPersonalizedThemeUtil} to access the user personalized theme persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the user personalized theme in the entity cache if it is enabled.
    *
    * @param userPersonalizedTheme the user personalized theme
    */
    public void cacheResult(
        com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme userPersonalizedTheme);

    /**
    * Caches the user personalized themes in the entity cache if it is enabled.
    *
    * @param userPersonalizedThemes the user personalized themes
    */
    public void cacheResult(
        java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> userPersonalizedThemes);

    /**
    * Creates a new user personalized theme with the primary key. Does not add the user personalized theme to the database.
    *
    * @param id the primary key for the new user personalized theme
    * @return the new user personalized theme
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme create(
        long id);

    /**
    * Removes the user personalized theme with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the user personalized theme
    * @return the user personalized theme that was removed
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a user personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme remove(
        long id)
        throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme updateImpl(
        com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme userPersonalizedTheme,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the user personalized theme with the primary key or throws a {@link com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException} if it could not be found.
    *
    * @param id the primary key of the user personalized theme
    * @return the user personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a user personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme findByPrimaryKey(
        long id)
        throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the user personalized theme with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the user personalized theme
    * @return the user personalized theme, or <code>null</code> if a user personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the user personalized themes where userId = &#63; and applyForAllPages = &#63;.
    *
    * @param userId the user ID
    * @param applyForAllPages the apply for all pages
    * @return the matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findByUserIdAndApplyForAllPages(
        long userId, boolean applyForAllPages)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the user personalized themes where userId = &#63; and applyForAllPages = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param userId the user ID
    * @param applyForAllPages the apply for all pages
    * @param start the lower bound of the range of user personalized themes
    * @param end the upper bound of the range of user personalized themes (not inclusive)
    * @return the range of matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findByUserIdAndApplyForAllPages(
        long userId, boolean applyForAllPages, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the user personalized themes where userId = &#63; and applyForAllPages = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param userId the user ID
    * @param applyForAllPages the apply for all pages
    * @param start the lower bound of the range of user personalized themes
    * @param end the upper bound of the range of user personalized themes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findByUserIdAndApplyForAllPages(
        long userId, boolean applyForAllPages, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first user personalized theme in the ordered set where userId = &#63; and applyForAllPages = &#63;.
    *
    * @param userId the user ID
    * @param applyForAllPages the apply for all pages
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme findByUserIdAndApplyForAllPages_First(
        long userId, boolean applyForAllPages,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first user personalized theme in the ordered set where userId = &#63; and applyForAllPages = &#63;.
    *
    * @param userId the user ID
    * @param applyForAllPages the apply for all pages
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme fetchByUserIdAndApplyForAllPages_First(
        long userId, boolean applyForAllPages,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last user personalized theme in the ordered set where userId = &#63; and applyForAllPages = &#63;.
    *
    * @param userId the user ID
    * @param applyForAllPages the apply for all pages
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme findByUserIdAndApplyForAllPages_Last(
        long userId, boolean applyForAllPages,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last user personalized theme in the ordered set where userId = &#63; and applyForAllPages = &#63;.
    *
    * @param userId the user ID
    * @param applyForAllPages the apply for all pages
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme fetchByUserIdAndApplyForAllPages_Last(
        long userId, boolean applyForAllPages,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the user personalized themes before and after the current user personalized theme in the ordered set where userId = &#63; and applyForAllPages = &#63;.
    *
    * @param id the primary key of the current user personalized theme
    * @param userId the user ID
    * @param applyForAllPages the apply for all pages
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next user personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a user personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme[] findByUserIdAndApplyForAllPages_PrevAndNext(
        long id, long userId, boolean applyForAllPages,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the user personalized themes where userId = &#63; and layoutId = &#63;.
    *
    * @param userId the user ID
    * @param layoutId the layout ID
    * @return the matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findByUserIdAndLayoutId(
        long userId, long layoutId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the user personalized themes where userId = &#63; and layoutId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param userId the user ID
    * @param layoutId the layout ID
    * @param start the lower bound of the range of user personalized themes
    * @param end the upper bound of the range of user personalized themes (not inclusive)
    * @return the range of matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findByUserIdAndLayoutId(
        long userId, long layoutId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the user personalized themes where userId = &#63; and layoutId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param userId the user ID
    * @param layoutId the layout ID
    * @param start the lower bound of the range of user personalized themes
    * @param end the upper bound of the range of user personalized themes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findByUserIdAndLayoutId(
        long userId, long layoutId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first user personalized theme in the ordered set where userId = &#63; and layoutId = &#63;.
    *
    * @param userId the user ID
    * @param layoutId the layout ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme findByUserIdAndLayoutId_First(
        long userId, long layoutId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first user personalized theme in the ordered set where userId = &#63; and layoutId = &#63;.
    *
    * @param userId the user ID
    * @param layoutId the layout ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme fetchByUserIdAndLayoutId_First(
        long userId, long layoutId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last user personalized theme in the ordered set where userId = &#63; and layoutId = &#63;.
    *
    * @param userId the user ID
    * @param layoutId the layout ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme findByUserIdAndLayoutId_Last(
        long userId, long layoutId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last user personalized theme in the ordered set where userId = &#63; and layoutId = &#63;.
    *
    * @param userId the user ID
    * @param layoutId the layout ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme fetchByUserIdAndLayoutId_Last(
        long userId, long layoutId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the user personalized themes before and after the current user personalized theme in the ordered set where userId = &#63; and layoutId = &#63;.
    *
    * @param id the primary key of the current user personalized theme
    * @param userId the user ID
    * @param layoutId the layout ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next user personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a user personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme[] findByUserIdAndLayoutId_PrevAndNext(
        long id, long userId, long layoutId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the user personalized themes where userId = &#63;.
    *
    * @param userId the user ID
    * @return the matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findByUserId(
        long userId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the user personalized themes where userId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param userId the user ID
    * @param start the lower bound of the range of user personalized themes
    * @param end the upper bound of the range of user personalized themes (not inclusive)
    * @return the range of matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findByUserId(
        long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the user personalized themes where userId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param userId the user ID
    * @param start the lower bound of the range of user personalized themes
    * @param end the upper bound of the range of user personalized themes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findByUserId(
        long userId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first user personalized theme in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme findByUserId_First(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first user personalized theme in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme fetchByUserId_First(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last user personalized theme in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme findByUserId_Last(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last user personalized theme in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme fetchByUserId_Last(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the user personalized themes before and after the current user personalized theme in the ordered set where userId = &#63;.
    *
    * @param id the primary key of the current user personalized theme
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next user personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a user personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme[] findByUserId_PrevAndNext(
        long id, long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the user personalized themes where themeId = &#63;.
    *
    * @param themeId the theme ID
    * @return the matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findByThemeId(
        java.lang.String themeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the user personalized themes where themeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param themeId the theme ID
    * @param start the lower bound of the range of user personalized themes
    * @param end the upper bound of the range of user personalized themes (not inclusive)
    * @return the range of matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findByThemeId(
        java.lang.String themeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the user personalized themes where themeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param themeId the theme ID
    * @param start the lower bound of the range of user personalized themes
    * @param end the upper bound of the range of user personalized themes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findByThemeId(
        java.lang.String themeId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first user personalized theme in the ordered set where themeId = &#63;.
    *
    * @param themeId the theme ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme findByThemeId_First(
        java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first user personalized theme in the ordered set where themeId = &#63;.
    *
    * @param themeId the theme ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme fetchByThemeId_First(
        java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last user personalized theme in the ordered set where themeId = &#63;.
    *
    * @param themeId the theme ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme findByThemeId_Last(
        java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last user personalized theme in the ordered set where themeId = &#63;.
    *
    * @param themeId the theme ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme fetchByThemeId_Last(
        java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the user personalized themes before and after the current user personalized theme in the ordered set where themeId = &#63;.
    *
    * @param id the primary key of the current user personalized theme
    * @param themeId the theme ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next user personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a user personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme[] findByThemeId_PrevAndNext(
        long id, java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the user personalized themes.
    *
    * @return the user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the user personalized themes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of user personalized themes
    * @param end the upper bound of the range of user personalized themes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the user personalized themes where userId = &#63; and applyForAllPages = &#63; from the database.
    *
    * @param userId the user ID
    * @param applyForAllPages the apply for all pages
    * @throws SystemException if a system exception occurred
    */
    public void removeByUserIdAndApplyForAllPages(long userId,
        boolean applyForAllPages)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the user personalized themes where userId = &#63; and layoutId = &#63; from the database.
    *
    * @param userId the user ID
    * @param layoutId the layout ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUserIdAndLayoutId(long userId, long layoutId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the user personalized themes where userId = &#63; from the database.
    *
    * @param userId the user ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUserId(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the user personalized themes where themeId = &#63; from the database.
    *
    * @param themeId the theme ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByThemeId(java.lang.String themeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the user personalized themes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of user personalized themes where userId = &#63; and applyForAllPages = &#63;.
    *
    * @param userId the user ID
    * @param applyForAllPages the apply for all pages
    * @return the number of matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public int countByUserIdAndApplyForAllPages(long userId,
        boolean applyForAllPages)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of user personalized themes where userId = &#63; and layoutId = &#63;.
    *
    * @param userId the user ID
    * @param layoutId the layout ID
    * @return the number of matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public int countByUserIdAndLayoutId(long userId, long layoutId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of user personalized themes where userId = &#63;.
    *
    * @param userId the user ID
    * @return the number of matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public int countByUserId(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of user personalized themes where themeId = &#63;.
    *
    * @param themeId the theme ID
    * @return the number of matching user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public int countByThemeId(java.lang.String themeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of user personalized themes.
    *
    * @return the number of user personalized themes
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
