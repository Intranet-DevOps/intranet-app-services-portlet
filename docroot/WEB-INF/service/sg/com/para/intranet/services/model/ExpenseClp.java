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
import sg.com.para.intranet.services.service.ExpenseLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Karnagi
 */
public class ExpenseClp extends BaseModelImpl<Expense> implements Expense {
	public ExpenseClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Expense.class;
	}

	@Override
	public String getModelClassName() {
		return Expense.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _expenseId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setExpenseId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _expenseId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("expenseId", getExpenseId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("expenseDate", getExpenseDate());
		attributes.put("submissionDate", getSubmissionDate());
		attributes.put("amount", getAmount());
		attributes.put("projectId", getProjectId());
		attributes.put("category", getCategory());
		attributes.put("remarks", getRemarks());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer expenseId = (Integer)attributes.get("expenseId");

		if (expenseId != null) {
			setExpenseId(expenseId);
		}

		Integer employeeId = (Integer)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Date expenseDate = (Date)attributes.get("expenseDate");

		if (expenseDate != null) {
			setExpenseDate(expenseDate);
		}

		Date submissionDate = (Date)attributes.get("submissionDate");

		if (submissionDate != null) {
			setSubmissionDate(submissionDate);
		}

		Double amount = (Double)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		Integer projectId = (Integer)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}
	}

	@Override
	public int getExpenseId() {
		return _expenseId;
	}

	@Override
	public void setExpenseId(int expenseId) {
		_expenseId = expenseId;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setExpenseId", int.class);

				method.invoke(_expenseRemoteModel, expenseId);
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

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeId", int.class);

				method.invoke(_expenseRemoteModel, employeeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getExpenseDate() {
		return _expenseDate;
	}

	@Override
	public void setExpenseDate(Date expenseDate) {
		_expenseDate = expenseDate;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setExpenseDate", Date.class);

				method.invoke(_expenseRemoteModel, expenseDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSubmissionDate() {
		return _submissionDate;
	}

	@Override
	public void setSubmissionDate(Date submissionDate) {
		_submissionDate = submissionDate;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setSubmissionDate", Date.class);

				method.invoke(_expenseRemoteModel, submissionDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAmount() {
		return _amount;
	}

	@Override
	public void setAmount(double amount) {
		_amount = amount;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount", double.class);

				method.invoke(_expenseRemoteModel, amount);
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

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setProjectId", int.class);

				method.invoke(_expenseRemoteModel, projectId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCategory() {
		return _category;
	}

	@Override
	public void setCategory(String category) {
		_category = category;

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setCategory", String.class);

				method.invoke(_expenseRemoteModel, category);
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

		if (_expenseRemoteModel != null) {
			try {
				Class<?> clazz = _expenseRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_expenseRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getExpenseRemoteModel() {
		return _expenseRemoteModel;
	}

	public void setExpenseRemoteModel(BaseModel<?> expenseRemoteModel) {
		_expenseRemoteModel = expenseRemoteModel;
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

		Class<?> remoteModelClass = _expenseRemoteModel.getClass();

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

		Object returnValue = method.invoke(_expenseRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ExpenseLocalServiceUtil.addExpense(this);
		}
		else {
			ExpenseLocalServiceUtil.updateExpense(this);
		}
	}

	@Override
	public Expense toEscapedModel() {
		return (Expense)ProxyUtil.newProxyInstance(Expense.class.getClassLoader(),
			new Class[] { Expense.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ExpenseClp clone = new ExpenseClp();

		clone.setExpenseId(getExpenseId());
		clone.setEmployeeId(getEmployeeId());
		clone.setExpenseDate(getExpenseDate());
		clone.setSubmissionDate(getSubmissionDate());
		clone.setAmount(getAmount());
		clone.setProjectId(getProjectId());
		clone.setCategory(getCategory());
		clone.setRemarks(getRemarks());

		return clone;
	}

	@Override
	public int compareTo(Expense expense) {
		int primaryKey = expense.getPrimaryKey();

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

		if (!(obj instanceof ExpenseClp)) {
			return false;
		}

		ExpenseClp expense = (ExpenseClp)obj;

		int primaryKey = expense.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{expenseId=");
		sb.append(getExpenseId());
		sb.append(", employeeId=");
		sb.append(getEmployeeId());
		sb.append(", expenseDate=");
		sb.append(getExpenseDate());
		sb.append(", submissionDate=");
		sb.append(getSubmissionDate());
		sb.append(", amount=");
		sb.append(getAmount());
		sb.append(", projectId=");
		sb.append(getProjectId());
		sb.append(", category=");
		sb.append(getCategory());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("sg.com.para.intranet.services.model.Expense");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>expenseId</column-name><column-value><![CDATA[");
		sb.append(getExpenseId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expenseDate</column-name><column-value><![CDATA[");
		sb.append(getExpenseDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>submissionDate</column-name><column-value><![CDATA[");
		sb.append(getSubmissionDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount</column-name><column-value><![CDATA[");
		sb.append(getAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectId</column-name><column-value><![CDATA[");
		sb.append(getProjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category</column-name><column-value><![CDATA[");
		sb.append(getCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _expenseId;
	private int _employeeId;
	private Date _expenseDate;
	private Date _submissionDate;
	private double _amount;
	private int _projectId;
	private String _category;
	private String _remarks;
	private BaseModel<?> _expenseRemoteModel;
	private Class<?> _clpSerializerClass = sg.com.para.intranet.services.service.ClpSerializer.class;
}