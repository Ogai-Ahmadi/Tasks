package class18.task;

public class ReverseStr2 {

static String st="Congratulations!";
//the following is instructor solution
public static String reverseString(String str) {
	return new StringBuilder(str).reverse().toString();
	
}
	

	
/*public static void reverseSt(String str) {
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
	}
}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ReverseStr2 str1 = new ReverseStr2();
		
		//str1.reverseSt(st);
		
		System.out.println(ReverseStr2.reverseString("Monday"));

	}

}
