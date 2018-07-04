package com;

import java.util.Random;

public class Registrar {
static Registrar getRegistrar(){
return new Registrar();
}

public int registerStudent(Student student) {
	int admissionId = 0;
	Validator validator=Validator.getValidator();
	
if(validator.validateStudentDetails(student)){
	Random r= new Random();
	 admissionId=r.nextInt(100000);
}
	
	return admissionId;
}
}
