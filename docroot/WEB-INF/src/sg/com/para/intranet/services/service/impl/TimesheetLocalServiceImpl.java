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
import sg.com.para.intranet.services.service.base.TimesheetLocalServiceBaseImpl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;

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
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * sg.com.para.intranet.services.service.TimesheetLocalServiceUtil} to
	 * access the timesheet local service.
	 */

	public Timesheet getTimesheet(int timesheetId) throws Exception {
		return timesheetPersistence.findByPrimaryKey(timesheetId);
	}

	public List<Timesheet> findTimesheetsByUser(Date startDate, Date endDate, String userId) throws Exception {
		DynamicQuery dynaQuery = DynamicQueryFactoryUtil.forClass(Timesheet.class)
				.add(PropertyFactoryUtil.forName("employeeScreenName").eq(userId))
				.addOrder(OrderFactoryUtil.asc("logDate"));
		List<Timesheet> ret = timesheetPersistence.findWithDynamicQuery(dynaQuery);
		
		return ret; 
	}
}