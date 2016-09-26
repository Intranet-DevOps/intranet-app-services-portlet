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

package sg.com.para.intranet.services.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import sg.com.para.intranet.services.service.TimesheetServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link sg.com.para.intranet.services.service.TimesheetServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link sg.com.para.intranet.services.model.TimesheetSoap}.
 * If the method in the service utility returns a
 * {@link sg.com.para.intranet.services.model.Timesheet}, that is translated to a
 * {@link sg.com.para.intranet.services.model.TimesheetSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Fernando Karnagi
 * @see TimesheetServiceHttp
 * @see sg.com.para.intranet.services.model.TimesheetSoap
 * @see sg.com.para.intranet.services.service.TimesheetServiceUtil
 * @generated
 */
public class TimesheetServiceSoap {
	public static sg.com.para.intranet.services.model.TimesheetSoap getTimesheet(
		int timesheetId, java.lang.String actor) throws RemoteException {
		try {
			sg.com.para.intranet.services.model.Timesheet returnValue = TimesheetServiceUtil.getTimesheet(timesheetId,
					actor);

			return sg.com.para.intranet.services.model.TimesheetSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static sg.com.para.intranet.services.model.TimesheetSoap[] findTimesheetsByUser(
		java.util.Date startDate, java.util.Date endDate,
		java.lang.String userId, java.lang.String actor)
		throws RemoteException {
		try {
			java.util.List<sg.com.para.intranet.services.model.Timesheet> returnValue =
				TimesheetServiceUtil.findTimesheetsByUser(startDate, endDate,
					userId, actor);

			return sg.com.para.intranet.services.model.TimesheetSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static sg.com.para.intranet.services.model.TimesheetDetailsSoap[] getTimesheetDetails(
		long timesheetId, java.lang.String actor) throws RemoteException {
		try {
			java.util.List<sg.com.para.intranet.services.model.TimesheetDetails> returnValue =
				TimesheetServiceUtil.getTimesheetDetails(timesheetId, actor);

			return sg.com.para.intranet.services.model.TimesheetDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static sg.com.para.intranet.services.model.TimesheetDetailsSoap createTimesheetDetails(
		long timesheetId, java.util.Date clockInTime,
		java.util.Date clockOutTime, java.lang.String actor)
		throws RemoteException {
		try {
			sg.com.para.intranet.services.model.TimesheetDetails returnValue = TimesheetServiceUtil.createTimesheetDetails(timesheetId,
					clockInTime, clockOutTime, actor);

			return sg.com.para.intranet.services.model.TimesheetDetailsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static sg.com.para.intranet.services.model.TimesheetDetailsSoap updateTimesheetDetails(
		long timesheetDetailsId, java.util.Date clockInTime,
		java.util.Date clockOutTime, java.lang.String actor)
		throws RemoteException {
		try {
			sg.com.para.intranet.services.model.TimesheetDetails returnValue = TimesheetServiceUtil.updateTimesheetDetails(timesheetDetailsId,
					clockInTime, clockOutTime, actor);

			return sg.com.para.intranet.services.model.TimesheetDetailsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteTimesheetDetails(long timesheetDetailsId,
		java.lang.String actor) throws RemoteException {
		try {
			TimesheetServiceUtil.deleteTimesheetDetails(timesheetDetailsId,
				actor);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static sg.com.para.intranet.services.model.TimesheetSoap createTimeSheet(
		java.lang.String employeeScreenName, double regular, double overtime,
		double sick, double vacation, double holiday, double unpaid,
		double other, java.lang.String remarks, java.lang.String status,
		java.lang.String projectCode, long logDate, java.lang.String actor)
		throws RemoteException {
		try {
			sg.com.para.intranet.services.model.Timesheet returnValue = TimesheetServiceUtil.createTimeSheet(employeeScreenName,
					regular, overtime, sick, vacation, holiday, unpaid, other,
					remarks, status, projectCode, logDate, actor);

			return sg.com.para.intranet.services.model.TimesheetSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static sg.com.para.intranet.services.model.TimesheetSoap updateTimeSheet(
		int timesheetId, java.lang.String employeeScreenName, double regular,
		double overtime, double sick, double vacation, double holiday,
		double unpaid, double other, java.lang.String remarks,
		java.lang.String status, java.lang.String projectCode, long logDate,
		java.lang.String actor) throws RemoteException {
		try {
			sg.com.para.intranet.services.model.Timesheet returnValue = TimesheetServiceUtil.updateTimeSheet(timesheetId,
					employeeScreenName, regular, overtime, sick, vacation,
					holiday, unpaid, other, remarks, status, projectCode,
					logDate, actor);

			return sg.com.para.intranet.services.model.TimesheetSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteTimeSheet(int timesheetId, java.lang.String actor)
		throws RemoteException {
		try {
			TimesheetServiceUtil.deleteTimeSheet(timesheetId, actor);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void approveTimeSheet(int timesheetId, java.lang.String actor)
		throws RemoteException {
		try {
			TimesheetServiceUtil.approveTimeSheet(timesheetId, actor);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void rejectTimeSheet(int timesheetId,
		java.lang.String comment, java.lang.String actor)
		throws RemoteException {
		try {
			TimesheetServiceUtil.rejectTimeSheet(timesheetId, comment, actor);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void submitMonth(int year, int month,
		java.lang.String userId, java.lang.String actor)
		throws RemoteException {
		try {
			TimesheetServiceUtil.submitMonth(year, month, userId, actor);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void rejectMonth(int year, int month,
		java.lang.String comment, java.lang.String actor)
		throws RemoteException {
		try {
			TimesheetServiceUtil.rejectMonth(year, month, comment, actor);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void approveMonth(int year, int month,
		java.lang.String userId, java.lang.String actor)
		throws RemoteException {
		try {
			TimesheetServiceUtil.approveMonth(year, month, userId, actor);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(TimesheetServiceSoap.class);
}