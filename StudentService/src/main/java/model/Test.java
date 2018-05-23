package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the test database table.
 * 
 */
@Entity
@NamedQuery(name="Test.findAll", query="SELECT t FROM Test t")
public class Test implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="test_id")
	private int testId;

	@Column(name="test_place")
	private String testPlace;

	@Column(name="test_result")
	private int testResult;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="test_time")
	private Date testTime;

	//bi-directional many-to-one association to Student
	@OneToMany(mappedBy="test")
	private List<Student> students;

	public Test() {
	}

	public int getTestId() {
		return this.testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestPlace() {
		return this.testPlace;
	}

	public void setTestPlace(String testPlace) {
		this.testPlace = testPlace;
	}

	public int getTestResult() {
		return this.testResult;
	}

	public void setTestResult(int testResult) {
		this.testResult = testResult;
	}

	public Date getTestTime() {
		return this.testTime;
	}

	public void setTestTime(Date testTime) {
		this.testTime = testTime;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student addStudent(Student student) {
		getStudents().add(student);
		student.setTest(this);

		return student;
	}

	public Student removeStudent(Student student) {
		getStudents().remove(student);
		student.setTest(null);

		return student;
	}

}