package class16.task;

public class Students {
	
	String Name;
	int ID;
	static int numberOfStudents=0;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create a Class called Students
			Create three  variables  Name , ID  and  numberOfStudents
			Create three objects of the Students Class
			Set the value for  studentName , studentID and increment  the numberOfStudents for each object
			Print out  total number of students */
		
Students st1 = new Students();
Students st2 = new Students();
Students st3 = new Students();


st1.Name= "Ahmad";
st1.ID = 123;
st1.numberOfStudents++;

st2.Name= "Mahmood";
st2.ID = 124;
st1.numberOfStudents++;
st3.Name= "Mansoor";
st3.ID = 125;
st1.numberOfStudents++;
//int sum = numberOfStudents;
System.out.println(numberOfStudents);


	}

}
