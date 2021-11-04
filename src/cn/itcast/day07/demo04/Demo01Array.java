package cn.itcast.day07.demo04;
/*
题目:
定义一个数组，用来存储3个Person对象。
*/
public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",20);
        Person three = new Person("马尔扎哈",38);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //Person person = array[1];  可以直接转换，把array[1]放在下方
        System.out.println(array[1]);//地址值，需加上getName()才能转换
        System.out.println(array[1].getName());

    }
}
