package cn.itcast.day04.demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(15,25);
        System.out.println("方法执行了");
        //打印调用
        System.out.println(sum(10,20));
        System.out.println("方法执行了");
        //赋值调用
        int result = sum(18,29);
        result += 100;
        System.out.println(result);

    }
    public static int sum(int a, int b){
        System.out.println("方法执行了");
        int result = a + b;
        return result;
    }
}
