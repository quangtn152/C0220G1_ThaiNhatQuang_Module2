package Opp.Abstract.BaiTap.interfaceResizeable;

import Opp.KeThua.ThucHanh.Circle;
import Opp.KeThua.ThucHanh.Rectangle;
import Opp.KeThua.ThucHanh.Square;

public class interfaceResizeable {
    public static void main(String[] args) {
        double percent = Math.round(Math.random() * 100);
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(5);
        System.out.println("Before resize:");
        for (Resizeable resizeable : shapes) {
            System.out.println("dien tich " + resizeable.toString() + Math.round(resizeable.resize(0)*100)/100d);
        }
        System.out.println("Dien tich se tang them " + percent + "%");
        System.out.println("After resize:");
        for (Resizeable resizeable : shapes) {
            System.out.println("dien tich " + resizeable.toString() + Math.round(resizeable.resize(percent)*100)/100d);
        }
//        Resizeable resizeable1 = (Circle) circle;
//        Resizeable resizeable2 = (Rectangle) rectangle;
//        Resizeable resizeable3 = (Square) square;
//        System.out.println("Before resize:");
//        System.out.println("Dien tich hinh tron: " + circle.getArea());
//        System.out.println("Dien tich chu nhat : " + rectangle.getArea());
//        System.out.println("Dien tich hinh vuong: " + square.getArea());
//        System.out.println("After resize:");
//        Resizeable resizeable2 = (Rectangle) rectangle;
//        Resizeable resizeable3 = (Square) square;
//        System.out.println("Dien tich hinh tron: " + ((Resizeable)circle).resize(10));
//        System.out.println("Dien tich chu nhat: " + resizeable2.resize(10));
//        System.out.println("Dien tich hinh vuong: " + resizeable3.resize(10));
    }
}
