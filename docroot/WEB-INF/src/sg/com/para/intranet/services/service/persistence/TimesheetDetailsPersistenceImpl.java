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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import sg.com.para.intranet.services.NoSuchTimesheetDetailsException;
import sg.com.para.intranet.services.model.TimesheetDetails;
import sg.com.para.intranet.services.model.impl.TimesheetDetailsImpl;
import sg.com.para.intranet.services.model.impl.TimesheetDetailsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the timesheet details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Karnagi
 * @see TimesheetDetailsPersistence
 * @see TimesheetDetailsUtil
 * @generated
 */
public class TimesheetDetailsPersistenceImpl extends BasePersistenceImpl<TimesheetDetails>
	implements TimesheetDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TimesheetDetailsUtil} to access the timesheet details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TimesheetDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TimesheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TimesheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			TimesheetDetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TimesheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TimesheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			TimesheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TimesheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TimesheetDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TimesheetDetailsPersistenceImpl() {
		setModelClass(TimesheetDetails.class);
	}

	/**
	 * Caches the timesheet details in the entity cache if it is enabled.
	 *
	 * @param timesheetDetails the timesheet details
	 */
	@Override
	public void cacheResult(TimesheetDetails timesheetDetails) {
		EntityCacheUtil.putResult(TimesheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TimesheetDetailsImpl.class, timesheetDetails.getPrimaryKey(),
			timesheetDetails);

		timesheetDetails.resetOriginalValues();
	}

	/**
	 * Caches the timesheet detailses in the entity cache if it is enabled.
	 *
	 * @param timesheetDetailses the timesheet detailses
	 */
	@Override
	public void cacheResult(List<TimesheetDetails> timesheetDetailses) {
		for (TimesheetDetails timesheetDetails : timesheetDetailses) {
			if (EntityCacheUtil.getResult(
						TimesheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
						TimesheetDetailsImpl.class,
						timesheetDetails.getPrimaryKey()) == null) {
				cacheResult(timesheetDetails);
			}
			else {
				timesheetDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all timesheet detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TimesheetDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TimesheetDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the timesheet details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TimesheetDetails timesheetDetails) {
		EntityCacheUtil.removeResult(TimesheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TimesheetDetailsImpl.class, timesheetDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TimesheetDetails> timesheetDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TimesheetDetails timesheetDetails : timesheetDetailses) {
			EntityCacheUtil.removeResult(TimesheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
				TimesheetDetailsImpl.class, timesheetDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new timesheet details with the primary key. Does not add the timesheet details to the database.
	 *
	 * @param timesheetDetailsId the primary key for the new timesheet details
	 * @return the new timesheet details
	 */
	@Override
	public TimesheetDetails create(int timesheetDetailsId) {
		TimesheetDetails timesheetDetails = new TimesheetDetailsImpl();

		timesheetDetails.setNew(true);
		timesheetDetails.setPrimaryKey(timesheetDetailsId);

		return timesheetDetails;
	}

	/**
	 * Removes the timesheet details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param timesheetDetailsId the primary key of the timesheet details
	 * @return the timesheet details that was removed
	 * @throws sg.com.para.intranet.services.NoSuchTimesheetDetailsException if a timesheet details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TimesheetDetails remove(int timesheetDetailsId)
		throws NoSuchTimesheetDetailsException, SystemException {
		return remove((Serializable)timesheetDetailsId);
	}

	/**
	 * Removes the timesheet details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the timesheet details
	 * @return the timesheet details that was removed
	 * @throws sg.com.para.intranet.services.NoSuchTimesheetDetailsException if a timesheet details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TimesheetDetails remove(Serializable primaryKey)
		throws NoSuchTimesheetDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TimesheetDetails timesheetDetails = (TimesheetDetails)session.get(TimesheetDetailsImpl.class,
					primaryKey);

			if (timesheetDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTimesheetDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(timesheetDetails);
		}
		catch (NoSuchTimesheetDetailsException nsee) {
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
	protected TimesheetDetails removeImpl(TimesheetDetails timesheetDetails)
		throws SystemException {
		timesheetDetails = toUnwrappedModel(timesheetDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(timesheetDetails)) {
				timesheetDetails = (TimesheetDetails)session.get(TimesheetDetailsImpl.class,
						timesheetDetails.getPrimaryKeyObj());
			}

			if (timesheetDetails != null) {
				session.delete(timesheetDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (timesheetDetails != null) {
			clearCache(timesheetDetails);
		}

		return timesheetDetails;
	}

	@Override
	public TimesheetDetails updateImpl(
		sg.com.para.intranet.services.model.TimesheetDetails timesheetDetails)
		throws SystemException {
		timesheetDetails = toUnwrappedModel(timesheetDetails);

		boolean isNew = timesheetDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (timesheetDetails.isNew()) {
				session.save(timesheetDetails);

				timesheetDetails.setNew(false);
			}
			else {
				session.merge(timesheetDetails);
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

		EntityCacheUtil.putResult(TimesheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TimesheetDetailsImpl.class, timesheetDetails.getPrimaryKey(),
			timesheetDetails);

		return timesheetDetails;
	}

	protected TimesheetDetails toUnwrappedModel(
		TimesheetDetails timesheetDetails) {
		if (timesheetDetails instanceof TimesheetDetailsImpl) {
			return timesheetDetails;
		}

		TimesheetDetailsImpl timesheetDetailsImpl = new TimesheetDetailsImpl();

		timesheetDetailsImpl.setNew(timesheetDetails.isNew());
		timesheetDetailsImpl.setPrimaryKey(timesheetDetails.getPrimaryKey());

		timesheetDetailsImpl.setTimesheetDetailsId(timesheetDetails.getTimesheetDetailsId());
		timesheetDetailsImpl.setTimesheetId(timesheetDetails.getTimesheetId());
		timesheetDetailsImpl.setClockInTime(timesheetDetails.getClockInTime());
		timesheetDetailsImpl.setClockOutTime(timesheetDetails.getClockOutTime());
		timesheetDetailsImpl.setRemarks(timesheetDetails.getRemarks());
		timesheetDetailsImpl.setType(timesheetDetails.getType());

		return timesheetDetailsImpl;
	}

	/**
	 * Returns the timesheet details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the timesheet details
	 * @return the timesheet details
	 * @throws sg.com.para.intranet.services.NoSuchTimesheetDetailsException if a timesheet details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TimesheetDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTimesheetDetailsException, SystemException {
		TimesheetDetails timesheetDetails = fetchByPrimaryKey(primaryKey);

		if (timesheetDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTimesheetDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return timesheetDetails;
	}

	/**
	 * Returns the timesheet details with the primary key or throws a {@link sg.com.para.intranet.services.NoSuchTimesheetDetailsException} if it could not be found.
	 *
	 * @param timesheetDetailsId the primary key of the timesheet details
	 * @return the timesheet details
	 * @throws sg.com.para.intranet.services.NoSuchTimesheetDetailsException if a timesheet details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TimesheetDetails findByPrimaryKey(int timesheetDetailsId)
		throws NoSuchTimesheetDetailsException, SystemException {
		return findByPrimaryKey((Serializable)timesheetDetailsId);
	}

	/**
	 * Returns the timesheet details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the timesheet details
	 * @return the timesheet details, or <code>null</code> if a timesheet details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TimesheetDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TimesheetDetails timesheetDetails = (TimesheetDetails)EntityCacheUtil.getResult(TimesheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
				TimesheetDetailsImpl.class, primaryKey);

		if (timesheetDetails == _nullTimesheetDetails) {
			return null;
		}

		if (timesheetDetails == null) {
			Session session = null;

			try {
				session = openSession();

				timesheetDetails = (TimesheetDetails)session.get(TimesheetDetailsImpl.class,
						primaryKey);

				if (timesheetDetails != null) {
					cacheResult(timesheetDetails);
				}
				else {
					EntityCacheUtil.putResult(TimesheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
						TimesheetDetailsImpl.class, primaryKey,
						_nullTimesheetDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TimesheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
					TimesheetDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return timesheetDetails;
	}

	/**
	 * Returns the timesheet details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param timesheetDetailsId the primary key of the timesheet details
	 * @return the timesheet details, or <code>null</code> if a timesheet details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TimesheetDetails fetchByPrimaryKey(int timesheetDetailsId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)timesheetDetailsId);
	}

	/**
	 * Returns all the timesheet detailses.
	 *
	 * @return the timesheet detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TimesheetDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<TimesheetDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<TimesheetDetails> findAll(int start, int end,
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

		List<TimesheetDetails> list = (List<TimesheetDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TIMESHEETDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TIMESHEETDETAILS;

				if (pagination) {
					sql = sql.concat(TimesheetDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TimesheetDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TimesheetDetails>(list);
				}
				else {
					list = (List<TimesheetDetails>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the timesheet detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TimesheetDetails timesheetDetails : findAll()) {
			remove(timesheetDetails);
		}
	}

	/**
	 * Returns the number of timesheet detailses.
	 *
	 * @return the number of timesheet detailses
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

				Query q = session.createQuery(_SQL_COUNT_TIMESHEETDETAILS);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the timesheet details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.sg.com.para.intranet.services.model.TimesheetDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TimesheetDetails>> listenersList = new ArrayList<ModelListener<TimesheetDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TimesheetDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TimesheetDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TIMESHEETDETAILS = "SELECT timesheetDetails FROM TimesheetDetails timesheetDetails";
	private static final String _SQL_COUNT_TIMESHEETDETAILS = "SELECT COUNT(timesheetDetails) FROM TimesheetDetails timesheetDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "timesheetDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TimesheetDetails exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TimesheetDetailsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"type"
			});
	private static TimesheetDetails _nullTimesheetDetails = new TimesheetDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TimesheetDetails> toCacheModel() {
				return _nullTimesheetDetailsCacheModel;
			}
		};

	private static CacheModel<TimesheetDetails> _nullTimesheetDetailsCacheModel = new CacheModel<TimesheetDetails>() {
			@Override
			public TimesheetDetails toEntityModel() {
				return _nullTimesheetDetails;
			}
		};
}