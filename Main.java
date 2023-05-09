public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle("Red", false, 3);
        Rectangle r1 = new Rectangle("Blue", false, 4, 3);
        Square s1 = new Square("Black", true, 5);
        Square s2 = new Square(2);
        System.out.println("The area of circle = " + c1.getArea());
        System.out.println("The perimeter of circle = " + c1.getPerimeter());
        System.out.println(c1.toString());
        System.out.println("__________________");
        System.out.println("The area of rectangle = " + r1.getArea());
        System.out.println("The perimeter of rectangle = " + r1.getPerimeter());
        System.out.println(r1.toString());
        System.out.println("__________________");
        System.out.println("The area of Square = " + s1.getArea());
        System.out.println("The perimeter of Square = " + s1.getPerimeter());
        System.out.println(s1.toString());
        System.out.println("__________________");
        System.out.println(s2.toString());


    }
}