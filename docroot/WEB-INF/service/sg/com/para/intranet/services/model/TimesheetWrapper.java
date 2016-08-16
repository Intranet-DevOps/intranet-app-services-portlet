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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Timesheet}.
 * </p>
 *
 * @author Fernando Karnagi
 * @see Timesheet
 * @generated
 */
public class TimesheetWrapper implements Timesheet, ModelWrapper<Timesheet> {
	public TimesheetWrapper(Timesheet timesheet) {
		_timesheet = timesheet;
	}

	@Override
	public Class<?> getModelClass() {
		return Timesheet.class;
	}

	@Override
	public String getModelClassName() {
		return Timesheet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("timesheetId", getTimesheetId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("logDate", getLogDate());
		attributes.put("logType", getLogType());
		attributes.put("hours", getHours());
		attributes.put("projectId", getProjectId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer timesheetId = (Integer)attributes.get("timesheetId");

		if (timesheetId != null) {
			setTimesheetId(timesheetId);
		}

		Integer employeeId = (Integer)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Date logDate = (Date)attributes.get("logDate");

		if (logDate != null) {
			setLogDate(logDate);
		}

		String logType = (String)attributes.get("logType");

		if (logType != null) {
			setLogType(logType);
		}

		Double hours = (Double)attributes.get("hours");

		if (hours != null) {
			setHours(hours);
		}

		Integer projectId = (Integer)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}
	}

	/**
	* Returns the primary key of this timesheet.
	*
	* @return the primary key of this timesheet
	*/
	@Override
	public int getPrimaryKey() {
		return _timesheet.getPrimaryKey();
	}

	/**
	* Sets the primary key of this timesheet.
	*
	* @param primaryKey the primary key of this timesheet
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_timesheet.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the timesheet ID of this timesheet.
	*
	* @return the timesheet ID of this timesheet
	*/
	@Override
	public int getTimesheetId() {
		return _timesheet.getTimesheetId();
	}

	/**
	* Sets the timesheet ID of this timesheet.
	*
	* @param timesheetId the timesheet ID of this timesheet
	*/
	@Override
	public void setTimesheetId(int timesheetId) {
		_timesheet.setTimesheetId(timesheetId);
	}

	/**
	* Returns the employee ID of this timesheet.
	*
	* @return the employee ID of this timesheet
	*/
	@Override
	public int getEmployeeId() {
		return _timesheet.getEmployeeId();
	}

	/**
	* Sets the employee ID of this timesheet.
	*
	* @param employeeId the employee ID of this timesheet
	*/
	@Override
	public void setEmployeeId(int employeeId) {
		_timesheet.setEmployeeId(employeeId);
	}

	/**
	* Returns the log date of this timesheet.
	*
	* @return the log date of this timesheet
	*/
	@Override
	public java.util.Date getLogDate() {
		return _timesheet.getLogDate();
	}

	/**
	* Sets the log date of this timesheet.
	*
	* @param logDate the log date of this timesheet
	*/
	@Override
	public void setLogDate(java.util.Date logDate) {
		_timesheet.setLogDate(logDate);
	}

	/**
	* Returns the log type of this timesheet.
	*
	* @return the log type of this timesheet
	*/
	@Override
	public java.lang.String getLogType() {
		return _timesheet.getLogType();
	}

	/**
	* Sets the log type of this timesheet.
	*
	* @param logType the log type of this timesheet
	*/
	@Override
	public void setLogType(java.lang.String logType) {
		_timesheet.setLogType(logType);
	}

	/**
	* Returns the hours of this timesheet.
	*
	* @return the hours of this timesheet
	*/
	@Override
	public double getHours() {
		return _timesheet.getHours();
	}

	/**
	* Sets the hours of this timesheet.
	*
	* @param hours the hours of this timesheet
	*/
	@Override
	public void setHours(double hours) {
		_timesheet.setHours(hours);
	}

	/**
	* Returns the project ID of this timesheet.
	*
	* @return the project ID of this timesheet
	*/
	@Override
	public int getProjectId() {
		return _timesheet.getProjectId();
	}

	/**
	* Sets the project ID of this timesheet.
	*
	* @param projectId the project ID of this timesheet
	*/
	@Override
	public void setProjectId(int projectId) {
		_timesheet.setProjectId(projectId);
	}

	@Override
	public boolean isNew() {
		return _timesheet.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_timesheet.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _timesheet.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_timesheet.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _timesheet.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _timesheet.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_timesheet.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _timesheet.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_timesheet.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_timesheet.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_timesheet.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TimesheetWrapper((Timesheet)_timesheet.clone());
	}

	@Override
	public int compareTo(
		sg.com.para.intranet.services.model.Timesheet timesheet) {
		return _timesheet.compareTo(timesheet);
	}

	@Override
	public int hashCode() {
		return _timesheet.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<sg.com.para.intranet.services.model.Timesheet> toCacheModel() {
		return _timesheet.toCacheModel();
	}

	@Override
	public sg.com.para.intranet.services.model.Timesheet toEscapedModel() {
		return new TimesheetWrapper(_timesheet.toEscapedModel());
	}

	@Override
	public sg.com.para.intranet.services.model.Timesheet toUnescapedModel() {
		return new TimesheetWrapper(_timesheet.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _timesheet.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _timesheet.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_timesheet.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TimesheetWrapper)) {
			return false;
		}

		TimesheetWrapper timesheetWrapper = (TimesheetWrapper)obj;

		if (Validator.equals(_timesheet, timesheetWrapper._timesheet)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Timesheet getWrappedTimesheet() {
		return _timesheet;
	}

	@Override
	public Timesheet getWrappedModel() {
		return _timesheet;
	}

	@Override
	public void resetOriginalValues() {
		_timesheet.resetOriginalValues();
	}

	private Timesheet _timesheet;
}