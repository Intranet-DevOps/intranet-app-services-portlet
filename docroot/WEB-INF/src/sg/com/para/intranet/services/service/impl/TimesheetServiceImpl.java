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

import sg.com.para.intranet.services.model.Timesheet;
import sg.com.para.intranet.services.service.base.TimesheetServiceBaseImpl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

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

	private static Log _log = LogFactoryUtil.getLog(TimesheetServiceImpl.class);

	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * sg.com.para.intranet.services.service.TimesheetServiceUtil} to access the
	 * timesheet remote service.
	 */

	public Timesheet getTimesheet(int timesheetId, String actor) throws Exception {
		_log.info("getTimesheet [timesheetId: " + timesheetId + "]");
		return timesheetLocalService.getTimesheet(timesheetId, actor);
	}

	public List<Timesheet> findTimesheetsByUser(Date startDate, Date endDate, String userId, String actor)
			throws Exception {
		_log.info("findTimesheetsByUser [startDate: " + startDate + ", endDate: " + endDate + ", userId: " + userId
				+ "]");
		return timesheetLocalService.findTimesheetsByUser(startDate, endDate, userId, actor);
	}

	public Timesheet createTimeSheet(String employeeScreenName, double regular, double overtime, double sick,
			double vacation, double holiday, double unpaid, double other, String remarks, String status,
			String projectCode, String actor) throws Exception {
		Timesheet timesheet = timesheetLocalService.createTimesheet((int) CounterLocalServiceUtil
				.increment(Timesheet.class.toString()));
		timesheet.setEmployeeScreenName(employeeScreenName);
		timesheet.setRegular(regular);
		timesheet.setLogDate(new Date());
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

	public Timesheet updateTimeSheet(int timesheetId, String employeeScreenName, double regular, double overtime,
			double sick, double vacation, double holiday, double unpaid, double other, String remarks, String status,
			String projectCode, String actor) throws Exception {
		_log.info("updateTimeSheet [timesheetId: " + timesheetId + ", employeeScreenName: " + employeeScreenName
				+ ", regular " + regular + ", overtime: " + overtime + ", sick: " + sick + ", vacation: " + vacation
				+ ", unpaid: " + unpaid + ", other: " + other + ", remarks: " + remarks + ", status: " + status
				+ ", projectCode: " + projectCode + "]");
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

	public void approveTimeSheet(int timesheetId, String actor) throws Exception {
		_log.info("approveTimeSheet [timesheetId: " + timesheetId + ", by approver: " + actor + "]");
		Timesheet timesheet = timesheetLocalService.fetchTimesheet(timesheetId);
		timesheet.setStatus("APPROVED");
		timesheetLocalService.updateTimesheet(timesheet);
	}

	public void rejectTimeSheet(int timesheetId, String comment, String actor) throws Exception {
		_log.info("approveTimeSheet [timesheetId: " + timesheetId + ", by approver: " + actor + ", comment: " + comment
				+ "]");
		Timesheet timesheet = timesheetLocalService.fetchTimesheet(timesheetId);
		timesheet.setStatus("REJECTED");
		timesheetLocalService.updateTimesheet(timesheet);
	}

	public void submitMonth(int year, int month, String userId, String actor) throws Exception {
		_log.info("submitMonth [year: " + year + ", month: " + month + ", userId: " + userId + "]");
	}

	public void rejectMonth(int year, int month, String comment, String actor) throws Exception {
		_log.info("rejectMonth [year: " + year + ", month: " + month + ", by approver: " + actor + ", comment: "
				+ comment + "]");
	}

	public void c(int year, int month, String userId, String actor) throws Exception {
		_log.info("comment [year: " + year + ", month: " + month + ", by approver: " + actor + "]");
	}
}