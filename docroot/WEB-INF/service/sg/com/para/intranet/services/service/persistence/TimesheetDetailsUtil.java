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

import sg.com.para.intranet.services.model.TimesheetDetails;

import java.util.List;

/**
 * The persistence utility for the timesheet details service. This utility wraps {@link TimesheetDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Karnagi
 * @see TimesheetDetailsPersistence
 * @see TimesheetDetailsPersistenceImpl
 * @generated
 */
public class TimesheetDetailsUtil {
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
	public static void clearCache(TimesheetDetails timesheetDetails) {
		getPersistence().clearCache(timesheetDetails);
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
	public static List<TimesheetDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TimesheetDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TimesheetDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TimesheetDetails update(TimesheetDetails timesheetDetails)
		throws SystemException {
		return getPersistence().update(timesheetDetails);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TimesheetDetails update(TimesheetDetails timesheetDetails,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(timesheetDetails, serviceContext);
	}

	/**
	* Caches the timesheet details in the entity cache if it is enabled.
	*
	* @param timesheetDetails the timesheet details
	*/
	public static void cacheResult(
		sg.com.para.intranet.services.model.TimesheetDetails timesheetDetails) {
		getPersistence().cacheResult(timesheetDetails);
	}

	/**
	* Caches the timesheet detailses in the entity cache if it is enabled.
	*
	* @param timesheetDetailses the timesheet detailses
	*/
	public static void cacheResult(
		java.util.List<sg.com.para.intranet.services.model.TimesheetDetails> timesheetDetailses) {
		getPersistence().cacheResult(timesheetDetailses);
	}

	/**
	* Creates a new timesheet details with the primary key. Does not add the timesheet details to the database.
	*
	* @param timesheetDetailsId the primary key for the new timesheet details
	* @return the new timesheet details
	*/
	public static sg.com.para.intranet.services.model.TimesheetDetails create(
		int timesheetDetailsId) {
		return getPersistence().create(timesheetDetailsId);
	}

	/**
	* Removes the timesheet details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetDetailsId the primary key of the timesheet details
	* @return the timesheet details that was removed
	* @throws sg.com.para.intranet.services.NoSuchTimesheetDetailsException if a timesheet details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static sg.com.para.intranet.services.model.TimesheetDetails remove(
		int timesheetDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			sg.com.para.intranet.services.NoSuchTimesheetDetailsException {
		return getPersistence().remove(timesheetDetailsId);
	}

	public static sg.com.para.intranet.services.model.TimesheetDetails updateImpl(
		sg.com.para.intranet.services.model.TimesheetDetails timesheetDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(timesheetDetails);
	}

	/**
	* Returns the timesheet details with the primary key or throws a {@link sg.com.para.intranet.services.NoSuchTimesheetDetailsException} if it could not be found.
	*
	* @param timesheetDetailsId the primary key of the timesheet details
	* @return the timesheet details
	* @throws sg.com.para.intranet.services.NoSuchTimesheetDetailsException if a timesheet details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static sg.com.para.intranet.services.model.TimesheetDetails findByPrimaryKey(
		int timesheetDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			sg.com.para.intranet.services.NoSuchTimesheetDetailsException {
		return getPersistence().findByPrimaryKey(timesheetDetailsId);
	}

	/**
	* Returns the timesheet details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param timesheetDetailsId the primary key of the timesheet details
	* @return the timesheet details, or <code>null</code> if a timesheet details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static sg.com.para.intranet.services.model.TimesheetDetails fetchByPrimaryKey(
		int timesheetDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(timesheetDetailsId);
	}

	/**
	* Returns all the timesheet detailses.
	*
	* @return the timesheet detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<sg.com.para.intranet.services.model.TimesheetDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<sg.com.para.intranet.services.model.TimesheetDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<sg.com.para.intranet.services.model.TimesheetDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the timesheet detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of timesheet detailses.
	*
	* @return the number of timesheet detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TimesheetDetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TimesheetDetailsPersistence)PortletBeanLocatorUtil.locate(sg.com.para.intranet.services.service.ClpSerializer.getServletContextName(),
					TimesheetDetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(TimesheetDetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TimesheetDetailsPersistence persistence) {
	}

	private static TimesheetDetailsPersistence _persistence;
}