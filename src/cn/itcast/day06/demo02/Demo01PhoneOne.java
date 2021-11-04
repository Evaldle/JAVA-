package cn.itcast.day06.demo02;
import cn.itcast.day06.demo02.Phone;
public class Demo01PhoneOne {
    public static void main(String[] args) {
        //根据Phone类，创建一个名 为one的对象
        //格式:类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("===================");

        one.brand = "iQoo";
        one.price = 8848;
        one.color = "白色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("===================");


        one.call("小姐姐");
        one.sendMessage();
    }

}
