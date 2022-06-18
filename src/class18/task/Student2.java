package class18.task;

public class Student2 {
	private String name;
	private String address;
	
	Student2(){
		this.name= name;
		this.address=address;
	}
public void displayInfo() {
	System.out.println("Name is:" +name+" Address is: "+address);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	Write a Student class   that have instance variables name and address.
		//Create a constructor that will initialize those variables.
		//Print name & address of given  student using displayInfo method.
		Student2 st = new Student2();
		st.name="Yama";
		st.address ="123 south mountain view rd";
		st.displayInfo();
		
	}

}
