package class16.task;

public class SyntaxEmployee {
	int empID;
	double salary;
	String CEO = "Sumair";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create a Class called SyntaxEmployee:
			Create three  variables  empID , salary and set the CEO to “Sumair”
			Create two objects of the class SyntaxEmployee
			Set the value of eID, salary for each of the objects
			Print out the eID , salary and  CEO for each of the objects
			*/		

	SyntaxEmployee emp1 = new SyntaxEmployee();
	SyntaxEmployee emp2 = new SyntaxEmployee();
	emp1.empID = 123;
	emp1.salary = 2400;
	emp2.empID = 123;
	emp2.salary = 2400;
	
	System.out.println("Employee ID is: "+ emp1.empID +" Salary is: "+emp1.salary+" CEO is:"+emp1.CEO);
	System.out.println("Employee ID is: "+ emp2.empID +" Salary is: "+emp2.salary+" CEO is:"+emp2.CEO);
	
	
	
	
	}
}
