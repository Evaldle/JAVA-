package cn.itcast.day05.demo05;

import cn.itcast.day05.demo05.Sun;

public class Demo02SunText {
    public static void main(String[] args) {
        Sun one = new Sun();
        one.color = "红色";
        one.Size = 1392000;
        one.Regular = "东升西落";
        System.out.println(one.color);
        System.out.println(one.Size);
        System.out.println(one.Regular);
        System.out.println("==================");

        one.Me("我");
        one.Text();



    }



}
