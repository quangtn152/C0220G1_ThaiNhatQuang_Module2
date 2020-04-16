package P4_TinhChatOPP.KeThua.ThucHanh;

import P4_TinhChatOPP.Abstract.BaiTap.interfaceResizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String name() {
        return "hinh tron";

    }

    @Override
    public String toString() {
//        return "A Circle with radius="
//                + getRadius()
//                + ",Which is a subclass of"
//                + super.toString();
        return "hinh tron la:";
    }



    @Override
    public void resize(double percent) {
        System.out.println("Dien tich Hinh tron truoc khi resize: "+ Math.round(getArea()*100)/100d);
        System.out.println("Dien tich Hinh tron sau khi resize: "+ Math.round((getArea()+getArea() * percent / 100)*100)/100d);
    }
}
