/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package sg.com.para.intranet.services.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.util.StringUtil;

import sg.com.para.intranet.services.model.Timesheet;
import sg.com.para.intranet.services.service.base.TimesheetServiceBaseImpl;

/**
 * The implementation of the timesheet remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link sg.com.para.intranet.services.service.TimesheetService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Fernando Karnagi
 * @see sg.com.para.intranet.services.service.base.TimesheetServiceBaseImpl
 * @see sg.com.para.intranet.services.service.TimesheetServiceUtil
 */
public class TimesheetServiceImpl extends TimesheetServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * sg.com.para.intranet.services.service.TimesheetServiceUtil} to access the
	 * timesheet remote service.
	 */

	public Timesheet getTimesheet(int timesheetId) throws Exception {
		return timesheetLocalService.getTimesheet(timesheetId);
	}

	public List<Timesheet> findTimesheetsByUser(Date startDate, Date endDate, String userId) throws Exception {
		return timesheetLocalService.findTimesheetsByUser(startDate, endDate, userId);
	}

	public Timesheet createTimeSheet(String employeeScreenName, double regular, double overtime, double sick,
			double vacation, double holiday, double unpaid, double other, String remarks, String status,
			String projectCode) throws Exception {
		Timesheet timesheet = timesheetLocalService.createTimesheet((int) CounterLocalServiceUtil
				.increment(Timesheet.class.toString()));
		timesheet.setEmployeeScreenName(employeeScreenName);
		timesheet.setRegular(regular);
		timesheet.setOvertime(overtime);
		timesheet.setSick(sick);
		timesheet.setVacation(vacation);
		timesheet.setHoliday(holiday);
		timesheet.setUnpaid(unpaid);
		timesheet.setOther(other);
		timesheet.setRemarks(remarks);
		timesheet.setStatus(status);
		timesheet.setProjectCode(projectCode);

		timesheetLocalService.updateTimesheet(timesheet);
		
		return timesheet;
	}

	public Timesheet updateTimeSheet(int timesheetId, String employeeScreenName, double regular, double overtime, double sick,
			double vacation, double holiday, double unpaid, double other, String remarks, String status,
			String projectCode) throws Exception {
		Timesheet timesheet = timesheetLocalService.fetchTimesheet(timesheetId);
		timesheet.setEmployeeScreenName(employeeScreenName);
		timesheet.setRegular(regular);
		timesheet.setOvertime(overtime);
		timesheet.setSick(sick);
		timesheet.setVacation(vacation);
		timesheet.setHoliday(holiday);
		timesheet.setUnpaid(unpaid);
		timesheet.setOther(other);
		timesheet.setRemarks(remarks);
		timesheet.setStatus(status);
		timesheet.setProjectCode(projectCode);

		timesheet = timesheetLocalService.updateTimesheet(timesheet);
		
		return timesheet;
	}

}