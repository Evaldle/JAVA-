package cn.itcast.day04.demo05;
/*
* 二进制：01
* 十进制：0123456789
* 十六进制：0123456789abcdef
* */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        int[] array = {10,20,30};

        System.out.println(array);

        System.out.println(array[0]);//10
        System.out.println(array[1]);//20
        System.out.println(array[2]);//30
        System.out.println("==============");

        //对数组进行赋值
        int num = array[1];
        System.out.println(num);

        System.out.println("==================");

        int[] array1 = new int[5];
        System.out.println(array1);

        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);
        System.out.println("===================");

        //重点，容易记错这个步骤！
        array1[2] = 863;
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);



    }


}
