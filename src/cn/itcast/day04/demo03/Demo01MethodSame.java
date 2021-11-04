package cn.itcast.day04.demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        //这里用打印调用示例
        System.out.println(isSame(10,20));//false
        System.out.println(isSame(20,20));//true

    }
    public static boolean isSame(int a, int b) {
        /*boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }*/
        //boolean same = a == b ? true : false;
//        boolean same = a == b;
//        return same;
        return a == b;
    }
}
