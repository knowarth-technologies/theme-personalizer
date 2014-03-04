<%--
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
--%>
<%@ include file="/html/init.jsp"%>
<liferay-portlet:actionURL var="saveAvailableThemeURL"
	name="saveAvailableThemes" />
<liferay-ui:success key="available-theme-changes-saved-successfully"
	message="available-theme-changes-saved-successfully"></liferay-ui:success>
<liferay-ui:error key="system-error-please-contact-adminstrator"></liferay-ui:error>
<h3>Select Themes for Personalization</h3>
<aui:form action="<%=saveAvailableThemeURL%>" method="post" name="fm"
	onSubmit='<%="event.preventDefault(); "
						+ renderResponse.getNamespace() + "submitForm();"%>'>
	<aui:fieldset cssClass="available-themes">
		<liferay-ui:input-move-boxes leftBoxName="currentThemeIds"
			leftList="${selectedThemeIdList }" leftTitle="selected-themes"
			rightBoxName="availableThemeIds"
			rightList="${availableThemeIdsList }" rightTitle="available-themes" />
		<aui:input name="selectedThemeIds" type="hidden" />

		<aui:button-row>
			<aui:button type="submit" />

			<aui:button href="<%=redirect%>" type="cancel" />
		</aui:button-row>
	</aui:fieldset>
	<aui:script>
  Liferay.provide(
       window,
        '<portlet:namespace />submitForm',
        function() {
        document.forms["<portlet:namespace />fm"].<portlet:namespace />selectedThemeIds.value = Liferay.Util.listSelect(document.<portlet:namespace />fm.<portlet:namespace />currentThemeIds);
        document.forms["<portlet:namespace />fm"].submit();
        }, ['liferay-util-list-fields']
       );
 </aui:script>
</aui:form>


