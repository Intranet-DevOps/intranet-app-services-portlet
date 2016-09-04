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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Expense}.
 * </p>
 *
 * @author Fernando Karnagi
 * @see Expense
 * @generated
 */
public class ExpenseWrapper implements Expense, ModelWrapper<Expense> {
	public ExpenseWrapper(Expense expense) {
		_expense = expense;
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
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("expenseId", getExpenseId());
		attributes.put("employeeScreenName", getEmployeeScreenName());
		attributes.put("expenseDate", getExpenseDate());
		attributes.put("submissionDate", getSubmissionDate());
		attributes.put("amount", getAmount());
		attributes.put("projectCode", getProjectCode());
		attributes.put("category", getCategory());
		attributes.put("status", getStatus());
		attributes.put("remarks", getRemarks());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer expenseId = (Integer)attributes.get("expenseId");

		if (expenseId != null) {
			setExpenseId(expenseId);
		}

		String employeeScreenName = (String)attributes.get("employeeScreenName");

		if (employeeScreenName != null) {
			setEmployeeScreenName(employeeScreenName);
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

		String projectCode = (String)attributes.get("projectCode");

		if (projectCode != null) {
			setProjectCode(projectCode);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}
	}

	/**
	* Returns the primary key of this expense.
	*
	* @return the primary key of this expense
	*/
	@Override
	public int getPrimaryKey() {
		return _expense.getPrimaryKey();
	}

	/**
	* Sets the primary key of this expense.
	*
	* @param primaryKey the primary key of this expense
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_expense.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the expense ID of this expense.
	*
	* @return the expense ID of this expense
	*/
	@Override
	public int getExpenseId() {
		return _expense.getExpenseId();
	}

	/**
	* Sets the expense ID of this expense.
	*
	* @param expenseId the expense ID of this expense
	*/
	@Override
	public void setExpenseId(int expenseId) {
		_expense.setExpenseId(expenseId);
	}

	/**
	* Returns the employee screen name of this expense.
	*
	* @return the employee screen name of this expense
	*/
	@Override
	public java.lang.String getEmployeeScreenName() {
		return _expense.getEmployeeScreenName();
	}

	/**
	* Sets the employee screen name of this expense.
	*
	* @param employeeScreenName the employee screen name of this expense
	*/
	@Override
	public void setEmployeeScreenName(java.lang.String employeeScreenName) {
		_expense.setEmployeeScreenName(employeeScreenName);
	}

	/**
	* Returns the expense date of this expense.
	*
	* @return the expense date of this expense
	*/
	@Override
	public java.util.Date getExpenseDate() {
		return _expense.getExpenseDate();
	}

	/**
	* Sets the expense date of this expense.
	*
	* @param expenseDate the expense date of this expense
	*/
	@Override
	public void setExpenseDate(java.util.Date expenseDate) {
		_expense.setExpenseDate(expenseDate);
	}

	/**
	* Returns the submission date of this expense.
	*
	* @return the submission date of this expense
	*/
	@Override
	public java.util.Date getSubmissionDate() {
		return _expense.getSubmissionDate();
	}

	/**
	* Sets the submission date of this expense.
	*
	* @param submissionDate the submission date of this expense
	*/
	@Override
	public void setSubmissionDate(java.util.Date submissionDate) {
		_expense.setSubmissionDate(submissionDate);
	}

	/**
	* Returns the amount of this expense.
	*
	* @return the amount of this expense
	*/
	@Override
	public double getAmount() {
		return _expense.getAmount();
	}

	/**
	* Sets the amount of this expense.
	*
	* @param amount the amount of this expense
	*/
	@Override
	public void setAmount(double amount) {
		_expense.setAmount(amount);
	}

	/**
	* Returns the project code of this expense.
	*
	* @return the project code of this expense
	*/
	@Override
	public java.lang.String getProjectCode() {
		return _expense.getProjectCode();
	}

	/**
	* Sets the project code of this expense.
	*
	* @param projectCode the project code of this expense
	*/
	@Override
	public void setProjectCode(java.lang.String projectCode) {
		_expense.setProjectCode(projectCode);
	}

	/**
	* Returns the category of this expense.
	*
	* @return the category of this expense
	*/
	@Override
	public java.lang.String getCategory() {
		return _expense.getCategory();
	}

	/**
	* Sets the category of this expense.
	*
	* @param category the category of this expense
	*/
	@Override
	public void setCategory(java.lang.String category) {
		_expense.setCategory(category);
	}

	/**
	* Returns the status of this expense.
	*
	* @return the status of this expense
	*/
	@Override
	public java.lang.String getStatus() {
		return _expense.getStatus();
	}

	/**
	* Sets the status of this expense.
	*
	* @param status the status of this expense
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_expense.setStatus(status);
	}

	/**
	* Returns the remarks of this expense.
	*
	* @return the remarks of this expense
	*/
	@Override
	public java.lang.String getRemarks() {
		return _expense.getRemarks();
	}

	/**
	* Sets the remarks of this expense.
	*
	* @param remarks the remarks of this expense
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_expense.setRemarks(remarks);
	}

	@Override
	public boolean isNew() {
		return _expense.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_expense.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _expense.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_expense.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _expense.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _expense.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_expense.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _expense.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_expense.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_expense.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_expense.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ExpenseWrapper((Expense)_expense.clone());
	}

	@Override
	public int compareTo(sg.com.para.intranet.services.model.Expense expense) {
		return _expense.compareTo(expense);
	}

	@Override
	public int hashCode() {
		return _expense.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<sg.com.para.intranet.services.model.Expense> toCacheModel() {
		return _expense.toCacheModel();
	}

	@Override
	public sg.com.para.intranet.services.model.Expense toEscapedModel() {
		return new ExpenseWrapper(_expense.toEscapedModel());
	}

	@Override
	public sg.com.para.intranet.services.model.Expense toUnescapedModel() {
		return new ExpenseWrapper(_expense.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _expense.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _expense.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_expense.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ExpenseWrapper)) {
			return false;
		}

		ExpenseWrapper expenseWrapper = (ExpenseWrapper)obj;

		if (Validator.equals(_expense, expenseWrapper._expense)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Expense getWrappedExpense() {
		return _expense;
	}

	@Override
	public Expense getWrappedModel() {
		return _expense;
	}

	@Override
	public void resetOriginalValues() {
		_expense.resetOriginalValues();
	}

	private Expense _expense;
}