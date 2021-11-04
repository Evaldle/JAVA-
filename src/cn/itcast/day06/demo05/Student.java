package cn.itcast.day06.demo05;
/*
一个标准的类通常要拥有下面四个组成部分:
1.所有的成员变量都要使用private关键字修饰
2.为每一个成员变量编写一-对儿Getter/Setter方法
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法
这样标准的类也叫做Java Bean
  */

public class Student {
    private String name;
    private int age;
    //当创建好name（可变）和age（可变）时，可以在Code选项里找到Generate，选择它就可以快捷输入Getter和Setter了。
    //第一个Consteructor选项为创建无参数（什么都不选）和全参数（全选），选择它则会自动创建。
    //快捷键为Alt + Ins

    //无参数
    public Student() {
    }
    //全参数
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getter和Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
