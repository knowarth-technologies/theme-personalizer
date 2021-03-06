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
package com.knowarth.portlets.themepersonalizer.model.impl;

import com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme;
import com.knowarth.portlets.themepersonalizer.service.AvailablePersonalizedThemeLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the AvailablePersonalizedTheme service. Represents a row in the &quot;KNOWARTH_AvailablePersonalizedTheme&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AvailablePersonalizedThemeImpl}.
 * </p>
 *
 * @author Samir Bhatt
 * @see AvailablePersonalizedThemeImpl
 * @see com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme
 * @generated
 */
public abstract class AvailablePersonalizedThemeBaseImpl
    extends AvailablePersonalizedThemeModelImpl
    implements AvailablePersonalizedTheme {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a available personalized theme model instance should use the {@link AvailablePersonalizedTheme} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            AvailablePersonalizedThemeLocalServiceUtil.addAvailablePersonalizedTheme(this);
        } else {
            AvailablePersonalizedThemeLocalServiceUtil.updateAvailablePersonalizedTheme(this);
        }
    }
}
