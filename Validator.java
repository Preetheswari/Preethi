package com;

public class Validator {
	static Validator getValidator() {
		   return new Validator();
	}
		   boolean validateStudentDetails(Student student){
			   System.out.println("Validated");
			 return true;
		   }
	}
