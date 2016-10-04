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

/**
 * The base model interface for the Attachment service. Represents a row in the &quot;intranet_attachment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link sg.com.para.intranet.services.model.impl.AttachmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link sg.com.para.intranet.services.model.impl.AttachmentImpl}.
 * </p>
 *
 * @author Fernando Karnagi
 * @see Attachment
 * @see sg.com.para.intranet.services.model.impl.AttachmentImpl
 * @see sg.com.para.intranet.services.model.impl.AttachmentModelImpl
 * @generated
 */
public interface AttachmentModel extends BaseModel<Attachment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a attachment model instance should use the {@link Attachment} interface instead.
	 */

	/**
	 * Returns the primary key of this attachment.
	 *
	 * @return the primary key of this attachment
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this attachment.
	 *
	 * @param primaryKey the primary key of this attachment
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the attachment ID of this attachment.
	 *
	 * @return the attachment ID of this attachment
	 */
	public int getAttachmentId();

	/**
	 * Sets the attachment ID of this attachment.
	 *
	 * @param attachmentId the attachment ID of this attachment
	 */
	public void setAttachmentId(int attachmentId);

	/**
	 * Returns the entity type of this attachment.
	 *
	 * @return the entity type of this attachment
	 */
	@AutoEscape
	public String getEntityType();

	/**
	 * Sets the entity type of this attachment.
	 *
	 * @param entityType the entity type of this attachment
	 */
	public void setEntityType(String entityType);

	/**
	 * Returns the entity ID of this attachment.
	 *
	 * @return the entity ID of this attachment
	 */
	public int getEntityId();

	/**
	 * Sets the entity ID of this attachment.
	 *
	 * @param entityId the entity ID of this attachment
	 */
	public void setEntityId(int entityId);

	/**
	 * Returns the attachment text of this attachment.
	 *
	 * @return the attachment text of this attachment
	 */
	@AutoEscape
	public String getAttachmentText();

	/**
	 * Sets the attachment text of this attachment.
	 *
	 * @param attachmentText the attachment text of this attachment
	 */
	public void setAttachmentText(String attachmentText);

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
		sg.com.para.intranet.services.model.Attachment attachment);

	@Override
	public int hashCode();

	@Override
	public CacheModel<sg.com.para.intranet.services.model.Attachment> toCacheModel();

	@Override
	public sg.com.para.intranet.services.model.Attachment toEscapedModel();

	@Override
	public sg.com.para.intranet.services.model.Attachment toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}