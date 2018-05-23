package dto;

import java.util.Date;

import model.Test;

public class TestDTO {
	
	private int testId;
	private String testPlace;
	private int testResult;
	private Date testTime;
	
	
	public TestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TestDTO(Test test) {
		setTestId(test.getTestId());
		setTestPlace(test.getTestPlace());
		setTestResult(test.getTestResult());
		setTestTime(test.getTestTime());
	}

	public TestDTO(int testId, String testPlace, int testResult, Date testTime) {
		super();
		this.testId = testId;
		this.testPlace = testPlace;
		this.testResult = testResult;
		this.testTime = testTime;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestPlace() {
		return testPlace;
	}

	public void setTestPlace(String testPlace) {
		this.testPlace = testPlace;
	}

	public int getTestResult() {
		return testResult;
	}

	public void setTestResult(int testResult) {
		this.testResult = testResult;
	}

	public Date getTestTime() {
		return testTime;
	}

	public void setTestTime(Date testTime) {
		this.testTime = testTime;
	}

	@Override
	public String toString() {
		return "TestDTO [testId=" + testId + ", testPlace=" + testPlace + ", testResult=" + testResult + ", testTime="
				+ testTime + "]";
	}
	
}
