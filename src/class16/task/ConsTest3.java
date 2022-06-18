package class16.task;

import class18.task.ConsTest1;

public class ConsTest3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this constructor is private and shows ERROR when used in different class, but in different package
	ConsTest1 obj1 = new ConsTest1(67000.0);
	
	//This constructor is defined Public, so it is visible in the other class of the different package
	ConsTest1 obj2 = new ConsTest1("Hosai", 123);
	
	//This constructor is defined Protected, it is not visible in the class of different package
	ConsTest1 obj3 = new ConsTest1("Manager");
	
	//This constructor doesn't have any access level which means it has default access level, so it is visible,
			// in the different package and different class
			obj4 = new ConsTest1();
			obj4.id=123;
			obj4.name="Aimal";
			System.out.println(obj4.name+" "+" "+obj4.id);
	
	
}

}