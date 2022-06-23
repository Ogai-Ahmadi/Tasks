package class21task.teacher;

public class Area {
	void area(double length, double width) {
		System.out.println(length*width);
	}
	void area(double length) {
		System.out.println(length*length);
	}
	void volum(double length, double width,double hight) {
		System.out.println(length*width*hight);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.	Create 1 class in which create a methods that will calculate the area (volume in case of box) of
		//•	Rectangle
		//•	Square
		//•	Box
		Area rectangle = new Area();
		Area square = new Area();
		Area box = new Area();
		
		rectangle.area(3, 4);
		square.area(4);
		box.volum(3, 4, 2);
		
		
		
	
	}

}
