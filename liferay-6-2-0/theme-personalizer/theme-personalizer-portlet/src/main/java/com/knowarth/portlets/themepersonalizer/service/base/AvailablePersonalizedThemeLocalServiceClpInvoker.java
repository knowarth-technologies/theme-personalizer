package com.knowarth.portlets.themepersonalizer.service.base;

import com.knowarth.portlets.themepersonalizer.service.AvailablePersonalizedThemeLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Samir Bhatt
 * @generated
 */
public class AvailablePersonalizedThemeLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName36;
    private String[] _methodParameterTypes36;
    private String _methodName37;
    private String[] _methodParameterTypes37;
    private String _methodName42;
    private String[] _methodParameterTypes42;
    private String _methodName43;
    private String[] _methodParameterTypes43;
    private String _methodName44;
    private String[] _methodParameterTypes44;

    public AvailablePersonalizedThemeLocalServiceClpInvoker() {
        _methodName0 = "addAvailablePersonalizedTheme";

        _methodParameterTypes0 = new String[] {
                "com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme"
            };

        _methodName1 = "createAvailablePersonalizedTheme";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteAvailablePersonalizedTheme";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteAvailablePersonalizedTheme";

        _methodParameterTypes3 = new String[] {
                "com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchAvailablePersonalizedTheme";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getAvailablePersonalizedTheme";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getAvailablePersonalizedThemes";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getAvailablePersonalizedThemesCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateAvailablePersonalizedTheme";

        _methodParameterTypes15 = new String[] {
                "com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme"
            };

        _methodName36 = "getBeanIdentifier";

        _methodParameterTypes36 = new String[] {  };

        _methodName37 = "setBeanIdentifier";

        _methodParameterTypes37 = new String[] { "java.lang.String" };

        _methodName42 = "addAvailablePersonalizedTheme";

        _methodParameterTypes42 = new String[] { "long", "java.lang.String" };

        _methodName43 = "removeAllByCompanyId";

        _methodParameterTypes43 = new String[] { "long" };

        _methodName44 = "findAllByCompanyId";

        _methodParameterTypes44 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.addAvailablePersonalizedTheme((com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.createAvailablePersonalizedTheme(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.deleteAvailablePersonalizedTheme(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.deleteAvailablePersonalizedTheme((com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.fetchAvailablePersonalizedTheme(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.getAvailablePersonalizedTheme(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.getAvailablePersonalizedThemes(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.getAvailablePersonalizedThemesCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.updateAvailablePersonalizedTheme((com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme) arguments[0]);
        }

        if (_methodName36.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName37.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
            AvailablePersonalizedThemeLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName42.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.addAvailablePersonalizedTheme(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1]);
        }

        if (_methodName43.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
            AvailablePersonalizedThemeLocalServiceUtil.removeAllByCompanyId(((Long) arguments[0]).longValue());

            return null;
        }

        if (_methodName44.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
            return AvailablePersonalizedThemeLocalServiceUtil.findAllByCompanyId(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
