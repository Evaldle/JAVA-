package cn.itcast.day06.demo02;
import cn.itcast.day06.demo02.Phone;
public class Demo02PhoneTwo {
    public static void main(String[] args) {
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
        System.out.println("~~~~~~~~~~~~~~~~~分隔线~~~~~~~~~~~~~~~~~");

        Phone two = new Phone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("===================");

        two.brand = "小米";
        two.price = 3999;
        two.color = "红色";
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("===================");


        two.call("习大大");
        two.sendMessage();
    }

}
