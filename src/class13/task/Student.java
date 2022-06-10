package class13.task;
import java.util.*;
public class Student {
void  gitGrade() {
	char grade;
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();
		if(input>90) {
			grade='A';
		}else if(input>80){
			grade='B';
		}else if(input>70){
			grade='C';
		}else if(input>50){
			grade='D';
		}else  {
			grade='F';
			}
		System.out.println(grade);		
}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create  class Student that will have a method getGrade.
		 *  Your method should accept the score of a student and return a grade:
		score > 90 - A
		score >80 - B
		score >70 - C
		score > 50 - D
		anything else - F	*/	
		Student st = new Student();
		st.gitGrade();
		
		
	}

}
