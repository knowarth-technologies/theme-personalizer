package com.knowarth.portlets.themepersonalizer.service.messaging;

import com.knowarth.portlets.themepersonalizer.service.AvailablePersonalizedThemeLocalServiceUtil;
import com.knowarth.portlets.themepersonalizer.service.ClpSerializer;
import com.knowarth.portlets.themepersonalizer.service.UserPersonalizedThemeLocalServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            AvailablePersonalizedThemeLocalServiceUtil.clearService();

            UserPersonalizedThemeLocalServiceUtil.clearService();
        }
    }
}
