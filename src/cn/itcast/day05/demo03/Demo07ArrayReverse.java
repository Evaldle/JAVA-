package cn.itcast.day05.demo03;
//反转元素
public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] array = {10, 15, 6, 100, 89};


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println("==============");

            //这是一个反转的方法程序
            for (int min = 0, max = array.length - 1; min < max; min++, max--) {
                int temp = array[min];
                array[min] = array[max];
                array[max] = temp;


            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
