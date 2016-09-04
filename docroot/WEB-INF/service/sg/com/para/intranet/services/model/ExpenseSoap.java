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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link sg.com.para.intranet.services.service.http.ExpenseServiceSoap}.
 *
 * @author Fernando Karnagi
 * @see sg.com.para.intranet.services.service.http.ExpenseServiceSoap
 * @generated
 */
public class ExpenseSoap implements Serializable {
	public static ExpenseSoap toSoapModel(Expense model) {
		ExpenseSoap soapModel = new ExpenseSoap();

		soapModel.setExpenseId(model.getExpenseId());
		soapModel.setEmployeeScreenName(model.getEmployeeScreenName());
		soapModel.setExpenseDate(model.getExpenseDate());
		soapModel.setSubmissionDate(model.getSubmissionDate());
		soapModel.setAmount(model.getAmount());
		soapModel.setProjectCode(model.getProjectCode());
		soapModel.setCategory(model.getCategory());
		soapModel.setStatus(model.getStatus());
		soapModel.setRemarks(model.getRemarks());

		return soapModel;
	}

	public static ExpenseSoap[] toSoapModels(Expense[] models) {
		ExpenseSoap[] soapModels = new ExpenseSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ExpenseSoap[][] toSoapModels(Expense[][] models) {
		ExpenseSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ExpenseSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ExpenseSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ExpenseSoap[] toSoapModels(List<Expense> models) {
		List<ExpenseSoap> soapModels = new ArrayList<ExpenseSoap>(models.size());

		for (Expense model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ExpenseSoap[soapModels.size()]);
	}

	public ExpenseSoap() {
	}

	public int getPrimaryKey() {
		return _expenseId;
	}

	public void setPrimaryKey(int pk) {
		setExpenseId(pk);
	}

	public int getExpenseId() {
		return _expenseId;
	}

	public void setExpenseId(int expenseId) {
		_expenseId = expenseId;
	}

	public String getEmployeeScreenName() {
		return _employeeScreenName;
	}

	public void setEmployeeScreenName(String employeeScreenName) {
		_employeeScreenName = employeeScreenName;
	}

	public Date getExpenseDate() {
		return _expenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		_expenseDate = expenseDate;
	}

	public Date getSubmissionDate() {
		return _submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		_submissionDate = submissionDate;
	}

	public double getAmount() {
		return _amount;
	}

	public void setAmount(double amount) {
		_amount = amount;
	}

	public String getProjectCode() {
		return _projectCode;
	}

	public void setProjectCode(String projectCode) {
		_projectCode = projectCode;
	}

	public String getCategory() {
		return _category;
	}

	public void setCategory(String category) {
		_category = category;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	private int _expenseId;
	private String _employeeScreenName;
	private Date _expenseDate;
	private Date _submissionDate;
	private double _amount;
	private String _projectCode;
	private String _category;
	private String _status;
	private String _remarks;
}