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

import sg.com.para.intranet.services.model.TimesheetDetails;

/**
 * The persistence interface for the timesheet details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Karnagi
 * @see TimesheetDetailsPersistenceImpl
 * @see TimesheetDetailsUtil
 * @generated
 */
public interface TimesheetDetailsPersistence extends BasePersistence<TimesheetDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TimesheetDetailsUtil} to access the timesheet details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the timesheet details in the entity cache if it is enabled.
	*
	* @param timesheetDetails the timesheet details
	*/
	public void cacheResult(
		sg.com.para.intranet.services.model.TimesheetDetails timesheetDetails);

	/**
	* Caches the timesheet detailses in the entity cache if it is enabled.
	*
	* @param timesheetDetailses the timesheet detailses
	*/
	public void cacheResult(
		java.util.List<sg.com.para.intranet.services.model.TimesheetDetails> timesheetDetailses);

	/**
	* Creates a new timesheet details with the primary key. Does not add the timesheet details to the database.
	*
	* @param timesheetDetailsId the primary key for the new timesheet details
	* @return the new timesheet details
	*/
	public sg.com.para.intranet.services.model.TimesheetDetails create(
		int timesheetDetailsId);

	/**
	* Removes the timesheet details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetDetailsId the primary key of the timesheet details
	* @return the timesheet details that was removed
	* @throws sg.com.para.intranet.services.NoSuchTimesheetDetailsException if a timesheet details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public sg.com.para.intranet.services.model.TimesheetDetails remove(
		int timesheetDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			sg.com.para.intranet.services.NoSuchTimesheetDetailsException;

	public sg.com.para.intranet.services.model.TimesheetDetails updateImpl(
		sg.com.para.intranet.services.model.TimesheetDetails timesheetDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the timesheet details with the primary key or throws a {@link sg.com.para.intranet.services.NoSuchTimesheetDetailsException} if it could not be found.
	*
	* @param timesheetDetailsId the primary key of the timesheet details
	* @return the timesheet details
	* @throws sg.com.para.intranet.services.NoSuchTimesheetDetailsException if a timesheet details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public sg.com.para.intranet.services.model.TimesheetDetails findByPrimaryKey(
		int timesheetDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			sg.com.para.intranet.services.NoSuchTimesheetDetailsException;

	/**
	* Returns the timesheet details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param timesheetDetailsId the primary key of the timesheet details
	* @return the timesheet details, or <code>null</code> if a timesheet details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public sg.com.para.intranet.services.model.TimesheetDetails fetchByPrimaryKey(
		int timesheetDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the timesheet detailses.
	*
	* @return the timesheet detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<sg.com.para.intranet.services.model.TimesheetDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<sg.com.para.intranet.services.model.TimesheetDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the timesheet detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.TimesheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of timesheet detailses
	* @param end the upper bound of the range of timesheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of timesheet detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<sg.com.para.intranet.services.model.TimesheetDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the timesheet detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of timesheet detailses.
	*
	* @return the number of timesheet detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}