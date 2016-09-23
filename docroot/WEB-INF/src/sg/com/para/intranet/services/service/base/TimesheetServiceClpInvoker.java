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
		_methodName42 = "getBeanIdentifier";

		_methodParameterTypes42 = new String[] {  };

		_methodName43 = "setBeanIdentifier";

		_methodParameterTypes43 = new String[] { "java.lang.String" };

		_methodName48 = "getTimesheet";

		_methodParameterTypes48 = new String[] { "int", "java.lang.String" };

		_methodName49 = "findTimesheetsByUser";

		_methodParameterTypes49 = new String[] {
				"java.util.Date", "java.util.Date", "java.lang.String",
				"java.lang.String"
			};

		_methodName50 = "createTimeSheet";

		_methodParameterTypes50 = new String[] {
				"java.lang.String", "double", "double", "double", "double",
				"double", "double", "double", "java.lang.String",
				"java.lang.String", "java.lang.String", "long",
				"java.lang.String"
			};

		_methodName51 = "updateTimeSheet";

		_methodParameterTypes51 = new String[] {
				"int", "java.lang.String", "double", "double", "double",
				"double", "double", "double", "double", "java.lang.String",
				"java.lang.String", "java.lang.String", "long",
				"java.lang.String"
			};

		_methodName52 = "deleteTimeSheet";

		_methodParameterTypes52 = new String[] { "int", "java.lang.String" };

		_methodName53 = "approveTimeSheet";

		_methodParameterTypes53 = new String[] { "int", "java.lang.String" };

		_methodName54 = "rejectTimeSheet";

		_methodParameterTypes54 = new String[] {
				"int", "java.lang.String", "java.lang.String"
			};

		_methodName55 = "submitMonth";

		_methodParameterTypes55 = new String[] {
				"int", "int", "java.lang.String", "java.lang.String"
			};

		_methodName56 = "rejectMonth";

		_methodParameterTypes56 = new String[] {
				"int", "int", "java.lang.String", "java.lang.String"
			};

		_methodName57 = "approveMonth";

		_methodParameterTypes57 = new String[] {
				"int", "int", "java.lang.String", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return TimesheetServiceUtil.getBeanIdentifier();
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			TimesheetServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			return TimesheetServiceUtil.getTimesheet(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
			return TimesheetServiceUtil.findTimesheetsByUser((java.util.Date)arguments[0],
				(java.util.Date)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3]);
		}

		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
			return TimesheetServiceUtil.createTimeSheet((java.lang.String)arguments[0],
				((Double)arguments[1]).doubleValue(),
				((Double)arguments[2]).doubleValue(),
				((Double)arguments[3]).doubleValue(),
				((Double)arguments[4]).doubleValue(),
				((Double)arguments[5]).doubleValue(),
				((Double)arguments[6]).doubleValue(),
				((Double)arguments[7]).doubleValue(),
				(java.lang.String)arguments[8], (java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				((Long)arguments[11]).longValue(),
				(java.lang.String)arguments[12]);
		}

		if (_methodName51.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
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
				(java.lang.String)arguments[11],
				((Long)arguments[12]).longValue(),
				(java.lang.String)arguments[13]);
		}

		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
			TimesheetServiceUtil.deleteTimeSheet(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);

			return null;
		}

		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
			TimesheetServiceUtil.approveTimeSheet(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);

			return null;
		}

		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
			TimesheetServiceUtil.rejectTimeSheet(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);

			return null;
		}

		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
			TimesheetServiceUtil.submitMonth(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);

			return null;
		}

		if (_methodName56.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
			TimesheetServiceUtil.rejectMonth(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);

			return null;
		}

		if (_methodName57.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
			TimesheetServiceUtil.approveMonth(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName50;
	private String[] _methodParameterTypes50;
	private String _methodName51;
	private String[] _methodParameterTypes51;
	private String _methodName52;
	private String[] _methodParameterTypes52;
	private String _methodName53;
	private String[] _methodParameterTypes53;
	private String _methodName54;
	private String[] _methodParameterTypes54;
	private String _methodName55;
	private String[] _methodParameterTypes55;
	private String _methodName56;
	private String[] _methodParameterTypes56;
	private String _methodName57;
	private String[] _methodParameterTypes57;
}