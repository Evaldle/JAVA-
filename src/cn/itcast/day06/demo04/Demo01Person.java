package cn.itcast.day06.demo04;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "王健林";
        person.setHello("王思聪");
        //地址值都一样
        System.out.println(person);
    }
}
