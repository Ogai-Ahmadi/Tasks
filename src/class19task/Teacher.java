package class19task;

public class Teacher {
	String name;
	int id;
	String subject;
	String grade;
	
	Teacher(String tname, int tid, String tsubject, String tgrade){
		
	}
	
	void printInfo(String name, int id, String subject, String grade) {
		this.name=name;
		this.id=id;
		this.subject=subject;
		this.grade=grade;
		
		
		System.out.println(" name: "+name+"ID: "+id+" subject is: "+subject+"grade is: "+ grade);
	}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program called Teacher.  Identify features and behaviour of that Class. 
		//Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features 
		//and behaviour. Test all 4 classes

	//}

}
