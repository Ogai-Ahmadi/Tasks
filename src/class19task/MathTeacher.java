package class19task;

class MathTeacher extends Teacher{
	
	MathTeacher(String name, int id, String subject,String grade){
		super(name, id, subject, grade);	
	}
	
	int workhours;
	int numberOfclass;
	
void  displayInfo() {
		
		System.out.println("Name: "+name+"number of class: "+numberOfclass+"Working hours:"+workhours);
	}
	
	public static void main(String[] args) {
		
		//Teacher t = new Teacher("Ahmad", 333, "linear Aljebra","5th");
		MathTeacher mt = new MathTeacher("Zala ",111,"Discret Mathematics","7th");
		mt.workhours=6;
		mt.numberOfclass=3;
		
		mt.printInfo("Maryam",11,"Discret Mathematics","7th");
		mt.displayInfo();
		//t.printInfo();
		
	}

}
