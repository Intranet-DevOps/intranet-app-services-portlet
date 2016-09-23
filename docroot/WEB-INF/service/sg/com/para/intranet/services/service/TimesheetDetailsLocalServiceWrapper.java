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
 * Provides a wrapper for {@link TimesheetDetailsLocalService}.
 *
 * @author Fernando Karnagi
 * @see TimesheetDetailsLocalService
 * @generated
 */
public class TimesheetDetailsLocalServiceWrapper
	implements TimesheetDetailsLocalService,
		ServiceWrapper<TimesheetDetailsLocalService> {
	public TimesheetDetailsLocalServiceWrapper(
		TimesheetDetailsLocalService timesheetDetailsLocalService) {
		_timesheetDetailsLocalService = timesheetDetailsLocalService;
	}

	/**
	* Adds the timesheet details to the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetDetails the timesheet details
	* @return the timesheet details that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.services.model.TimesheetDetails addTimesheetDetails(
		sg.com.para.intranet.services.model.TimesheetDetails timesheetDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetDetailsLocalService.addTimesheetDetails(timesheetDetails);
	}

	/**
	* Creates a new timesheet details with the primary key. Does not add the timesheet details to the database.
	*
	* @param timesheetDetailsId the primary key for the new timesheet details
	* @return the new timesheet details
	*/
	@Override
	public sg.com.para.intranet.services.model.TimesheetDetails createTimesheetDetails(
		int timesheetDetailsId) {
		return _timesheetDetailsLocalService.createTimesheetDetails(timesheetDetailsId);
	}

	/**
	* Deletes the timesheet details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetDetailsId the primary key of the timesheet details
	* @return the timesheet details that was removed
	* @throws PortalException if a timesheet details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.services.model.TimesheetDetails deleteTimesheetDetails(
		int timesheetDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _timesheetDetailsLocalService.deleteTimesheetDetails(timesheetDetailsId);
	}

	/**
	* Deletes the timesheet details from the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetDetails the timesheet details
	* @return the timesheet details that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.services.model.TimesheetDetails deleteTimesheetDetails(
		sg.com.para.intranet.services.model.TimesheetDetails timesheetDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetDetailsLocalService.deleteTimesheetDetails(timesheetDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _timesheetDetailsLocalService.dynamicQuery();
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
		return _timesheetDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.TimesheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _timesheetDetailsLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.TimesheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _timesheetDetailsLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _timesheetDetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _timesheetDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public sg.com.para.intranet.services.model.TimesheetDetails fetchTimesheetDetails(
		int timesheetDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetDetailsLocalService.fetchTimesheetDetails(timesheetDetailsId);
	}

	/**
	* Returns the timesheet details with the primary key.
	*
	* @param timesheetDetailsId the primary key of the timesheet details
	* @return the timesheet details
	* @throws PortalException if a timesheet details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.services.model.TimesheetDetails getTimesheetDetails(
		int timesheetDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _timesheetDetailsLocalService.getTimesheetDetails(timesheetDetailsId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _timesheetDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the timesheet detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.TimesheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of timesheet detailses
	* @param end the upper bound of the range of timesheet detailses (not inclusive)
	* @return the range of timesheet detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<sg.com.para.intranet.services.model.TimesheetDetails> getTimesheetDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetDetailsLocalService.getTimesheetDetailses(start, end);
	}

	/**
	* Returns the number of timesheet detailses.
	*
	* @return the number of timesheet detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTimesheetDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetDetailsLocalService.getTimesheetDetailsesCount();
	}

	/**
	* Updates the timesheet details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param timesheetDetails the timesheet details
	* @return the timesheet details that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.services.model.TimesheetDetails updateTimesheetDetails(
		sg.com.para.intranet.services.model.TimesheetDetails timesheetDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetDetailsLocalService.updateTimesheetDetails(timesheetDetails);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _timesheetDetailsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_timesheetDetailsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _timesheetDetailsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TimesheetDetailsLocalService getWrappedTimesheetDetailsLocalService() {
		return _timesheetDetailsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTimesheetDetailsLocalService(
		TimesheetDetailsLocalService timesheetDetailsLocalService) {
		_timesheetDetailsLocalService = timesheetDetailsLocalService;
	}

	@Override
	public TimesheetDetailsLocalService getWrappedService() {
		return _timesheetDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		TimesheetDetailsLocalService timesheetDetailsLocalService) {
		_timesheetDetailsLocalService = timesheetDetailsLocalService;
	}

	private TimesheetDetailsLocalService _timesheetDetailsLocalService;
}