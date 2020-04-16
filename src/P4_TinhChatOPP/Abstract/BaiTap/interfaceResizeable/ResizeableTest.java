package P4_TinhChatOPP.Abstract.BaiTap.interfaceResizeable;

import P4_TinhChatOPP.KeThua.ThucHanh.Circle;
import P4_TinhChatOPP.KeThua.ThucHanh.Rectangle;
import P4_TinhChatOPP.KeThua.ThucHanh.Shape;
import P4_TinhChatOPP.KeThua.ThucHanh.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        double percent = Math.round(Math.random() * 100);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(5);
        System.out.println("Dien tich se tang them " + percent + "%");
        for (Shape shape : shapes) {
           shape.resize(percent);
        }

    }
}
