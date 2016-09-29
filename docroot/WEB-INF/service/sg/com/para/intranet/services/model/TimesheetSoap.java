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
		soapModel.setEmployeeScreenName(model.getEmployeeScreenName());
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
		soapModel.setProjectCode(model.getProjectCode());
		soapModel.setApprovedBy(model.getApprovedBy());
		soapModel.setApprovedDate(model.getApprovedDate());
		soapModel.setProcessedBy(model.getProcessedBy());
		soapModel.setProcessedDate(model.getProcessedDate());

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

	public String getEmployeeScreenName() {
		return _employeeScreenName;
	}

	public void setEmployeeScreenName(String employeeScreenName) {
		_employeeScreenName = employeeScreenName;
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

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getProjectCode() {
		return _projectCode;
	}

	public void setProjectCode(String projectCode) {
		_projectCode = projectCode;
	}

	public String getApprovedBy() {
		return _approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		_approvedBy = approvedBy;
	}

	public Date getApprovedDate() {
		return _approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;
	}

	public String getProcessedBy() {
		return _processedBy;
	}

	public void setProcessedBy(String processedBy) {
		_processedBy = processedBy;
	}

	public Date getProcessedDate() {
		return _processedDate;
	}

	public void setProcessedDate(Date processedDate) {
		_processedDate = processedDate;
	}

	private int _timesheetId;
	private String _employeeScreenName;
	private Date _logDate;
	private double _regular;
	private double _overtime;
	private double _sick;
	private double _vacation;
	private double _holiday;
	private double _unpaid;
	private double _other;
	private String _remarks;
	private String _status;
	private String _projectCode;
	private String _approvedBy;
	private Date _approvedDate;
	private String _processedBy;
	private Date _processedDate;
}