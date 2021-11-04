package cn.itcast.day07.demo03;

import java.util.Random;

/*获取一个随机的int数字(参数代表了范围，左闭右开区间) : int num = r.nextInt(3)
实际上代表的含义是: [0,3)， 也就是0~2|

*/
public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);
            System.out.println("随机数是：" + num);//范围实际上是0~9的数字


        }
    }
}
