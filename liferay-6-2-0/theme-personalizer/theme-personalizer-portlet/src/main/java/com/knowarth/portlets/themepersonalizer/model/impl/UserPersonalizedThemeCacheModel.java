package com.knowarth.portlets.themepersonalizer.model.impl;

import com.knowarth.portlets.themepersonalizer.model.UserPersonalizedTheme;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserPersonalizedTheme in entity cache.
 *
 * @author Samir Bhatt
 * @see UserPersonalizedTheme
 * @generated
 */
public class UserPersonalizedThemeCacheModel implements CacheModel<UserPersonalizedTheme>,
    Externalizable {
    public long id;
    public long userId;
    public long layoutId;
    public String themeId;
    public String colorSchemeId;
    public boolean applyForAllPages;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{id=");
        sb.append(id);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", layoutId=");
        sb.append(layoutId);
        sb.append(", themeId=");
        sb.append(themeId);
        sb.append(", colorSchemeId=");
        sb.append(colorSchemeId);
        sb.append(", applyForAllPages=");
        sb.append(applyForAllPages);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UserPersonalizedTheme toEntityModel() {
        UserPersonalizedThemeImpl userPersonalizedThemeImpl = new UserPersonalizedThemeImpl();

        userPersonalizedThemeImpl.setId(id);
        userPersonalizedThemeImpl.setUserId(userId);
        userPersonalizedThemeImpl.setLayoutId(layoutId);

        if (themeId == null) {
            userPersonalizedThemeImpl.setThemeId(StringPool.BLANK);
        } else {
            userPersonalizedThemeImpl.setThemeId(themeId);
        }

        if (colorSchemeId == null) {
            userPersonalizedThemeImpl.setColorSchemeId(StringPool.BLANK);
        } else {
            userPersonalizedThemeImpl.setColorSchemeId(colorSchemeId);
        }

        userPersonalizedThemeImpl.setApplyForAllPages(applyForAllPages);

        userPersonalizedThemeImpl.resetOriginalValues();

        return userPersonalizedThemeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        userId = objectInput.readLong();
        layoutId = objectInput.readLong();
        themeId = objectInput.readUTF();
        colorSchemeId = objectInput.readUTF();
        applyForAllPages = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(layoutId);

        if (themeId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(themeId);
        }

        if (colorSchemeId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(colorSchemeId);
        }

        objectOutput.writeBoolean(applyForAllPages);
    }
}
