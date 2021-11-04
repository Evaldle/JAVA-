package cn.itcast.day05.demo04;
//数组作为方法的返回值
//内部数据和返回值都是同一个地址值，没有变化
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);

        System.out.println("总和是：" + result[0]);
        System.out.println("平均数是：" + result[1]);

    }
    public static int[]  calculate(int a,int b,int c){
        //第一种格式
        int sum = a+b+c;
        int avg = sum/3;
       /* int[] array = new int[2];
        sum = array[0];
        avg = array[1];*/
        //第二种格式
        int[] array = {sum,avg};
        return array;



    }

}
