package class19task;

class ChemistryTeacher extends Teacher{
	
	
	ChemistryTeacher(String name, int id, String subject,String grade) {
		super(name, id, subject, grade);
		
	}

	 int experience;
	
	 void display() {
		System.out.println(name+" have "+experience+" years of experience");
	}
	

public static void main(String[] args) {
	
	
	ChemistryTeacher teach2 = new ChemistryTeacher("Saba", 123, "Chimestry fundamentals","8th");
	teach2.experience = 4;
	
	teach2.printInfo("Saba", 123, "Chimestry fundamentals","8th");
	teach2.display();	
}
}