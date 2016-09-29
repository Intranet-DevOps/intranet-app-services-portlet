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

package sg.com.para.intranet.services.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import sg.com.para.intranet.services.model.Project;
import sg.com.para.intranet.services.service.ProjectLocalService;
import sg.com.para.intranet.services.service.persistence.AttachmentPersistence;
import sg.com.para.intranet.services.service.persistence.EmployeePersistence;
import sg.com.para.intranet.services.service.persistence.ExpensePersistence;
import sg.com.para.intranet.services.service.persistence.ProjectPersistence;
import sg.com.para.intranet.services.service.persistence.TimesheetDetailsPersistence;
import sg.com.para.intranet.services.service.persistence.TimesheetPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the project local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link sg.com.para.intranet.services.service.impl.ProjectLocalServiceImpl}.
 * </p>
 *
 * @author Fernando Karnagi
 * @see sg.com.para.intranet.services.service.impl.ProjectLocalServiceImpl
 * @see sg.com.para.intranet.services.service.ProjectLocalServiceUtil
 * @generated
 */
public abstract class ProjectLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements ProjectLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link sg.com.para.intranet.services.service.ProjectLocalServiceUtil} to access the project local service.
	 */

	/**
	 * Adds the project to the database. Also notifies the appropriate model listeners.
	 *
	 * @param project the project
	 * @return the project that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Project addProject(Project project) throws SystemException {
		project.setNew(true);

		return projectPersistence.update(project);
	}

	/**
	 * Creates a new project with the primary key. Does not add the project to the database.
	 *
	 * @param projectId the primary key for the new project
	 * @return the new project
	 */
	@Override
	public Project createProject(int projectId) {
		return projectPersistence.create(projectId);
	}

	/**
	 * Deletes the project with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param projectId the primary key of the project
	 * @return the project that was removed
	 * @throws PortalException if a project with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Project deleteProject(int projectId)
		throws PortalException, SystemException {
		return projectPersistence.remove(projectId);
	}

	/**
	 * Deletes the project from the database. Also notifies the appropriate model listeners.
	 *
	 * @param project the project
	 * @return the project that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Project deleteProject(Project project) throws SystemException {
		return projectPersistence.remove(project);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Project.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return projectPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return projectPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return projectPersistence.findWithDynamicQuery(dynamicQuery, start,
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return projectPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return projectPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Project fetchProject(int projectId) throws SystemException {
		return projectPersistence.fetchByPrimaryKey(projectId);
	}

	/**
	 * Returns the project with the primary key.
	 *
	 * @param projectId the primary key of the project
	 * @return the project
	 * @throws PortalException if a project with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Project getProject(int projectId)
		throws PortalException, SystemException {
		return projectPersistence.findByPrimaryKey(projectId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return projectPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.services.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of projects
	 * @param end the upper bound of the range of projects (not inclusive)
	 * @return the range of projects
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Project> getProjects(int start, int end)
		throws SystemException {
		return projectPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of projects.
	 *
	 * @return the number of projects
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getProjectsCount() throws SystemException {
		return projectPersistence.countAll();
	}

	/**
	 * Updates the project in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param project the project
	 * @return the project that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Project updateProject(Project project) throws SystemException {
		return projectPersistence.update(project);
	}

	/**
	 * Returns the attachment local service.
	 *
	 * @return the attachment local service
	 */
	public sg.com.para.intranet.services.service.AttachmentLocalService getAttachmentLocalService() {
		return attachmentLocalService;
	}

	/**
	 * Sets the attachment local service.
	 *
	 * @param attachmentLocalService the attachment local service
	 */
	public void setAttachmentLocalService(
		sg.com.para.intranet.services.service.AttachmentLocalService attachmentLocalService) {
		this.attachmentLocalService = attachmentLocalService;
	}

	/**
	 * Returns the attachment remote service.
	 *
	 * @return the attachment remote service
	 */
	public sg.com.para.intranet.services.service.AttachmentService getAttachmentService() {
		return attachmentService;
	}

	/**
	 * Sets the attachment remote service.
	 *
	 * @param attachmentService the attachment remote service
	 */
	public void setAttachmentService(
		sg.com.para.intranet.services.service.AttachmentService attachmentService) {
		this.attachmentService = attachmentService;
	}

	/**
	 * Returns the attachment persistence.
	 *
	 * @return the attachment persistence
	 */
	public AttachmentPersistence getAttachmentPersistence() {
		return attachmentPersistence;
	}

	/**
	 * Sets the attachment persistence.
	 *
	 * @param attachmentPersistence the attachment persistence
	 */
	public void setAttachmentPersistence(
		AttachmentPersistence attachmentPersistence) {
		this.attachmentPersistence = attachmentPersistence;
	}

	/**
	 * Returns the employee local service.
	 *
	 * @return the employee local service
	 */
	public sg.com.para.intranet.services.service.EmployeeLocalService getEmployeeLocalService() {
		return employeeLocalService;
	}

	/**
	 * Sets the employee local service.
	 *
	 * @param employeeLocalService the employee local service
	 */
	public void setEmployeeLocalService(
		sg.com.para.intranet.services.service.EmployeeLocalService employeeLocalService) {
		this.employeeLocalService = employeeLocalService;
	}

	/**
	 * Returns the employee remote service.
	 *
	 * @return the employee remote service
	 */
	public sg.com.para.intranet.services.service.EmployeeService getEmployeeService() {
		return employeeService;
	}

	/**
	 * Sets the employee remote service.
	 *
	 * @param employeeService the employee remote service
	 */
	public void setEmployeeService(
		sg.com.para.intranet.services.service.EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	/**
	 * Returns the employee persistence.
	 *
	 * @return the employee persistence
	 */
	public EmployeePersistence getEmployeePersistence() {
		return employeePersistence;
	}

	/**
	 * Sets the employee persistence.
	 *
	 * @param employeePersistence the employee persistence
	 */
	public void setEmployeePersistence(EmployeePersistence employeePersistence) {
		this.employeePersistence = employeePersistence;
	}

	/**
	 * Returns the expense local service.
	 *
	 * @return the expense local service
	 */
	public sg.com.para.intranet.services.service.ExpenseLocalService getExpenseLocalService() {
		return expenseLocalService;
	}

	/**
	 * Sets the expense local service.
	 *
	 * @param expenseLocalService the expense local service
	 */
	public void setExpenseLocalService(
		sg.com.para.intranet.services.service.ExpenseLocalService expenseLocalService) {
		this.expenseLocalService = expenseLocalService;
	}

	/**
	 * Returns the expense remote service.
	 *
	 * @return the expense remote service
	 */
	public sg.com.para.intranet.services.service.ExpenseService getExpenseService() {
		return expenseService;
	}

	/**
	 * Sets the expense remote service.
	 *
	 * @param expenseService the expense remote service
	 */
	public void setExpenseService(
		sg.com.para.intranet.services.service.ExpenseService expenseService) {
		this.expenseService = expenseService;
	}

	/**
	 * Returns the expense persistence.
	 *
	 * @return the expense persistence
	 */
	public ExpensePersistence getExpensePersistence() {
		return expensePersistence;
	}

	/**
	 * Sets the expense persistence.
	 *
	 * @param expensePersistence the expense persistence
	 */
	public void setExpensePersistence(ExpensePersistence expensePersistence) {
		this.expensePersistence = expensePersistence;
	}

	/**
	 * Returns the project local service.
	 *
	 * @return the project local service
	 */
	public sg.com.para.intranet.services.service.ProjectLocalService getProjectLocalService() {
		return projectLocalService;
	}

	/**
	 * Sets the project local service.
	 *
	 * @param projectLocalService the project local service
	 */
	public void setProjectLocalService(
		sg.com.para.intranet.services.service.ProjectLocalService projectLocalService) {
		this.projectLocalService = projectLocalService;
	}

	/**
	 * Returns the project remote service.
	 *
	 * @return the project remote service
	 */
	public sg.com.para.intranet.services.service.ProjectService getProjectService() {
		return projectService;
	}

	/**
	 * Sets the project remote service.
	 *
	 * @param projectService the project remote service
	 */
	public void setProjectService(
		sg.com.para.intranet.services.service.ProjectService projectService) {
		this.projectService = projectService;
	}

	/**
	 * Returns the project persistence.
	 *
	 * @return the project persistence
	 */
	public ProjectPersistence getProjectPersistence() {
		return projectPersistence;
	}

	/**
	 * Sets the project persistence.
	 *
	 * @param projectPersistence the project persistence
	 */
	public void setProjectPersistence(ProjectPersistence projectPersistence) {
		this.projectPersistence = projectPersistence;
	}

	/**
	 * Returns the timesheet local service.
	 *
	 * @return the timesheet local service
	 */
	public sg.com.para.intranet.services.service.TimesheetLocalService getTimesheetLocalService() {
		return timesheetLocalService;
	}

	/**
	 * Sets the timesheet local service.
	 *
	 * @param timesheetLocalService the timesheet local service
	 */
	public void setTimesheetLocalService(
		sg.com.para.intranet.services.service.TimesheetLocalService timesheetLocalService) {
		this.timesheetLocalService = timesheetLocalService;
	}

	/**
	 * Returns the timesheet remote service.
	 *
	 * @return the timesheet remote service
	 */
	public sg.com.para.intranet.services.service.TimesheetService getTimesheetService() {
		return timesheetService;
	}

	/**
	 * Sets the timesheet remote service.
	 *
	 * @param timesheetService the timesheet remote service
	 */
	public void setTimesheetService(
		sg.com.para.intranet.services.service.TimesheetService timesheetService) {
		this.timesheetService = timesheetService;
	}

	/**
	 * Returns the timesheet persistence.
	 *
	 * @return the timesheet persistence
	 */
	public TimesheetPersistence getTimesheetPersistence() {
		return timesheetPersistence;
	}

	/**
	 * Sets the timesheet persistence.
	 *
	 * @param timesheetPersistence the timesheet persistence
	 */
	public void setTimesheetPersistence(
		TimesheetPersistence timesheetPersistence) {
		this.timesheetPersistence = timesheetPersistence;
	}

	/**
	 * Returns the timesheet details local service.
	 *
	 * @return the timesheet details local service
	 */
	public sg.com.para.intranet.services.service.TimesheetDetailsLocalService getTimesheetDetailsLocalService() {
		return timesheetDetailsLocalService;
	}

	/**
	 * Sets the timesheet details local service.
	 *
	 * @param timesheetDetailsLocalService the timesheet details local service
	 */
	public void setTimesheetDetailsLocalService(
		sg.com.para.intranet.services.service.TimesheetDetailsLocalService timesheetDetailsLocalService) {
		this.timesheetDetailsLocalService = timesheetDetailsLocalService;
	}

	/**
	 * Returns the timesheet details remote service.
	 *
	 * @return the timesheet details remote service
	 */
	public sg.com.para.intranet.services.service.TimesheetDetailsService getTimesheetDetailsService() {
		return timesheetDetailsService;
	}

	/**
	 * Sets the timesheet details remote service.
	 *
	 * @param timesheetDetailsService the timesheet details remote service
	 */
	public void setTimesheetDetailsService(
		sg.com.para.intranet.services.service.TimesheetDetailsService timesheetDetailsService) {
		this.timesheetDetailsService = timesheetDetailsService;
	}

	/**
	 * Returns the timesheet details persistence.
	 *
	 * @return the timesheet details persistence
	 */
	public TimesheetDetailsPersistence getTimesheetDetailsPersistence() {
		return timesheetDetailsPersistence;
	}

	/**
	 * Sets the timesheet details persistence.
	 *
	 * @param timesheetDetailsPersistence the timesheet details persistence
	 */
	public void setTimesheetDetailsPersistence(
		TimesheetDetailsPersistence timesheetDetailsPersistence) {
		this.timesheetDetailsPersistence = timesheetDetailsPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("sg.com.para.intranet.services.model.Project",
			projectLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"sg.com.para.intranet.services.model.Project");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Project.class;
	}

	protected String getModelClassName() {
		return Project.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = projectPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = sg.com.para.intranet.services.service.AttachmentLocalService.class)
	protected sg.com.para.intranet.services.service.AttachmentLocalService attachmentLocalService;
	@BeanReference(type = sg.com.para.intranet.services.service.AttachmentService.class)
	protected sg.com.para.intranet.services.service.AttachmentService attachmentService;
	@BeanReference(type = AttachmentPersistence.class)
	protected AttachmentPersistence attachmentPersistence;
	@BeanReference(type = sg.com.para.intranet.services.service.EmployeeLocalService.class)
	protected sg.com.para.intranet.services.service.EmployeeLocalService employeeLocalService;
	@BeanReference(type = sg.com.para.intranet.services.service.EmployeeService.class)
	protected sg.com.para.intranet.services.service.EmployeeService employeeService;
	@BeanReference(type = EmployeePersistence.class)
	protected EmployeePersistence employeePersistence;
	@BeanReference(type = sg.com.para.intranet.services.service.ExpenseLocalService.class)
	protected sg.com.para.intranet.services.service.ExpenseLocalService expenseLocalService;
	@BeanReference(type = sg.com.para.intranet.services.service.ExpenseService.class)
	protected sg.com.para.intranet.services.service.ExpenseService expenseService;
	@BeanReference(type = ExpensePersistence.class)
	protected ExpensePersistence expensePersistence;
	@BeanReference(type = sg.com.para.intranet.services.service.ProjectLocalService.class)
	protected sg.com.para.intranet.services.service.ProjectLocalService projectLocalService;
	@BeanReference(type = sg.com.para.intranet.services.service.ProjectService.class)
	protected sg.com.para.intranet.services.service.ProjectService projectService;
	@BeanReference(type = ProjectPersistence.class)
	protected ProjectPersistence projectPersistence;
	@BeanReference(type = sg.com.para.intranet.services.service.TimesheetLocalService.class)
	protected sg.com.para.intranet.services.service.TimesheetLocalService timesheetLocalService;
	@BeanReference(type = sg.com.para.intranet.services.service.TimesheetService.class)
	protected sg.com.para.intranet.services.service.TimesheetService timesheetService;
	@BeanReference(type = TimesheetPersistence.class)
	protected TimesheetPersistence timesheetPersistence;
	@BeanReference(type = sg.com.para.intranet.services.service.TimesheetDetailsLocalService.class)
	protected sg.com.para.intranet.services.service.TimesheetDetailsLocalService timesheetDetailsLocalService;
	@BeanReference(type = sg.com.para.intranet.services.service.TimesheetDetailsService.class)
	protected sg.com.para.intranet.services.service.TimesheetDetailsService timesheetDetailsService;
	@BeanReference(type = TimesheetDetailsPersistence.class)
	protected TimesheetDetailsPersistence timesheetDetailsPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private ProjectLocalServiceClpInvoker _clpInvoker = new ProjectLocalServiceClpInvoker();
}