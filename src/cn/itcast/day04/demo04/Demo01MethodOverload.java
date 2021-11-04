package cn.itcast.day04.demo04;
/*方法的重载
* 方法重载与下列因素无关：
* 1.参数的个数不同
* 2.参数的类型不同
* 3.参数的多类型顺序不同
*
* 方法重载与下列因素无关：
* 1。与参数的名称无关
* 2.与方法的返回值类型无关*/
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(11,28));
        System.out.println(sum(10,20,30));

    }

    /*
        public static int sumTwo(int a, int b) {

            return a + b;
        }

        public static int sumThree(int a, int b, int c) {

            return a + b + c;

        }

        public static int sumFour(int a, int b, int c, int d) {

            return a + b + c + d;
        }
    */
    public static int sum(int a, int b) {
        System.out.println("有2个参数的方法执行了");

        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println("有3个参数的方法执行了");

        return a + b + c;

    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("有4个参数的方法执行了");

        return a + b + c + d;
    }
}