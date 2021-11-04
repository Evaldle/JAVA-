package cn.itcast.day05.demo03;
//数组索引越界异常
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array = {15,25,35};
        //            [0][1][2]
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //错误，索引越界异常，并不存在3号元素
        System.out.println(array[3]);
    }
}
