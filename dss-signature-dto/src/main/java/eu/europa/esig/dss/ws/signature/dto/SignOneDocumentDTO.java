/**
 * DSS - Digital Signature Services
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 * 
 * This file is part of the "DSS - Digital Signature Services" project.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.esig.dss.ws.signature.dto;

import java.io.Serializable;

import eu.europa.esig.dss.ws.dto.RemoteDocument;
import eu.europa.esig.dss.ws.dto.SignatureValueDTO;
import eu.europa.esig.dss.ws.signature.dto.parameters.RemoteSignatureParameters;

/**
 * This class is a DTO to transfer required objects to execute signDocument method
 * It's only possible to transfer an object by POST and REST.
 * It's impossible to transfer big objects by GET (url size limitation)
 */
@SuppressWarnings("serial")
public class SignOneDocumentDTO extends AbstractSignDocumentDTO implements Serializable {

	private RemoteDocument toSignDocument;

	public SignOneDocumentDTO() {
		super(null, null);
	}

	public SignOneDocumentDTO(RemoteDocument toSignDocument, RemoteSignatureParameters parameters, SignatureValueDTO signatureValue) {
		super(parameters, signatureValue);
		this.toSignDocument = toSignDocument;
	}

	public RemoteDocument getToSignDocument() {
		return toSignDocument;
	}

	public void setToSignDocument(RemoteDocument toSignDocument) {
		this.toSignDocument = toSignDocument;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((getParameters() == null) ? 0 : getParameters().hashCode());
		result = (prime * result) + ((getSignatureValue() == null) ? 0 : getSignatureValue().hashCode());
		result = (prime * result) + ((toSignDocument == null) ? 0 : toSignDocument.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SignOneDocumentDTO other = (SignOneDocumentDTO) obj;
		if (getParameters() == null) {
			if (other.getParameters() != null) {
				return false;
			}
		} else if (!getParameters().equals(other.getParameters())) {
			return false;
		}
		if (getSignatureValue() == null) {
			if (other.getSignatureValue() != null) {
				return false;
			}
		} else if (!getSignatureValue().equals(other.getSignatureValue())) {
			return false;
		}
		if (toSignDocument == null) {
			if (other.toSignDocument != null) {
				return false;
			}
		} else if (!toSignDocument.equals(other.toSignDocument)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SignDocumentDTO [toSignDocument=" + toSignDocument + ", parameters=" + getParameters() + ", signatureValue=" + getSignatureValue() + "]";
	}

}
