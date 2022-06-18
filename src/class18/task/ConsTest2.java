package class18.task;

public class ConsTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this constructor is private and show error when used in different class, but in same package
		ConsTest1 obj1 = new ConsTest1(4600.0);
		
		//This constructor is defined Public, so it is visible in the other class of the same package
		ConsTest1 obj2 = new ConsTest1("Hosai", 123);
		
		//this constructor is defined Protected, it is visible in the same package and different class
		
		//This constructor doesn't have any access level which means it has default access level, so it is visible,
		// in the same package and different class
		ConsTest1 obj3 = new ConsTest1("Manager");ConsTest1 obj4 = new ConsTest1();
		obj4.id=123;
		obj4.name="Aimal";
		System.out.println(obj4.name+" "+" "+obj4.id);
		
		
	}

}
