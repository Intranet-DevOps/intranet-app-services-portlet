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
		attributes.put("employeeScreenName", getEmployeeScreenName());
		attributes.put("logDate", getLogDate());
		attributes.put("regular", getRegular());
		attributes.put("overtime", getOvertime());
		attributes.put("sick", getSick());
		attributes.put("vacation", getVacation());
		attributes.put("holiday", getHoliday());
		attributes.put("unpaid", getUnpaid());
		attributes.put("other", getOther());
		attributes.put("remarks", getRemarks());
		attributes.put("status", getStatus());
		attributes.put("projectCode", getProjectCode());
		attributes.put("approvedBy", getApprovedBy());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("processedBy", getProcessedBy());
		attributes.put("processedDate", getProcessedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer timesheetId = (Integer)attributes.get("timesheetId");

		if (timesheetId != null) {
			setTimesheetId(timesheetId);
		}

		String employeeScreenName = (String)attributes.get("employeeScreenName");

		if (employeeScreenName != null) {
			setEmployeeScreenName(employeeScreenName);
		}

		Date logDate = (Date)attributes.get("logDate");

		if (logDate != null) {
			setLogDate(logDate);
		}

		Double regular = (Double)attributes.get("regular");

		if (regular != null) {
			setRegular(regular);
		}

		Double overtime = (Double)attributes.get("overtime");

		if (overtime != null) {
			setOvertime(overtime);
		}

		Double sick = (Double)attributes.get("sick");

		if (sick != null) {
			setSick(sick);
		}

		Double vacation = (Double)attributes.get("vacation");

		if (vacation != null) {
			setVacation(vacation);
		}

		Double holiday = (Double)attributes.get("holiday");

		if (holiday != null) {
			setHoliday(holiday);
		}

		Double unpaid = (Double)attributes.get("unpaid");

		if (unpaid != null) {
			setUnpaid(unpaid);
		}

		Double other = (Double)attributes.get("other");

		if (other != null) {
			setOther(other);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String projectCode = (String)attributes.get("projectCode");

		if (projectCode != null) {
			setProjectCode(projectCode);
		}

		String approvedBy = (String)attributes.get("approvedBy");

		if (approvedBy != null) {
			setApprovedBy(approvedBy);
		}

		Date approvedDate = (Date)attributes.get("approvedDate");

		if (approvedDate != null) {
			setApprovedDate(approvedDate);
		}

		String processedBy = (String)attributes.get("processedBy");

		if (processedBy != null) {
			setProcessedBy(processedBy);
		}

		Date processedDate = (Date)attributes.get("processedDate");

		if (processedDate != null) {
			setProcessedDate(processedDate);
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
	* Returns the employee screen name of this timesheet.
	*
	* @return the employee screen name of this timesheet
	*/
	@Override
	public java.lang.String getEmployeeScreenName() {
		return _timesheet.getEmployeeScreenName();
	}

	/**
	* Sets the employee screen name of this timesheet.
	*
	* @param employeeScreenName the employee screen name of this timesheet
	*/
	@Override
	public void setEmployeeScreenName(java.lang.String employeeScreenName) {
		_timesheet.setEmployeeScreenName(employeeScreenName);
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
	* Returns the regular of this timesheet.
	*
	* @return the regular of this timesheet
	*/
	@Override
	public double getRegular() {
		return _timesheet.getRegular();
	}

	/**
	* Sets the regular of this timesheet.
	*
	* @param regular the regular of this timesheet
	*/
	@Override
	public void setRegular(double regular) {
		_timesheet.setRegular(regular);
	}

	/**
	* Returns the overtime of this timesheet.
	*
	* @return the overtime of this timesheet
	*/
	@Override
	public double getOvertime() {
		return _timesheet.getOvertime();
	}

	/**
	* Sets the overtime of this timesheet.
	*
	* @param overtime the overtime of this timesheet
	*/
	@Override
	public void setOvertime(double overtime) {
		_timesheet.setOvertime(overtime);
	}

	/**
	* Returns the sick of this timesheet.
	*
	* @return the sick of this timesheet
	*/
	@Override
	public double getSick() {
		return _timesheet.getSick();
	}

	/**
	* Sets the sick of this timesheet.
	*
	* @param sick the sick of this timesheet
	*/
	@Override
	public void setSick(double sick) {
		_timesheet.setSick(sick);
	}

	/**
	* Returns the vacation of this timesheet.
	*
	* @return the vacation of this timesheet
	*/
	@Override
	public double getVacation() {
		return _timesheet.getVacation();
	}

	/**
	* Sets the vacation of this timesheet.
	*
	* @param vacation the vacation of this timesheet
	*/
	@Override
	public void setVacation(double vacation) {
		_timesheet.setVacation(vacation);
	}

	/**
	* Returns the holiday of this timesheet.
	*
	* @return the holiday of this timesheet
	*/
	@Override
	public double getHoliday() {
		return _timesheet.getHoliday();
	}

	/**
	* Sets the holiday of this timesheet.
	*
	* @param holiday the holiday of this timesheet
	*/
	@Override
	public void setHoliday(double holiday) {
		_timesheet.setHoliday(holiday);
	}

	/**
	* Returns the unpaid of this timesheet.
	*
	* @return the unpaid of this timesheet
	*/
	@Override
	public double getUnpaid() {
		return _timesheet.getUnpaid();
	}

	/**
	* Sets the unpaid of this timesheet.
	*
	* @param unpaid the unpaid of this timesheet
	*/
	@Override
	public void setUnpaid(double unpaid) {
		_timesheet.setUnpaid(unpaid);
	}

	/**
	* Returns the other of this timesheet.
	*
	* @return the other of this timesheet
	*/
	@Override
	public double getOther() {
		return _timesheet.getOther();
	}

	/**
	* Sets the other of this timesheet.
	*
	* @param other the other of this timesheet
	*/
	@Override
	public void setOther(double other) {
		_timesheet.setOther(other);
	}

	/**
	* Returns the remarks of this timesheet.
	*
	* @return the remarks of this timesheet
	*/
	@Override
	public java.lang.String getRemarks() {
		return _timesheet.getRemarks();
	}

	/**
	* Sets the remarks of this timesheet.
	*
	* @param remarks the remarks of this timesheet
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_timesheet.setRemarks(remarks);
	}

	/**
	* Returns the status of this timesheet.
	*
	* @return the status of this timesheet
	*/
	@Override
	public java.lang.String getStatus() {
		return _timesheet.getStatus();
	}

	/**
	* Sets the status of this timesheet.
	*
	* @param status the status of this timesheet
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_timesheet.setStatus(status);
	}

	/**
	* Returns the project code of this timesheet.
	*
	* @return the project code of this timesheet
	*/
	@Override
	public java.lang.String getProjectCode() {
		return _timesheet.getProjectCode();
	}

	/**
	* Sets the project code of this timesheet.
	*
	* @param projectCode the project code of this timesheet
	*/
	@Override
	public void setProjectCode(java.lang.String projectCode) {
		_timesheet.setProjectCode(projectCode);
	}

	/**
	* Returns the approved by of this timesheet.
	*
	* @return the approved by of this timesheet
	*/
	@Override
	public java.lang.String getApprovedBy() {
		return _timesheet.getApprovedBy();
	}

	/**
	* Sets the approved by of this timesheet.
	*
	* @param approvedBy the approved by of this timesheet
	*/
	@Override
	public void setApprovedBy(java.lang.String approvedBy) {
		_timesheet.setApprovedBy(approvedBy);
	}

	/**
	* Returns the approved date of this timesheet.
	*
	* @return the approved date of this timesheet
	*/
	@Override
	public java.util.Date getApprovedDate() {
		return _timesheet.getApprovedDate();
	}

	/**
	* Sets the approved date of this timesheet.
	*
	* @param approvedDate the approved date of this timesheet
	*/
	@Override
	public void setApprovedDate(java.util.Date approvedDate) {
		_timesheet.setApprovedDate(approvedDate);
	}

	/**
	* Returns the processed by of this timesheet.
	*
	* @return the processed by of this timesheet
	*/
	@Override
	public java.lang.String getProcessedBy() {
		return _timesheet.getProcessedBy();
	}

	/**
	* Sets the processed by of this timesheet.
	*
	* @param processedBy the processed by of this timesheet
	*/
	@Override
	public void setProcessedBy(java.lang.String processedBy) {
		_timesheet.setProcessedBy(processedBy);
	}

	/**
	* Returns the processed date of this timesheet.
	*
	* @return the processed date of this timesheet
	*/
	@Override
	public java.util.Date getProcessedDate() {
		return _timesheet.getProcessedDate();
	}

	/**
	* Sets the processed date of this timesheet.
	*
	* @param processedDate the processed date of this timesheet
	*/
	@Override
	public void setProcessedDate(java.util.Date processedDate) {
		_timesheet.setProcessedDate(processedDate);
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