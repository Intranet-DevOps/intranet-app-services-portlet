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
	public int getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(int employeeId) {
		_employeeId = employeeId;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeId", int.class);

				method.invoke(_timesheetRemoteModel, employeeId);
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
	public String getLogType() {
		return _logType;
	}

	@Override
	public void setLogType(String logType) {
		_logType = logType;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setLogType", String.class);

				method.invoke(_timesheetRemoteModel, logType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getHours() {
		return _hours;
	}

	@Override
	public void setHours(double hours) {
		_hours = hours;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setHours", double.class);

				method.invoke(_timesheetRemoteModel, hours);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getProjectId() {
		return _projectId;
	}

	@Override
	public void setProjectId(int projectId) {
		_projectId = projectId;

		if (_timesheetRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetRemoteModel.getClass();

				Method method = clazz.getMethod("setProjectId", int.class);

				method.invoke(_timesheetRemoteModel, projectId);
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
		clone.setEmployeeId(getEmployeeId());
		clone.setLogDate(getLogDate());
		clone.setLogType(getLogType());
		clone.setHours(getHours());
		clone.setProjectId(getProjectId());

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
		StringBundler sb = new StringBundler(13);

		sb.append("{timesheetId=");
		sb.append(getTimesheetId());
		sb.append(", employeeId=");
		sb.append(getEmployeeId());
		sb.append(", logDate=");
		sb.append(getLogDate());
		sb.append(", logType=");
		sb.append(getLogType());
		sb.append(", hours=");
		sb.append(getHours());
		sb.append(", projectId=");
		sb.append(getProjectId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("sg.com.para.intranet.services.model.Timesheet");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>timesheetId</column-name><column-value><![CDATA[");
		sb.append(getTimesheetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>logDate</column-name><column-value><![CDATA[");
		sb.append(getLogDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>logType</column-name><column-value><![CDATA[");
		sb.append(getLogType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hours</column-name><column-value><![CDATA[");
		sb.append(getHours());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectId</column-name><column-value><![CDATA[");
		sb.append(getProjectId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _timesheetId;
	private int _employeeId;
	private Date _logDate;
	private String _logType;
	private double _hours;
	private int _projectId;
	private BaseModel<?> _timesheetRemoteModel;
	private Class<?> _clpSerializerClass = sg.com.para.intranet.services.service.ClpSerializer.class;
}