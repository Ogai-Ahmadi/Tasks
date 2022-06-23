package class20task.teacher;
import java.math.*;
public class Circle extends Shape{
	 
	Circle(float radius){
		super(radius);
	}
	
		double circle_area(int r) {

			return Math.PI*Math.pow(r,2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle rad = new Circle(6);
		rad.circle_area(3);
		System.out.println(rad.circle_area(3));
	}

}
