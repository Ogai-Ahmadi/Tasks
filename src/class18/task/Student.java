package class18.task;

public class Student {
	String name;
	int grade1;
	int grade2;
	int grade3;
	
	
	Student(String name, int grade1, int grade2, int grade3){
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.name = name;
		
	}
	public  double average() {
	
	double average=(grade1+grade2+grade3)/3;
	return  average;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2.	Write a java Class Students that have a constructor which takes students name and 3 subject grades.
		 *  Inside your class also have a method to Calculate Average Grade. 
		 *  Test Student class for 5 different students with different marks. 
		 * Your program should print an average mark of each students name.
		 */

	
	Student st1 = new Student("Ali", 90, 80,70);
	System.out.println(st1.name+"'s Average score is " + st1.average());
	
	Student st2 = new Student("Hosai", 90, 40,70);
	System.out.println(st2.name+"'s Average score is " + st2.average());
	
	Student st3 = new Student("Yama", 80, 80,70);
	System.out.println(st3.name+"'s Average score is " + st3.average());
	
	Student st4 = new Student("Zala", 79, 70,100);
	System.out.println(st4.name+"'s Average score is " + st4.average());
	
	Student st5 = new Student("Idris", 50, 50,70);
	System.out.println(st5.name+"'s Average score is " + st5.average());
	
	
	
	
	
	}
}
