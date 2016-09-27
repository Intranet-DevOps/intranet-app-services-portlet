create table intranet_Timesheet (
	timesheetId INTEGER not null primary key,
	employeeId INTEGER,
	logDate DATE null,
	logType VARCHAR(75) null,
	hours DOUBLE,
	projectId INTEGER
);

create table intranet_employee (
	employeeId INTEGER not null primary key,
	screenName VARCHAR(75) null,
	joinDate DATE null,
	leaveDate DATE null
);

create table intranet_expense (
	expenseId INTEGER not null primary key,
	employeeScreenName VARCHAR(75) null,
	expenseDate DATE null,
	submissionDate DATE null,
	amount DOUBLE,
	projectCode VARCHAR(75) null,
	category VARCHAR(75) null,
	status VARCHAR(75) null,
	remarks VARCHAR(75) null
);

create table intranet_project (
	projectId INTEGER not null primary key,
	code_ VARCHAR(75) null,
	description VARCHAR(75) null
);

create table intranet_timesheet (
	timesheetId INTEGER not null primary key,
	employeeScreenName VARCHAR(75) null,
	logDate DATE null,
	regular DOUBLE,
	overtime DOUBLE,
	sick DOUBLE,
	vacation DOUBLE,
	holiday DOUBLE,
	unpaid DOUBLE,
	other DOUBLE,
	remarks VARCHAR(75) null,
	status VARCHAR(75) null,
	projectCode VARCHAR(75) null
);

create table intranet_timesheet_details (
	timesheetDetailsId INTEGER not null primary key,
	timesheetId INTEGER,
	clockInTime DATE null,
	clockOutTime DATE null,
	remarks VARCHAR(75) null,
	type_ VARCHAR(75) null
);