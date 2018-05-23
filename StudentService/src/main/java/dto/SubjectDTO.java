package dto;

import model.Subject;

public class SubjectDTO {
	
	private int subjectId;
	private String espb;
	private String subjectName;
	
	
	public SubjectDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SubjectDTO(Subject subject) {
		setSubjectId(subject.getSubjectId());
		setEspb(subject.getEspb());
		setSubjectName(subject.getSubjectName());
	}

	public SubjectDTO(int subjectId, String espb, String subjectName) {
		super();
		this.subjectId = subjectId;
		this.espb = espb;
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getEspb() {
		return espb;
	}

	public void setEspb(String espb) {
		this.espb = espb;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "SubjectDTO [subjectId=" + subjectId + ", espb=" + espb + ", subjectName=" + subjectName + "]";
	}
	
}
