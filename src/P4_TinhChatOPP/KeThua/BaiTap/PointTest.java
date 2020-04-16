package P4_TinhChatOPP.KeThua.BaiTap;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(5, 10);
        System.out.println(point);
        MoveablePoint moveablePoint = new MoveablePoint(2, 2, 5, 5);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
        moveablePoint.setSpeed(3, 3);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
