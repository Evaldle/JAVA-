package cn.itcast.day05.demo03;
//获取数组的长度，Length为长度的意思
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {1,2,3,5,7,4,9,34,6,78,94,6,87,34,7,4,7,4,7,4,78,5,6,6,5,56};
        //获取数组的长度步骤
        int len = arrayB.length;
        System.out.println("arrayB数组的长度是"+len);

        //还可以这样写
        System.out.println(arrayB.length);

    }
}
