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

import sg.com.para.intranet.services.model.Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Fernando Karnagi
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{employeeId=");
		sb.append(employeeId);
		sb.append(", screenName=");
		sb.append(screenName);
		sb.append(", joinDate=");
		sb.append(joinDate);
		sb.append(", leaveDate=");
		sb.append(leaveDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setEmployeeId(employeeId);

		if (screenName == null) {
			employeeImpl.setScreenName(StringPool.BLANK);
		}
		else {
			employeeImpl.setScreenName(screenName);
		}

		if (joinDate == Long.MIN_VALUE) {
			employeeImpl.setJoinDate(null);
		}
		else {
			employeeImpl.setJoinDate(new Date(joinDate));
		}

		if (leaveDate == Long.MIN_VALUE) {
			employeeImpl.setLeaveDate(null);
		}
		else {
			employeeImpl.setLeaveDate(new Date(leaveDate));
		}

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeId = objectInput.readInt();
		screenName = objectInput.readUTF();
		joinDate = objectInput.readLong();
		leaveDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(employeeId);

		if (screenName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(screenName);
		}

		objectOutput.writeLong(joinDate);
		objectOutput.writeLong(leaveDate);
	}

	public int employeeId;
	public String screenName;
	public long joinDate;
	public long leaveDate;
}