package Opp.KeThua.ThucHanh;

import Opp.Abstract.BaiTap.interfaceResizeable.Resizeable;

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
    public double resize(double percent) {
        return getArea()+getArea() * percent / 100;
    }
}
