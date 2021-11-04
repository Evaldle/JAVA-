package cn.itcast.day06.demo02;
import cn.itcast.day06.demo02.Phone;
public class Demo04PhoneParam {

    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 9999;
        one.color = "七彩";
        //因为用中括号隔开了，所以需要用返回值这个参数来进行链接，返回了Phone param这个参数，所以填写one；
        Method(one);

    }

    public static void Method(/*类作为参数也是可以的*/Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);



    }
}
