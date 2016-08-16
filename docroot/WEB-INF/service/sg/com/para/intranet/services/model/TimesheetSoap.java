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

package sg.com.para.intranet.services.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link sg.com.para.intranet.services.service.http.TimesheetServiceSoap}.
 *
 * @author Fernando Karnagi
 * @see sg.com.para.intranet.services.service.http.TimesheetServiceSoap
 * @generated
 */
public class TimesheetSoap implements Serializable {
	public static TimesheetSoap toSoapModel(Timesheet model) {
		TimesheetSoap soapModel = new TimesheetSoap();

		soapModel.setTimesheetId(model.getTimesheetId());
		soapModel.setEmployeeId(model.getEmployeeId());
		soapModel.setLogDate(model.getLogDate());
		soapModel.setLogType(model.getLogType());
		soapModel.setHours(model.getHours());
		soapModel.setProjectId(model.getProjectId());

		return soapModel;
	}

	public static TimesheetSoap[] toSoapModels(Timesheet[] models) {
		TimesheetSoap[] soapModels = new TimesheetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TimesheetSoap[][] toSoapModels(Timesheet[][] models) {
		TimesheetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TimesheetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TimesheetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TimesheetSoap[] toSoapModels(List<Timesheet> models) {
		List<TimesheetSoap> soapModels = new ArrayList<TimesheetSoap>(models.size());

		for (Timesheet model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TimesheetSoap[soapModels.size()]);
	}

	public TimesheetSoap() {
	}

	public int getPrimaryKey() {
		return _timesheetId;
	}

	public void setPrimaryKey(int pk) {
		setTimesheetId(pk);
	}

	public int getTimesheetId() {
		return _timesheetId;
	}

	public void setTimesheetId(int timesheetId) {
		_timesheetId = timesheetId;
	}

	public int getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(int employeeId) {
		_employeeId = employeeId;
	}

	public Date getLogDate() {
		return _logDate;
	}

	public void setLogDate(Date logDate) {
		_logDate = logDate;
	}

	public String getLogType() {
		return _logType;
	}

	public void setLogType(String logType) {
		_logType = logType;
	}

	public double getHours() {
		return _hours;
	}

	public void setHours(double hours) {
		_hours = hours;
	}

	public int getProjectId() {
		return _projectId;
	}

	public void setProjectId(int projectId) {
		_projectId = projectId;
	}

	private int _timesheetId;
	private int _employeeId;
	private Date _logDate;
	private String _logType;
	private double _hours;
	private int _projectId;
}