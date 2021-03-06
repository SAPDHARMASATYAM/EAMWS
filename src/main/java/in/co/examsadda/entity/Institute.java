package in.co.examsadda.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.data.domain.Persistable;


/**
 * The persistent class for the institute database table.
 * 
 */
@Entity
@Table(name="institute")
@NamedQuery(name="Institute.findAll", query="SELECT i FROM Institute i")
public class Institute implements Serializable, Persistable<String>  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="institute_id", unique=true, nullable=false, length=100)
	private String instituteId;

	
	@Column(name="institute_name_in_english", nullable=false)
	private String instituteNameInEnglish;

	
	@Column(name="institute_name_in_regional", nullable=false)
	private String instituteNameInRegional;

	@Column(name="is_institute_active", nullable=false)
	private boolean isInstituteActive;

	@Column(name="password", nullable=false)
	private String password;
	@Transient
	private boolean isNew = false;

	public boolean isNew() {
		return isNew;
	}

	@Override
	public String getId() {
		return this.getInstituteId();
	}

	public String getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}

	public String getInstituteNameInEnglish() {
		return instituteNameInEnglish;
	}

	public void setInstituteNameInEnglish(String instituteNameInEnglish) {
		this.instituteNameInEnglish = instituteNameInEnglish;
	}

	public String getInstituteNameInRegional() {
		return instituteNameInRegional;
	}

	public void setInstituteNameInRegional(String instituteNameInRegional) {
		this.instituteNameInRegional = instituteNameInRegional;
	}

	public boolean isInstituteActive() {
		return isInstituteActive;
	}

	public void setInstituteActive(boolean isInstituteActive) {
		this.isInstituteActive = isInstituteActive;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	
}