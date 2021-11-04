package cn.itcast.day05.demo01;

public class Demo01ArrayOne {
    public static void main(String[] args) {
        int[] arrayA = new int[5];

        System.out.println(arrayA);
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//0
        System.out.println(arrayA[2]);//0
        System.out.println(arrayA[3]);//0
        System.out.println(arrayA[4]);//0
        System.out.println("=================");

        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//10
        System.out.println(arrayA[2]);//20
        System.out.println(arrayA[3]);//0
        System.out.println(arrayA[4]);//0
        System.out.println("=================分割");

        //此步骤是重点
        int[] arrayB = arrayA;
        System.out.println(arrayB);
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//10
        System.out.println(arrayB[2]);//20
        System.out.println("================");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);//100
        System.out.println(arrayB[2]);//200
        System.out.println("================下面为arrayA");

        //再写一遍arrayA数值也不会变
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//100
        System.out.println(arrayA[2]);//200

    }
}
