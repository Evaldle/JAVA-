package cn.itcast.day06.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu2 = new Student("张三",18);
        System.out.println("姓名"+stu2.getName()+", 年龄"+stu2.getAge());

    }
}
