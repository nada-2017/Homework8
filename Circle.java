public class Circle extends Shape{
    private double radius;
    private final double pi = 3.14;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled,double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area = pi*Math.sqrt(radius);
        return Math.round(area*100.0)/100.0;
    }
    public double getPerimeter(){
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " +  radius + ", which is a subclass of " + super.toString();
    }
}
