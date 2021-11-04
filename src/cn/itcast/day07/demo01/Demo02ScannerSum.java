package cn.itcast.day07.demo01;

import java.util.Scanner;

//类名称 对象名 = new 类名称();
public class Demo02ScannerSum {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int a = sc.nextInt();
        int result = a + b;

        System.out.println("结果是："+ result);


    }
}
