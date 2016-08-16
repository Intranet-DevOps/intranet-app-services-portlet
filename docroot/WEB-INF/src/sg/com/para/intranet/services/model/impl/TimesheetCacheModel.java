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

package sg.com.para.intranet.services.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import sg.com.para.intranet.services.model.Timesheet;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Timesheet in entity cache.
 *
 * @author Fernando Karnagi
 * @see Timesheet
 * @generated
 */
public class TimesheetCacheModel implements CacheModel<Timesheet>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{timesheetId=");
		sb.append(timesheetId);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append(", logDate=");
		sb.append(logDate);
		sb.append(", logType=");
		sb.append(logType);
		sb.append(", hours=");
		sb.append(hours);
		sb.append(", projectId=");
		sb.append(projectId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Timesheet toEntityModel() {
		TimesheetImpl timesheetImpl = new TimesheetImpl();

		timesheetImpl.setTimesheetId(timesheetId);
		timesheetImpl.setEmployeeId(employeeId);

		if (logDate == Long.MIN_VALUE) {
			timesheetImpl.setLogDate(null);
		}
		else {
			timesheetImpl.setLogDate(new Date(logDate));
		}

		if (logType == null) {
			timesheetImpl.setLogType(StringPool.BLANK);
		}
		else {
			timesheetImpl.setLogType(logType);
		}

		timesheetImpl.setHours(hours);
		timesheetImpl.setProjectId(projectId);

		timesheetImpl.resetOriginalValues();

		return timesheetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		timesheetId = objectInput.readInt();
		employeeId = objectInput.readInt();
		logDate = objectInput.readLong();
		logType = objectInput.readUTF();
		hours = objectInput.readDouble();
		projectId = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(timesheetId);
		objectOutput.writeInt(employeeId);
		objectOutput.writeLong(logDate);

		if (logType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(logType);
		}

		objectOutput.writeDouble(hours);
		objectOutput.writeInt(projectId);
	}

	public int timesheetId;
	public int employeeId;
	public long logDate;
	public String logType;
	public double hours;
	public int projectId;
}