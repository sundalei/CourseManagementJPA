package packt.book.jee.eclipse.ch4.jpa.bean;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="student")
@RequestScoped
public class Student extends Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Date enrolledsince;

	public Date getEnrolledsince() {
		return enrolledsince;
	}

	public void setEnrolledsince(Date enrolledsince) {
		this.enrolledsince = enrolledsince;
	}
}
