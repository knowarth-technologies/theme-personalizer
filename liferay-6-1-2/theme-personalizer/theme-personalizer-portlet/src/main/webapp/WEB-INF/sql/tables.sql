create table KNOWARTH_AvailablePersonalizedTheme (
	id_ LONG not null primary key,
	companyId LONG,
	themeId VARCHAR(75) null
);

create table KNOWARTH_UserPersonalizedTheme (
	id_ LONG not null primary key,
	userId LONG,
	layoutId LONG,
	themeId VARCHAR(75) null,
	colorSchemeId VARCHAR(75) null,
	applyForAllPages BOOLEAN
);