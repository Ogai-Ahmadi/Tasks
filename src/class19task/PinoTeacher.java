package class19task;

public class PinoTeacher extends Teacher {

	PinoTeacher(String tname, int tid, String tsubject, String tgrade) {
		super(tname, tid, tsubject, tgrade);
		// TODO Auto-generated constructor stub
	}

	boolean pino_certification=true;
	
	
	public static void main(String[] args) {
		PinoTeacher pteach = new PinoTeacher("Alia", 1234,"Basics of pino", "3rd");
		pteach.printInfo("Alia", 1234,"Basics of pino", "3rd");
		System.out.println("Certification is: "+pteach.pino_certification);
		
	}
	
	
	
}
