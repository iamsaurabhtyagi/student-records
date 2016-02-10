package com.college.student;

public class StudentDetails {
	
	private int rollNo;
	private String studentName;
	private String fatherName;
	private String motherName;
	private String dob;
	private String department;
	private String branch=department;
	private String year;
	private String semester="";
	private String localAddress="NOT Mentioned";
	private String permanentAddress="NOT Mentioned";
	
	public StudentDetails(){
		
	}
	public StudentDetails(int rollNo, String studentName, String fatherName, String motherName, String dob, String department, String branch, String year, String semester, String localAddress, String permanentAddress) {
		
		this.rollNo=rollNo;
		this.studentName=studentName;
		this.fatherName=fatherName;
		this.motherName=motherName;
		this.dob=dob;
		this.department=department;
		this.branch=branch;
		this.year=year;
		this.localAddress=localAddress;
		this.permanentAddress=permanentAddress;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String faterName) {
		this.fatherName = faterName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getLocalAddress() {
		return localAddress;
	}
	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanantAddress) {
		this.permanentAddress = permanantAddress;
	}
}
