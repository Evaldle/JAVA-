package cn.itcast.day06.demo01;
/*
定义一个类，用来模拟“学生”事物，其中就有两个组成部分

属性（是什么）：
      姓名
      年龄
行为（能做什么）：
      吃饭
      睡觉
      学习

对应到JAVA的类当中：

成员变量（属性）：
    String name;//姓名
    int age;//年龄
成员方法（行为）：
//成员方法当中没有static，谨记！

    public void eat(){}//吃饭
    public void sleep(){}//睡觉
    public void study(){}//学习
*/

public class Student {
    //成员变量
    String name /*= "任正非"*/;
    int age /*= 60*/;

    //成员方法
    public void eat(){
        System.out.println("吃饭饭！");

    }
    public void sleep(){
        System.out.println("睡觉觉！");

    }
    public void study(){
        System.out.println("学习！");
    }


}
