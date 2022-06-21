package class20task.teacher;

public class Circle extends Shape{
	 
	Circle(float radius){
		super(radius);
	}
	
		double circle_area(float r) {

			return (3.1415)*r*r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle rad = new Circle(6);
		rad.circle_area(3);
		System.out.println(rad.circle_area(3));
	}

}
