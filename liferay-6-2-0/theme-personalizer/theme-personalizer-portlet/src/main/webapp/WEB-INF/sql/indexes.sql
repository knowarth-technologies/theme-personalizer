create index IX_825AF0A3 on KNOWARTH_AvailablePersonalizedTheme (companyId);
create index IX_E3A955B1 on KNOWARTH_AvailablePersonalizedTheme (companyId, themeId);

create index IX_93986CEF on KNOWARTH_UserPersonalizedTheme (themeId);
create index IX_DC0CFEDF on KNOWARTH_UserPersonalizedTheme (userId);
create index IX_40B914D1 on KNOWARTH_UserPersonalizedTheme (userId, applyForAllPages);
create index IX_50ED4BB8 on KNOWARTH_UserPersonalizedTheme (userId, layoutId);