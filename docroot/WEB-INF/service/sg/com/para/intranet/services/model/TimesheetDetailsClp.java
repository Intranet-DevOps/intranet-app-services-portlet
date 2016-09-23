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
import sg.com.para.intranet.services.service.TimesheetDetailsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Karnagi
 */
public class TimesheetDetailsClp extends BaseModelImpl<TimesheetDetails>
	implements TimesheetDetails {
	public TimesheetDetailsClp() {
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
	public int getPrimaryKey() {
		return _timesheetDetailsId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setTimesheetDetailsId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _timesheetDetailsId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("timesheetDetailsId", getTimesheetDetailsId());
		attributes.put("timesheetId", getTimesheetId());
		attributes.put("clockInTime", getClockInTime());
		attributes.put("clockOutTime", getClockOutTime());
		attributes.put("remarks", getRemarks());

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
	}

	@Override
	public int getTimesheetDetailsId() {
		return _timesheetDetailsId;
	}

	@Override
	public void setTimesheetDetailsId(int timesheetDetailsId) {
		_timesheetDetailsId = timesheetDetailsId;

		if (_timesheetDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setTimesheetDetailsId",
						int.class);

				method.invoke(_timesheetDetailsRemoteModel, timesheetDetailsId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTimesheetId() {
		return _timesheetId;
	}

	@Override
	public void setTimesheetId(int timesheetId) {
		_timesheetId = timesheetId;

		if (_timesheetDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setTimesheetId", int.class);

				method.invoke(_timesheetDetailsRemoteModel, timesheetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getClockInTime() {
		return _clockInTime;
	}

	@Override
	public void setClockInTime(Date clockInTime) {
		_clockInTime = clockInTime;

		if (_timesheetDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setClockInTime", Date.class);

				method.invoke(_timesheetDetailsRemoteModel, clockInTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getClockOutTime() {
		return _clockOutTime;
	}

	@Override
	public void setClockOutTime(Date clockOutTime) {
		_clockOutTime = clockOutTime;

		if (_timesheetDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setClockOutTime", Date.class);

				method.invoke(_timesheetDetailsRemoteModel, clockOutTime);
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

		if (_timesheetDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_timesheetDetailsRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTimesheetDetailsRemoteModel() {
		return _timesheetDetailsRemoteModel;
	}

	public void setTimesheetDetailsRemoteModel(
		BaseModel<?> timesheetDetailsRemoteModel) {
		_timesheetDetailsRemoteModel = timesheetDetailsRemoteModel;
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

		Class<?> remoteModelClass = _timesheetDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_timesheetDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TimesheetDetailsLocalServiceUtil.addTimesheetDetails(this);
		}
		else {
			TimesheetDetailsLocalServiceUtil.updateTimesheetDetails(this);
		}
	}

	@Override
	public TimesheetDetails toEscapedModel() {
		return (TimesheetDetails)ProxyUtil.newProxyInstance(TimesheetDetails.class.getClassLoader(),
			new Class[] { TimesheetDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TimesheetDetailsClp clone = new TimesheetDetailsClp();

		clone.setTimesheetDetailsId(getTimesheetDetailsId());
		clone.setTimesheetId(getTimesheetId());
		clone.setClockInTime(getClockInTime());
		clone.setClockOutTime(getClockOutTime());
		clone.setRemarks(getRemarks());

		return clone;
	}

	@Override
	public int compareTo(TimesheetDetails timesheetDetails) {
		int primaryKey = timesheetDetails.getPrimaryKey();

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

		if (!(obj instanceof TimesheetDetailsClp)) {
			return false;
		}

		TimesheetDetailsClp timesheetDetails = (TimesheetDetailsClp)obj;

		int primaryKey = timesheetDetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{timesheetDetailsId=");
		sb.append(getTimesheetDetailsId());
		sb.append(", timesheetId=");
		sb.append(getTimesheetId());
		sb.append(", clockInTime=");
		sb.append(getClockInTime());
		sb.append(", clockOutTime=");
		sb.append(getClockOutTime());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("sg.com.para.intranet.services.model.TimesheetDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>timesheetDetailsId</column-name><column-value><![CDATA[");
		sb.append(getTimesheetDetailsId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timesheetId</column-name><column-value><![CDATA[");
		sb.append(getTimesheetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clockInTime</column-name><column-value><![CDATA[");
		sb.append(getClockInTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clockOutTime</column-name><column-value><![CDATA[");
		sb.append(getClockOutTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _timesheetDetailsId;
	private int _timesheetId;
	private Date _clockInTime;
	private Date _clockOutTime;
	private String _remarks;
	private BaseModel<?> _timesheetDetailsRemoteModel;
	private Class<?> _clpSerializerClass = sg.com.para.intranet.services.service.ClpSerializer.class;
}