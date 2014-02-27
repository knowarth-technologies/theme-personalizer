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

<liferay-portlet:actionURL var="savePersonalizedThemeURL"
	name="savePersonalizedTheme">
	<liferay-portlet:param name="redirect" value="<%=redirect%>" />
</liferay-portlet:actionURL>

<liferay-portlet:actionURL var="resetPersonalizedThemeURL"
	name="resetPersonalizedTheme">
	<liferay-portlet:param name="redirect" value="<%=redirect%>" />
</liferay-portlet:actionURL>

<liferay-ui:success key="theme-personalization-restored-to-default"
	message="theme-personalization-restored-to-default"></liferay-ui:success>
<liferay-ui:success
	key="theme-personalization-changes-saved-scucessfully"
	message="theme-personalization-changes-saved-scucessfully"></liferay-ui:success>
<liferay-ui:error key="system-error-please-contact-adminstrator"></liferay-ui:error>
<c:choose>
	<c:when test="${!empty availableThems}">
		<aui:form action="<%=savePersonalizedThemeURL%>" method="post" name="fm"
			onSubmit='<%="event.preventDefault(); "
								+ renderResponse.getNamespace() + "submitForm();"%>'>
			<aui:fieldset cssClass="theme-personalizer">
				<aui:select label="theme" name="selectedThemeId" inlineField="true"
					inlineLabel="left">
					<c:forEach var="theme" items="${availableThems}">
						<c:choose>
							<c:when test="${selectedThemeId == theme.key}">
								<aui:option label="${theme.value}" value="${theme.key}"
									selected="true"></aui:option>
							</c:when>
							<c:otherwise>
								<aui:option label="${theme.value}" value="${theme.key}"
									selected="false"></aui:option>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</aui:select>
		
				<aui:select label="color-scheme" name="selectedColorSchemeId"
					inlineField="true" inlineLabel="left">
					<c:forEach var="colorScheme" items="${availableColorSchemes}">
						<c:choose>
							<c:when test="${selectedColorSchemeId == colorScheme.key}">
								<aui:option label="${colorScheme.value.name}"
									value="${colorScheme.key}" selected="true"></aui:option>
							</c:when>
							<c:otherwise>
								<aui:option label="${colorScheme.value.name}"
									value="${colorScheme.key}" selected="false"></aui:option>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</aui:select>
				<aui:input label="apply-for-all-pages" inlineLabel="right"
					name="applyForAllPages" type="checkbox" value="${applyForAllPages}"
					inlineField="true"></aui:input>
				<aui:button type="submit" inlineField="true" inlineLabel="left" />
				<aui:button type="button" inlineField="true" inlineLabel="left"
					value="reset-to-defaults"
					onClick='<%="event.preventDefault();"
									+ renderResponse.getNamespace() + "reset();"%>' />
			</aui:fieldset>
			<aui:script use="aui-dialog,node,aui-io-request">	
				A.one("#<portlet:namespace />selectedThemeId").on("change",function(E){
					var selectedTheme=  A.one("#<portlet:namespace />selectedThemeId").val();
					A.one("#<portlet:namespace />selectedColorSchemeId").val("");
					A.io.request('<liferay-portlet:resourceURL></liferay-portlet:resourceURL>&<portlet:namespace />selectedThemeId='+selectedTheme, {
					  dataType: 'json',
					  on: {
					   success: function() {
					   	 var colorSchemeArray = this.get('responseData');
					   	 if(colorSchemeArray){
					   	 	document.forms['<portlet:namespace />fm'].<portlet:namespace />selectedColorSchemeId.options.length=0;
					   	 	for(var i=0;i < colorSchemeArray.length;i++){
					   	 		var optionObject = new Option(colorSchemeArray[i].colorSchemeName,colorSchemeArray[i].colorSchemeId);
					   	 		document.forms['<portlet:namespace />fm'].<portlet:namespace />selectedColorSchemeId.options[i] = optionObject; 
					   	 	}
					   	 	if(document.forms['<portlet:namespace />fm'].<portlet:namespace />selectedColorSchemeId.options.length >0){
					   	 		document.forms['<portlet:namespace />fm'].<portlet:namespace />selectedColorSchemeId.options[0].selected = true;
					   	 	}
					   	 }
					     
					   }
					  }
					});
					
				});
		  Liferay.provide(
		       window,
		        '<portlet:namespace />submitForm',
		        function() {
		        document.forms["<portlet:namespace />fm"].submit();
		        }, ['liferay-util-list-fields']
		       );
		       
		   Liferay.provide(
		       window,
		        '<portlet:namespace />reset',
		        function() {
		        document.forms["<portlet:namespace />fm"].action='<%=resetPersonalizedThemeURL%>';
		        document.forms["<portlet:namespace />fm"].submit();
		        }, ['liferay-util-list-fields']
		       );
		            
		 </aui:script>
		</aui:form>
	</c:when>
	<c:otherwise>
		<p>
			Theme Personalizer is not configured. Please contact your administrator to configure Theme Personalizer through Theme Personalizer Admin in Control Panel.
		</p>
	</c:otherwise>
</c:choose>	