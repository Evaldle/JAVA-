package cn.itcast.day05.demo03;

public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {15,25,35,45,55,66,77};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("==================");

        //可以用for循环进行数组的遍历输出
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
            System.out.println("===================");

            //动态获取数组的长度进行遍历输出
            int num = array.length;
            for (int j = 0; j < num/*直接写array.length也可以*/; j++) {
                System.out.println(array[j]);

            }

        }
    }
}
