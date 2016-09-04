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

import sg.com.para.intranet.services.model.Expense;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Expense in entity cache.
 *
 * @author Fernando Karnagi
 * @see Expense
 * @generated
 */
public class ExpenseCacheModel implements CacheModel<Expense>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{expenseId=");
		sb.append(expenseId);
		sb.append(", employeeScreenName=");
		sb.append(employeeScreenName);
		sb.append(", expenseDate=");
		sb.append(expenseDate);
		sb.append(", submissionDate=");
		sb.append(submissionDate);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", projectCode=");
		sb.append(projectCode);
		sb.append(", category=");
		sb.append(category);
		sb.append(", status=");
		sb.append(status);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Expense toEntityModel() {
		ExpenseImpl expenseImpl = new ExpenseImpl();

		expenseImpl.setExpenseId(expenseId);

		if (employeeScreenName == null) {
			expenseImpl.setEmployeeScreenName(StringPool.BLANK);
		}
		else {
			expenseImpl.setEmployeeScreenName(employeeScreenName);
		}

		if (expenseDate == Long.MIN_VALUE) {
			expenseImpl.setExpenseDate(null);
		}
		else {
			expenseImpl.setExpenseDate(new Date(expenseDate));
		}

		if (submissionDate == Long.MIN_VALUE) {
			expenseImpl.setSubmissionDate(null);
		}
		else {
			expenseImpl.setSubmissionDate(new Date(submissionDate));
		}

		expenseImpl.setAmount(amount);

		if (projectCode == null) {
			expenseImpl.setProjectCode(StringPool.BLANK);
		}
		else {
			expenseImpl.setProjectCode(projectCode);
		}

		if (category == null) {
			expenseImpl.setCategory(StringPool.BLANK);
		}
		else {
			expenseImpl.setCategory(category);
		}

		if (status == null) {
			expenseImpl.setStatus(StringPool.BLANK);
		}
		else {
			expenseImpl.setStatus(status);
		}

		if (remarks == null) {
			expenseImpl.setRemarks(StringPool.BLANK);
		}
		else {
			expenseImpl.setRemarks(remarks);
		}

		expenseImpl.resetOriginalValues();

		return expenseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		expenseId = objectInput.readInt();
		employeeScreenName = objectInput.readUTF();
		expenseDate = objectInput.readLong();
		submissionDate = objectInput.readLong();
		amount = objectInput.readDouble();
		projectCode = objectInput.readUTF();
		category = objectInput.readUTF();
		status = objectInput.readUTF();
		remarks = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(expenseId);

		if (employeeScreenName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeScreenName);
		}

		objectOutput.writeLong(expenseDate);
		objectOutput.writeLong(submissionDate);
		objectOutput.writeDouble(amount);

		if (projectCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectCode);
		}

		if (category == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(category);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}
	}

	public int expenseId;
	public String employeeScreenName;
	public long expenseDate;
	public long submissionDate;
	public double amount;
	public String projectCode;
	public String category;
	public String status;
	public String remarks;
}