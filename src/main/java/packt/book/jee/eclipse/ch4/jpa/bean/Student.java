package packt.book.jee.eclipse.ch4.jpa.bean;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@ManagedBean(name="student")
@RequestScoped
public class Student extends Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Temporal(TemporalType.DATE)
	@Column(name="enrolled_since")
	private Date enrolledSince;

	public Date getEnrolledSince() {
		return enrolledSince;
	}

	public void setEnrolledSince(Date enrolledSince) {
		this.enrolledSince = enrolledSince;
	}

}
