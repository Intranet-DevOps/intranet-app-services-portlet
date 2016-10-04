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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Timesheet. This utility wraps
 * {@link sg.com.para.intranet.services.service.impl.TimesheetServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Fernando Karnagi
 * @see TimesheetService
 * @see sg.com.para.intranet.services.service.base.TimesheetServiceBaseImpl
 * @see sg.com.para.intranet.services.service.impl.TimesheetServiceImpl
 * @generated
 */
public class TimesheetServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link sg.com.para.intranet.services.service.impl.TimesheetServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static sg.com.para.intranet.services.model.Timesheet getTimesheet(
		int timesheetId, java.lang.String actor) throws java.lang.Exception {
		return getService().getTimesheet(timesheetId, actor);
	}

	public static java.util.List<sg.com.para.intranet.services.model.Timesheet> findTimesheetsByUser(
		java.util.Date startDate, java.util.Date endDate,
		java.lang.String userId, java.lang.String actor)
		throws java.lang.Exception {
		return getService()
				   .findTimesheetsByUser(startDate, endDate, userId, actor);
	}

	public static java.util.List<sg.com.para.intranet.services.model.TimesheetDetails> getTimesheetDetails(
		int timesheetId, java.lang.String actor) throws java.lang.Exception {
		return getService().getTimesheetDetails(timesheetId, actor);
	}

	public static sg.com.para.intranet.services.model.TimesheetDetails addTimesheetDetails(
		int timesheetId, java.util.Date logDate, java.lang.String clockInTime,
		java.lang.String clockOutTime, java.lang.String type,
		java.lang.String remarks, java.lang.String fulldayOrTimeBased,
		java.lang.String actor) throws java.lang.Exception {
		return getService()
				   .addTimesheetDetails(timesheetId, logDate, clockInTime,
			clockOutTime, type, remarks, fulldayOrTimeBased, actor);
	}

	public static void deleteTimesheetDetails(int timesheetDetailsId,
		java.lang.String actor) throws java.lang.Exception {
		getService().deleteTimesheetDetails(timesheetDetailsId, actor);
	}

	public static sg.com.para.intranet.services.model.Timesheet createTimeSheet(
		java.lang.String employeeScreenName, double regular, double overtime,
		double sick, double vacation, double holiday, double unpaid,
		double other, java.lang.String remarks, java.lang.String status,
		java.lang.String projectCode, long logDate, java.lang.String actor)
		throws java.lang.Exception {
		return getService()
				   .createTimeSheet(employeeScreenName, regular, overtime,
			sick, vacation, holiday, unpaid, other, remarks, status,
			projectCode, logDate, actor);
	}

	public static sg.com.para.intranet.services.model.Timesheet updateTimeSheet(
		int timesheetId, java.lang.String employeeScreenName, double regular,
		double overtime, double sick, double vacation, double holiday,
		double unpaid, double other, java.lang.String remarks,
		java.lang.String status, java.lang.String projectCode, long logDate,
		java.lang.String actor) throws java.lang.Exception {
		return getService()
				   .updateTimeSheet(timesheetId, employeeScreenName, regular,
			overtime, sick, vacation, holiday, unpaid, other, remarks, status,
			projectCode, logDate, actor);
	}

	public static void deleteTimeSheet(int timesheetId, java.lang.String actor)
		throws java.lang.Exception {
		getService().deleteTimeSheet(timesheetId, actor);
	}

	public static void approveTimeSheet(int timesheetId, java.lang.String actor)
		throws java.lang.Exception {
		getService().approveTimeSheet(timesheetId, actor);
	}

	public static void rejectTimeSheet(int timesheetId,
		java.lang.String comment, java.lang.String actor)
		throws java.lang.Exception {
		getService().rejectTimeSheet(timesheetId, comment, actor);
	}

	public static void submitMonth(int year, int month,
		java.lang.String userId, java.lang.String actor)
		throws java.lang.Exception {
		getService().submitMonth(year, month, userId, actor);
	}

	public static void rejectMonth(int year, int month,
		java.lang.String comment, java.lang.String actor)
		throws java.lang.Exception {
		getService().rejectMonth(year, month, comment, actor);
	}

	public static void approveMonth(int year, int month,
		java.lang.String userId, java.lang.String actor)
		throws java.lang.Exception {
		getService().approveMonth(year, month, userId, actor);
	}

	public static void clearService() {
		_service = null;
	}

	public static TimesheetService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TimesheetService.class.getName());

			if (invokableService instanceof TimesheetService) {
				_service = (TimesheetService)invokableService;
			}
			else {
				_service = new TimesheetServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(TimesheetServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TimesheetService service) {
	}

	private static TimesheetService _service;
}