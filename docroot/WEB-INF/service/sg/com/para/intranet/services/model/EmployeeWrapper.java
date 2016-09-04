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
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author Fernando Karnagi
 * @see Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
	public EmployeeWrapper(Employee employee) {
		_employee = employee;
	}

	@Override
	public Class<?> getModelClass() {
		return Employee.class;
	}

	@Override
	public String getModelClassName() {
		return Employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeId", getEmployeeId());
		attributes.put("screenName", getScreenName());
		attributes.put("joinDate", getJoinDate());
		attributes.put("leaveDate", getLeaveDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer employeeId = (Integer)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		String screenName = (String)attributes.get("screenName");

		if (screenName != null) {
			setScreenName(screenName);
		}

		Date joinDate = (Date)attributes.get("joinDate");

		if (joinDate != null) {
			setJoinDate(joinDate);
		}

		Date leaveDate = (Date)attributes.get("leaveDate");

		if (leaveDate != null) {
			setLeaveDate(leaveDate);
		}
	}

	/**
	* Returns the primary key of this employee.
	*
	* @return the primary key of this employee
	*/
	@Override
	public int getPrimaryKey() {
		return _employee.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee.
	*
	* @param primaryKey the primary key of this employee
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_employee.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee ID of this employee.
	*
	* @return the employee ID of this employee
	*/
	@Override
	public int getEmployeeId() {
		return _employee.getEmployeeId();
	}

	/**
	* Sets the employee ID of this employee.
	*
	* @param employeeId the employee ID of this employee
	*/
	@Override
	public void setEmployeeId(int employeeId) {
		_employee.setEmployeeId(employeeId);
	}

	/**
	* Returns the screen name of this employee.
	*
	* @return the screen name of this employee
	*/
	@Override
	public java.lang.String getScreenName() {
		return _employee.getScreenName();
	}

	/**
	* Sets the screen name of this employee.
	*
	* @param screenName the screen name of this employee
	*/
	@Override
	public void setScreenName(java.lang.String screenName) {
		_employee.setScreenName(screenName);
	}

	/**
	* Returns the join date of this employee.
	*
	* @return the join date of this employee
	*/
	@Override
	public java.util.Date getJoinDate() {
		return _employee.getJoinDate();
	}

	/**
	* Sets the join date of this employee.
	*
	* @param joinDate the join date of this employee
	*/
	@Override
	public void setJoinDate(java.util.Date joinDate) {
		_employee.setJoinDate(joinDate);
	}

	/**
	* Returns the leave date of this employee.
	*
	* @return the leave date of this employee
	*/
	@Override
	public java.util.Date getLeaveDate() {
		return _employee.getLeaveDate();
	}

	/**
	* Sets the leave date of this employee.
	*
	* @param leaveDate the leave date of this employee
	*/
	@Override
	public void setLeaveDate(java.util.Date leaveDate) {
		_employee.setLeaveDate(leaveDate);
	}

	@Override
	public boolean isNew() {
		return _employee.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employee.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employee.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employee.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employee.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employee.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employee.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employee.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employee.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeWrapper((Employee)_employee.clone());
	}

	@Override
	public int compareTo(sg.com.para.intranet.services.model.Employee employee) {
		return _employee.compareTo(employee);
	}

	@Override
	public int hashCode() {
		return _employee.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<sg.com.para.intranet.services.model.Employee> toCacheModel() {
		return _employee.toCacheModel();
	}

	@Override
	public sg.com.para.intranet.services.model.Employee toEscapedModel() {
		return new EmployeeWrapper(_employee.toEscapedModel());
	}

	@Override
	public sg.com.para.intranet.services.model.Employee toUnescapedModel() {
		return new EmployeeWrapper(_employee.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employee.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employee.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeWrapper)) {
			return false;
		}

		EmployeeWrapper employeeWrapper = (EmployeeWrapper)obj;

		if (Validator.equals(_employee, employeeWrapper._employee)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Employee getWrappedEmployee() {
		return _employee;
	}

	@Override
	public Employee getWrappedModel() {
		return _employee;
	}

	@Override
	public void resetOriginalValues() {
		_employee.resetOriginalValues();
	}

	private Employee _employee;
}