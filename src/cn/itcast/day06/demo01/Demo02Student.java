package cn.itcast.day06.demo01;

        /*
        通常情况下，一个类并不能直接使用，需要根据类创建-一个对象， 才能使用。
        1.导包:也就是指出需要使用的类，在什么位置。
        import包名称.类名称;//这是重点
        导包格式：
        import.cn.itcast.day6. demo01.Student;
        对于和当前类属于同一一个包的情况，可以省珞导包语句不写。
注意事项：
如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。

        */


import jdk.swing.interop.SwingInterOpUtils;

public class Demo02Student {
    public static void main(String[] args) {
        //1.导包。
        //我需要使用Student的类，和我自己Demo02Student位于同一个包下，所以省略导包语句不写

        // 2.创建，格式:
        //类名称 对象名= new 类名称();//和数组很像
        //根据Student的类，创建了一个名为stu的对象
        Student stu = new Student();

        /*3.使用，分为两种情况:
        使用成员变量:对象名.成员变量名
        使用成员方法:对象名.成员方法名(参数)
        (也就是，想用谁，就用对象名点儿谁)
*/
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0
        System.out.println("================");

        //改变对象当中的成员变量数值内容
        //将右侧的字符串，赋值交给stu对象当中的name成员变量
        stu.name = "任正非";
        stu.age = 68;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("================");



        //成员方法名
        //使用成员方法:对象名.成员方法名(参数)
        stu.eat();
        stu.sleep();
        stu.study();



    }

}
