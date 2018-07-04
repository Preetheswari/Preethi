package com;

public class Student {
	String name,maritalStatus,nationality,sex,dob,address,priEmailId,secemailId,phNo,interestedSub,highestQual;
	int age;
	int admissionId;
	String result;
	Exam exam;
	
	public Student(){}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPriEmailId(String priEmailId) {
		this.priEmailId = priEmailId;
	}

	public void setSecemailId(String secemailId) {
		this.secemailId = secemailId;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	
	public void setInterestedSub(String interestedSub) {
		this.interestedSub = interestedSub;
	}

	public void setHighestQual(String highestQual) {
		this.highestQual = highestQual;
	}
	
	public void setAge(int age) {
		this.age = age;
	
	}
void registerStudent(){
	Registrar registrar=Registrar.getRegistrar();
	admissionId=registrar.registerStudent(this);
	System.out.println("AdmissionId is: " +admissionId);
}
void registerforExam(){
	ExamRegistrar examRegistrar=ExamRegistrar.getExamRegistrar();
	exam=examRegistrar.registeringStudentForExamination(this);
}
void appearForExam(){
	Paper paper=exam.getPaper();
	result=paper.submit();
	System.out.println(result);
}

}
