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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import sg.com.para.intranet.services.model.Timesheet;

import java.util.List;

/**
 * The persistence utility for the timesheet service. This utility wraps {@link TimesheetPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Karnagi
 * @see TimesheetPersistence
 * @see TimesheetPersistenceImpl
 * @generated
 */
public class TimesheetUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Timesheet timesheet) {
		getPersistence().clearCache(timesheet);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Timesheet> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Timesheet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Timesheet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Timesheet update(Timesheet timesheet)
		throws SystemException {
		return getPersistence().update(timesheet);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Timesheet update(Timesheet timesheet,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(timesheet, serviceContext);
	}

	/**
	* Caches the timesheet in the entity cache if it is enabled.
	*
	* @param timesheet the timesheet
	*/
	public static void cacheResult(
		sg.com.para.intranet.services.model.Timesheet timesheet) {
		getPersistence().cacheResult(timesheet);
	}

	/**
	* Caches the timesheets in the entity cache if it is enabled.
	*
	* @param timesheets the timesheets
	*/
	public static void cacheResult(
		java.util.List<sg.com.para.intranet.services.model.Timesheet> timesheets) {
		getPersistence().cacheResult(timesheets);
	}

	/**
	* Creates a new timesheet with the primary key. Does not add the timesheet to the database.
	*
	* @param timesheetId the primary key for the new timesheet
	* @return the new timesheet
	*/
	public static sg.com.para.intranet.services.model.Timesheet create(
		int timesheetId) {
		return getPersistence().create(timesheetId);
	}

	/**
	* Removes the timesheet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetId the primary key of the timesheet
	* @return the timesheet that was removed
	* @throws sg.com.para.intranet.services.NoSuchTimesheetException if a timesheet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static sg.com.para.intranet.services.model.Timesheet remove(
		int timesheetId)
		throws com.liferay.portal.kernel.exception.SystemException,
			sg.com.para.intranet.services.NoSuchTimesheetException {
		return getPersistence().remove(timesheetId);
	}

	public static sg.com.para.intranet.services.model.Timesheet updateImpl(
		sg.com.para.intranet.services.model.Timesheet timesheet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(timesheet);
	}

	/**
	* Returns the timesheet with the primary key or throws a {@link sg.com.para.intranet.services.NoSuchTimesheetException} if it could not be found.
	*
	* @param timesheetId the primary key of the timesheet
	* @return the timesheet
	* @throws sg.com.para.intranet.services.NoSuchTimesheetException if a timesheet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static sg.com.para.intranet.services.model.Timesheet findByPrimaryKey(
		int timesheetId)
		throws com.liferay.portal.kernel.exception.SystemException,
			sg.com.para.intranet.services.NoSuchTimesheetException {
		return getPersistence().findByPrimaryKey(timesheetId);
	}

	/**
	* Returns the timesheet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param timesheetId the primary key of the timesheet
	* @return the timesheet, or <code>null</code> if a timesheet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static sg.com.para.intranet.services.model.Timesheet fetchByPrimaryKey(
		int timesheetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(timesheetId);
	}

	/**
	* Returns all the timesheets.
	*
	* @return the timesheets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<sg.com.para.intranet.services.model.Timesheet> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<sg.com.para.intranet.services.model.Timesheet> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<sg.com.para.intranet.services.model.Timesheet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the timesheets from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of timesheets.
	*
	* @return the number of timesheets
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TimesheetPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TimesheetPersistence)PortletBeanLocatorUtil.locate(sg.com.para.intranet.services.service.ClpSerializer.getServletContextName(),
					TimesheetPersistence.class.getName());

			ReferenceRegistry.registerReference(TimesheetUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TimesheetPersistence persistence) {
	}

	private static TimesheetPersistence _persistence;
}