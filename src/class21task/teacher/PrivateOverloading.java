package class21task.teacher;

public class PrivateOverloading {

	private static void factorial(int num) {
		int result=1;
		for(int i=1; i<=num; i++ ) {
			
			 result *= i;
		}System.out.println(result);
		
		
	}
	private static void factorial() {
	int num=4;
		int result=1;
		for(int i=1; i<=num; i++ ) {
			
			 result *= i;
		}System.out.println(result);
		
		
	}
	private static void factorial(double num) {
		
			int result=1;
			for(int i=1; i<=num; i++ ) {
				
				 result *= i;
			}System.out.println(result);
			
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3.	Create 1 class with a private method that has 3 overloaded forms.
		//Then call each overloaded method with specific arguments and observe result.
		factorial(5);
		factorial();
		factorial(3.0);
	}

}
