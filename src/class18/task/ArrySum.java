package class18.task;

public class ArrySum {
	
	static int a[] = {2,4,6,1,7};
	
private static int sum(int [] array) {
	int arr_sum=array[0];
	for(int i=1; i<array.length;i++) {
		
		arr_sum+=array[i];
		
	}return arr_sum;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.	Create a method that will accept an array as parameters and will return a sum of all elements from that array.
		 *  Method should be visibly only within same package and accessible by the creating an instance of the class.
		 */
		
		System.out.println(sum(a));
		

	}

}
