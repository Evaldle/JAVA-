package cn.itcast.day06.demo02;
import cn.itcast.day06.demo02.Phone;
public class Demo03PhoneSame {
    public static void main(String[] args) {

        Phone one = new Phone();
        System.out.println(one.brand);//null
        System.out.println(one.price);//0.0
        System.out.println(one.color);//null
        System.out.println("===================");

        one.brand = "iQoo";
        one.price = 8848;
        one.color = "白色";
        System.out.println(one.brand);//iQoo
        System.out.println(one.price);//8848
        System.out.println(one.color);//白色
        System.out.println("===================");


        one.call("小姐姐");//给小姐姐打电话
        one.sendMessage();//群发短信
        System.out.println("~~~~~~~~~~~~~~~~~分隔线~~~~~~~~~~~~~~~~~");

        //将one当中保存的对象地址值赋值给two
        Phone two = one;
        System.out.println(one.brand);//iQoo
        System.out.println(one.price);//8848
        System.out.println(one.color);//白色
        System.out.println("===================");

        two.brand = "小米";
        two.price = 3999;
        two.color = "红色";
        System.out.println(two.brand);//小米
        System.out.println(two.price);//3999.0
        System.out.println(two.color);//红色
        System.out.println("===================");


        two.call("习大大");//给习大大打电话
        two.sendMessage();//群发短信
    }

}
