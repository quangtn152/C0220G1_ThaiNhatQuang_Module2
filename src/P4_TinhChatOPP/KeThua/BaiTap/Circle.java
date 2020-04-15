package P4_TinhChatOPP.KeThua.BaiTap;

public class Circle {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius: " + this.radius
                + " has Area is: " + getArea()
                + " and color is : " + this.color;
    }
}
