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
 * Provides a wrapper for {@link TimesheetLocalService}.
 *
 * @author Fernando Karnagi
 * @see TimesheetLocalService
 * @generated
 */
public class TimesheetLocalServiceWrapper implements TimesheetLocalService,
	ServiceWrapper<TimesheetLocalService> {
	public TimesheetLocalServiceWrapper(
		TimesheetLocalService timesheetLocalService) {
		_timesheetLocalService = timesheetLocalService;
	}

	/**
	* Adds the timesheet to the database. Also notifies the appropriate model listeners.
	*
	* @param timesheet the timesheet
	* @return the timesheet that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.services.model.Timesheet addTimesheet(
		sg.com.para.intranet.services.model.Timesheet timesheet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetLocalService.addTimesheet(timesheet);
	}

	/**
	* Creates a new timesheet with the primary key. Does not add the timesheet to the database.
	*
	* @param timesheetId the primary key for the new timesheet
	* @return the new timesheet
	*/
	@Override
	public sg.com.para.intranet.services.model.Timesheet createTimesheet(
		int timesheetId) {
		return _timesheetLocalService.createTimesheet(timesheetId);
	}

	/**
	* Deletes the timesheet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetId the primary key of the timesheet
	* @return the timesheet that was removed
	* @throws PortalException if a timesheet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.services.model.Timesheet deleteTimesheet(
		int timesheetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _timesheetLocalService.deleteTimesheet(timesheetId);
	}

	/**
	* Deletes the timesheet from the database. Also notifies the appropriate model listeners.
	*
	* @param timesheet the timesheet
	* @return the timesheet that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.services.model.Timesheet deleteTimesheet(
		sg.com.para.intranet.services.model.Timesheet timesheet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetLocalService.deleteTimesheet(timesheet);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _timesheetLocalService.dynamicQuery();
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
		return _timesheetLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.TimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _timesheetLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.TimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _timesheetLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _timesheetLocalService.dynamicQueryCount(dynamicQuery);
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
		return _timesheetLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public sg.com.para.intranet.services.model.Timesheet fetchTimesheet(
		int timesheetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetLocalService.fetchTimesheet(timesheetId);
	}

	/**
	* Returns the timesheet with the primary key.
	*
	* @param timesheetId the primary key of the timesheet
	* @return the timesheet
	* @throws PortalException if a timesheet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	* @throws java.lang.Exception
	*/
	@Override
	public sg.com.para.intranet.services.model.Timesheet getTimesheet(
		int timesheetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.lang.Exception {
		return _timesheetLocalService.getTimesheet(timesheetId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _timesheetLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the timesheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.TimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of timesheets
	* @param end the upper bound of the range of timesheets (not inclusive)
	* @return the range of timesheets
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<sg.com.para.intranet.services.model.Timesheet> getTimesheets(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetLocalService.getTimesheets(start, end);
	}

	/**
	* Returns the number of timesheets.
	*
	* @return the number of timesheets
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTimesheetsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetLocalService.getTimesheetsCount();
	}

	/**
	* Updates the timesheet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param timesheet the timesheet
	* @return the timesheet that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.services.model.Timesheet updateTimesheet(
		sg.com.para.intranet.services.model.Timesheet timesheet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetLocalService.updateTimesheet(timesheet);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _timesheetLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_timesheetLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _timesheetLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<sg.com.para.intranet.services.model.Timesheet> findTimesheetsByUser(
		java.util.Date startDate, java.util.Date endDate,
		java.lang.String userId) throws java.lang.Exception {
		return _timesheetLocalService.findTimesheetsByUser(startDate, endDate,
			userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TimesheetLocalService getWrappedTimesheetLocalService() {
		return _timesheetLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTimesheetLocalService(
		TimesheetLocalService timesheetLocalService) {
		_timesheetLocalService = timesheetLocalService;
	}

	@Override
	public TimesheetLocalService getWrappedService() {
		return _timesheetLocalService;
	}

	@Override
	public void setWrappedService(TimesheetLocalService timesheetLocalService) {
		_timesheetLocalService = timesheetLocalService;
	}

	private TimesheetLocalService _timesheetLocalService;
}