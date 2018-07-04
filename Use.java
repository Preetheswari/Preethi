package com;
import java.util.Scanner;
public class Use {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
String name=sc.next();
System.out.println("Enter your age");
int age=sc.nextInt ();
System.out.println("Enter your MaritalStatus");
String maritalStatus=sc.next();
System.out.println("Enter your nationality");
String nationality=sc.next();
System.out.println("Enter your sex");
String sex=sc.next();
System.out.println("Enter your dob");
String dob=sc.next();
System.out.println("Enter your address");
String address=sc.next();
System.out.println("Enter your priEmailId");
String priEmailId=sc.next();
System.out.println("Enter your secemailId");
String secemailId=sc.next();
System.out.println("Enter your phoneNumber");
String phNo=sc.next();
System.out.println("Enter your intrestd subj");
String interestedSub=sc.next();
System.out.println("Enter your highestQualification");
String highestQual=sc.next();

	Student s=new Student();
	s.setName(name);
	s.setDob(dob);
	s.setSex(sex);
	s.setNationality(nationality);
	s.setAge(age);
	s.setMaritalStatus(maritalStatus);
	s.setAddress(address);
	s.setHighestQual(highestQual);
	s.setInterestedSub(interestedSub);
	s.setPhNo(phNo);
	s.setPriEmailId(priEmailId);
	s.setSecemailId(secemailId);
	s.registerStudent();
	s.registerforExam();
	s.appearForExam();

	}
}
	
