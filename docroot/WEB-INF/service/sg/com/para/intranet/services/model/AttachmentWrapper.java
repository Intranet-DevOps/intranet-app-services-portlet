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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Attachment}.
 * </p>
 *
 * @author Fernando Karnagi
 * @see Attachment
 * @generated
 */
public class AttachmentWrapper implements Attachment, ModelWrapper<Attachment> {
	public AttachmentWrapper(Attachment attachment) {
		_attachment = attachment;
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

	/**
	* Returns the primary key of this attachment.
	*
	* @return the primary key of this attachment
	*/
	@Override
	public int getPrimaryKey() {
		return _attachment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this attachment.
	*
	* @param primaryKey the primary key of this attachment
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_attachment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the attachment ID of this attachment.
	*
	* @return the attachment ID of this attachment
	*/
	@Override
	public int getAttachmentId() {
		return _attachment.getAttachmentId();
	}

	/**
	* Sets the attachment ID of this attachment.
	*
	* @param attachmentId the attachment ID of this attachment
	*/
	@Override
	public void setAttachmentId(int attachmentId) {
		_attachment.setAttachmentId(attachmentId);
	}

	/**
	* Returns the entity type of this attachment.
	*
	* @return the entity type of this attachment
	*/
	@Override
	public java.lang.String getEntityType() {
		return _attachment.getEntityType();
	}

	/**
	* Sets the entity type of this attachment.
	*
	* @param entityType the entity type of this attachment
	*/
	@Override
	public void setEntityType(java.lang.String entityType) {
		_attachment.setEntityType(entityType);
	}

	/**
	* Returns the entity ID of this attachment.
	*
	* @return the entity ID of this attachment
	*/
	@Override
	public int getEntityId() {
		return _attachment.getEntityId();
	}

	/**
	* Sets the entity ID of this attachment.
	*
	* @param entityId the entity ID of this attachment
	*/
	@Override
	public void setEntityId(int entityId) {
		_attachment.setEntityId(entityId);
	}

	/**
	* Returns the attachment text of this attachment.
	*
	* @return the attachment text of this attachment
	*/
	@Override
	public java.lang.String getAttachmentText() {
		return _attachment.getAttachmentText();
	}

	/**
	* Sets the attachment text of this attachment.
	*
	* @param attachmentText the attachment text of this attachment
	*/
	@Override
	public void setAttachmentText(java.lang.String attachmentText) {
		_attachment.setAttachmentText(attachmentText);
	}

	@Override
	public boolean isNew() {
		return _attachment.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_attachment.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _attachment.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_attachment.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _attachment.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _attachment.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_attachment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _attachment.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_attachment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_attachment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_attachment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AttachmentWrapper((Attachment)_attachment.clone());
	}

	@Override
	public int compareTo(
		sg.com.para.intranet.services.model.Attachment attachment) {
		return _attachment.compareTo(attachment);
	}

	@Override
	public int hashCode() {
		return _attachment.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<sg.com.para.intranet.services.model.Attachment> toCacheModel() {
		return _attachment.toCacheModel();
	}

	@Override
	public sg.com.para.intranet.services.model.Attachment toEscapedModel() {
		return new AttachmentWrapper(_attachment.toEscapedModel());
	}

	@Override
	public sg.com.para.intranet.services.model.Attachment toUnescapedModel() {
		return new AttachmentWrapper(_attachment.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _attachment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _attachment.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_attachment.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AttachmentWrapper)) {
			return false;
		}

		AttachmentWrapper attachmentWrapper = (AttachmentWrapper)obj;

		if (Validator.equals(_attachment, attachmentWrapper._attachment)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Attachment getWrappedAttachment() {
		return _attachment;
	}

	@Override
	public Attachment getWrappedModel() {
		return _attachment;
	}

	@Override
	public void resetOriginalValues() {
		_attachment.resetOriginalValues();
	}

	private Attachment _attachment;
}