package cn.itcast.day04.demo02;

public class Demo03MethodParam {
    public static void main(String[] args) {
        Method1(10, 20);
        Method2();

    }

    public static void Method1(int a, int b) {
        //有参数
        int result = a * b;
        System.out.println("结果是:" + result);
        System.out.println("============");

    }

    public static void Method2() {
        //无参数
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello,World!" + i);

        }

    }
}
