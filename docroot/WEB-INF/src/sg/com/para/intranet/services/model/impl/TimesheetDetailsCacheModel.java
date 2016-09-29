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

import sg.com.para.intranet.services.model.TimesheetDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TimesheetDetails in entity cache.
 *
 * @author Fernando Karnagi
 * @see TimesheetDetails
 * @generated
 */
public class TimesheetDetailsCacheModel implements CacheModel<TimesheetDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{timesheetDetailsId=");
		sb.append(timesheetDetailsId);
		sb.append(", timesheetId=");
		sb.append(timesheetId);
		sb.append(", clockInTime=");
		sb.append(clockInTime);
		sb.append(", clockOutTime=");
		sb.append(clockOutTime);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", type=");
		sb.append(type);
		sb.append(", fulldayOrTimeBased=");
		sb.append(fulldayOrTimeBased);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TimesheetDetails toEntityModel() {
		TimesheetDetailsImpl timesheetDetailsImpl = new TimesheetDetailsImpl();

		timesheetDetailsImpl.setTimesheetDetailsId(timesheetDetailsId);
		timesheetDetailsImpl.setTimesheetId(timesheetId);

		if (clockInTime == Long.MIN_VALUE) {
			timesheetDetailsImpl.setClockInTime(null);
		}
		else {
			timesheetDetailsImpl.setClockInTime(new Date(clockInTime));
		}

		if (clockOutTime == Long.MIN_VALUE) {
			timesheetDetailsImpl.setClockOutTime(null);
		}
		else {
			timesheetDetailsImpl.setClockOutTime(new Date(clockOutTime));
		}

		if (remarks == null) {
			timesheetDetailsImpl.setRemarks(StringPool.BLANK);
		}
		else {
			timesheetDetailsImpl.setRemarks(remarks);
		}

		if (type == null) {
			timesheetDetailsImpl.setType(StringPool.BLANK);
		}
		else {
			timesheetDetailsImpl.setType(type);
		}

		if (fulldayOrTimeBased == null) {
			timesheetDetailsImpl.setFulldayOrTimeBased(StringPool.BLANK);
		}
		else {
			timesheetDetailsImpl.setFulldayOrTimeBased(fulldayOrTimeBased);
		}

		timesheetDetailsImpl.resetOriginalValues();

		return timesheetDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		timesheetDetailsId = objectInput.readInt();
		timesheetId = objectInput.readInt();
		clockInTime = objectInput.readLong();
		clockOutTime = objectInput.readLong();
		remarks = objectInput.readUTF();
		type = objectInput.readUTF();
		fulldayOrTimeBased = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(timesheetDetailsId);
		objectOutput.writeInt(timesheetId);
		objectOutput.writeLong(clockInTime);
		objectOutput.writeLong(clockOutTime);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (fulldayOrTimeBased == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fulldayOrTimeBased);
		}
	}

	public int timesheetDetailsId;
	public int timesheetId;
	public long clockInTime;
	public long clockOutTime;
	public String remarks;
	public String type;
	public String fulldayOrTimeBased;
}