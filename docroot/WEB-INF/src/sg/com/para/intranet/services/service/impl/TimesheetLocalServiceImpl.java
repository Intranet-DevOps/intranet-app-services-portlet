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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import sg.com.para.intranet.services.model.Timesheet;
import sg.com.para.intranet.services.model.bean.TimesheetBean;
import sg.com.para.intranet.services.service.base.TimesheetLocalServiceBaseImpl;
import sg.com.para.intranet.services.util.DateUtils;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * The implementation of the timesheet local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link sg.com.para.intranet.services.service.TimesheetLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Fernando Karnagi
 * @see sg.com.para.intranet.services.service.base.TimesheetLocalServiceBaseImpl
 * @see sg.com.para.intranet.services.service.TimesheetLocalServiceUtil
 */
public class TimesheetLocalServiceImpl extends TimesheetLocalServiceBaseImpl {

	private static Log _log = LogFactoryUtil.getLog(TimesheetLocalServiceImpl.class);

	/*
	 * 
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * sg.com.para.intranet.services.service.TimesheetLocalServiceUtil} to
	 * access the timesheet local service.
	 */

	public Timesheet getTimesheet(int timesheetId, String actor) throws Exception {
		return timesheetPersistence.findByPrimaryKey(timesheetId);
	}

	private Timesheet isTimesheetPresent(Date date, List<Timesheet> timesheets) {
		for (Timesheet timesheet : timesheets) {
			if (timesheet.getLogDate() != null) {
				if (DateUtils.isSameDate(date, timesheet.getLogDate())) {
					return timesheet;
				}
			}
		}
		return null;
	}

	public List<Timesheet> findTimesheetsByUser(Date startDate, Date endDate, String userId, String actor)
			throws Exception {
 
		DynamicQuery dynaQuery = DynamicQueryFactoryUtil.forClass(Timesheet.class, getClass().getClassLoader())
				.add(PropertyFactoryUtil.forName("employeeScreenName").eq(userId))
				.addOrder(OrderFactoryUtil.asc("logDate"));

		List<Timesheet> timesheets = timesheetPersistence.findWithDynamicQuery(dynaQuery);
		_log.info("find with dynamic query [timesheets: " + timesheets + "]");
		List<Timesheet> timesheetsRet = new ArrayList<Timesheet>();
		int currentTime = (int) new Date().getTime();
		while (startDate.before(endDate)) {
			Timesheet existingTimesheet = isTimesheetPresent(startDate, timesheets);
			if (existingTimesheet == null) {
				currentTime++;
				existingTimesheet = new TimesheetBean();
				existingTimesheet.setTimesheetId(currentTime);
				existingTimesheet.setEmployeeScreenName(userId);
				existingTimesheet.setLogDate(startDate);
			}

			timesheetsRet.add(existingTimesheet);
			startDate = DateUtils.increaseDay(startDate, 1);
		}

		return timesheetsRet;
	}
}