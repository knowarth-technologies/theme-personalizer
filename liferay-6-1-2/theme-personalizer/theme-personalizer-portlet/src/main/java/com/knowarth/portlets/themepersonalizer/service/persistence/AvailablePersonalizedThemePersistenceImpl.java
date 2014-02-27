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

import com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException;
import com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme;
import com.knowarth.portlets.themepersonalizer.model.impl.AvailablePersonalizedThemeImpl;
import com.knowarth.portlets.themepersonalizer.model.impl.AvailablePersonalizedThemeModelImpl;
import com.knowarth.portlets.themepersonalizer.service.persistence.AvailablePersonalizedThemePersistence;
import com.knowarth.portlets.themepersonalizer.service.persistence.UserPersonalizedThemePersistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the available personalized theme service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Samir Bhatt
 * @see AvailablePersonalizedThemePersistence
 * @see AvailablePersonalizedThemeUtil
 * @generated
 */
public class AvailablePersonalizedThemePersistenceImpl
    extends BasePersistenceImpl<AvailablePersonalizedTheme>
    implements AvailablePersonalizedThemePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link AvailablePersonalizedThemeUtil} to access the available personalized theme persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = AvailablePersonalizedThemeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            AvailablePersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            AvailablePersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            AvailablePersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            AvailablePersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
            new String[] { Long.class.getName() },
            AvailablePersonalizedThemeModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            AvailablePersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByCompanyId", new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYIDANDTHEMEID =
        new FinderPath(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            AvailablePersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            AvailablePersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByCompanyIdAndThemeId",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDANDTHEMEID =
        new FinderPath(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            AvailablePersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            AvailablePersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByCompanyIdAndThemeId",
            new String[] { Long.class.getName(), String.class.getName() },
            AvailablePersonalizedThemeModelImpl.COMPANYID_COLUMN_BITMASK |
            AvailablePersonalizedThemeModelImpl.THEMEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYIDANDTHEMEID = new FinderPath(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            AvailablePersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByCompanyIdAndThemeId",
            new String[] { Long.class.getName(), String.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            AvailablePersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            AvailablePersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            AvailablePersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            AvailablePersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            AvailablePersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
            new String[0]);
    private static final String _SQL_SELECT_AVAILABLEPERSONALIZEDTHEME = "SELECT availablePersonalizedTheme FROM AvailablePersonalizedTheme availablePersonalizedTheme";
    private static final String _SQL_SELECT_AVAILABLEPERSONALIZEDTHEME_WHERE = "SELECT availablePersonalizedTheme FROM AvailablePersonalizedTheme availablePersonalizedTheme WHERE ";
    private static final String _SQL_COUNT_AVAILABLEPERSONALIZEDTHEME = "SELECT COUNT(availablePersonalizedTheme) FROM AvailablePersonalizedTheme availablePersonalizedTheme";
    private static final String _SQL_COUNT_AVAILABLEPERSONALIZEDTHEME_WHERE = "SELECT COUNT(availablePersonalizedTheme) FROM AvailablePersonalizedTheme availablePersonalizedTheme WHERE ";
    private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "availablePersonalizedTheme.companyId = ?";
    private static final String _FINDER_COLUMN_COMPANYIDANDTHEMEID_COMPANYID_2 = "availablePersonalizedTheme.companyId = ? AND ";
    private static final String _FINDER_COLUMN_COMPANYIDANDTHEMEID_THEMEID_1 = "availablePersonalizedTheme.themeId IS NULL";
    private static final String _FINDER_COLUMN_COMPANYIDANDTHEMEID_THEMEID_2 = "availablePersonalizedTheme.themeId = ?";
    private static final String _FINDER_COLUMN_COMPANYIDANDTHEMEID_THEMEID_3 = "(availablePersonalizedTheme.themeId IS NULL OR availablePersonalizedTheme.themeId = ?)";
    private static final String _ORDER_BY_ENTITY_ALIAS = "availablePersonalizedTheme.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AvailablePersonalizedTheme exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AvailablePersonalizedTheme exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(AvailablePersonalizedThemePersistenceImpl.class);
    private static AvailablePersonalizedTheme _nullAvailablePersonalizedTheme = new AvailablePersonalizedThemeImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<AvailablePersonalizedTheme> toCacheModel() {
                return _nullAvailablePersonalizedThemeCacheModel;
            }
        };

    private static CacheModel<AvailablePersonalizedTheme> _nullAvailablePersonalizedThemeCacheModel =
        new CacheModel<AvailablePersonalizedTheme>() {
            public AvailablePersonalizedTheme toEntityModel() {
                return _nullAvailablePersonalizedTheme;
            }
        };

    @BeanReference(type = AvailablePersonalizedThemePersistence.class)
    protected AvailablePersonalizedThemePersistence availablePersonalizedThemePersistence;
    @BeanReference(type = UserPersonalizedThemePersistence.class)
    protected UserPersonalizedThemePersistence userPersonalizedThemePersistence;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;

    /**
     * Caches the available personalized theme in the entity cache if it is enabled.
     *
     * @param availablePersonalizedTheme the available personalized theme
     */
    public void cacheResult(
        AvailablePersonalizedTheme availablePersonalizedTheme) {
        EntityCacheUtil.putResult(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            AvailablePersonalizedThemeImpl.class,
            availablePersonalizedTheme.getPrimaryKey(),
            availablePersonalizedTheme);

        availablePersonalizedTheme.resetOriginalValues();
    }

    /**
     * Caches the available personalized themes in the entity cache if it is enabled.
     *
     * @param availablePersonalizedThemes the available personalized themes
     */
    public void cacheResult(
        List<AvailablePersonalizedTheme> availablePersonalizedThemes) {
        for (AvailablePersonalizedTheme availablePersonalizedTheme : availablePersonalizedThemes) {
            if (EntityCacheUtil.getResult(
                        AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
                        AvailablePersonalizedThemeImpl.class,
                        availablePersonalizedTheme.getPrimaryKey()) == null) {
                cacheResult(availablePersonalizedTheme);
            } else {
                availablePersonalizedTheme.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all available personalized themes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(AvailablePersonalizedThemeImpl.class.getName());
        }

        EntityCacheUtil.clearCache(AvailablePersonalizedThemeImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the available personalized theme.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(
        AvailablePersonalizedTheme availablePersonalizedTheme) {
        EntityCacheUtil.removeResult(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            AvailablePersonalizedThemeImpl.class,
            availablePersonalizedTheme.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(
        List<AvailablePersonalizedTheme> availablePersonalizedThemes) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (AvailablePersonalizedTheme availablePersonalizedTheme : availablePersonalizedThemes) {
            EntityCacheUtil.removeResult(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
                AvailablePersonalizedThemeImpl.class,
                availablePersonalizedTheme.getPrimaryKey());
        }
    }

    /**
     * Creates a new available personalized theme with the primary key. Does not add the available personalized theme to the database.
     *
     * @param id the primary key for the new available personalized theme
     * @return the new available personalized theme
     */
    public AvailablePersonalizedTheme create(long id) {
        AvailablePersonalizedTheme availablePersonalizedTheme = new AvailablePersonalizedThemeImpl();

        availablePersonalizedTheme.setNew(true);
        availablePersonalizedTheme.setPrimaryKey(id);

        return availablePersonalizedTheme;
    }

    /**
     * Removes the available personalized theme with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the available personalized theme
     * @return the available personalized theme that was removed
     * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a available personalized theme with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public AvailablePersonalizedTheme remove(long id)
        throws NoSuchAvailablePersonalizedThemeException, SystemException {
        return remove(Long.valueOf(id));
    }

    /**
     * Removes the available personalized theme with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the available personalized theme
     * @return the available personalized theme that was removed
     * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a available personalized theme with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AvailablePersonalizedTheme remove(Serializable primaryKey)
        throws NoSuchAvailablePersonalizedThemeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            AvailablePersonalizedTheme availablePersonalizedTheme = (AvailablePersonalizedTheme) session.get(AvailablePersonalizedThemeImpl.class,
                    primaryKey);

            if (availablePersonalizedTheme == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchAvailablePersonalizedThemeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(availablePersonalizedTheme);
        } catch (NoSuchAvailablePersonalizedThemeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected AvailablePersonalizedTheme removeImpl(
        AvailablePersonalizedTheme availablePersonalizedTheme)
        throws SystemException {
        availablePersonalizedTheme = toUnwrappedModel(availablePersonalizedTheme);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, availablePersonalizedTheme);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(availablePersonalizedTheme);

        return availablePersonalizedTheme;
    }

    @Override
    public AvailablePersonalizedTheme updateImpl(
        com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme availablePersonalizedTheme,
        boolean merge) throws SystemException {
        availablePersonalizedTheme = toUnwrappedModel(availablePersonalizedTheme);

        boolean isNew = availablePersonalizedTheme.isNew();

        AvailablePersonalizedThemeModelImpl availablePersonalizedThemeModelImpl = (AvailablePersonalizedThemeModelImpl) availablePersonalizedTheme;

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, availablePersonalizedTheme, merge);

            availablePersonalizedTheme.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew ||
                !AvailablePersonalizedThemeModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((availablePersonalizedThemeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(availablePersonalizedThemeModelImpl.getOriginalCompanyId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);

                args = new Object[] {
                        Long.valueOf(availablePersonalizedThemeModelImpl.getCompanyId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);
            }

            if ((availablePersonalizedThemeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDANDTHEMEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(availablePersonalizedThemeModelImpl.getOriginalCompanyId()),
                        
                        availablePersonalizedThemeModelImpl.getOriginalThemeId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYIDANDTHEMEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDANDTHEMEID,
                    args);

                args = new Object[] {
                        Long.valueOf(availablePersonalizedThemeModelImpl.getCompanyId()),
                        
                        availablePersonalizedThemeModelImpl.getThemeId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYIDANDTHEMEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDANDTHEMEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            AvailablePersonalizedThemeImpl.class,
            availablePersonalizedTheme.getPrimaryKey(),
            availablePersonalizedTheme);

        return availablePersonalizedTheme;
    }

    protected AvailablePersonalizedTheme toUnwrappedModel(
        AvailablePersonalizedTheme availablePersonalizedTheme) {
        if (availablePersonalizedTheme instanceof AvailablePersonalizedThemeImpl) {
            return availablePersonalizedTheme;
        }

        AvailablePersonalizedThemeImpl availablePersonalizedThemeImpl = new AvailablePersonalizedThemeImpl();

        availablePersonalizedThemeImpl.setNew(availablePersonalizedTheme.isNew());
        availablePersonalizedThemeImpl.setPrimaryKey(availablePersonalizedTheme.getPrimaryKey());

        availablePersonalizedThemeImpl.setId(availablePersonalizedTheme.getId());
        availablePersonalizedThemeImpl.setCompanyId(availablePersonalizedTheme.getCompanyId());
        availablePersonalizedThemeImpl.setThemeId(availablePersonalizedTheme.getThemeId());

        return availablePersonalizedThemeImpl;
    }

    /**
     * Returns the available personalized theme with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the available personalized theme
     * @return the available personalized theme
     * @throws com.liferay.portal.NoSuchModelException if a available personalized theme with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AvailablePersonalizedTheme findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the available personalized theme with the primary key or throws a {@link com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException} if it could not be found.
     *
     * @param id the primary key of the available personalized theme
     * @return the available personalized theme
     * @throws com.knowarth.portlets.themepersonalizer.NoSuchAvailablePersonalizedThemeException if a available personalized theme with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public AvailablePersonalizedTheme findByPrimaryKey(long id)
        throws NoSuchAvailablePersonalizedThemeException, SystemException {
        AvailablePersonalizedTheme availablePersonalizedTheme = fetchByPrimaryKey(id);

        if (availablePersonalizedTheme == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
            }

            throw new NoSuchAvailablePersonalizedThemeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                id);
        }

        return availablePersonalizedTheme;
    }

    /**
     * Returns the available personalized theme with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the available personalized theme
     * @return the available personalized theme, or <code>null</code> if a available personalized theme with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AvailablePersonalizedTheme fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the available personalized theme with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the available personalized theme
     * @return the available personalized theme, or <code>null</code> if a available personalized theme with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public AvailablePersonalizedTheme fetchByPrimaryKey(long id)
        throws SystemException {
        AvailablePersonalizedTheme availablePersonalizedTheme = (AvailablePersonalizedTheme) EntityCacheUtil.getResult(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
                AvailablePersonalizedThemeImpl.class, id);

        if (availablePersonalizedTheme == _nullAvailablePersonalizedTheme) {
            return null;
        }

        if (availablePersonalizedTheme == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                availablePersonalizedTheme = (AvailablePersonalizedTheme) session.get(AvailablePersonalizedThemeImpl.class,
                        Long.valueOf(id));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (availablePersonalizedTheme != null) {
                    cacheResult(availablePersonalizedTheme);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(AvailablePersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
                        AvailablePersonalizedThemeImpl.class, id,
                        _nullAvailablePersonalizedTheme);
                }

                closeSession(session);
            }
        }

        return availablePersonalizedTheme;
    }

    /**
     * Returns all the available personalized themes where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the matching available personalized themes
     * @throws SystemException if a system exception occurred
     */
    public List<AvailablePersonalizedTheme> findByCompanyId(long companyId)
        throws SystemException {
        return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    public List<AvailablePersonalizedTheme> findByCompanyId(long companyId,
        int start, int end) throws SystemException {
        return findByCompanyId(companyId, start, end, null);
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
    public List<AvailablePersonalizedTheme> findByCompanyId(long companyId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
            finderArgs = new Object[] { companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
            finderArgs = new Object[] { companyId, start, end, orderByComparator };
        }

        List<AvailablePersonalizedTheme> list = (List<AvailablePersonalizedTheme>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (AvailablePersonalizedTheme availablePersonalizedTheme : list) {
                if ((companyId != availablePersonalizedTheme.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(2);
            }

            query.append(_SQL_SELECT_AVAILABLEPERSONALIZEDTHEME_WHERE);

            query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                list = (List<AvailablePersonalizedTheme>) QueryUtil.list(q,
                        getDialect(), start, end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
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
    public AvailablePersonalizedTheme findByCompanyId_First(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchAvailablePersonalizedThemeException, SystemException {
        AvailablePersonalizedTheme availablePersonalizedTheme = fetchByCompanyId_First(companyId,
                orderByComparator);

        if (availablePersonalizedTheme != null) {
            return availablePersonalizedTheme;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAvailablePersonalizedThemeException(msg.toString());
    }

    /**
     * Returns the first available personalized theme in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching available personalized theme, or <code>null</code> if a matching available personalized theme could not be found
     * @throws SystemException if a system exception occurred
     */
    public AvailablePersonalizedTheme fetchByCompanyId_First(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<AvailablePersonalizedTheme> list = findByCompanyId(companyId, 0,
                1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public AvailablePersonalizedTheme findByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchAvailablePersonalizedThemeException, SystemException {
        AvailablePersonalizedTheme availablePersonalizedTheme = fetchByCompanyId_Last(companyId,
                orderByComparator);

        if (availablePersonalizedTheme != null) {
            return availablePersonalizedTheme;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAvailablePersonalizedThemeException(msg.toString());
    }

    /**
     * Returns the last available personalized theme in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching available personalized theme, or <code>null</code> if a matching available personalized theme could not be found
     * @throws SystemException if a system exception occurred
     */
    public AvailablePersonalizedTheme fetchByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCompanyId(companyId);

        List<AvailablePersonalizedTheme> list = findByCompanyId(companyId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public AvailablePersonalizedTheme[] findByCompanyId_PrevAndNext(long id,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchAvailablePersonalizedThemeException, SystemException {
        AvailablePersonalizedTheme availablePersonalizedTheme = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            AvailablePersonalizedTheme[] array = new AvailablePersonalizedThemeImpl[3];

            array[0] = getByCompanyId_PrevAndNext(session,
                    availablePersonalizedTheme, companyId, orderByComparator,
                    true);

            array[1] = availablePersonalizedTheme;

            array[2] = getByCompanyId_PrevAndNext(session,
                    availablePersonalizedTheme, companyId, orderByComparator,
                    false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected AvailablePersonalizedTheme getByCompanyId_PrevAndNext(
        Session session, AvailablePersonalizedTheme availablePersonalizedTheme,
        long companyId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AVAILABLEPERSONALIZEDTHEME_WHERE);

        query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(availablePersonalizedTheme);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<AvailablePersonalizedTheme> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the available personalized themes where companyId = &#63; and themeId = &#63;.
     *
     * @param companyId the company ID
     * @param themeId the theme ID
     * @return the matching available personalized themes
     * @throws SystemException if a system exception occurred
     */
    public List<AvailablePersonalizedTheme> findByCompanyIdAndThemeId(
        long companyId, String themeId) throws SystemException {
        return findByCompanyIdAndThemeId(companyId, themeId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    public List<AvailablePersonalizedTheme> findByCompanyIdAndThemeId(
        long companyId, String themeId, int start, int end)
        throws SystemException {
        return findByCompanyIdAndThemeId(companyId, themeId, start, end, null);
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
    public List<AvailablePersonalizedTheme> findByCompanyIdAndThemeId(
        long companyId, String themeId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYIDANDTHEMEID;
            finderArgs = new Object[] { companyId, themeId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYIDANDTHEMEID;
            finderArgs = new Object[] {
                    companyId, themeId,
                    
                    start, end, orderByComparator
                };
        }

        List<AvailablePersonalizedTheme> list = (List<AvailablePersonalizedTheme>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (AvailablePersonalizedTheme availablePersonalizedTheme : list) {
                if ((companyId != availablePersonalizedTheme.getCompanyId()) ||
                        !Validator.equals(themeId,
                            availablePersonalizedTheme.getThemeId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_AVAILABLEPERSONALIZEDTHEME_WHERE);

            query.append(_FINDER_COLUMN_COMPANYIDANDTHEMEID_COMPANYID_2);

            if (themeId == null) {
                query.append(_FINDER_COLUMN_COMPANYIDANDTHEMEID_THEMEID_1);
            } else {
                if (themeId.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_COMPANYIDANDTHEMEID_THEMEID_3);
                } else {
                    query.append(_FINDER_COLUMN_COMPANYIDANDTHEMEID_THEMEID_2);
                }
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                if (themeId != null) {
                    qPos.add(themeId);
                }

                list = (List<AvailablePersonalizedTheme>) QueryUtil.list(q,
                        getDialect(), start, end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
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
    public AvailablePersonalizedTheme findByCompanyIdAndThemeId_First(
        long companyId, String themeId, OrderByComparator orderByComparator)
        throws NoSuchAvailablePersonalizedThemeException, SystemException {
        AvailablePersonalizedTheme availablePersonalizedTheme = fetchByCompanyIdAndThemeId_First(companyId,
                themeId, orderByComparator);

        if (availablePersonalizedTheme != null) {
            return availablePersonalizedTheme;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(", themeId=");
        msg.append(themeId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAvailablePersonalizedThemeException(msg.toString());
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
    public AvailablePersonalizedTheme fetchByCompanyIdAndThemeId_First(
        long companyId, String themeId, OrderByComparator orderByComparator)
        throws SystemException {
        List<AvailablePersonalizedTheme> list = findByCompanyIdAndThemeId(companyId,
                themeId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public AvailablePersonalizedTheme findByCompanyIdAndThemeId_Last(
        long companyId, String themeId, OrderByComparator orderByComparator)
        throws NoSuchAvailablePersonalizedThemeException, SystemException {
        AvailablePersonalizedTheme availablePersonalizedTheme = fetchByCompanyIdAndThemeId_Last(companyId,
                themeId, orderByComparator);

        if (availablePersonalizedTheme != null) {
            return availablePersonalizedTheme;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(", themeId=");
        msg.append(themeId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAvailablePersonalizedThemeException(msg.toString());
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
    public AvailablePersonalizedTheme fetchByCompanyIdAndThemeId_Last(
        long companyId, String themeId, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByCompanyIdAndThemeId(companyId, themeId);

        List<AvailablePersonalizedTheme> list = findByCompanyIdAndThemeId(companyId,
                themeId, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public AvailablePersonalizedTheme[] findByCompanyIdAndThemeId_PrevAndNext(
        long id, long companyId, String themeId,
        OrderByComparator orderByComparator)
        throws NoSuchAvailablePersonalizedThemeException, SystemException {
        AvailablePersonalizedTheme availablePersonalizedTheme = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            AvailablePersonalizedTheme[] array = new AvailablePersonalizedThemeImpl[3];

            array[0] = getByCompanyIdAndThemeId_PrevAndNext(session,
                    availablePersonalizedTheme, companyId, themeId,
                    orderByComparator, true);

            array[1] = availablePersonalizedTheme;

            array[2] = getByCompanyIdAndThemeId_PrevAndNext(session,
                    availablePersonalizedTheme, companyId, themeId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected AvailablePersonalizedTheme getByCompanyIdAndThemeId_PrevAndNext(
        Session session, AvailablePersonalizedTheme availablePersonalizedTheme,
        long companyId, String themeId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AVAILABLEPERSONALIZEDTHEME_WHERE);

        query.append(_FINDER_COLUMN_COMPANYIDANDTHEMEID_COMPANYID_2);

        if (themeId == null) {
            query.append(_FINDER_COLUMN_COMPANYIDANDTHEMEID_THEMEID_1);
        } else {
            if (themeId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_COMPANYIDANDTHEMEID_THEMEID_3);
            } else {
                query.append(_FINDER_COLUMN_COMPANYIDANDTHEMEID_THEMEID_2);
            }
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(companyId);

        if (themeId != null) {
            qPos.add(themeId);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(availablePersonalizedTheme);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<AvailablePersonalizedTheme> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the available personalized themes.
     *
     * @return the available personalized themes
     * @throws SystemException if a system exception occurred
     */
    public List<AvailablePersonalizedTheme> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<AvailablePersonalizedTheme> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    public List<AvailablePersonalizedTheme> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = new Object[] { start, end, orderByComparator };

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<AvailablePersonalizedTheme> list = (List<AvailablePersonalizedTheme>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_AVAILABLEPERSONALIZEDTHEME);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_AVAILABLEPERSONALIZEDTHEME;
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<AvailablePersonalizedTheme>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<AvailablePersonalizedTheme>) QueryUtil.list(q,
                            getDialect(), start, end);
                }
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the available personalized themes where companyId = &#63; from the database.
     *
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByCompanyId(long companyId) throws SystemException {
        for (AvailablePersonalizedTheme availablePersonalizedTheme : findByCompanyId(
                companyId)) {
            remove(availablePersonalizedTheme);
        }
    }

    /**
     * Removes all the available personalized themes where companyId = &#63; and themeId = &#63; from the database.
     *
     * @param companyId the company ID
     * @param themeId the theme ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByCompanyIdAndThemeId(long companyId, String themeId)
        throws SystemException {
        for (AvailablePersonalizedTheme availablePersonalizedTheme : findByCompanyIdAndThemeId(
                companyId, themeId)) {
            remove(availablePersonalizedTheme);
        }
    }

    /**
     * Removes all the available personalized themes from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (AvailablePersonalizedTheme availablePersonalizedTheme : findAll()) {
            remove(availablePersonalizedTheme);
        }
    }

    /**
     * Returns the number of available personalized themes where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the number of matching available personalized themes
     * @throws SystemException if a system exception occurred
     */
    public int countByCompanyId(long companyId) throws SystemException {
        Object[] finderArgs = new Object[] { companyId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_COMPANYID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_AVAILABLEPERSONALIZEDTHEME_WHERE);

            query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of available personalized themes where companyId = &#63; and themeId = &#63;.
     *
     * @param companyId the company ID
     * @param themeId the theme ID
     * @return the number of matching available personalized themes
     * @throws SystemException if a system exception occurred
     */
    public int countByCompanyIdAndThemeId(long companyId, String themeId)
        throws SystemException {
        Object[] finderArgs = new Object[] { companyId, themeId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_COMPANYIDANDTHEMEID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_AVAILABLEPERSONALIZEDTHEME_WHERE);

            query.append(_FINDER_COLUMN_COMPANYIDANDTHEMEID_COMPANYID_2);

            if (themeId == null) {
                query.append(_FINDER_COLUMN_COMPANYIDANDTHEMEID_THEMEID_1);
            } else {
                if (themeId.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_COMPANYIDANDTHEMEID_THEMEID_3);
                } else {
                    query.append(_FINDER_COLUMN_COMPANYIDANDTHEMEID_THEMEID_2);
                }
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                if (themeId != null) {
                    qPos.add(themeId);
                }

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COMPANYIDANDTHEMEID,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of available personalized themes.
     *
     * @return the number of available personalized themes
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_AVAILABLEPERSONALIZEDTHEME);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the available personalized theme persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<AvailablePersonalizedTheme>> listenersList = new ArrayList<ModelListener<AvailablePersonalizedTheme>>();

                for (String listenerClassName : listenerClassNames) {
                    Class<?> clazz = getClass();

                    listenersList.add((ModelListener<AvailablePersonalizedTheme>) InstanceFactory.newInstance(
                            clazz.getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(AvailablePersonalizedThemeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
