package com.knowarth.portlets.themepersonalizer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AvailablePersonalizedThemeLocalService}.
 *
 * @author Samir Bhatt
 * @see AvailablePersonalizedThemeLocalService
 * @generated
 */
public class AvailablePersonalizedThemeLocalServiceWrapper
    implements AvailablePersonalizedThemeLocalService,
        ServiceWrapper<AvailablePersonalizedThemeLocalService> {
    private AvailablePersonalizedThemeLocalService _availablePersonalizedThemeLocalService;

    public AvailablePersonalizedThemeLocalServiceWrapper(
        AvailablePersonalizedThemeLocalService availablePersonalizedThemeLocalService) {
        _availablePersonalizedThemeLocalService = availablePersonalizedThemeLocalService;
    }

    /**
    * Adds the available personalized theme to the database. Also notifies the appropriate model listeners.
    *
    * @param availablePersonalizedTheme the available personalized theme
    * @return the available personalized theme that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme addAvailablePersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme availablePersonalizedTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.addAvailablePersonalizedTheme(availablePersonalizedTheme);
    }

    /**
    * Creates a new available personalized theme with the primary key. Does not add the available personalized theme to the database.
    *
    * @param id the primary key for the new available personalized theme
    * @return the new available personalized theme
    */
    @Override
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme createAvailablePersonalizedTheme(
        long id) {
        return _availablePersonalizedThemeLocalService.createAvailablePersonalizedTheme(id);
    }

    /**
    * Deletes the available personalized theme with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the available personalized theme
    * @return the available personalized theme that was removed
    * @throws PortalException if a available personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme deleteAvailablePersonalizedTheme(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.deleteAvailablePersonalizedTheme(id);
    }

    /**
    * Deletes the available personalized theme from the database. Also notifies the appropriate model listeners.
    *
    * @param availablePersonalizedTheme the available personalized theme
    * @return the available personalized theme that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme deleteAvailablePersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme availablePersonalizedTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.deleteAvailablePersonalizedTheme(availablePersonalizedTheme);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _availablePersonalizedThemeLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.AvailablePersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.AvailablePersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme fetchAvailablePersonalizedTheme(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.fetchAvailablePersonalizedTheme(id);
    }

    /**
    * Returns the available personalized theme with the primary key.
    *
    * @param id the primary key of the available personalized theme
    * @return the available personalized theme
    * @throws PortalException if a available personalized theme with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme getAvailablePersonalizedTheme(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.getAvailablePersonalizedTheme(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.getPersistedModel(primaryKeyObj);
    }

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
    @Override
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> getAvailablePersonalizedThemes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.getAvailablePersonalizedThemes(start,
            end);
    }

    /**
    * Returns the number of available personalized themes.
    *
    * @return the number of available personalized themes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getAvailablePersonalizedThemesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.getAvailablePersonalizedThemesCount();
    }

    /**
    * Updates the available personalized theme in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param availablePersonalizedTheme the available personalized theme
    * @return the available personalized theme that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme updateAvailablePersonalizedTheme(
        com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme availablePersonalizedTheme)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.updateAvailablePersonalizedTheme(availablePersonalizedTheme);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _availablePersonalizedThemeLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _availablePersonalizedThemeLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _availablePersonalizedThemeLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme addAvailablePersonalizedTheme(
        long companyId, java.lang.String themeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.addAvailablePersonalizedTheme(companyId,
            themeId);
    }

    @Override
    public void removeAllByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        _availablePersonalizedThemeLocalService.removeAllByCompanyId(companyId);
    }

    @Override
    public java.util.List<com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme> findAllByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _availablePersonalizedThemeLocalService.findAllByCompanyId(companyId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AvailablePersonalizedThemeLocalService getWrappedAvailablePersonalizedThemeLocalService() {
        return _availablePersonalizedThemeLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAvailablePersonalizedThemeLocalService(
        AvailablePersonalizedThemeLocalService availablePersonalizedThemeLocalService) {
        _availablePersonalizedThemeLocalService = availablePersonalizedThemeLocalService;
    }

    @Override
    public AvailablePersonalizedThemeLocalService getWrappedService() {
        return _availablePersonalizedThemeLocalService;
    }

    @Override
    public void setWrappedService(
        AvailablePersonalizedThemeLocalService availablePersonalizedThemeLocalService) {
        _availablePersonalizedThemeLocalService = availablePersonalizedThemeLocalService;
    }
}
