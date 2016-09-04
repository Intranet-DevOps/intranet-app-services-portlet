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

import sg.com.para.intranet.services.NoSuchExpenseException;
import sg.com.para.intranet.services.model.Expense;
import sg.com.para.intranet.services.model.impl.ExpenseImpl;
import sg.com.para.intranet.services.model.impl.ExpenseModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the expense service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Karnagi
 * @see ExpensePersistence
 * @see ExpenseUtil
 * @generated
 */
public class ExpensePersistenceImpl extends BasePersistenceImpl<Expense>
	implements ExpensePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ExpenseUtil} to access the expense persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ExpenseImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ExpenseModelImpl.ENTITY_CACHE_ENABLED,
			ExpenseModelImpl.FINDER_CACHE_ENABLED, ExpenseImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ExpenseModelImpl.ENTITY_CACHE_ENABLED,
			ExpenseModelImpl.FINDER_CACHE_ENABLED, ExpenseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ExpenseModelImpl.ENTITY_CACHE_ENABLED,
			ExpenseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ExpensePersistenceImpl() {
		setModelClass(Expense.class);
	}

	/**
	 * Caches the expense in the entity cache if it is enabled.
	 *
	 * @param expense the expense
	 */
	@Override
	public void cacheResult(Expense expense) {
		EntityCacheUtil.putResult(ExpenseModelImpl.ENTITY_CACHE_ENABLED,
			ExpenseImpl.class, expense.getPrimaryKey(), expense);

		expense.resetOriginalValues();
	}

	/**
	 * Caches the expenses in the entity cache if it is enabled.
	 *
	 * @param expenses the expenses
	 */
	@Override
	public void cacheResult(List<Expense> expenses) {
		for (Expense expense : expenses) {
			if (EntityCacheUtil.getResult(
						ExpenseModelImpl.ENTITY_CACHE_ENABLED,
						ExpenseImpl.class, expense.getPrimaryKey()) == null) {
				cacheResult(expense);
			}
			else {
				expense.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all expenses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ExpenseImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ExpenseImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the expense.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Expense expense) {
		EntityCacheUtil.removeResult(ExpenseModelImpl.ENTITY_CACHE_ENABLED,
			ExpenseImpl.class, expense.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Expense> expenses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Expense expense : expenses) {
			EntityCacheUtil.removeResult(ExpenseModelImpl.ENTITY_CACHE_ENABLED,
				ExpenseImpl.class, expense.getPrimaryKey());
		}
	}

	/**
	 * Creates a new expense with the primary key. Does not add the expense to the database.
	 *
	 * @param expenseId the primary key for the new expense
	 * @return the new expense
	 */
	@Override
	public Expense create(int expenseId) {
		Expense expense = new ExpenseImpl();

		expense.setNew(true);
		expense.setPrimaryKey(expenseId);

		return expense;
	}

	/**
	 * Removes the expense with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param expenseId the primary key of the expense
	 * @return the expense that was removed
	 * @throws sg.com.para.intranet.services.NoSuchExpenseException if a expense with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Expense remove(int expenseId)
		throws NoSuchExpenseException, SystemException {
		return remove((Serializable)expenseId);
	}

	/**
	 * Removes the expense with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the expense
	 * @return the expense that was removed
	 * @throws sg.com.para.intranet.services.NoSuchExpenseException if a expense with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Expense remove(Serializable primaryKey)
		throws NoSuchExpenseException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Expense expense = (Expense)session.get(ExpenseImpl.class, primaryKey);

			if (expense == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExpenseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(expense);
		}
		catch (NoSuchExpenseException nsee) {
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
	protected Expense removeImpl(Expense expense) throws SystemException {
		expense = toUnwrappedModel(expense);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(expense)) {
				expense = (Expense)session.get(ExpenseImpl.class,
						expense.getPrimaryKeyObj());
			}

			if (expense != null) {
				session.delete(expense);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (expense != null) {
			clearCache(expense);
		}

		return expense;
	}

	@Override
	public Expense updateImpl(
		sg.com.para.intranet.services.model.Expense expense)
		throws SystemException {
		expense = toUnwrappedModel(expense);

		boolean isNew = expense.isNew();

		Session session = null;

		try {
			session = openSession();

			if (expense.isNew()) {
				session.save(expense);

				expense.setNew(false);
			}
			else {
				session.merge(expense);
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

		EntityCacheUtil.putResult(ExpenseModelImpl.ENTITY_CACHE_ENABLED,
			ExpenseImpl.class, expense.getPrimaryKey(), expense);

		return expense;
	}

	protected Expense toUnwrappedModel(Expense expense) {
		if (expense instanceof ExpenseImpl) {
			return expense;
		}

		ExpenseImpl expenseImpl = new ExpenseImpl();

		expenseImpl.setNew(expense.isNew());
		expenseImpl.setPrimaryKey(expense.getPrimaryKey());

		expenseImpl.setExpenseId(expense.getExpenseId());
		expenseImpl.setEmployeeScreenName(expense.getEmployeeScreenName());
		expenseImpl.setExpenseDate(expense.getExpenseDate());
		expenseImpl.setSubmissionDate(expense.getSubmissionDate());
		expenseImpl.setAmount(expense.getAmount());
		expenseImpl.setProjectCode(expense.getProjectCode());
		expenseImpl.setCategory(expense.getCategory());
		expenseImpl.setStatus(expense.getStatus());
		expenseImpl.setRemarks(expense.getRemarks());

		return expenseImpl;
	}

	/**
	 * Returns the expense with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the expense
	 * @return the expense
	 * @throws sg.com.para.intranet.services.NoSuchExpenseException if a expense with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Expense findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExpenseException, SystemException {
		Expense expense = fetchByPrimaryKey(primaryKey);

		if (expense == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExpenseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return expense;
	}

	/**
	 * Returns the expense with the primary key or throws a {@link sg.com.para.intranet.services.NoSuchExpenseException} if it could not be found.
	 *
	 * @param expenseId the primary key of the expense
	 * @return the expense
	 * @throws sg.com.para.intranet.services.NoSuchExpenseException if a expense with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Expense findByPrimaryKey(int expenseId)
		throws NoSuchExpenseException, SystemException {
		return findByPrimaryKey((Serializable)expenseId);
	}

	/**
	 * Returns the expense with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the expense
	 * @return the expense, or <code>null</code> if a expense with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Expense fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Expense expense = (Expense)EntityCacheUtil.getResult(ExpenseModelImpl.ENTITY_CACHE_ENABLED,
				ExpenseImpl.class, primaryKey);

		if (expense == _nullExpense) {
			return null;
		}

		if (expense == null) {
			Session session = null;

			try {
				session = openSession();

				expense = (Expense)session.get(ExpenseImpl.class, primaryKey);

				if (expense != null) {
					cacheResult(expense);
				}
				else {
					EntityCacheUtil.putResult(ExpenseModelImpl.ENTITY_CACHE_ENABLED,
						ExpenseImpl.class, primaryKey, _nullExpense);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ExpenseModelImpl.ENTITY_CACHE_ENABLED,
					ExpenseImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return expense;
	}

	/**
	 * Returns the expense with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param expenseId the primary key of the expense
	 * @return the expense, or <code>null</code> if a expense with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Expense fetchByPrimaryKey(int expenseId) throws SystemException {
		return fetchByPrimaryKey((Serializable)expenseId);
	}

	/**
	 * Returns all the expenses.
	 *
	 * @return the expenses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Expense> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Expense> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the expenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.ExpenseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of expenses
	 * @param end the upper bound of the range of expenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of expenses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Expense> findAll(int start, int end,
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

		List<Expense> list = (List<Expense>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EXPENSE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXPENSE;

				if (pagination) {
					sql = sql.concat(ExpenseModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Expense>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Expense>(list);
				}
				else {
					list = (List<Expense>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the expenses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Expense expense : findAll()) {
			remove(expense);
		}
	}

	/**
	 * Returns the number of expenses.
	 *
	 * @return the number of expenses
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

				Query q = session.createQuery(_SQL_COUNT_EXPENSE);

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
	 * Initializes the expense persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.sg.com.para.intranet.services.model.Expense")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Expense>> listenersList = new ArrayList<ModelListener<Expense>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Expense>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ExpenseImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EXPENSE = "SELECT expense FROM Expense expense";
	private static final String _SQL_COUNT_EXPENSE = "SELECT COUNT(expense) FROM Expense expense";
	private static final String _ORDER_BY_ENTITY_ALIAS = "expense.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Expense exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ExpensePersistenceImpl.class);
	private static Expense _nullExpense = new ExpenseImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Expense> toCacheModel() {
				return _nullExpenseCacheModel;
			}
		};

	private static CacheModel<Expense> _nullExpenseCacheModel = new CacheModel<Expense>() {
			@Override
			public Expense toEntityModel() {
				return _nullExpense;
			}
		};
}