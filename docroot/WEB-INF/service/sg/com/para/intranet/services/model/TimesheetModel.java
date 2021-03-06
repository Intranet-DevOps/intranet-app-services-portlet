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

package sg.com.para.intranet.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Timesheet service. Represents a row in the &quot;intranet_timesheet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link sg.com.para.intranet.services.model.impl.TimesheetModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link sg.com.para.intranet.services.model.impl.TimesheetImpl}.
 * </p>
 *
 * @author Fernando Karnagi
 * @see Timesheet
 * @see sg.com.para.intranet.services.model.impl.TimesheetImpl
 * @see sg.com.para.intranet.services.model.impl.TimesheetModelImpl
 * @generated
 */
public interface TimesheetModel extends BaseModel<Timesheet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a timesheet model instance should use the {@link Timesheet} interface instead.
	 */

	/**
	 * Returns the primary key of this timesheet.
	 *
	 * @return the primary key of this timesheet
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this timesheet.
	 *
	 * @param primaryKey the primary key of this timesheet
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the timesheet ID of this timesheet.
	 *
	 * @return the timesheet ID of this timesheet
	 */
	public int getTimesheetId();

	/**
	 * Sets the timesheet ID of this timesheet.
	 *
	 * @param timesheetId the timesheet ID of this timesheet
	 */
	public void setTimesheetId(int timesheetId);

	/**
	 * Returns the employee screen name of this timesheet.
	 *
	 * @return the employee screen name of this timesheet
	 */
	@AutoEscape
	public String getEmployeeScreenName();

	/**
	 * Sets the employee screen name of this timesheet.
	 *
	 * @param employeeScreenName the employee screen name of this timesheet
	 */
	public void setEmployeeScreenName(String employeeScreenName);

	/**
	 * Returns the log date of this timesheet.
	 *
	 * @return the log date of this timesheet
	 */
	public Date getLogDate();

	/**
	 * Sets the log date of this timesheet.
	 *
	 * @param logDate the log date of this timesheet
	 */
	public void setLogDate(Date logDate);

	/**
	 * Returns the regular of this timesheet.
	 *
	 * @return the regular of this timesheet
	 */
	public double getRegular();

	/**
	 * Sets the regular of this timesheet.
	 *
	 * @param regular the regular of this timesheet
	 */
	public void setRegular(double regular);

	/**
	 * Returns the overtime of this timesheet.
	 *
	 * @return the overtime of this timesheet
	 */
	public double getOvertime();

	/**
	 * Sets the overtime of this timesheet.
	 *
	 * @param overtime the overtime of this timesheet
	 */
	public void setOvertime(double overtime);

	/**
	 * Returns the sick of this timesheet.
	 *
	 * @return the sick of this timesheet
	 */
	public double getSick();

	/**
	 * Sets the sick of this timesheet.
	 *
	 * @param sick the sick of this timesheet
	 */
	public void setSick(double sick);

	/**
	 * Returns the vacation of this timesheet.
	 *
	 * @return the vacation of this timesheet
	 */
	public double getVacation();

	/**
	 * Sets the vacation of this timesheet.
	 *
	 * @param vacation the vacation of this timesheet
	 */
	public void setVacation(double vacation);

	/**
	 * Returns the holiday of this timesheet.
	 *
	 * @return the holiday of this timesheet
	 */
	public double getHoliday();

	/**
	 * Sets the holiday of this timesheet.
	 *
	 * @param holiday the holiday of this timesheet
	 */
	public void setHoliday(double holiday);

	/**
	 * Returns the unpaid of this timesheet.
	 *
	 * @return the unpaid of this timesheet
	 */
	public double getUnpaid();

	/**
	 * Sets the unpaid of this timesheet.
	 *
	 * @param unpaid the unpaid of this timesheet
	 */
	public void setUnpaid(double unpaid);

	/**
	 * Returns the other of this timesheet.
	 *
	 * @return the other of this timesheet
	 */
	public double getOther();

	/**
	 * Sets the other of this timesheet.
	 *
	 * @param other the other of this timesheet
	 */
	public void setOther(double other);

	/**
	 * Returns the remarks of this timesheet.
	 *
	 * @return the remarks of this timesheet
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this timesheet.
	 *
	 * @param remarks the remarks of this timesheet
	 */
	public void setRemarks(String remarks);

	/**
	 * Returns the status of this timesheet.
	 *
	 * @return the status of this timesheet
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this timesheet.
	 *
	 * @param status the status of this timesheet
	 */
	public void setStatus(String status);

	/**
	 * Returns the project code of this timesheet.
	 *
	 * @return the project code of this timesheet
	 */
	@AutoEscape
	public String getProjectCode();

	/**
	 * Sets the project code of this timesheet.
	 *
	 * @param projectCode the project code of this timesheet
	 */
	public void setProjectCode(String projectCode);

	/**
	 * Returns the approved by of this timesheet.
	 *
	 * @return the approved by of this timesheet
	 */
	@AutoEscape
	public String getApprovedBy();

	/**
	 * Sets the approved by of this timesheet.
	 *
	 * @param approvedBy the approved by of this timesheet
	 */
	public void setApprovedBy(String approvedBy);

	/**
	 * Returns the approved date of this timesheet.
	 *
	 * @return the approved date of this timesheet
	 */
	public Date getApprovedDate();

	/**
	 * Sets the approved date of this timesheet.
	 *
	 * @param approvedDate the approved date of this timesheet
	 */
	public void setApprovedDate(Date approvedDate);

	/**
	 * Returns the processed by of this timesheet.
	 *
	 * @return the processed by of this timesheet
	 */
	@AutoEscape
	public String getProcessedBy();

	/**
	 * Sets the processed by of this timesheet.
	 *
	 * @param processedBy the processed by of this timesheet
	 */
	public void setProcessedBy(String processedBy);

	/**
	 * Returns the processed date of this timesheet.
	 *
	 * @return the processed date of this timesheet
	 */
	public Date getProcessedDate();

	/**
	 * Sets the processed date of this timesheet.
	 *
	 * @param processedDate the processed date of this timesheet
	 */
	public void setProcessedDate(Date processedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		sg.com.para.intranet.services.model.Timesheet timesheet);

	@Override
	public int hashCode();

	@Override
	public CacheModel<sg.com.para.intranet.services.model.Timesheet> toCacheModel();

	@Override
	public sg.com.para.intranet.services.model.Timesheet toEscapedModel();

	@Override
	public sg.com.para.intranet.services.model.Timesheet toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}