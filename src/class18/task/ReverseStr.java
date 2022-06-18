package class18.task;

public class ReverseStr {
	
	
   static StringBuilder str1=new StringBuilder("Congratulation!") ;
   
	public  void reverseSt(StringBuilder str) {
		
		
		System.out.println(str.reverse());
	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2.	Create a method that will take a String as a parameter and returns reversed String.
		 *  Method should be available to all classes within your project and accessible by class name.
		 */
		ReverseStr st = new ReverseStr();
		st.reverseSt(str1);

	}

}
