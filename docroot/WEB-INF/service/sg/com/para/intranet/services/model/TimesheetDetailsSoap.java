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
 * This class is used by SOAP remote services, specifically {@link sg.com.para.intranet.services.service.http.TimesheetDetailsServiceSoap}.
 *
 * @author Fernando Karnagi
 * @see sg.com.para.intranet.services.service.http.TimesheetDetailsServiceSoap
 * @generated
 */
public class TimesheetDetailsSoap implements Serializable {
	public static TimesheetDetailsSoap toSoapModel(TimesheetDetails model) {
		TimesheetDetailsSoap soapModel = new TimesheetDetailsSoap();

		soapModel.setTimesheetDetailsId(model.getTimesheetDetailsId());
		soapModel.setTimesheetId(model.getTimesheetId());
		soapModel.setClockInTime(model.getClockInTime());
		soapModel.setClockOutTime(model.getClockOutTime());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setType(model.getType());
		soapModel.setFulldayOrTimeBased(model.getFulldayOrTimeBased());

		return soapModel;
	}

	public static TimesheetDetailsSoap[] toSoapModels(TimesheetDetails[] models) {
		TimesheetDetailsSoap[] soapModels = new TimesheetDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TimesheetDetailsSoap[][] toSoapModels(
		TimesheetDetails[][] models) {
		TimesheetDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TimesheetDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TimesheetDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TimesheetDetailsSoap[] toSoapModels(
		List<TimesheetDetails> models) {
		List<TimesheetDetailsSoap> soapModels = new ArrayList<TimesheetDetailsSoap>(models.size());

		for (TimesheetDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TimesheetDetailsSoap[soapModels.size()]);
	}

	public TimesheetDetailsSoap() {
	}

	public int getPrimaryKey() {
		return _timesheetDetailsId;
	}

	public void setPrimaryKey(int pk) {
		setTimesheetDetailsId(pk);
	}

	public int getTimesheetDetailsId() {
		return _timesheetDetailsId;
	}

	public void setTimesheetDetailsId(int timesheetDetailsId) {
		_timesheetDetailsId = timesheetDetailsId;
	}

	public int getTimesheetId() {
		return _timesheetId;
	}

	public void setTimesheetId(int timesheetId) {
		_timesheetId = timesheetId;
	}

	public Date getClockInTime() {
		return _clockInTime;
	}

	public void setClockInTime(Date clockInTime) {
		_clockInTime = clockInTime;
	}

	public Date getClockOutTime() {
		return _clockOutTime;
	}

	public void setClockOutTime(Date clockOutTime) {
		_clockOutTime = clockOutTime;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public String getFulldayOrTimeBased() {
		return _fulldayOrTimeBased;
	}

	public void setFulldayOrTimeBased(String fulldayOrTimeBased) {
		_fulldayOrTimeBased = fulldayOrTimeBased;
	}

	private int _timesheetDetailsId;
	private int _timesheetId;
	private Date _clockInTime;
	private Date _clockOutTime;
	private String _remarks;
	private String _type;
	private String _fulldayOrTimeBased;
}