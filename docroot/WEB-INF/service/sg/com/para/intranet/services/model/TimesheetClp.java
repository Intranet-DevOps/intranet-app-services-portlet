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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import sg.com.para.intranet.services.service.ClpSerializer;
import sg.com.para.intranet.services.service.TimesheetLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Karnagi
 */
public class TimesheetClp extends BaseModelImpl<Timesheet> implements Timesheet {
	public TimesheetClp() {
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
	public int getPrimaryKey() {
		return _timesheetId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setTimesheetId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _timesheetId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
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

	@Override
	public int getTimesheetId() {
		return _timesheetId;
	}

	@Override
	public void setTimesheetId(int timesheetId) {
		_timesheetId = timesheetId;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setTimesheetId", int.class);

				method.invoke(_timesheetRemoteModel, timesheetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmployeeScreenName() {
		return _employeeScreenName;
	}

	@Override
	public void setEmployeeScreenName(String employeeScreenName) {
		_employeeScreenName = employeeScreenName;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeScreenName",
						String.class);

				method.invoke(_timesheetRemoteModel, employeeScreenName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLogDate() {
		return _logDate;
	}

	@Override
	public void setLogDate(Date logDate) {
		_logDate = logDate;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setLogDate", Date.class);

				method.invoke(_timesheetRemoteModel, logDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getRegular() {
		return _regular;
	}

	@Override
	public void setRegular(double regular) {
		_regular = regular;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setRegular", double.class);

				method.invoke(_timesheetRemoteModel, regular);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getOvertime() {
		return _overtime;
	}

	@Override
	public void setOvertime(double overtime) {
		_overtime = overtime;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setOvertime", double.class);

				method.invoke(_timesheetRemoteModel, overtime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getSick() {
		return _sick;
	}

	@Override
	public void setSick(double sick) {
		_sick = sick;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setSick", double.class);

				method.invoke(_timesheetRemoteModel, sick);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getVacation() {
		return _vacation;
	}

	@Override
	public void setVacation(double vacation) {
		_vacation = vacation;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setVacation", double.class);

				method.invoke(_timesheetRemoteModel, vacation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getHoliday() {
		return _holiday;
	}

	@Override
	public void setHoliday(double holiday) {
		_holiday = holiday;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setHoliday", double.class);

				method.invoke(_timesheetRemoteModel, holiday);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getUnpaid() {
		return _unpaid;
	}

	@Override
	public void setUnpaid(double unpaid) {
		_unpaid = unpaid;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setUnpaid", double.class);

				method.invoke(_timesheetRemoteModel, unpaid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getOther() {
		return _other;
	}

	@Override
	public void setOther(double other) {
		_other = other;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setOther", double.class);

				method.invoke(_timesheetRemoteModel, other);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemarks() {
		return _remarks;
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_timesheetRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_timesheetRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProjectCode() {
		return _projectCode;
	}

	@Override
	public void setProjectCode(String projectCode) {
		_projectCode = projectCode;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setProjectCode", String.class);

				method.invoke(_timesheetRemoteModel, projectCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApprovedBy() {
		return _approvedBy;
	}

	@Override
	public void setApprovedBy(String approvedBy) {
		_approvedBy = approvedBy;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovedBy", String.class);

				method.invoke(_timesheetRemoteModel, approvedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApprovedDate() {
		return _approvedDate;
	}

	@Override
	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovedDate", Date.class);

				method.invoke(_timesheetRemoteModel, approvedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProcessedBy() {
		return _processedBy;
	}

	@Override
	public void setProcessedBy(String processedBy) {
		_processedBy = processedBy;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessedBy", String.class);

				method.invoke(_timesheetRemoteModel, processedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getProcessedDate() {
		return _processedDate;
	}

	@Override
	public void setProcessedDate(Date processedDate) {
		_processedDate = processedDate;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessedDate", Date.class);

				method.invoke(_timesheetRemoteModel, processedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTimesheetRemoteModel() {
		return _timesheetRemoteModel;
	}

	public void setTimesheetRemoteModel(BaseModel<?> timesheetRemoteModel) {
		_timesheetRemoteModel = timesheetRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _timesheetRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_timesheetRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TimesheetLocalServiceUtil.addTimesheet(this);
		}
		else {
			TimesheetLocalServiceUtil.updateTimesheet(this);
		}
	}

	@Override
	public Timesheet toEscapedModel() {
		return (Timesheet)ProxyUtil.newProxyInstance(Timesheet.class.getClassLoader(),
			new Class[] { Timesheet.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TimesheetClp clone = new TimesheetClp();

		clone.setTimesheetId(getTimesheetId());
		clone.setEmployeeScreenName(getEmployeeScreenName());
		clone.setLogDate(getLogDate());
		clone.setRegular(getRegular());
		clone.setOvertime(getOvertime());
		clone.setSick(getSick());
		clone.setVacation(getVacation());
		clone.setHoliday(getHoliday());
		clone.setUnpaid(getUnpaid());
		clone.setOther(getOther());
		clone.setRemarks(getRemarks());
		clone.setStatus(getStatus());
		clone.setProjectCode(getProjectCode());
		clone.setApprovedBy(getApprovedBy());
		clone.setApprovedDate(getApprovedDate());
		clone.setProcessedBy(getProcessedBy());
		clone.setProcessedDate(getProcessedDate());

		return clone;
	}

	@Override
	public int compareTo(Timesheet timesheet) {
		int primaryKey = timesheet.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TimesheetClp)) {
			return false;
		}

		TimesheetClp timesheet = (TimesheetClp)obj;

		int primaryKey = timesheet.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{timesheetId=");
		sb.append(getTimesheetId());
		sb.append(", employeeScreenName=");
		sb.append(getEmployeeScreenName());
		sb.append(", logDate=");
		sb.append(getLogDate());
		sb.append(", regular=");
		sb.append(getRegular());
		sb.append(", overtime=");
		sb.append(getOvertime());
		sb.append(", sick=");
		sb.append(getSick());
		sb.append(", vacation=");
		sb.append(getVacation());
		sb.append(", holiday=");
		sb.append(getHoliday());
		sb.append(", unpaid=");
		sb.append(getUnpaid());
		sb.append(", other=");
		sb.append(getOther());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", projectCode=");
		sb.append(getProjectCode());
		sb.append(", approvedBy=");
		sb.append(getApprovedBy());
		sb.append(", approvedDate=");
		sb.append(getApprovedDate());
		sb.append(", processedBy=");
		sb.append(getProcessedBy());
		sb.append(", processedDate=");
		sb.append(getProcessedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("sg.com.para.intranet.services.model.Timesheet");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>timesheetId</column-name><column-value><![CDATA[");
		sb.append(getTimesheetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeScreenName</column-name><column-value><![CDATA[");
		sb.append(getEmployeeScreenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>logDate</column-name><column-value><![CDATA[");
		sb.append(getLogDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regular</column-name><column-value><![CDATA[");
		sb.append(getRegular());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>overtime</column-name><column-value><![CDATA[");
		sb.append(getOvertime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sick</column-name><column-value><![CDATA[");
		sb.append(getSick());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vacation</column-name><column-value><![CDATA[");
		sb.append(getVacation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>holiday</column-name><column-value><![CDATA[");
		sb.append(getHoliday());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unpaid</column-name><column-value><![CDATA[");
		sb.append(getUnpaid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>other</column-name><column-value><![CDATA[");
		sb.append(getOther());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectCode</column-name><column-value><![CDATA[");
		sb.append(getProjectCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedBy</column-name><column-value><![CDATA[");
		sb.append(getApprovedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedDate</column-name><column-value><![CDATA[");
		sb.append(getApprovedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processedBy</column-name><column-value><![CDATA[");
		sb.append(getProcessedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processedDate</column-name><column-value><![CDATA[");
		sb.append(getProcessedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _timesheetRemoteModel;
	private Class<?> _clpSerializerClass = sg.com.para.intranet.services.service.ClpSerializer.class;
}