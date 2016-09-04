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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import sg.com.para.intranet.services.NoSuchTimesheetException;
import sg.com.para.intranet.services.model.Timesheet;
import sg.com.para.intranet.services.model.impl.TimesheetImpl;
import sg.com.para.intranet.services.model.impl.TimesheetModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the timesheet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Karnagi
 * @see TimesheetPersistence
 * @see TimesheetUtil
 * @generated
 */
public class TimesheetPersistenceImpl extends BasePersistenceImpl<Timesheet>
	implements TimesheetPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TimesheetUtil} to access the timesheet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TimesheetImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TimesheetModelImpl.ENTITY_CACHE_ENABLED,
			TimesheetModelImpl.FINDER_CACHE_ENABLED, TimesheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TimesheetModelImpl.ENTITY_CACHE_ENABLED,
			TimesheetModelImpl.FINDER_CACHE_ENABLED, TimesheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TimesheetModelImpl.ENTITY_CACHE_ENABLED,
			TimesheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TimesheetPersistenceImpl() {
		setModelClass(Timesheet.class);
	}

	/**
	 * Caches the timesheet in the entity cache if it is enabled.
	 *
	 * @param timesheet the timesheet
	 */
	@Override
	public void cacheResult(Timesheet timesheet) {
		EntityCacheUtil.putResult(TimesheetModelImpl.ENTITY_CACHE_ENABLED,
			TimesheetImpl.class, timesheet.getPrimaryKey(), timesheet);

		timesheet.resetOriginalValues();
	}

	/**
	 * Caches the timesheets in the entity cache if it is enabled.
	 *
	 * @param timesheets the timesheets
	 */
	@Override
	public void cacheResult(List<Timesheet> timesheets) {
		for (Timesheet timesheet : timesheets) {
			if (EntityCacheUtil.getResult(
						TimesheetModelImpl.ENTITY_CACHE_ENABLED,
						TimesheetImpl.class, timesheet.getPrimaryKey()) == null) {
				cacheResult(timesheet);
			}
			else {
				timesheet.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all timesheets.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TimesheetImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TimesheetImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the timesheet.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Timesheet timesheet) {
		EntityCacheUtil.removeResult(TimesheetModelImpl.ENTITY_CACHE_ENABLED,
			TimesheetImpl.class, timesheet.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Timesheet> timesheets) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Timesheet timesheet : timesheets) {
			EntityCacheUtil.removeResult(TimesheetModelImpl.ENTITY_CACHE_ENABLED,
				TimesheetImpl.class, timesheet.getPrimaryKey());
		}
	}

	/**
	 * Creates a new timesheet with the primary key. Does not add the timesheet to the database.
	 *
	 * @param timesheetId the primary key for the new timesheet
	 * @return the new timesheet
	 */
	@Override
	public Timesheet create(int timesheetId) {
		Timesheet timesheet = new TimesheetImpl();

		timesheet.setNew(true);
		timesheet.setPrimaryKey(timesheetId);

		return timesheet;
	}

	/**
	 * Removes the timesheet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param timesheetId the primary key of the timesheet
	 * @return the timesheet that was removed
	 * @throws sg.com.para.intranet.services.NoSuchTimesheetException if a timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Timesheet remove(int timesheetId)
		throws NoSuchTimesheetException, SystemException {
		return remove((Serializable)timesheetId);
	}

	/**
	 * Removes the timesheet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the timesheet
	 * @return the timesheet that was removed
	 * @throws sg.com.para.intranet.services.NoSuchTimesheetException if a timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Timesheet remove(Serializable primaryKey)
		throws NoSuchTimesheetException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Timesheet timesheet = (Timesheet)session.get(TimesheetImpl.class,
					primaryKey);

			if (timesheet == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTimesheetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(timesheet);
		}
		catch (NoSuchTimesheetException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Timesheet removeImpl(Timesheet timesheet)
		throws SystemException {
		timesheet = toUnwrappedModel(timesheet);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(timesheet)) {
				timesheet = (Timesheet)session.get(TimesheetImpl.class,
						timesheet.getPrimaryKeyObj());
			}

			if (timesheet != null) {
				session.delete(timesheet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (timesheet != null) {
			clearCache(timesheet);
		}

		return timesheet;
	}

	@Override
	public Timesheet updateImpl(
		sg.com.para.intranet.services.model.Timesheet timesheet)
		throws SystemException {
		timesheet = toUnwrappedModel(timesheet);

		boolean isNew = timesheet.isNew();

		Session session = null;

		try {
			session = openSession();

			if (timesheet.isNew()) {
				session.save(timesheet);

				timesheet.setNew(false);
			}
			else {
				session.merge(timesheet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(TimesheetModelImpl.ENTITY_CACHE_ENABLED,
			TimesheetImpl.class, timesheet.getPrimaryKey(), timesheet);

		return timesheet;
	}

	protected Timesheet toUnwrappedModel(Timesheet timesheet) {
		if (timesheet instanceof TimesheetImpl) {
			return timesheet;
		}

		TimesheetImpl timesheetImpl = new TimesheetImpl();

		timesheetImpl.setNew(timesheet.isNew());
		timesheetImpl.setPrimaryKey(timesheet.getPrimaryKey());

		timesheetImpl.setTimesheetId(timesheet.getTimesheetId());
		timesheetImpl.setEmployeeScreenName(timesheet.getEmployeeScreenName());
		timesheetImpl.setLogDate(timesheet.getLogDate());
		timesheetImpl.setRegular(timesheet.getRegular());
		timesheetImpl.setOvertime(timesheet.getOvertime());
		timesheetImpl.setSick(timesheet.getSick());
		timesheetImpl.setVacation(timesheet.getVacation());
		timesheetImpl.setHoliday(timesheet.getHoliday());
		timesheetImpl.setUnpaid(timesheet.getUnpaid());
		timesheetImpl.setOther(timesheet.getOther());
		timesheetImpl.setRemarks(timesheet.getRemarks());
		timesheetImpl.setStatus(timesheet.getStatus());
		timesheetImpl.setProjectCode(timesheet.getProjectCode());

		return timesheetImpl;
	}

	/**
	 * Returns the timesheet with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the timesheet
	 * @return the timesheet
	 * @throws sg.com.para.intranet.services.NoSuchTimesheetException if a timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Timesheet findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTimesheetException, SystemException {
		Timesheet timesheet = fetchByPrimaryKey(primaryKey);

		if (timesheet == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTimesheetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return timesheet;
	}

	/**
	 * Returns the timesheet with the primary key or throws a {@link sg.com.para.intranet.services.NoSuchTimesheetException} if it could not be found.
	 *
	 * @param timesheetId the primary key of the timesheet
	 * @return the timesheet
	 * @throws sg.com.para.intranet.services.NoSuchTimesheetException if a timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Timesheet findByPrimaryKey(int timesheetId)
		throws NoSuchTimesheetException, SystemException {
		return findByPrimaryKey((Serializable)timesheetId);
	}

	/**
	 * Returns the timesheet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the timesheet
	 * @return the timesheet, or <code>null</code> if a timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Timesheet fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Timesheet timesheet = (Timesheet)EntityCacheUtil.getResult(TimesheetModelImpl.ENTITY_CACHE_ENABLED,
				TimesheetImpl.class, primaryKey);

		if (timesheet == _nullTimesheet) {
			return null;
		}

		if (timesheet == null) {
			Session session = null;

			try {
				session = openSession();

				timesheet = (Timesheet)session.get(TimesheetImpl.class,
						primaryKey);

				if (timesheet != null) {
					cacheResult(timesheet);
				}
				else {
					EntityCacheUtil.putResult(TimesheetModelImpl.ENTITY_CACHE_ENABLED,
						TimesheetImpl.class, primaryKey, _nullTimesheet);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TimesheetModelImpl.ENTITY_CACHE_ENABLED,
					TimesheetImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return timesheet;
	}

	/**
	 * Returns the timesheet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param timesheetId the primary key of the timesheet
	 * @return the timesheet, or <code>null</code> if a timesheet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Timesheet fetchByPrimaryKey(int timesheetId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)timesheetId);
	}

	/**
	 * Returns all the timesheets.
	 *
	 * @return the timesheets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Timesheet> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Timesheet> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Timesheet> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Timesheet> list = (List<Timesheet>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TIMESHEET);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TIMESHEET;

				if (pagination) {
					sql = sql.concat(TimesheetModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Timesheet>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Timesheet>(list);
				}
				else {
					list = (List<Timesheet>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the timesheets from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Timesheet timesheet : findAll()) {
			remove(timesheet);
		}
	}

	/**
	 * Returns the number of timesheets.
	 *
	 * @return the number of timesheets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TIMESHEET);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the timesheet persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.sg.com.para.intranet.services.model.Timesheet")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Timesheet>> listenersList = new ArrayList<ModelListener<Timesheet>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Timesheet>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(TimesheetImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TIMESHEET = "SELECT timesheet FROM Timesheet timesheet";
	private static final String _SQL_COUNT_TIMESHEET = "SELECT COUNT(timesheet) FROM Timesheet timesheet";
	private static final String _ORDER_BY_ENTITY_ALIAS = "timesheet.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Timesheet exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TimesheetPersistenceImpl.class);
	private static Timesheet _nullTimesheet = new TimesheetImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Timesheet> toCacheModel() {
				return _nullTimesheetCacheModel;
			}
		};

	private static CacheModel<Timesheet> _nullTimesheetCacheModel = new CacheModel<Timesheet>() {
			@Override
			public Timesheet toEntityModel() {
				return _nullTimesheet;
			}
		};
}