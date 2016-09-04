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

package sg.com.para.intranet.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ExpenseLocalService}.
 *
 * @author Fernando Karnagi
 * @see ExpenseLocalService
 * @generated
 */
public class ExpenseLocalServiceWrapper implements ExpenseLocalService,
	ServiceWrapper<ExpenseLocalService> {
	public ExpenseLocalServiceWrapper(ExpenseLocalService expenseLocalService) {
		_expenseLocalService = expenseLocalService;
	}

	/**
	* Adds the expense to the database. Also notifies the appropriate model listeners.
	*
	* @param expense the expense
	* @return the expense that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.services.model.Expense addExpense(
		sg.com.para.intranet.services.model.Expense expense)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _expenseLocalService.addExpense(expense);
	}

	/**
	* Creates a new expense with the primary key. Does not add the expense to the database.
	*
	* @param expenseId the primary key for the new expense
	* @return the new expense
	*/
	@Override
	public sg.com.para.intranet.services.model.Expense createExpense(
		int expenseId) {
		return _expenseLocalService.createExpense(expenseId);
	}

	/**
	* Deletes the expense with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param expenseId the primary key of the expense
	* @return the expense that was removed
	* @throws PortalException if a expense with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.services.model.Expense deleteExpense(
		int expenseId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expenseLocalService.deleteExpense(expenseId);
	}

	/**
	* Deletes the expense from the database. Also notifies the appropriate model listeners.
	*
	* @param expense the expense
	* @return the expense that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.services.model.Expense deleteExpense(
		sg.com.para.intranet.services.model.Expense expense)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _expenseLocalService.deleteExpense(expense);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _expenseLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _expenseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.ExpenseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _expenseLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.ExpenseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _expenseLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _expenseLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _expenseLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public sg.com.para.intranet.services.model.Expense fetchExpense(
		int expenseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _expenseLocalService.fetchExpense(expenseId);
	}

	/**
	* Returns the expense with the primary key.
	*
	* @param expenseId the primary key of the expense
	* @return the expense
	* @throws PortalException if a expense with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.services.model.Expense getExpense(int expenseId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expenseLocalService.getExpense(expenseId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _expenseLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the expenses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.ExpenseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of expenses
	* @param end the upper bound of the range of expenses (not inclusive)
	* @return the range of expenses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<sg.com.para.intranet.services.model.Expense> getExpenses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _expenseLocalService.getExpenses(start, end);
	}

	/**
	* Returns the number of expenses.
	*
	* @return the number of expenses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getExpensesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _expenseLocalService.getExpensesCount();
	}

	/**
	* Updates the expense in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param expense the expense
	* @return the expense that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.services.model.Expense updateExpense(
		sg.com.para.intranet.services.model.Expense expense)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _expenseLocalService.updateExpense(expense);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _expenseLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_expenseLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _expenseLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ExpenseLocalService getWrappedExpenseLocalService() {
		return _expenseLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedExpenseLocalService(
		ExpenseLocalService expenseLocalService) {
		_expenseLocalService = expenseLocalService;
	}

	@Override
	public ExpenseLocalService getWrappedService() {
		return _expenseLocalService;
	}

	@Override
	public void setWrappedService(ExpenseLocalService expenseLocalService) {
		_expenseLocalService = expenseLocalService;
	}

	private ExpenseLocalService _expenseLocalService;
}