Theme Personalizer
=========

Its a very common requirement for any portal to allow users to personalize portal's look and feel. Theme Personalizer is a plugin which allows users to apply their personized theme on any page in the Liferay portal. The plugin includes theme personalizer admin portlet (Control Panel) for portal admins and theme personalizer portlet for end users. Admin can configure themes which s/he wants to allow in theme personalizer portlet. Theme personaliser portlet can be added to any page or embeded in theme or layout. It works similar to Language portlet. Once available on a page users can choose their favorite theme and color scheme for that page. 


How to Use Theme Personalizer (Liferay 6.1.x CE)
---------
1. Install Theme Personalizer war file on Liferay Portal.
2. Sign In as Portal admin and navigate to Control Panel.
3. Now click on Theme Personalizer Admin entry from Portal section. It will display theme personalizer admin portlet as shown in bellow screenshot.
![ScreenShot](https://raw.github.com/knowarth-technologies/theme-personalizer/master/screenshots/liferay-6-1-2/theme-personalizer-admin-portlet-02.png)
4. All themes that are deployed on Liferay portal will be displayed (except WAP themes). By using arrow butons move your chice of themes in Available thems list box. End user will be allowed to personalize only those themes that are slected in available themes list box. Once selection is done click on save button.
5. Now navigate to any portal page and add Theme Personalizer portlet on the page. (It will be available under KNOWARTH Technologies category in add application diaglog box). Once added it will look similar to following screenshot.
![ScreenShot](https://raw.github.com/knowarth-technologies/theme-personalizer/master/screenshots/liferay-6-1-2/theme-personalizer-portlet.png)
6. Now Sign In as end user and select your chice of theme and color scheme and press save button. It will apply the theme on the page immediately. Other users will still see the default theme configured using mange page option. At any time we can reset the page theme to default by using Reset to Defaults option. If you check Apply for All pages check box then theme changes will be applied on all pages.

Things to Remember
------
- If there is no color scheme in a theme then Color Scheme dropdown will be blank. User can just choose Theme and apply it on the page.
- User can apply theme to all the pages and then go to individual page and override it through theme personalizer portlet on that page.
- The portlet will be automatically made hidden for Guest users.
- If available themes are not configured by Portal admin then theme personalizer portlet will only display a message.

Version 1.0.0
----

Here are some of the key features of the plugin included in this version.

- Control Panel based admin portlet to configure list of thmes available for theme personalization
- Easy to use portlet for end user to choose their choice of theme and color scheme
- Option to select personalized theme for all pages
- This version is compitible with Liferay Portal 6.1.x CE.

Support
------
Please feel free to contact us on contact@knowarth.com for any issue/suggestions. You can report issues through [Github issues] (https://github.com/knowarth-technologies/theme-personalizer/issues "Github Issues")