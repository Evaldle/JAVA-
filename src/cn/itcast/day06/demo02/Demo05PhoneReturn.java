package cn.itcast.day06.demo02;
//import cn.itcast.day06.demo02.Phone;
public class Demo05PhoneReturn {
    public static void main(String[] args) {

        //打印调用
        System.out.println("=======打印调用=======");
        System.out.println(getPhone().brand);
        System.out.println(getPhone().price);
        System.out.println(getPhone().color);
        System.out.println();

        System.out.println("=======赋值调用=======");
        //赋值调用
        Phone two = getPhone();
        System.out.println(getPhone().brand);
        System.out.println(getPhone().price);
        System.out.println(getPhone().color);

    }
    public static Phone getPhone(){
    Phone one = new Phone();
    one.brand = "苹果";
    one.price = 8388;
    one.color = "蓝色";

    return one;
}
}