package cn.itcast.day06.demo03;
import cn.itcast.day06.demo03.Student;
public class Demo04Student {
    public static void main(String[] args) {


        Student stu = new Student();
        stu.setName("鹿晗");
        stu.setAge(18);
        stu.setMale(false);

        System.out.println("姓名："+stu.getName());
        System.out.println("年龄："+stu.getAge());
        System.out.println("是不是男人："+stu.isMale());

    }
}