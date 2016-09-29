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

import sg.com.para.intranet.services.NoSuchAttachmentException;
import sg.com.para.intranet.services.model.Attachment;
import sg.com.para.intranet.services.model.impl.AttachmentImpl;
import sg.com.para.intranet.services.model.impl.AttachmentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the attachment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Karnagi
 * @see AttachmentPersistence
 * @see AttachmentUtil
 * @generated
 */
public class AttachmentPersistenceImpl extends BasePersistenceImpl<Attachment>
	implements AttachmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AttachmentUtil} to access the attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AttachmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, AttachmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, AttachmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AttachmentPersistenceImpl() {
		setModelClass(Attachment.class);
	}

	/**
	 * Caches the attachment in the entity cache if it is enabled.
	 *
	 * @param attachment the attachment
	 */
	@Override
	public void cacheResult(Attachment attachment) {
		EntityCacheUtil.putResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentImpl.class, attachment.getPrimaryKey(), attachment);

		attachment.resetOriginalValues();
	}

	/**
	 * Caches the attachments in the entity cache if it is enabled.
	 *
	 * @param attachments the attachments
	 */
	@Override
	public void cacheResult(List<Attachment> attachments) {
		for (Attachment attachment : attachments) {
			if (EntityCacheUtil.getResult(
						AttachmentModelImpl.ENTITY_CACHE_ENABLED,
						AttachmentImpl.class, attachment.getPrimaryKey()) == null) {
				cacheResult(attachment);
			}
			else {
				attachment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all attachments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AttachmentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AttachmentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the attachment.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Attachment attachment) {
		EntityCacheUtil.removeResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentImpl.class, attachment.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Attachment> attachments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Attachment attachment : attachments) {
			EntityCacheUtil.removeResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
				AttachmentImpl.class, attachment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new attachment with the primary key. Does not add the attachment to the database.
	 *
	 * @param attachmentId the primary key for the new attachment
	 * @return the new attachment
	 */
	@Override
	public Attachment create(int attachmentId) {
		Attachment attachment = new AttachmentImpl();

		attachment.setNew(true);
		attachment.setPrimaryKey(attachmentId);

		return attachment;
	}

	/**
	 * Removes the attachment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attachmentId the primary key of the attachment
	 * @return the attachment that was removed
	 * @throws sg.com.para.intranet.services.NoSuchAttachmentException if a attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attachment remove(int attachmentId)
		throws NoSuchAttachmentException, SystemException {
		return remove((Serializable)attachmentId);
	}

	/**
	 * Removes the attachment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attachment
	 * @return the attachment that was removed
	 * @throws sg.com.para.intranet.services.NoSuchAttachmentException if a attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attachment remove(Serializable primaryKey)
		throws NoSuchAttachmentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Attachment attachment = (Attachment)session.get(AttachmentImpl.class,
					primaryKey);

			if (attachment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttachmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(attachment);
		}
		catch (NoSuchAttachmentException nsee) {
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
	protected Attachment removeImpl(Attachment attachment)
		throws SystemException {
		attachment = toUnwrappedModel(attachment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attachment)) {
				attachment = (Attachment)session.get(AttachmentImpl.class,
						attachment.getPrimaryKeyObj());
			}

			if (attachment != null) {
				session.delete(attachment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (attachment != null) {
			clearCache(attachment);
		}

		return attachment;
	}

	@Override
	public Attachment updateImpl(
		sg.com.para.intranet.services.model.Attachment attachment)
		throws SystemException {
		attachment = toUnwrappedModel(attachment);

		boolean isNew = attachment.isNew();

		Session session = null;

		try {
			session = openSession();

			if (attachment.isNew()) {
				session.save(attachment);

				attachment.setNew(false);
			}
			else {
				session.merge(attachment);
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

		EntityCacheUtil.putResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentImpl.class, attachment.getPrimaryKey(), attachment);

		return attachment;
	}

	protected Attachment toUnwrappedModel(Attachment attachment) {
		if (attachment instanceof AttachmentImpl) {
			return attachment;
		}

		AttachmentImpl attachmentImpl = new AttachmentImpl();

		attachmentImpl.setNew(attachment.isNew());
		attachmentImpl.setPrimaryKey(attachment.getPrimaryKey());

		attachmentImpl.setAttachmentId(attachment.getAttachmentId());
		attachmentImpl.setEntityType(attachment.getEntityType());
		attachmentImpl.setEntityId(attachment.getEntityId());
		attachmentImpl.setAttachmentText(attachment.getAttachmentText());

		return attachmentImpl;
	}

	/**
	 * Returns the attachment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the attachment
	 * @return the attachment
	 * @throws sg.com.para.intranet.services.NoSuchAttachmentException if a attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attachment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttachmentException, SystemException {
		Attachment attachment = fetchByPrimaryKey(primaryKey);

		if (attachment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttachmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return attachment;
	}

	/**
	 * Returns the attachment with the primary key or throws a {@link sg.com.para.intranet.services.NoSuchAttachmentException} if it could not be found.
	 *
	 * @param attachmentId the primary key of the attachment
	 * @return the attachment
	 * @throws sg.com.para.intranet.services.NoSuchAttachmentException if a attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attachment findByPrimaryKey(int attachmentId)
		throws NoSuchAttachmentException, SystemException {
		return findByPrimaryKey((Serializable)attachmentId);
	}

	/**
	 * Returns the attachment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attachment
	 * @return the attachment, or <code>null</code> if a attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attachment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Attachment attachment = (Attachment)EntityCacheUtil.getResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
				AttachmentImpl.class, primaryKey);

		if (attachment == _nullAttachment) {
			return null;
		}

		if (attachment == null) {
			Session session = null;

			try {
				session = openSession();

				attachment = (Attachment)session.get(AttachmentImpl.class,
						primaryKey);

				if (attachment != null) {
					cacheResult(attachment);
				}
				else {
					EntityCacheUtil.putResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
						AttachmentImpl.class, primaryKey, _nullAttachment);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AttachmentModelImpl.ENTITY_CACHE_ENABLED,
					AttachmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return attachment;
	}

	/**
	 * Returns the attachment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attachmentId the primary key of the attachment
	 * @return the attachment, or <code>null</code> if a attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Attachment fetchByPrimaryKey(int attachmentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)attachmentId);
	}

	/**
	 * Returns all the attachments.
	 *
	 * @return the attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Attachment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attachments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of attachments
	 * @param end the upper bound of the range of attachments (not inclusive)
	 * @return the range of attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Attachment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attachments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of attachments
	 * @param end the upper bound of the range of attachments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Attachment> findAll(int start, int end,
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

		List<Attachment> list = (List<Attachment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ATTACHMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ATTACHMENT;

				if (pagination) {
					sql = sql.concat(AttachmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Attachment>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Attachment>(list);
				}
				else {
					list = (List<Attachment>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the attachments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Attachment attachment : findAll()) {
			remove(attachment);
		}
	}

	/**
	 * Returns the number of attachments.
	 *
	 * @return the number of attachments
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

				Query q = session.createQuery(_SQL_COUNT_ATTACHMENT);

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
	 * Initializes the attachment persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.sg.com.para.intranet.services.model.Attachment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Attachment>> listenersList = new ArrayList<ModelListener<Attachment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Attachment>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AttachmentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ATTACHMENT = "SELECT attachment FROM Attachment attachment";
	private static final String _SQL_COUNT_ATTACHMENT = "SELECT COUNT(attachment) FROM Attachment attachment";
	private static final String _ORDER_BY_ENTITY_ALIAS = "attachment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Attachment exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AttachmentPersistenceImpl.class);
	private static Attachment _nullAttachment = new AttachmentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Attachment> toCacheModel() {
				return _nullAttachmentCacheModel;
			}
		};

	private static CacheModel<Attachment> _nullAttachmentCacheModel = new CacheModel<Attachment>() {
			@Override
			public Attachment toEntityModel() {
				return _nullAttachment;
			}
		};
}