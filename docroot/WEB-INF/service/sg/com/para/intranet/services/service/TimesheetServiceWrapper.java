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

package sg.com.para.intranet.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TimesheetService}.
 *
 * @author Fernando Karnagi
 * @see TimesheetService
 * @generated
 */
public class TimesheetServiceWrapper implements TimesheetService,
	ServiceWrapper<TimesheetService> {
	public TimesheetServiceWrapper(TimesheetService timesheetService) {
		_timesheetService = timesheetService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _timesheetService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_timesheetService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _timesheetService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public sg.com.para.intranet.services.model.Timesheet getTimesheet(
		int timesheetId) throws java.lang.Exception {
		return _timesheetService.getTimesheet(timesheetId);
	}

	@Override
	public java.util.List<sg.com.para.intranet.services.model.Timesheet> findTimesheetsByUser(
		java.util.Date startDate, java.util.Date endDate,
		java.lang.String userId) throws java.lang.Exception {
		return _timesheetService.findTimesheetsByUser(startDate, endDate, userId);
	}

	@Override
	public sg.com.para.intranet.services.model.Timesheet createTimeSheet(
		java.lang.String employeeScreenName, double regular, double overtime,
		double sick, double vacation, double holiday, double unpaid,
		double other, java.lang.String remarks, java.lang.String status,
		java.lang.String projectCode) throws java.lang.Exception {
		return _timesheetService.createTimeSheet(employeeScreenName, regular,
			overtime, sick, vacation, holiday, unpaid, other, remarks, status,
			projectCode);
	}

	@Override
	public sg.com.para.intranet.services.model.Timesheet updateTimeSheet(
		int timesheetId, java.lang.String employeeScreenName, double regular,
		double overtime, double sick, double vacation, double holiday,
		double unpaid, double other, java.lang.String remarks,
		java.lang.String status, java.lang.String projectCode)
		throws java.lang.Exception {
		return _timesheetService.updateTimeSheet(timesheetId,
			employeeScreenName, regular, overtime, sick, vacation, holiday,
			unpaid, other, remarks, status, projectCode);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TimesheetService getWrappedTimesheetService() {
		return _timesheetService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTimesheetService(TimesheetService timesheetService) {
		_timesheetService = timesheetService;
	}

	@Override
	public TimesheetService getWrappedService() {
		return _timesheetService;
	}

	@Override
	public void setWrappedService(TimesheetService timesheetService) {
		_timesheetService = timesheetService;
	}

	private TimesheetService _timesheetService;
}