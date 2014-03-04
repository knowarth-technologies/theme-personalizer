package com.knowarth.portlets.themepersonalizer.model.impl;

import com.knowarth.portlets.themepersonalizer.model.AvailablePersonalizedTheme;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AvailablePersonalizedTheme in entity cache.
 *
 * @author Samir Bhatt
 * @see AvailablePersonalizedTheme
 * @generated
 */
public class AvailablePersonalizedThemeCacheModel implements CacheModel<AvailablePersonalizedTheme>,
    Externalizable {
    public long id;
    public long companyId;
    public String themeId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{id=");
        sb.append(id);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", themeId=");
        sb.append(themeId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public AvailablePersonalizedTheme toEntityModel() {
        AvailablePersonalizedThemeImpl availablePersonalizedThemeImpl = new AvailablePersonalizedThemeImpl();

        availablePersonalizedThemeImpl.setId(id);
        availablePersonalizedThemeImpl.setCompanyId(companyId);

        if (themeId == null) {
            availablePersonalizedThemeImpl.setThemeId(StringPool.BLANK);
        } else {
            availablePersonalizedThemeImpl.setThemeId(themeId);
        }

        availablePersonalizedThemeImpl.resetOriginalValues();

        return availablePersonalizedThemeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        companyId = objectInput.readLong();
        themeId = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeLong(companyId);

        if (themeId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(themeId);
        }
    }
}
