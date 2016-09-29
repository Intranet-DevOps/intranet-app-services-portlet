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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link sg.com.para.intranet.services.service.http.AttachmentServiceSoap}.
 *
 * @author Fernando Karnagi
 * @see sg.com.para.intranet.services.service.http.AttachmentServiceSoap
 * @generated
 */
public class AttachmentSoap implements Serializable {
	public static AttachmentSoap toSoapModel(Attachment model) {
		AttachmentSoap soapModel = new AttachmentSoap();

		soapModel.setAttachmentId(model.getAttachmentId());
		soapModel.setEntityType(model.getEntityType());
		soapModel.setEntityId(model.getEntityId());
		soapModel.setAttachmentText(model.getAttachmentText());

		return soapModel;
	}

	public static AttachmentSoap[] toSoapModels(Attachment[] models) {
		AttachmentSoap[] soapModels = new AttachmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AttachmentSoap[][] toSoapModels(Attachment[][] models) {
		AttachmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AttachmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AttachmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AttachmentSoap[] toSoapModels(List<Attachment> models) {
		List<AttachmentSoap> soapModels = new ArrayList<AttachmentSoap>(models.size());

		for (Attachment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AttachmentSoap[soapModels.size()]);
	}

	public AttachmentSoap() {
	}

	public int getPrimaryKey() {
		return _attachmentId;
	}

	public void setPrimaryKey(int pk) {
		setAttachmentId(pk);
	}

	public int getAttachmentId() {
		return _attachmentId;
	}

	public void setAttachmentId(int attachmentId) {
		_attachmentId = attachmentId;
	}

	public String getEntityType() {
		return _entityType;
	}

	public void setEntityType(String entityType) {
		_entityType = entityType;
	}

	public int getEntityId() {
		return _entityId;
	}

	public void setEntityId(int entityId) {
		_entityId = entityId;
	}

	public String getAttachmentText() {
		return _attachmentText;
	}

	public void setAttachmentText(String attachmentText) {
		_attachmentText = attachmentText;
	}

	private int _attachmentId;
	private String _entityType;
	private int _entityId;
	private String _attachmentText;
}