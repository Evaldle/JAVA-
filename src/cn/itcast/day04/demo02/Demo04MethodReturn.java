package cn.itcast.day04.demo02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(18,29);
        System.out.println(num);
        System.out.println("===============");
        printSum(18,22);
    }
    public static int getSum(int a ,int b ){
        int result = a + b;
        return result;
    }
    public static void printSum(int a, int b){
        int result = a * b;
        System.out.println("结果是：" + result);
    }
}
