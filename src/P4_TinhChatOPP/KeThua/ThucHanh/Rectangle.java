package P4_TinhChatOPP.KeThua.ThucHanh;

import P4_TinhChatOPP.Abstract.BaiTap.interfaceResizeable.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
//        return "A Rectangle with width="
//                + getWidth()
//                + " and length="
//                + getLength()
//                + ", which is a subclass of "
//                + super.toString();
        return "hinh chu nhat la:";
    }

    @Override
    public void resize(double percent) {
        System.out.println("Dien tich Hinh chu nhat truoc khi resize: "+ Math.round(getArea()*100)/100d);
        System.out.println("Dien tich Hinh chu nhat sau khi resize: "+ Math.round((getArea()+getArea() * percent / 100)*100)/100d);
    }
}
