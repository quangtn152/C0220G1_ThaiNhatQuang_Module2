package P4_TinhChatOPP.KeThua.ThucHanh;

import P4_TinhChatOPP.Abstract.BaiTap.interfaceResizeable.Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
//        return "A Square with side="
//                + getSide()
//                + ", which is a subclass of "
//                + super.toString();
        return "hinh vuong la:";
    }

    @Override
    public void resize(double percent) {
        System.out.println("Dien tich Hinh vuong truoc khi resize: "+ Math.round(getArea()*100)/100d);
        System.out.println("Dien tich Hinh vuong sau khi resize: "+ Math.round((getArea()+getArea() * percent / 100)*100)/100d);
    }
}
