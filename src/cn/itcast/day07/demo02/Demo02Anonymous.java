package cn.itcast.day07.demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println("输入的是：" + num);

        //匿名对象的方式
//        int num =/*前面可以赋值*/new Scanner(System.in)/*还没完*/.nextInt();//这种方法只能用一次
//        System.out.println("输入的是：" + num);

        //使用一般写法传入参数(重点)
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);
        //使用匿名对象来传入参数
//        methodParam(new Scanner(System.in));
//        把methodParam匿名参数传入到吗下面的methodParam参数中
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);

    }
    public static void methodParam(Scanner sc){
//        int num = sc.nextInt();
//        System.out.println("输入的是：" + num);

    }
    public static Scanner methodReturn(){
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
