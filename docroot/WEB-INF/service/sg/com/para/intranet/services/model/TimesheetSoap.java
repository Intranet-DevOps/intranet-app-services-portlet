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
		soapModel.setRegular(model.getRegular());
		soapModel.setOvertime(model.getOvertime());
		soapModel.setSick(model.getSick());
		soapModel.setVacation(model.getVacation());
		soapModel.setHoliday(model.getHoliday());
		soapModel.setUnpaid(model.getUnpaid());
		soapModel.setOther(model.getOther());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setStatus(model.getStatus());
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

	public double getRegular() {
		return _regular;
	}

	public void setRegular(double regular) {
		_regular = regular;
	}

	public double getOvertime() {
		return _overtime;
	}

	public void setOvertime(double overtime) {
		_overtime = overtime;
	}

	public double getSick() {
		return _sick;
	}

	public void setSick(double sick) {
		_sick = sick;
	}

	public double getVacation() {
		return _vacation;
	}

	public void setVacation(double vacation) {
		_vacation = vacation;
	}

	public double getHoliday() {
		return _holiday;
	}

	public void setHoliday(double holiday) {
		_holiday = holiday;
	}

	public double getUnpaid() {
		return _unpaid;
	}

	public void setUnpaid(double unpaid) {
		_unpaid = unpaid;
	}

	public double getOther() {
		return _other;
	}

	public void setOther(double other) {
		_other = other;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public double getStatus() {
		return _status;
	}

	public void setStatus(double status) {
		_status = status;
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
	private double _regular;
	private double _overtime;
	private double _sick;
	private double _vacation;
	private double _holiday;
	private double _unpaid;
	private double _other;
	private String _remarks;
	private double _status;
	private int _projectId;
}