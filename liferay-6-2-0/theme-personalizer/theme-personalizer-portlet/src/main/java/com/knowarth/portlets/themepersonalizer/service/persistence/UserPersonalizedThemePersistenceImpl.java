package com.knowarth.portlets.themepersonalizer.service.persistence;

import com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException;
import com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme;
import com.knowarth.portlets.themepersonalizer.model.impl.UserPersonalizedThemeImpl;
import com.knowarth.portlets.themepersonalizer.model.impl.UserPersonalizedThemeModelImpl;
import com.knowarth.portlets.themepersonalizer.service.persistence.UserPersonalizedThemePersistence;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the user personalized theme service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Samir Bhatt
 * @see UserPersonalizedThemePersistence
 * @see UserPersonalizedThemeUtil
 * @generated
 */
public class UserPersonalizedThemePersistenceImpl extends BasePersistenceImpl<UserPersonalizedTheme>
    implements UserPersonalizedThemePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link UserPersonalizedThemeUtil} to access the user personalized theme persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = UserPersonalizedThemeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            UserPersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            UserPersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERIDANDAPPLYFORALLPAGES =
        new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            UserPersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByUserIdAndApplyForAllPages",
            new String[] {
                Long.class.getName(), Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDANDAPPLYFORALLPAGES =
        new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            UserPersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByUserIdAndApplyForAllPages",
            new String[] { Long.class.getName(), Boolean.class.getName() },
            UserPersonalizedThemeModelImpl.USERID_COLUMN_BITMASK |
            UserPersonalizedThemeModelImpl.APPLYFORALLPAGES_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_USERIDANDAPPLYFORALLPAGES =
        new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByUserIdAndApplyForAllPages",
            new String[] { Long.class.getName(), Boolean.class.getName() });
    private static final String _FINDER_COLUMN_USERIDANDAPPLYFORALLPAGES_USERID_2 =
        "userPersonalizedTheme.userId = ? AND ";
    private static final String _FINDER_COLUMN_USERIDANDAPPLYFORALLPAGES_APPLYFORALLPAGES_2 =
        "userPersonalizedTheme.applyForAllPages = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERIDANDLAYOUTID =
        new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            UserPersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserIdAndLayoutId",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDANDLAYOUTID =
        new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            UserPersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByUserIdAndLayoutId",
            new String[] { Long.class.getName(), Long.class.getName() },
            UserPersonalizedThemeModelImpl.USERID_COLUMN_BITMASK |
            UserPersonalizedThemeModelImpl.LAYOUTID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_USERIDANDLAYOUTID = new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByUserIdAndLayoutId",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_USERIDANDLAYOUTID_USERID_2 = "userPersonalizedTheme.userId = ? AND ";
    private static final String _FINDER_COLUMN_USERIDANDLAYOUTID_LAYOUTID_2 = "userPersonalizedTheme.layoutId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            UserPersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
        new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            UserPersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
            new String[] { Long.class.getName() },
            UserPersonalizedThemeModelImpl.USERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_USERID_USERID_2 = "userPersonalizedTheme.userId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_THEMEID = new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            UserPersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByThemeId",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THEMEID =
        new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED,
            UserPersonalizedThemeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByThemeId",
            new String[] { String.class.getName() },
            UserPersonalizedThemeModelImpl.THEMEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_THEMEID = new FinderPath(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByThemeId",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_THEMEID_THEMEID_1 = "userPersonalizedTheme.themeId IS NULL";
    private static final String _FINDER_COLUMN_THEMEID_THEMEID_2 = "userPersonalizedTheme.themeId = ?";
    private static final String _FINDER_COLUMN_THEMEID_THEMEID_3 = "(userPersonalizedTheme.themeId IS NULL OR userPersonalizedTheme.themeId = '')";
    private static final String _SQL_SELECT_USERPERSONALIZEDTHEME = "SELECT userPersonalizedTheme FROM UserPersonalizedTheme userPersonalizedTheme";
    private static final String _SQL_SELECT_USERPERSONALIZEDTHEME_WHERE = "SELECT userPersonalizedTheme FROM UserPersonalizedTheme userPersonalizedTheme WHERE ";
    private static final String _SQL_COUNT_USERPERSONALIZEDTHEME = "SELECT COUNT(userPersonalizedTheme) FROM UserPersonalizedTheme userPersonalizedTheme";
    private static final String _SQL_COUNT_USERPERSONALIZEDTHEME_WHERE = "SELECT COUNT(userPersonalizedTheme) FROM UserPersonalizedTheme userPersonalizedTheme WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "userPersonalizedTheme.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserPersonalizedTheme exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserPersonalizedTheme exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(UserPersonalizedThemePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static UserPersonalizedTheme _nullUserPersonalizedTheme = new UserPersonalizedThemeImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<UserPersonalizedTheme> toCacheModel() {
                return _nullUserPersonalizedThemeCacheModel;
            }
        };

    private static CacheModel<UserPersonalizedTheme> _nullUserPersonalizedThemeCacheModel =
        new CacheModel<UserPersonalizedTheme>() {
            @Override
            public UserPersonalizedTheme toEntityModel() {
                return _nullUserPersonalizedTheme;
            }
        };

    public UserPersonalizedThemePersistenceImpl() {
        setModelClass(UserPersonalizedTheme.class);
    }

    /**
     * Returns all the user personalized themes where userId = &#63; and applyForAllPages = &#63;.
     *
     * @param userId the user ID
     * @param applyForAllPages the apply for all pages
     * @return the matching user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserPersonalizedTheme> findByUserIdAndApplyForAllPages(
        long userId, boolean applyForAllPages) throws SystemException {
        return findByUserIdAndApplyForAllPages(userId, applyForAllPages,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the user personalized themes where userId = &#63; and applyForAllPages = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.UserPersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param userId the user ID
     * @param applyForAllPages the apply for all pages
     * @param start the lower bound of the range of user personalized themes
     * @param end the upper bound of the range of user personalized themes (not inclusive)
     * @return the range of matching user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserPersonalizedTheme> findByUserIdAndApplyForAllPages(
        long userId, boolean applyForAllPages, int start, int end)
        throws SystemException {
        return findByUserIdAndApplyForAllPages(userId, applyForAllPages, start,
            end, null);
    }

    /**
     * Returns an ordered range of all the user personalized themes where userId = &#63; and applyForAllPages = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.UserPersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    @Override
    public List<UserPersonalizedTheme> findByUserIdAndApplyForAllPages(
        long userId, boolean applyForAllPages, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDANDAPPLYFORALLPAGES;
            finderArgs = new Object[] { userId, applyForAllPages };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERIDANDAPPLYFORALLPAGES;
            finderArgs = new Object[] {
                    userId, applyForAllPages,
                    
                    start, end, orderByComparator
                };
        }

        List<UserPersonalizedTheme> list = (List<UserPersonalizedTheme>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (UserPersonalizedTheme userPersonalizedTheme : list) {
                if ((userId != userPersonalizedTheme.getUserId()) ||
                        (applyForAllPages != userPersonalizedTheme.getApplyForAllPages())) {
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
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_USERPERSONALIZEDTHEME_WHERE);

            query.append(_FINDER_COLUMN_USERIDANDAPPLYFORALLPAGES_USERID_2);

            query.append(_FINDER_COLUMN_USERIDANDAPPLYFORALLPAGES_APPLYFORALLPAGES_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(UserPersonalizedThemeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                qPos.add(applyForAllPages);

                if (!pagination) {
                    list = (List<UserPersonalizedTheme>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UserPersonalizedTheme>(list);
                } else {
                    list = (List<UserPersonalizedTheme>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

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
    @Override
    public UserPersonalizedTheme findByUserIdAndApplyForAllPages_First(
        long userId, boolean applyForAllPages,
        OrderByComparator orderByComparator)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        UserPersonalizedTheme userPersonalizedTheme = fetchByUserIdAndApplyForAllPages_First(userId,
                applyForAllPages, orderByComparator);

        if (userPersonalizedTheme != null) {
            return userPersonalizedTheme;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("userId=");
        msg.append(userId);

        msg.append(", applyForAllPages=");
        msg.append(applyForAllPages);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserPersonalizedThemeException(msg.toString());
    }

    /**
     * Returns the first user personalized theme in the ordered set where userId = &#63; and applyForAllPages = &#63;.
     *
     * @param userId the user ID
     * @param applyForAllPages the apply for all pages
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme fetchByUserIdAndApplyForAllPages_First(
        long userId, boolean applyForAllPages,
        OrderByComparator orderByComparator) throws SystemException {
        List<UserPersonalizedTheme> list = findByUserIdAndApplyForAllPages(userId,
                applyForAllPages, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public UserPersonalizedTheme findByUserIdAndApplyForAllPages_Last(
        long userId, boolean applyForAllPages,
        OrderByComparator orderByComparator)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        UserPersonalizedTheme userPersonalizedTheme = fetchByUserIdAndApplyForAllPages_Last(userId,
                applyForAllPages, orderByComparator);

        if (userPersonalizedTheme != null) {
            return userPersonalizedTheme;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("userId=");
        msg.append(userId);

        msg.append(", applyForAllPages=");
        msg.append(applyForAllPages);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserPersonalizedThemeException(msg.toString());
    }

    /**
     * Returns the last user personalized theme in the ordered set where userId = &#63; and applyForAllPages = &#63;.
     *
     * @param userId the user ID
     * @param applyForAllPages the apply for all pages
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme fetchByUserIdAndApplyForAllPages_Last(
        long userId, boolean applyForAllPages,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUserIdAndApplyForAllPages(userId, applyForAllPages);

        if (count == 0) {
            return null;
        }

        List<UserPersonalizedTheme> list = findByUserIdAndApplyForAllPages(userId,
                applyForAllPages, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public UserPersonalizedTheme[] findByUserIdAndApplyForAllPages_PrevAndNext(
        long id, long userId, boolean applyForAllPages,
        OrderByComparator orderByComparator)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        UserPersonalizedTheme userPersonalizedTheme = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            UserPersonalizedTheme[] array = new UserPersonalizedThemeImpl[3];

            array[0] = getByUserIdAndApplyForAllPages_PrevAndNext(session,
                    userPersonalizedTheme, userId, applyForAllPages,
                    orderByComparator, true);

            array[1] = userPersonalizedTheme;

            array[2] = getByUserIdAndApplyForAllPages_PrevAndNext(session,
                    userPersonalizedTheme, userId, applyForAllPages,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected UserPersonalizedTheme getByUserIdAndApplyForAllPages_PrevAndNext(
        Session session, UserPersonalizedTheme userPersonalizedTheme,
        long userId, boolean applyForAllPages,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_USERPERSONALIZEDTHEME_WHERE);

        query.append(_FINDER_COLUMN_USERIDANDAPPLYFORALLPAGES_USERID_2);

        query.append(_FINDER_COLUMN_USERIDANDAPPLYFORALLPAGES_APPLYFORALLPAGES_2);

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
        } else {
            query.append(UserPersonalizedThemeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(userId);

        qPos.add(applyForAllPages);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(userPersonalizedTheme);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<UserPersonalizedTheme> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the user personalized themes where userId = &#63; and applyForAllPages = &#63; from the database.
     *
     * @param userId the user ID
     * @param applyForAllPages the apply for all pages
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUserIdAndApplyForAllPages(long userId,
        boolean applyForAllPages) throws SystemException {
        for (UserPersonalizedTheme userPersonalizedTheme : findByUserIdAndApplyForAllPages(
                userId, applyForAllPages, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
                null)) {
            remove(userPersonalizedTheme);
        }
    }

    /**
     * Returns the number of user personalized themes where userId = &#63; and applyForAllPages = &#63;.
     *
     * @param userId the user ID
     * @param applyForAllPages the apply for all pages
     * @return the number of matching user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUserIdAndApplyForAllPages(long userId,
        boolean applyForAllPages) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_USERIDANDAPPLYFORALLPAGES;

        Object[] finderArgs = new Object[] { userId, applyForAllPages };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_USERPERSONALIZEDTHEME_WHERE);

            query.append(_FINDER_COLUMN_USERIDANDAPPLYFORALLPAGES_USERID_2);

            query.append(_FINDER_COLUMN_USERIDANDAPPLYFORALLPAGES_APPLYFORALLPAGES_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                qPos.add(applyForAllPages);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the user personalized themes where userId = &#63; and layoutId = &#63;.
     *
     * @param userId the user ID
     * @param layoutId the layout ID
     * @return the matching user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserPersonalizedTheme> findByUserIdAndLayoutId(long userId,
        long layoutId) throws SystemException {
        return findByUserIdAndLayoutId(userId, layoutId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the user personalized themes where userId = &#63; and layoutId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.UserPersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param userId the user ID
     * @param layoutId the layout ID
     * @param start the lower bound of the range of user personalized themes
     * @param end the upper bound of the range of user personalized themes (not inclusive)
     * @return the range of matching user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserPersonalizedTheme> findByUserIdAndLayoutId(long userId,
        long layoutId, int start, int end) throws SystemException {
        return findByUserIdAndLayoutId(userId, layoutId, start, end, null);
    }

    /**
     * Returns an ordered range of all the user personalized themes where userId = &#63; and layoutId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.UserPersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    @Override
    public List<UserPersonalizedTheme> findByUserIdAndLayoutId(long userId,
        long layoutId, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDANDLAYOUTID;
            finderArgs = new Object[] { userId, layoutId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERIDANDLAYOUTID;
            finderArgs = new Object[] {
                    userId, layoutId,
                    
                    start, end, orderByComparator
                };
        }

        List<UserPersonalizedTheme> list = (List<UserPersonalizedTheme>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (UserPersonalizedTheme userPersonalizedTheme : list) {
                if ((userId != userPersonalizedTheme.getUserId()) ||
                        (layoutId != userPersonalizedTheme.getLayoutId())) {
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
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_USERPERSONALIZEDTHEME_WHERE);

            query.append(_FINDER_COLUMN_USERIDANDLAYOUTID_USERID_2);

            query.append(_FINDER_COLUMN_USERIDANDLAYOUTID_LAYOUTID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(UserPersonalizedThemeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                qPos.add(layoutId);

                if (!pagination) {
                    list = (List<UserPersonalizedTheme>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UserPersonalizedTheme>(list);
                } else {
                    list = (List<UserPersonalizedTheme>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

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
    @Override
    public UserPersonalizedTheme findByUserIdAndLayoutId_First(long userId,
        long layoutId, OrderByComparator orderByComparator)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        UserPersonalizedTheme userPersonalizedTheme = fetchByUserIdAndLayoutId_First(userId,
                layoutId, orderByComparator);

        if (userPersonalizedTheme != null) {
            return userPersonalizedTheme;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("userId=");
        msg.append(userId);

        msg.append(", layoutId=");
        msg.append(layoutId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserPersonalizedThemeException(msg.toString());
    }

    /**
     * Returns the first user personalized theme in the ordered set where userId = &#63; and layoutId = &#63;.
     *
     * @param userId the user ID
     * @param layoutId the layout ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme fetchByUserIdAndLayoutId_First(long userId,
        long layoutId, OrderByComparator orderByComparator)
        throws SystemException {
        List<UserPersonalizedTheme> list = findByUserIdAndLayoutId(userId,
                layoutId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public UserPersonalizedTheme findByUserIdAndLayoutId_Last(long userId,
        long layoutId, OrderByComparator orderByComparator)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        UserPersonalizedTheme userPersonalizedTheme = fetchByUserIdAndLayoutId_Last(userId,
                layoutId, orderByComparator);

        if (userPersonalizedTheme != null) {
            return userPersonalizedTheme;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("userId=");
        msg.append(userId);

        msg.append(", layoutId=");
        msg.append(layoutId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserPersonalizedThemeException(msg.toString());
    }

    /**
     * Returns the last user personalized theme in the ordered set where userId = &#63; and layoutId = &#63;.
     *
     * @param userId the user ID
     * @param layoutId the layout ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme fetchByUserIdAndLayoutId_Last(long userId,
        long layoutId, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByUserIdAndLayoutId(userId, layoutId);

        if (count == 0) {
            return null;
        }

        List<UserPersonalizedTheme> list = findByUserIdAndLayoutId(userId,
                layoutId, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public UserPersonalizedTheme[] findByUserIdAndLayoutId_PrevAndNext(
        long id, long userId, long layoutId, OrderByComparator orderByComparator)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        UserPersonalizedTheme userPersonalizedTheme = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            UserPersonalizedTheme[] array = new UserPersonalizedThemeImpl[3];

            array[0] = getByUserIdAndLayoutId_PrevAndNext(session,
                    userPersonalizedTheme, userId, layoutId, orderByComparator,
                    true);

            array[1] = userPersonalizedTheme;

            array[2] = getByUserIdAndLayoutId_PrevAndNext(session,
                    userPersonalizedTheme, userId, layoutId, orderByComparator,
                    false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected UserPersonalizedTheme getByUserIdAndLayoutId_PrevAndNext(
        Session session, UserPersonalizedTheme userPersonalizedTheme,
        long userId, long layoutId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_USERPERSONALIZEDTHEME_WHERE);

        query.append(_FINDER_COLUMN_USERIDANDLAYOUTID_USERID_2);

        query.append(_FINDER_COLUMN_USERIDANDLAYOUTID_LAYOUTID_2);

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
        } else {
            query.append(UserPersonalizedThemeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(userId);

        qPos.add(layoutId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(userPersonalizedTheme);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<UserPersonalizedTheme> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the user personalized themes where userId = &#63; and layoutId = &#63; from the database.
     *
     * @param userId the user ID
     * @param layoutId the layout ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUserIdAndLayoutId(long userId, long layoutId)
        throws SystemException {
        for (UserPersonalizedTheme userPersonalizedTheme : findByUserIdAndLayoutId(
                userId, layoutId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(userPersonalizedTheme);
        }
    }

    /**
     * Returns the number of user personalized themes where userId = &#63; and layoutId = &#63;.
     *
     * @param userId the user ID
     * @param layoutId the layout ID
     * @return the number of matching user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUserIdAndLayoutId(long userId, long layoutId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_USERIDANDLAYOUTID;

        Object[] finderArgs = new Object[] { userId, layoutId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_USERPERSONALIZEDTHEME_WHERE);

            query.append(_FINDER_COLUMN_USERIDANDLAYOUTID_USERID_2);

            query.append(_FINDER_COLUMN_USERIDANDLAYOUTID_LAYOUTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                qPos.add(layoutId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the user personalized themes where userId = &#63;.
     *
     * @param userId the user ID
     * @return the matching user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserPersonalizedTheme> findByUserId(long userId)
        throws SystemException {
        return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the user personalized themes where userId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.UserPersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param userId the user ID
     * @param start the lower bound of the range of user personalized themes
     * @param end the upper bound of the range of user personalized themes (not inclusive)
     * @return the range of matching user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserPersonalizedTheme> findByUserId(long userId, int start,
        int end) throws SystemException {
        return findByUserId(userId, start, end, null);
    }

    /**
     * Returns an ordered range of all the user personalized themes where userId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.UserPersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param userId the user ID
     * @param start the lower bound of the range of user personalized themes
     * @param end the upper bound of the range of user personalized themes (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserPersonalizedTheme> findByUserId(long userId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
            finderArgs = new Object[] { userId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
            finderArgs = new Object[] { userId, start, end, orderByComparator };
        }

        List<UserPersonalizedTheme> list = (List<UserPersonalizedTheme>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (UserPersonalizedTheme userPersonalizedTheme : list) {
                if ((userId != userPersonalizedTheme.getUserId())) {
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
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_USERPERSONALIZEDTHEME_WHERE);

            query.append(_FINDER_COLUMN_USERID_USERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(UserPersonalizedThemeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                if (!pagination) {
                    list = (List<UserPersonalizedTheme>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UserPersonalizedTheme>(list);
                } else {
                    list = (List<UserPersonalizedTheme>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first user personalized theme in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user personalized theme
     * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a matching user personalized theme could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme findByUserId_First(long userId,
        OrderByComparator orderByComparator)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        UserPersonalizedTheme userPersonalizedTheme = fetchByUserId_First(userId,
                orderByComparator);

        if (userPersonalizedTheme != null) {
            return userPersonalizedTheme;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("userId=");
        msg.append(userId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserPersonalizedThemeException(msg.toString());
    }

    /**
     * Returns the first user personalized theme in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme fetchByUserId_First(long userId,
        OrderByComparator orderByComparator) throws SystemException {
        List<UserPersonalizedTheme> list = findByUserId(userId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last user personalized theme in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching user personalized theme
     * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a matching user personalized theme could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme findByUserId_Last(long userId,
        OrderByComparator orderByComparator)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        UserPersonalizedTheme userPersonalizedTheme = fetchByUserId_Last(userId,
                orderByComparator);

        if (userPersonalizedTheme != null) {
            return userPersonalizedTheme;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("userId=");
        msg.append(userId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserPersonalizedThemeException(msg.toString());
    }

    /**
     * Returns the last user personalized theme in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme fetchByUserId_Last(long userId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUserId(userId);

        if (count == 0) {
            return null;
        }

        List<UserPersonalizedTheme> list = findByUserId(userId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public UserPersonalizedTheme[] findByUserId_PrevAndNext(long id,
        long userId, OrderByComparator orderByComparator)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        UserPersonalizedTheme userPersonalizedTheme = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            UserPersonalizedTheme[] array = new UserPersonalizedThemeImpl[3];

            array[0] = getByUserId_PrevAndNext(session, userPersonalizedTheme,
                    userId, orderByComparator, true);

            array[1] = userPersonalizedTheme;

            array[2] = getByUserId_PrevAndNext(session, userPersonalizedTheme,
                    userId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected UserPersonalizedTheme getByUserId_PrevAndNext(Session session,
        UserPersonalizedTheme userPersonalizedTheme, long userId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_USERPERSONALIZEDTHEME_WHERE);

        query.append(_FINDER_COLUMN_USERID_USERID_2);

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
        } else {
            query.append(UserPersonalizedThemeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(userId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(userPersonalizedTheme);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<UserPersonalizedTheme> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the user personalized themes where userId = &#63; from the database.
     *
     * @param userId the user ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUserId(long userId) throws SystemException {
        for (UserPersonalizedTheme userPersonalizedTheme : findByUserId(
                userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(userPersonalizedTheme);
        }
    }

    /**
     * Returns the number of user personalized themes where userId = &#63;.
     *
     * @param userId the user ID
     * @return the number of matching user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUserId(long userId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

        Object[] finderArgs = new Object[] { userId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_USERPERSONALIZEDTHEME_WHERE);

            query.append(_FINDER_COLUMN_USERID_USERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the user personalized themes where themeId = &#63;.
     *
     * @param themeId the theme ID
     * @return the matching user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserPersonalizedTheme> findByThemeId(String themeId)
        throws SystemException {
        return findByThemeId(themeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the user personalized themes where themeId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.UserPersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param themeId the theme ID
     * @param start the lower bound of the range of user personalized themes
     * @param end the upper bound of the range of user personalized themes (not inclusive)
     * @return the range of matching user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserPersonalizedTheme> findByThemeId(String themeId, int start,
        int end) throws SystemException {
        return findByThemeId(themeId, start, end, null);
    }

    /**
     * Returns an ordered range of all the user personalized themes where themeId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.UserPersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param themeId the theme ID
     * @param start the lower bound of the range of user personalized themes
     * @param end the upper bound of the range of user personalized themes (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserPersonalizedTheme> findByThemeId(String themeId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THEMEID;
            finderArgs = new Object[] { themeId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_THEMEID;
            finderArgs = new Object[] { themeId, start, end, orderByComparator };
        }

        List<UserPersonalizedTheme> list = (List<UserPersonalizedTheme>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (UserPersonalizedTheme userPersonalizedTheme : list) {
                if (!Validator.equals(themeId,
                            userPersonalizedTheme.getThemeId())) {
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
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_USERPERSONALIZEDTHEME_WHERE);

            boolean bindThemeId = false;

            if (themeId == null) {
                query.append(_FINDER_COLUMN_THEMEID_THEMEID_1);
            } else if (themeId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_THEMEID_THEMEID_3);
            } else {
                bindThemeId = true;

                query.append(_FINDER_COLUMN_THEMEID_THEMEID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(UserPersonalizedThemeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindThemeId) {
                    qPos.add(themeId);
                }

                if (!pagination) {
                    list = (List<UserPersonalizedTheme>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UserPersonalizedTheme>(list);
                } else {
                    list = (List<UserPersonalizedTheme>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first user personalized theme in the ordered set where themeId = &#63;.
     *
     * @param themeId the theme ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user personalized theme
     * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a matching user personalized theme could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme findByThemeId_First(String themeId,
        OrderByComparator orderByComparator)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        UserPersonalizedTheme userPersonalizedTheme = fetchByThemeId_First(themeId,
                orderByComparator);

        if (userPersonalizedTheme != null) {
            return userPersonalizedTheme;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("themeId=");
        msg.append(themeId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserPersonalizedThemeException(msg.toString());
    }

    /**
     * Returns the first user personalized theme in the ordered set where themeId = &#63;.
     *
     * @param themeId the theme ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme fetchByThemeId_First(String themeId,
        OrderByComparator orderByComparator) throws SystemException {
        List<UserPersonalizedTheme> list = findByThemeId(themeId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last user personalized theme in the ordered set where themeId = &#63;.
     *
     * @param themeId the theme ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching user personalized theme
     * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a matching user personalized theme could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme findByThemeId_Last(String themeId,
        OrderByComparator orderByComparator)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        UserPersonalizedTheme userPersonalizedTheme = fetchByThemeId_Last(themeId,
                orderByComparator);

        if (userPersonalizedTheme != null) {
            return userPersonalizedTheme;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("themeId=");
        msg.append(themeId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserPersonalizedThemeException(msg.toString());
    }

    /**
     * Returns the last user personalized theme in the ordered set where themeId = &#63;.
     *
     * @param themeId the theme ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching user personalized theme, or <code>null</code> if a matching user personalized theme could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme fetchByThemeId_Last(String themeId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByThemeId(themeId);

        if (count == 0) {
            return null;
        }

        List<UserPersonalizedTheme> list = findByThemeId(themeId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public UserPersonalizedTheme[] findByThemeId_PrevAndNext(long id,
        String themeId, OrderByComparator orderByComparator)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        UserPersonalizedTheme userPersonalizedTheme = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            UserPersonalizedTheme[] array = new UserPersonalizedThemeImpl[3];

            array[0] = getByThemeId_PrevAndNext(session, userPersonalizedTheme,
                    themeId, orderByComparator, true);

            array[1] = userPersonalizedTheme;

            array[2] = getByThemeId_PrevAndNext(session, userPersonalizedTheme,
                    themeId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected UserPersonalizedTheme getByThemeId_PrevAndNext(Session session,
        UserPersonalizedTheme userPersonalizedTheme, String themeId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_USERPERSONALIZEDTHEME_WHERE);

        boolean bindThemeId = false;

        if (themeId == null) {
            query.append(_FINDER_COLUMN_THEMEID_THEMEID_1);
        } else if (themeId.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_THEMEID_THEMEID_3);
        } else {
            bindThemeId = true;

            query.append(_FINDER_COLUMN_THEMEID_THEMEID_2);
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
        } else {
            query.append(UserPersonalizedThemeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindThemeId) {
            qPos.add(themeId);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(userPersonalizedTheme);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<UserPersonalizedTheme> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the user personalized themes where themeId = &#63; from the database.
     *
     * @param themeId the theme ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByThemeId(String themeId) throws SystemException {
        for (UserPersonalizedTheme userPersonalizedTheme : findByThemeId(
                themeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(userPersonalizedTheme);
        }
    }

    /**
     * Returns the number of user personalized themes where themeId = &#63;.
     *
     * @param themeId the theme ID
     * @return the number of matching user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByThemeId(String themeId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_THEMEID;

        Object[] finderArgs = new Object[] { themeId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_USERPERSONALIZEDTHEME_WHERE);

            boolean bindThemeId = false;

            if (themeId == null) {
                query.append(_FINDER_COLUMN_THEMEID_THEMEID_1);
            } else if (themeId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_THEMEID_THEMEID_3);
            } else {
                bindThemeId = true;

                query.append(_FINDER_COLUMN_THEMEID_THEMEID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindThemeId) {
                    qPos.add(themeId);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the user personalized theme in the entity cache if it is enabled.
     *
     * @param userPersonalizedTheme the user personalized theme
     */
    @Override
    public void cacheResult(UserPersonalizedTheme userPersonalizedTheme) {
        EntityCacheUtil.putResult(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeImpl.class,
            userPersonalizedTheme.getPrimaryKey(), userPersonalizedTheme);

        userPersonalizedTheme.resetOriginalValues();
    }

    /**
     * Caches the user personalized themes in the entity cache if it is enabled.
     *
     * @param userPersonalizedThemes the user personalized themes
     */
    @Override
    public void cacheResult(List<UserPersonalizedTheme> userPersonalizedThemes) {
        for (UserPersonalizedTheme userPersonalizedTheme : userPersonalizedThemes) {
            if (EntityCacheUtil.getResult(
                        UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
                        UserPersonalizedThemeImpl.class,
                        userPersonalizedTheme.getPrimaryKey()) == null) {
                cacheResult(userPersonalizedTheme);
            } else {
                userPersonalizedTheme.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all user personalized themes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(UserPersonalizedThemeImpl.class.getName());
        }

        EntityCacheUtil.clearCache(UserPersonalizedThemeImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the user personalized theme.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(UserPersonalizedTheme userPersonalizedTheme) {
        EntityCacheUtil.removeResult(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeImpl.class,
            userPersonalizedTheme.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<UserPersonalizedTheme> userPersonalizedThemes) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (UserPersonalizedTheme userPersonalizedTheme : userPersonalizedThemes) {
            EntityCacheUtil.removeResult(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
                UserPersonalizedThemeImpl.class,
                userPersonalizedTheme.getPrimaryKey());
        }
    }

    /**
     * Creates a new user personalized theme with the primary key. Does not add the user personalized theme to the database.
     *
     * @param id the primary key for the new user personalized theme
     * @return the new user personalized theme
     */
    @Override
    public UserPersonalizedTheme create(long id) {
        UserPersonalizedTheme userPersonalizedTheme = new UserPersonalizedThemeImpl();

        userPersonalizedTheme.setNew(true);
        userPersonalizedTheme.setPrimaryKey(id);

        return userPersonalizedTheme;
    }

    /**
     * Removes the user personalized theme with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the user personalized theme
     * @return the user personalized theme that was removed
     * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a user personalized theme with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme remove(long id)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the user personalized theme with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the user personalized theme
     * @return the user personalized theme that was removed
     * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a user personalized theme with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme remove(Serializable primaryKey)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            UserPersonalizedTheme userPersonalizedTheme = (UserPersonalizedTheme) session.get(UserPersonalizedThemeImpl.class,
                    primaryKey);

            if (userPersonalizedTheme == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchUserPersonalizedThemeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(userPersonalizedTheme);
        } catch (NoSuchUserPersonalizedThemeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected UserPersonalizedTheme removeImpl(
        UserPersonalizedTheme userPersonalizedTheme) throws SystemException {
        userPersonalizedTheme = toUnwrappedModel(userPersonalizedTheme);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(userPersonalizedTheme)) {
                userPersonalizedTheme = (UserPersonalizedTheme) session.get(UserPersonalizedThemeImpl.class,
                        userPersonalizedTheme.getPrimaryKeyObj());
            }

            if (userPersonalizedTheme != null) {
                session.delete(userPersonalizedTheme);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (userPersonalizedTheme != null) {
            clearCache(userPersonalizedTheme);
        }

        return userPersonalizedTheme;
    }

    @Override
    public UserPersonalizedTheme updateImpl(
        com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme userPersonalizedTheme)
        throws SystemException {
        userPersonalizedTheme = toUnwrappedModel(userPersonalizedTheme);

        boolean isNew = userPersonalizedTheme.isNew();

        UserPersonalizedThemeModelImpl userPersonalizedThemeModelImpl = (UserPersonalizedThemeModelImpl) userPersonalizedTheme;

        Session session = null;

        try {
            session = openSession();

            if (userPersonalizedTheme.isNew()) {
                session.save(userPersonalizedTheme);

                userPersonalizedTheme.setNew(false);
            } else {
                session.merge(userPersonalizedTheme);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !UserPersonalizedThemeModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((userPersonalizedThemeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDANDAPPLYFORALLPAGES.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        userPersonalizedThemeModelImpl.getOriginalUserId(),
                        userPersonalizedThemeModelImpl.getOriginalApplyForAllPages()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERIDANDAPPLYFORALLPAGES,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDANDAPPLYFORALLPAGES,
                    args);

                args = new Object[] {
                        userPersonalizedThemeModelImpl.getUserId(),
                        userPersonalizedThemeModelImpl.getApplyForAllPages()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERIDANDAPPLYFORALLPAGES,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDANDAPPLYFORALLPAGES,
                    args);
            }

            if ((userPersonalizedThemeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDANDLAYOUTID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        userPersonalizedThemeModelImpl.getOriginalUserId(),
                        userPersonalizedThemeModelImpl.getOriginalLayoutId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERIDANDLAYOUTID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDANDLAYOUTID,
                    args);

                args = new Object[] {
                        userPersonalizedThemeModelImpl.getUserId(),
                        userPersonalizedThemeModelImpl.getLayoutId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERIDANDLAYOUTID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDANDLAYOUTID,
                    args);
            }

            if ((userPersonalizedThemeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        userPersonalizedThemeModelImpl.getOriginalUserId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
                    args);

                args = new Object[] { userPersonalizedThemeModelImpl.getUserId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
                    args);
            }

            if ((userPersonalizedThemeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THEMEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        userPersonalizedThemeModelImpl.getOriginalThemeId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THEMEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THEMEID,
                    args);

                args = new Object[] { userPersonalizedThemeModelImpl.getThemeId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THEMEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THEMEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
            UserPersonalizedThemeImpl.class,
            userPersonalizedTheme.getPrimaryKey(), userPersonalizedTheme);

        return userPersonalizedTheme;
    }

    protected UserPersonalizedTheme toUnwrappedModel(
        UserPersonalizedTheme userPersonalizedTheme) {
        if (userPersonalizedTheme instanceof UserPersonalizedThemeImpl) {
            return userPersonalizedTheme;
        }

        UserPersonalizedThemeImpl userPersonalizedThemeImpl = new UserPersonalizedThemeImpl();

        userPersonalizedThemeImpl.setNew(userPersonalizedTheme.isNew());
        userPersonalizedThemeImpl.setPrimaryKey(userPersonalizedTheme.getPrimaryKey());

        userPersonalizedThemeImpl.setId(userPersonalizedTheme.getId());
        userPersonalizedThemeImpl.setUserId(userPersonalizedTheme.getUserId());
        userPersonalizedThemeImpl.setLayoutId(userPersonalizedTheme.getLayoutId());
        userPersonalizedThemeImpl.setThemeId(userPersonalizedTheme.getThemeId());
        userPersonalizedThemeImpl.setColorSchemeId(userPersonalizedTheme.getColorSchemeId());
        userPersonalizedThemeImpl.setApplyForAllPages(userPersonalizedTheme.isApplyForAllPages());

        return userPersonalizedThemeImpl;
    }

    /**
     * Returns the user personalized theme with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the user personalized theme
     * @return the user personalized theme
     * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a user personalized theme with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme findByPrimaryKey(Serializable primaryKey)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        UserPersonalizedTheme userPersonalizedTheme = fetchByPrimaryKey(primaryKey);

        if (userPersonalizedTheme == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchUserPersonalizedThemeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return userPersonalizedTheme;
    }

    /**
     * Returns the user personalized theme with the primary key or throws a {@link com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException} if it could not be found.
     *
     * @param id the primary key of the user personalized theme
     * @return the user personalized theme
     * @throws com.knowarth.portlets.themepersonalizer.NoSuchUserPersonalizedThemeException if a user personalized theme with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme findByPrimaryKey(long id)
        throws NoSuchUserPersonalizedThemeException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the user personalized theme with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the user personalized theme
     * @return the user personalized theme, or <code>null</code> if a user personalized theme with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        UserPersonalizedTheme userPersonalizedTheme = (UserPersonalizedTheme) EntityCacheUtil.getResult(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
                UserPersonalizedThemeImpl.class, primaryKey);

        if (userPersonalizedTheme == _nullUserPersonalizedTheme) {
            return null;
        }

        if (userPersonalizedTheme == null) {
            Session session = null;

            try {
                session = openSession();

                userPersonalizedTheme = (UserPersonalizedTheme) session.get(UserPersonalizedThemeImpl.class,
                        primaryKey);

                if (userPersonalizedTheme != null) {
                    cacheResult(userPersonalizedTheme);
                } else {
                    EntityCacheUtil.putResult(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
                        UserPersonalizedThemeImpl.class, primaryKey,
                        _nullUserPersonalizedTheme);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(UserPersonalizedThemeModelImpl.ENTITY_CACHE_ENABLED,
                    UserPersonalizedThemeImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return userPersonalizedTheme;
    }

    /**
     * Returns the user personalized theme with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the user personalized theme
     * @return the user personalized theme, or <code>null</code> if a user personalized theme with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserPersonalizedTheme fetchByPrimaryKey(long id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the user personalized themes.
     *
     * @return the user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserPersonalizedTheme> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the user personalized themes.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.UserPersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of user personalized themes
     * @param end the upper bound of the range of user personalized themes (not inclusive)
     * @return the range of user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserPersonalizedTheme> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the user personalized themes.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.knowarth.portlets.themepersonalizer.model.impl.UserPersonalizedThemeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of user personalized themes
     * @param end the upper bound of the range of user personalized themes (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserPersonalizedTheme> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<UserPersonalizedTheme> list = (List<UserPersonalizedTheme>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_USERPERSONALIZEDTHEME);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_USERPERSONALIZEDTHEME;

                if (pagination) {
                    sql = sql.concat(UserPersonalizedThemeModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<UserPersonalizedTheme>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UserPersonalizedTheme>(list);
                } else {
                    list = (List<UserPersonalizedTheme>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the user personalized themes from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (UserPersonalizedTheme userPersonalizedTheme : findAll()) {
            remove(userPersonalizedTheme);
        }
    }

    /**
     * Returns the number of user personalized themes.
     *
     * @return the number of user personalized themes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_USERPERSONALIZEDTHEME);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the user personalized theme persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<UserPersonalizedTheme>> listenersList = new ArrayList<ModelListener<UserPersonalizedTheme>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<UserPersonalizedTheme>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(UserPersonalizedThemeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
