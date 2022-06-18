package class18.task;

public class Vowel {

static String str1 = "You are smart!";

private void vowel(String str) {
	
	System.out.print(str.replaceAll("[^a,e,i,o,u]","")); 

	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3.	Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
		 *  Method should be available inside the class only where it was declared and executed by calling it is name.
		 * 
		 */
		Vowel v = new Vowel();
		v.vowel(str1);
		

	}

}
