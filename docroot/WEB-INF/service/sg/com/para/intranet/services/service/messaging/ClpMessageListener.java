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

package sg.com.para.intranet.services.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import sg.com.para.intranet.services.service.ClpSerializer;
import sg.com.para.intranet.services.service.EmployeeLocalServiceUtil;
import sg.com.para.intranet.services.service.EmployeeServiceUtil;
import sg.com.para.intranet.services.service.ExpenseLocalServiceUtil;
import sg.com.para.intranet.services.service.ExpenseServiceUtil;
import sg.com.para.intranet.services.service.ProjectLocalServiceUtil;
import sg.com.para.intranet.services.service.ProjectServiceUtil;
import sg.com.para.intranet.services.service.TimesheetDetailsLocalServiceUtil;
import sg.com.para.intranet.services.service.TimesheetDetailsServiceUtil;
import sg.com.para.intranet.services.service.TimesheetLocalServiceUtil;
import sg.com.para.intranet.services.service.TimesheetServiceUtil;

/**
 * @author Fernando Karnagi
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			EmployeeLocalServiceUtil.clearService();

			EmployeeServiceUtil.clearService();
			ExpenseLocalServiceUtil.clearService();

			ExpenseServiceUtil.clearService();
			ProjectLocalServiceUtil.clearService();

			ProjectServiceUtil.clearService();
			TimesheetLocalServiceUtil.clearService();

			TimesheetServiceUtil.clearService();
			TimesheetDetailsLocalServiceUtil.clearService();

			TimesheetDetailsServiceUtil.clearService();
		}
	}
}