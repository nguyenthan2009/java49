public class Main {
    public static void main(String[] args) {
       Circle circle = new Circle(3);
        circle.resize(5);
        System.out.println( circle.getArea());
        Square square = new Square(6);
        square.resize(3);
        System.out.println(square.getArea());
        Rectangle rectangle = new Rectangle(3,4);
        rectangle.resize(4);
        System.out.println(rectangle.getArea());
    }
}
