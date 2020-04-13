package Opp.KeThua.BaiTap;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea()*this.height;
    }
    @Override
    public String toString(){
        return "A Cylinder with radius: " + getRadius()
                + "\n and Height: " + getHeight()
                + "\n has Area is: " + getArea()
                + "\n and Volume is: " + getVolume()
                + "\n and color is : " +getColor();
    }
}
