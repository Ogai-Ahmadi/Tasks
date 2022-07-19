package class24task;

public interface Shape {
    /*1.	Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
     Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
     Test your code.
     */

    void calculateArea(int r);
    void calculatePerimeter(int a);

}

class Circle implements Shape {

    @Override
    public void calculateArea(int r) {

        System.out.println("The area of the circle is:" + r * r * Math.PI);
    }

    @Override
    public void calculatePerimeter(int a) {

        System.out.println("The Perimeter of the square is:" + a * 4);
    }
}


class Square implements Shape{
    @Override
    public void calculateArea(int r) {

        System.out.println("The area of the circle is:" + r * r * Math.PI);
    }

    @Override
    public void calculatePerimeter(int a) {

        System.out.println("The Perimeter of the square is:" + a * 4);

    }
}

class Test{
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calculateArea(3);
        shape.calculatePerimeter(4);

        Shape shape1 = new Square();
        shape1.calculateArea(5);
        shape1.calculatePerimeter(6);

    }
}

