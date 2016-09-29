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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import sg.com.para.intranet.services.service.AttachmentLocalServiceUtil;
import sg.com.para.intranet.services.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Karnagi
 */
public class AttachmentClp extends BaseModelImpl<Attachment>
	implements Attachment {
	public AttachmentClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Attachment.class;
	}

	@Override
	public String getModelClassName() {
		return Attachment.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _attachmentId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setAttachmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _attachmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("attachmentId", getAttachmentId());
		attributes.put("entityType", getEntityType());
		attributes.put("entityId", getEntityId());
		attributes.put("attachmentText", getAttachmentText());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer attachmentId = (Integer)attributes.get("attachmentId");

		if (attachmentId != null) {
			setAttachmentId(attachmentId);
		}

		String entityType = (String)attributes.get("entityType");

		if (entityType != null) {
			setEntityType(entityType);
		}

		Integer entityId = (Integer)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}

		String attachmentText = (String)attributes.get("attachmentText");

		if (attachmentText != null) {
			setAttachmentText(attachmentText);
		}
	}

	@Override
	public int getAttachmentId() {
		return _attachmentId;
	}

	@Override
	public void setAttachmentId(int attachmentId) {
		_attachmentId = attachmentId;

		if (_attachmentRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachmentId", int.class);

				method.invoke(_attachmentRemoteModel, attachmentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEntityType() {
		return _entityType;
	}

	@Override
	public void setEntityType(String entityType) {
		_entityType = entityType;

		if (_attachmentRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setEntityType", String.class);

				method.invoke(_attachmentRemoteModel, entityType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getEntityId() {
		return _entityId;
	}

	@Override
	public void setEntityId(int entityId) {
		_entityId = entityId;

		if (_attachmentRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setEntityId", int.class);

				method.invoke(_attachmentRemoteModel, entityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAttachmentText() {
		return _attachmentText;
	}

	@Override
	public void setAttachmentText(String attachmentText) {
		_attachmentText = attachmentText;

		if (_attachmentRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachmentText",
						String.class);

				method.invoke(_attachmentRemoteModel, attachmentText);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAttachmentRemoteModel() {
		return _attachmentRemoteModel;
	}

	public void setAttachmentRemoteModel(BaseModel<?> attachmentRemoteModel) {
		_attachmentRemoteModel = attachmentRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _attachmentRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_attachmentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AttachmentLocalServiceUtil.addAttachment(this);
		}
		else {
			AttachmentLocalServiceUtil.updateAttachment(this);
		}
	}

	@Override
	public Attachment toEscapedModel() {
		return (Attachment)ProxyUtil.newProxyInstance(Attachment.class.getClassLoader(),
			new Class[] { Attachment.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AttachmentClp clone = new AttachmentClp();

		clone.setAttachmentId(getAttachmentId());
		clone.setEntityType(getEntityType());
		clone.setEntityId(getEntityId());
		clone.setAttachmentText(getAttachmentText());

		return clone;
	}

	@Override
	public int compareTo(Attachment attachment) {
		int primaryKey = attachment.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AttachmentClp)) {
			return false;
		}

		AttachmentClp attachment = (AttachmentClp)obj;

		int primaryKey = attachment.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{attachmentId=");
		sb.append(getAttachmentId());
		sb.append(", entityType=");
		sb.append(getEntityType());
		sb.append(", entityId=");
		sb.append(getEntityId());
		sb.append(", attachmentText=");
		sb.append(getAttachmentText());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("sg.com.para.intranet.services.model.Attachment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>attachmentId</column-name><column-value><![CDATA[");
		sb.append(getAttachmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>entityType</column-name><column-value><![CDATA[");
		sb.append(getEntityType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>entityId</column-name><column-value><![CDATA[");
		sb.append(getEntityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachmentText</column-name><column-value><![CDATA[");
		sb.append(getAttachmentText());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _attachmentId;
	private String _entityType;
	private int _entityId;
	private String _attachmentText;
	private BaseModel<?> _attachmentRemoteModel;
	private Class<?> _clpSerializerClass = sg.com.para.intranet.services.service.ClpSerializer.class;
}