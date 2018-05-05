package packt.book.jee.eclipse.ch4.jpa.service_bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import packt.book.jee.eclipse.ch4.jpa.bean.Course;
import packt.book.jee.eclipse.ch4.jpa.service.CourseService;

@ManagedBean(name="courseServiceBean")
@RequestScoped
public class CourseServiceBean {
	
	@ManagedProperty(value="#{course}")
	private Course course;
	
	@ManagedProperty(value="#{emFactoryBean}")
	private EntityManagerFactoryBean entityManagerFactoryBean;
	
	private String errMsg = null;
	
	private CourseService courseService;
	
	@PostConstruct
	public void init() {
		courseService = new CourseService(entityManagerFactoryBean);
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	public String addCourse() {
		//System.out.println(course.getName());
		courseService.addCourse(course);
		return "listCourse";
	}
	
	public List<Course> getCourses() {
		return courseService.getCourses();
	}

	public void setEntityManagerFactoryBean(EntityManagerFactoryBean entityManagerFactoryBean) {
		this.entityManagerFactoryBean = entityManagerFactoryBean;
	}
}
