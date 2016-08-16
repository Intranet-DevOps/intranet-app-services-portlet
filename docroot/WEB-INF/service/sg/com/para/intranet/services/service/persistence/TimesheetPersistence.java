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

package sg.com.para.intranet.services.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import sg.com.para.intranet.services.model.Timesheet;

/**
 * The persistence interface for the timesheet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Karnagi
 * @see TimesheetPersistenceImpl
 * @see TimesheetUtil
 * @generated
 */
public interface TimesheetPersistence extends BasePersistence<Timesheet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TimesheetUtil} to access the timesheet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the timesheet in the entity cache if it is enabled.
	*
	* @param timesheet the timesheet
	*/
	public void cacheResult(
		sg.com.para.intranet.services.model.Timesheet timesheet);

	/**
	* Caches the timesheets in the entity cache if it is enabled.
	*
	* @param timesheets the timesheets
	*/
	public void cacheResult(
		java.util.List<sg.com.para.intranet.services.model.Timesheet> timesheets);

	/**
	* Creates a new timesheet with the primary key. Does not add the timesheet to the database.
	*
	* @param timesheetId the primary key for the new timesheet
	* @return the new timesheet
	*/
	public sg.com.para.intranet.services.model.Timesheet create(int timesheetId);

	/**
	* Removes the timesheet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetId the primary key of the timesheet
	* @return the timesheet that was removed
	* @throws sg.com.para.intranet.services.NoSuchTimesheetException if a timesheet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public sg.com.para.intranet.services.model.Timesheet remove(int timesheetId)
		throws com.liferay.portal.kernel.exception.SystemException,
			sg.com.para.intranet.services.NoSuchTimesheetException;

	public sg.com.para.intranet.services.model.Timesheet updateImpl(
		sg.com.para.intranet.services.model.Timesheet timesheet)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the timesheet with the primary key or throws a {@link sg.com.para.intranet.services.NoSuchTimesheetException} if it could not be found.
	*
	* @param timesheetId the primary key of the timesheet
	* @return the timesheet
	* @throws sg.com.para.intranet.services.NoSuchTimesheetException if a timesheet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public sg.com.para.intranet.services.model.Timesheet findByPrimaryKey(
		int timesheetId)
		throws com.liferay.portal.kernel.exception.SystemException,
			sg.com.para.intranet.services.NoSuchTimesheetException;

	/**
	* Returns the timesheet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param timesheetId the primary key of the timesheet
	* @return the timesheet, or <code>null</code> if a timesheet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public sg.com.para.intranet.services.model.Timesheet fetchByPrimaryKey(
		int timesheetId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the timesheets.
	*
	* @return the timesheets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<sg.com.para.intranet.services.model.Timesheet> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<sg.com.para.intranet.services.model.Timesheet> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the timesheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.TimesheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of timesheets
	* @param end the upper bound of the range of timesheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of timesheets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<sg.com.para.intranet.services.model.Timesheet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the timesheets from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of timesheets.
	*
	* @return the number of timesheets
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}