package P0_demo;

public class MyClass {
//    static public int X = 2;
//
//    static {
//        X = 1;
//    }
//
//    static public void method() {
//        X = 5;
//    }
//
//    public static void main(String[] args) {
//        MyClass o = new MyClass();
//        MyClass.method();
//        MyClass.X = 10;
//        System.out.printf("x=%d, y=%d", o.X, MyClass.X);
//    }

//static public int X = 2;
//
//    public static void main(String[] args) {
//        MyClass o1 = new MyClass();
//        MyClass o2 = new MyClass();
//        o2.X = 5;
//        System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, MyClass.X);
//    }
//Q4
//void method(int x, int y) {
//    x = 5;
//    y = 5;
//    System.out.println(x+" "+y);
//}
//    public static void main(String[] args) {
//        MyClass o = new MyClass();
//        int x = 1, y = 1;
//        o.method(x, y);
//        System.out.printf("x=%d, y=%d", x, y);
//    }
//Q5
void method(int[] x) {
    x[0] = 5;
    x[1] = 5;
    System.out.printf("x=%d, y=%d",x[0], x[1]);
}

    public static void main(String[] args) {
        MyClass o = new MyClass();
        int[] x = {1, 1};
        o.method(x);
        System.out.printf("x=%d, y=%d", x[0], x[1]);
    }
}