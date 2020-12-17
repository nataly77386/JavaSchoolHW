package HW1_2;

public class Rectangle extends Figure{
    private double width;
    private double height;
    private double area;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        Calculate();
    }

    public double getHeight() {
        return height;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
        Calculate();
    }

    public void setWidth(double width) {
        this.width = width;
        Calculate();
    }

    public void Calculate(){
        area=width*height;
    }

    public double getArea(){
        return area;
    }
}
