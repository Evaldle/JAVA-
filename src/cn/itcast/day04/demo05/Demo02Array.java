package cn.itcast.day04.demo05;

public class Demo02Array {
    //静态数组
    public static void main(String[] args) {
        int[] array = new int[] {10, 20, 30};
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("===============0");


        String[] array1 = new String[] {"Hello","World","JAVA"};
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println("===============1");


        int[] array2 = array;
        array2 = new int[5];
        System.out.println(array2);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);


        System.out.println("===============2");
    }
}
