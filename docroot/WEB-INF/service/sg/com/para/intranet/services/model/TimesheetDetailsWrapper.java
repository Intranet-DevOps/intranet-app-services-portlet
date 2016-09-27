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
 * This class is a wrapper for {@link TimesheetDetails}.
 * </p>
 *
 * @author Fernando Karnagi
 * @see TimesheetDetails
 * @generated
 */
public class TimesheetDetailsWrapper implements TimesheetDetails,
	ModelWrapper<TimesheetDetails> {
	public TimesheetDetailsWrapper(TimesheetDetails timesheetDetails) {
		_timesheetDetails = timesheetDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return TimesheetDetails.class;
	}

	@Override
	public String getModelClassName() {
		return TimesheetDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("timesheetDetailsId", getTimesheetDetailsId());
		attributes.put("timesheetId", getTimesheetId());
		attributes.put("clockInTime", getClockInTime());
		attributes.put("clockOutTime", getClockOutTime());
		attributes.put("remarks", getRemarks());
		attributes.put("type", getType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer timesheetDetailsId = (Integer)attributes.get(
				"timesheetDetailsId");

		if (timesheetDetailsId != null) {
			setTimesheetDetailsId(timesheetDetailsId);
		}

		Integer timesheetId = (Integer)attributes.get("timesheetId");

		if (timesheetId != null) {
			setTimesheetId(timesheetId);
		}

		Date clockInTime = (Date)attributes.get("clockInTime");

		if (clockInTime != null) {
			setClockInTime(clockInTime);
		}

		Date clockOutTime = (Date)attributes.get("clockOutTime");

		if (clockOutTime != null) {
			setClockOutTime(clockOutTime);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}
	}

	/**
	* Returns the primary key of this timesheet details.
	*
	* @return the primary key of this timesheet details
	*/
	@Override
	public int getPrimaryKey() {
		return _timesheetDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this timesheet details.
	*
	* @param primaryKey the primary key of this timesheet details
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_timesheetDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the timesheet details ID of this timesheet details.
	*
	* @return the timesheet details ID of this timesheet details
	*/
	@Override
	public int getTimesheetDetailsId() {
		return _timesheetDetails.getTimesheetDetailsId();
	}

	/**
	* Sets the timesheet details ID of this timesheet details.
	*
	* @param timesheetDetailsId the timesheet details ID of this timesheet details
	*/
	@Override
	public void setTimesheetDetailsId(int timesheetDetailsId) {
		_timesheetDetails.setTimesheetDetailsId(timesheetDetailsId);
	}

	/**
	* Returns the timesheet ID of this timesheet details.
	*
	* @return the timesheet ID of this timesheet details
	*/
	@Override
	public int getTimesheetId() {
		return _timesheetDetails.getTimesheetId();
	}

	/**
	* Sets the timesheet ID of this timesheet details.
	*
	* @param timesheetId the timesheet ID of this timesheet details
	*/
	@Override
	public void setTimesheetId(int timesheetId) {
		_timesheetDetails.setTimesheetId(timesheetId);
	}

	/**
	* Returns the clock in time of this timesheet details.
	*
	* @return the clock in time of this timesheet details
	*/
	@Override
	public java.util.Date getClockInTime() {
		return _timesheetDetails.getClockInTime();
	}

	/**
	* Sets the clock in time of this timesheet details.
	*
	* @param clockInTime the clock in time of this timesheet details
	*/
	@Override
	public void setClockInTime(java.util.Date clockInTime) {
		_timesheetDetails.setClockInTime(clockInTime);
	}

	/**
	* Returns the clock out time of this timesheet details.
	*
	* @return the clock out time of this timesheet details
	*/
	@Override
	public java.util.Date getClockOutTime() {
		return _timesheetDetails.getClockOutTime();
	}

	/**
	* Sets the clock out time of this timesheet details.
	*
	* @param clockOutTime the clock out time of this timesheet details
	*/
	@Override
	public void setClockOutTime(java.util.Date clockOutTime) {
		_timesheetDetails.setClockOutTime(clockOutTime);
	}

	/**
	* Returns the remarks of this timesheet details.
	*
	* @return the remarks of this timesheet details
	*/
	@Override
	public java.lang.String getRemarks() {
		return _timesheetDetails.getRemarks();
	}

	/**
	* Sets the remarks of this timesheet details.
	*
	* @param remarks the remarks of this timesheet details
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_timesheetDetails.setRemarks(remarks);
	}

	/**
	* Returns the type of this timesheet details.
	*
	* @return the type of this timesheet details
	*/
	@Override
	public java.lang.String getType() {
		return _timesheetDetails.getType();
	}

	/**
	* Sets the type of this timesheet details.
	*
	* @param type the type of this timesheet details
	*/
	@Override
	public void setType(java.lang.String type) {
		_timesheetDetails.setType(type);
	}

	@Override
	public boolean isNew() {
		return _timesheetDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_timesheetDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _timesheetDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_timesheetDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _timesheetDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _timesheetDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_timesheetDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _timesheetDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_timesheetDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_timesheetDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_timesheetDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TimesheetDetailsWrapper((TimesheetDetails)_timesheetDetails.clone());
	}

	@Override
	public int compareTo(
		sg.com.para.intranet.services.model.TimesheetDetails timesheetDetails) {
		return _timesheetDetails.compareTo(timesheetDetails);
	}

	@Override
	public int hashCode() {
		return _timesheetDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<sg.com.para.intranet.services.model.TimesheetDetails> toCacheModel() {
		return _timesheetDetails.toCacheModel();
	}

	@Override
	public sg.com.para.intranet.services.model.TimesheetDetails toEscapedModel() {
		return new TimesheetDetailsWrapper(_timesheetDetails.toEscapedModel());
	}

	@Override
	public sg.com.para.intranet.services.model.TimesheetDetails toUnescapedModel() {
		return new TimesheetDetailsWrapper(_timesheetDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _timesheetDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _timesheetDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_timesheetDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TimesheetDetailsWrapper)) {
			return false;
		}

		TimesheetDetailsWrapper timesheetDetailsWrapper = (TimesheetDetailsWrapper)obj;

		if (Validator.equals(_timesheetDetails,
					timesheetDetailsWrapper._timesheetDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TimesheetDetails getWrappedTimesheetDetails() {
		return _timesheetDetails;
	}

	@Override
	public TimesheetDetails getWrappedModel() {
		return _timesheetDetails;
	}

	@Override
	public void resetOriginalValues() {
		_timesheetDetails.resetOriginalValues();
	}

	private TimesheetDetails _timesheetDetails;
}