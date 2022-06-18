package class18.task;


public class ConsTest1 {
	int id;
	String name;
	double salary;

	public ConsTest1(String name, int id){
		this.id= id;
		this.name=name;

}
	private ConsTest1(Double salary){
		this.id = 0;
		this.name="Ali";
		this.salary=salary;
		}
	//If the parameter of the following constructor is omitted, it shows error of duplicate method ConsTest1
	protected ConsTest1(String title){

		}
	//Adding DEFAULT access level produce error
	 ConsTest1(){
		this.id=id;
		this.salary=salary;

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*1.	Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
	 *  and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
	 *   3 - from different class inside different package  and observe result.
	 */
		//All four constructors having different access levels are visible in the same class
		ConsTest1 obj1 = new ConsTest1("Manager");
		ConsTest1 obj2 = new ConsTest1(34000.0);
		ConsTest1 obj3 = new ConsTest1("Yama",234);
		ConsTest1 obj4 = new ConsTest1();
		obj4.id=123;
		obj4.name="Aimal";
		System.out.println(obj4.name+" "+" "+obj4.id);
		

		
				
	}
}
