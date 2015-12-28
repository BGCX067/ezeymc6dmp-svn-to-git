package jp.co.parrainer.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the MESSEAGE_TABLE database table.
 * 
 */
@Embeddable
public class MesseageTablePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PAGE_ID")
	private int pageId;

	@Column(name="LANGUAGE_CODE")
	private String languageCode;

	public MesseageTablePK() {
	}
	public int getPageId() {
		return this.pageId;
	}
	public void setPageId(int pageId) {
		this.pageId = pageId;
	}
	public String getLanguageCode() {
		return this.languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MesseageTablePK)) {
			return false;
		}
		MesseageTablePK castOther = (MesseageTablePK)other;
		return 
			(this.pageId == castOther.pageId)
			&& this.languageCode.equals(castOther.languageCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.pageId;
		hash = hash * prime + this.languageCode.hashCode();
		
		return hash;
	}
}