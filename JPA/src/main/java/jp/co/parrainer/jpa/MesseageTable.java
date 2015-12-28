package jp.co.parrainer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MESSEAGE_TABLE database table.
 * 
 */
@Entity
@Table(name="MESSEAGE_TABLE")
@NamedQuery(name="MesseageTable.findAll", query="SELECT m FROM MesseageTable m")
public class MesseageTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MesseageTablePK id;

	@Column(name="MESSEAGE_TEXT")
	private String messeageText;

	public MesseageTable() {
	}

	public MesseageTablePK getId() {
		return this.id;
	}

	public void setId(MesseageTablePK id) {
		this.id = id;
	}

	public String getMesseageText() {
		return this.messeageText;
	}

	public void setMesseageText(String messeageText) {
		this.messeageText = messeageText;
	}

}