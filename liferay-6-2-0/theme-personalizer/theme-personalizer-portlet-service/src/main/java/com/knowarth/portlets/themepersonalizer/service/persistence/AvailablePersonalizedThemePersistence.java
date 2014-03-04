package com.knowarth.portlets.themepersonalizer.service.persistence;

import com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the available personalized theme service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Samir Bhatt
 * @see AvailablePersonalizedThemePersistenceImpl
 * @see AvailablePersonalizedThemeUtil
 * @generated
 */
public interface AvailablePersonalizedThemePersistence extends BasePersistence<AvailablePersonalizedTheme> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AvailablePersonalizedThemeUtil} to access the available personalized theme persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the available personalized themes where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the available personalized themes where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.AvailablePersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of available personalized themes
    * @param end the upper bound of the range of available personalized themes (not inclusive)
    * @return the range of matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findByCompanyId(
        long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the available personalized themes where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.AvailablePersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of available personalized themes
    * @param end the upper bound of the range of available personalized themes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findByCompanyId(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first available personalized theme in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching available personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a matching available personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme findByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first available personalized theme in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching available personalized theme, or <code>null</code> if a matching available personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme fetchByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last available personalized theme in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching available personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a matching available personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme findByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last available personalized theme in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching available personalized theme, or <code>null</code> if a matching available personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme fetchByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme[] findByCompanyId_PrevAndNext(
        long id, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the available personalized themes where companyId = &#63; from the database.
    *
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of available personalized themes where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the number of matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public int countByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the available personalized themes where companyId = &#63; and themeId = &#63;.
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @return the matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findByCompanyIdAndThemeId(
        long companyId, java.lang.String themeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the available personalized themes where companyId = &#63; and themeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.AvailablePersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @param start the lower bound of the range of available personalized themes
    * @param end the upper bound of the range of available personalized themes (not inclusive)
    * @return the range of matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findByCompanyIdAndThemeId(
        long companyId, java.lang.String themeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the available personalized themes where companyId = &#63; and themeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.AvailablePersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findByCompanyIdAndThemeId(
        long companyId, java.lang.String themeId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme findByCompanyIdAndThemeId_First(
        long companyId, java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first available personalized theme in the ordered set where companyId = &#63; and themeId = &#63;.
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching available personalized theme, or <code>null</code> if a matching available personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme fetchByCompanyIdAndThemeId_First(
        long companyId, java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme findByCompanyIdAndThemeId_Last(
        long companyId, java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last available personalized theme in the ordered set where companyId = &#63; and themeId = &#63;.
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching available personalized theme, or <code>null</code> if a matching available personalized theme could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme fetchByCompanyIdAndThemeId_Last(
        long companyId, java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme[] findByCompanyIdAndThemeId_PrevAndNext(
        long id, long companyId, java.lang.String themeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the available personalized themes where companyId = &#63; and themeId = &#63; from the database.
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByCompanyIdAndThemeId(long companyId,
        java.lang.String themeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of available personalized themes where companyId = &#63; and themeId = &#63;.
    *
    * @param companyId the company ID
    * @param themeId the theme ID
    * @return the number of matching available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public int countByCompanyIdAndThemeId(long companyId,
        java.lang.String themeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the available personalized theme in the entity cache if it is enabled.
    *
    * @param availablePersonalizedTheme the available personalized theme
    */
    public void cacheResult(
        com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme availablePersonalizedTheme);

    /**
    * Caches the available personalized themes in the entity cache if it is enabled.
    *
    * @param availablePersonalizedThemes the available personalized themes
    */
    public void cacheResult(
        java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> availablePersonalizedThemes);

    /**
    * Creates a new available personalized theme with the primary key. Does not add the available personalized theme to the database.
    *
    * @param id the primary key for the new available personalized theme
    * @return the new available personalized theme
    */
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme create(
        long id);

    /**
    * Removes the available personalized theme with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the available personalized theme
    * @return the available personalized theme that was removed
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a available personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme remove(
        long id)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme updateImpl(
        com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme availablePersonalizedTheme)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the available personalized theme with the primary key or throws a {@link com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException} if it could not be found.
    *
    * @param id the primary key of the available personalized theme
    * @return the available personalized theme
    * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a available personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme findByPrimaryKey(
        long id)
        throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the available personalized theme with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the available personalized theme
    * @return the available personalized theme, or <code>null</code> if a available personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the available personalized themes.
    *
    * @return the available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the available personalized themes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.AvailablePersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of available personalized themes
    * @param end the upper bound of the range of available personalized themes (not inclusive)
    * @return the range of available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the available personalized themes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.AvailablePersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of available personalized themes
    * @param end the upper bound of the range of available personalized themes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the available personalized themes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of available personalized themes.
    *
    * @return the number of available personalized themes
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
