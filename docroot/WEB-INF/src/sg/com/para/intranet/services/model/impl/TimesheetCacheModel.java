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
		StringBundler sb = new StringBundler(27);

		sb.append("{timesheetId=");
		sb.append(timesheetId);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append(", logDate=");
		sb.append(logDate);
		sb.append(", regular=");
		sb.append(regular);
		sb.append(", overtime=");
		sb.append(overtime);
		sb.append(", sick=");
		sb.append(sick);
		sb.append(", vacation=");
		sb.append(vacation);
		sb.append(", holiday=");
		sb.append(holiday);
		sb.append(", unpaid=");
		sb.append(unpaid);
		sb.append(", other=");
		sb.append(other);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", status=");
		sb.append(status);
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

		timesheetImpl.setRegular(regular);
		timesheetImpl.setOvertime(overtime);
		timesheetImpl.setSick(sick);
		timesheetImpl.setVacation(vacation);
		timesheetImpl.setHoliday(holiday);
		timesheetImpl.setUnpaid(unpaid);
		timesheetImpl.setOther(other);

		if (remarks == null) {
			timesheetImpl.setRemarks(StringPool.BLANK);
		}
		else {
			timesheetImpl.setRemarks(remarks);
		}

		timesheetImpl.setStatus(status);
		timesheetImpl.setProjectId(projectId);

		timesheetImpl.resetOriginalValues();

		return timesheetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		timesheetId = objectInput.readInt();
		employeeId = objectInput.readInt();
		logDate = objectInput.readLong();
		regular = objectInput.readDouble();
		overtime = objectInput.readDouble();
		sick = objectInput.readDouble();
		vacation = objectInput.readDouble();
		holiday = objectInput.readDouble();
		unpaid = objectInput.readDouble();
		other = objectInput.readDouble();
		remarks = objectInput.readUTF();
		status = objectInput.readDouble();
		projectId = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(timesheetId);
		objectOutput.writeInt(employeeId);
		objectOutput.writeLong(logDate);
		objectOutput.writeDouble(regular);
		objectOutput.writeDouble(overtime);
		objectOutput.writeDouble(sick);
		objectOutput.writeDouble(vacation);
		objectOutput.writeDouble(holiday);
		objectOutput.writeDouble(unpaid);
		objectOutput.writeDouble(other);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeDouble(status);
		objectOutput.writeInt(projectId);
	}

	public int timesheetId;
	public int employeeId;
	public long logDate;
	public double regular;
	public double overtime;
	public double sick;
	public double vacation;
	public double holiday;
	public double unpaid;
	public double other;
	public String remarks;
	public double status;
	public int projectId;
}