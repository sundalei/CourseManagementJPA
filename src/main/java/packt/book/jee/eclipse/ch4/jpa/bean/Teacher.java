package packt.book.jee.eclipse.ch4.jpa.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="teacher")
@RequestScoped
public class Teacher extends Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}