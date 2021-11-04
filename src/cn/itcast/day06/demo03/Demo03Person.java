package cn.itcast.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {

        Person me = new Person();
        me.show();

        me.name = "赵勇";
        me.setAge(23);

        //System.out.println(me.getAge()); 此步不会报错，但也不用写
        //me.age = 23; 直接访问private内容，错误写法!
        me.show();

        /*if (me.age > 0){
            me.show();
        }else{
            System.out.println("null");
        }*/
    }
}
