public class Square extends Rectangle{
    public Square() {
        super(1.0,1.0);
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public double getPerimeter() {
        return 4*getSide();
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " +
                super.toString();
    }
}
