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

package sg.com.para.intranet.services.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import sg.com.para.intranet.services.model.Attachment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Attachment in entity cache.
 *
 * @author Fernando Karnagi
 * @see Attachment
 * @generated
 */
public class AttachmentCacheModel implements CacheModel<Attachment>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{attachmentId=");
		sb.append(attachmentId);
		sb.append(", entityType=");
		sb.append(entityType);
		sb.append(", entityId=");
		sb.append(entityId);
		sb.append(", attachmentText=");
		sb.append(attachmentText);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Attachment toEntityModel() {
		AttachmentImpl attachmentImpl = new AttachmentImpl();

		attachmentImpl.setAttachmentId(attachmentId);

		if (entityType == null) {
			attachmentImpl.setEntityType(StringPool.BLANK);
		}
		else {
			attachmentImpl.setEntityType(entityType);
		}

		attachmentImpl.setEntityId(entityId);

		if (attachmentText == null) {
			attachmentImpl.setAttachmentText(StringPool.BLANK);
		}
		else {
			attachmentImpl.setAttachmentText(attachmentText);
		}

		attachmentImpl.resetOriginalValues();

		return attachmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attachmentId = objectInput.readInt();
		entityType = objectInput.readUTF();
		entityId = objectInput.readInt();
		attachmentText = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(attachmentId);

		if (entityType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(entityType);
		}

		objectOutput.writeInt(entityId);

		if (attachmentText == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(attachmentText);
		}
	}

	public int attachmentId;
	public String entityType;
	public int entityId;
	public String attachmentText;
}