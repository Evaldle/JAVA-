package cn.itcast.day07.demo05;

import cn.itcast.day07.demo05.Student;

/*
题目:
自定义4个学生对象，添加到集合，并遍历。

思路:
1.自定义Student学生类，四个部分
2.创建一个集合，用来存储学生对象，泛型: <Student>
3.根据类，创建4个学生对象。
4.将4个学生对象添加到集合中: add
5.遍历集合: for、size、 get
*/

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("张三",20);
        Student two = new Student("李四",21);
        Student three = new Student("王五",19);
        Student four = new Student("陈六",28);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge());//需要添加.getname才能出结果，否则就是地址值


        }

/*        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("陈六");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("各位同学的名字：" + list.get(i));


        }*/



        /*String[] n = new String[4];
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("陈六");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("学生的名字为：" + list.get(i));

        }
*/
    }

}
