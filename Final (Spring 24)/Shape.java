package final_solve;
/*write a java programm that includes an abstract class Shape with an abstract method CalculateArea.
Then create two subclass Circle and Rectangle that provide implementations for this method*/

abstract class Shape {
    abstract void CalculateArea();

}
class Circle extends Shape{
    public static void main(String[] args) {
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        c.CalculateArea();
        r.CalculateArea();
    }

    @Override
    void CalculateArea() {
        float radius =5;
        float area= (float) (3.1416*radius*radius);
        System.out.println("Area of the circle is : "+area);
    }
}
class Rectangle extends Shape{

    void CalculateArea() {
        // Assuming 'a' represents both width and height for a square
        float width = 5;
        float length = 10; // To make it a square by default
        float area = width * length;
        System.out.println("Area of the square is: " + area);
    }

}

