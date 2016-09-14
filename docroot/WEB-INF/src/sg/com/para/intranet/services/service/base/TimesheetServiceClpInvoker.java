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

import sg.com.para.intranet.services.service.TimesheetServiceUtil;

import java.util.Arrays;

/**
 * @author Fernando Karnagi
 * @generated
 */
public class TimesheetServiceClpInvoker {
	public TimesheetServiceClpInvoker() {
		_methodName36 = "getBeanIdentifier";

		_methodParameterTypes36 = new String[] {  };

		_methodName37 = "setBeanIdentifier";

		_methodParameterTypes37 = new String[] { "java.lang.String" };

		_methodName42 = "getTimesheet";

		_methodParameterTypes42 = new String[] { "int", "java.lang.String" };

		_methodName43 = "findTimesheetsByUser";

		_methodParameterTypes43 = new String[] {
				"java.util.Date", "java.util.Date", "java.lang.String",
				"java.lang.String"
			};

		_methodName44 = "createTimeSheet";

		_methodParameterTypes44 = new String[] {
				"java.lang.String", "double", "double", "double", "double",
				"double", "double", "double", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName45 = "updateTimeSheet";

		_methodParameterTypes45 = new String[] {
				"int", "java.lang.String", "double", "double", "double",
				"double", "double", "double", "double", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName46 = "approveTimeSheet";

		_methodParameterTypes46 = new String[] { "int", "java.lang.String" };

		_methodName47 = "rejectTimeSheet";

		_methodParameterTypes47 = new String[] {
				"int", "java.lang.String", "java.lang.String"
			};

		_methodName48 = "submitMonth";

		_methodParameterTypes48 = new String[] {
				"int", "int", "java.lang.String", "java.lang.String"
			};

		_methodName49 = "rejectMonth";

		_methodParameterTypes49 = new String[] {
				"int", "int", "java.lang.String", "java.lang.String"
			};

		_methodName50 = "approveMonth";

		_methodParameterTypes50 = new String[] {
				"int", "int", "java.lang.String", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			return TimesheetServiceUtil.getBeanIdentifier();
		}

		if (_methodName37.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
			TimesheetServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return TimesheetServiceUtil.getTimesheet(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return TimesheetServiceUtil.findTimesheetsByUser((java.util.Date)arguments[0],
				(java.util.Date)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3]);
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			return TimesheetServiceUtil.createTimeSheet((java.lang.String)arguments[0],
				((Double)arguments[1]).doubleValue(),
				((Double)arguments[2]).doubleValue(),
				((Double)arguments[3]).doubleValue(),
				((Double)arguments[4]).doubleValue(),
				((Double)arguments[5]).doubleValue(),
				((Double)arguments[6]).doubleValue(),
				((Double)arguments[7]).doubleValue(),
				(java.lang.String)arguments[8], (java.lang.String)arguments[9],
				(java.lang.String)arguments[10], (java.lang.String)arguments[11]);
		}

		if (_methodName45.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
			return TimesheetServiceUtil.updateTimeSheet(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				((Double)arguments[2]).doubleValue(),
				((Double)arguments[3]).doubleValue(),
				((Double)arguments[4]).doubleValue(),
				((Double)arguments[5]).doubleValue(),
				((Double)arguments[6]).doubleValue(),
				((Double)arguments[7]).doubleValue(),
				((Double)arguments[8]).doubleValue(),
				(java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				(java.lang.String)arguments[11], (java.lang.String)arguments[12]);
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			TimesheetServiceUtil.approveTimeSheet(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);

			return null;
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			TimesheetServiceUtil.rejectTimeSheet(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);

			return null;
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			TimesheetServiceUtil.submitMonth(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);

			return null;
		}

		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
			TimesheetServiceUtil.rejectMonth(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);

			return null;
		}

		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
			TimesheetServiceUtil.approveMonth(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName37;
	private String[] _methodParameterTypes37;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName45;
	private String[] _methodParameterTypes45;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName50;
	private String[] _methodParameterTypes50;
}