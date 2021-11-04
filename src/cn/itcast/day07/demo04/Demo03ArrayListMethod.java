package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
Arraylist当中的常用方法有:
public boolean add(E e): 向集合当中添加元素，参数的类型和泛型-致。 返回值代表添加是否成功。
备注:对于ArrayList集合来说， add添加动作一定是 成功的，所以返回值可用可不用。
但是对于其他集合(今后学习)来说，add添加动作不一定成功。

public I get(int index): 从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。

public E remove(int index): 从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。

public int size(): 获取集合的尺寸长度，返回值是集合中包含的元素个数。
*/
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();


        boolean success = list.add("高圆圆");
        System.out.println(list);
        System.out.println("添加的动作是否成功:"+ success);

        list.add("赵又廷");
        list.add("周杰伦");
        list.add("胡歌");
        list.add("李小璐");
        System.out.println(list);

        // 从集合中获取元素: get。索引值从0开始
        String name = list.get(2);
        System.out.println("第二号索引位置：" + name);//周杰伦

        //从集合中删除元素: remove。 索引值从开始。
        //有返回值，按Alt+回车进行自动填写
        String whoRemove = list.remove(4);
        System.out.println("被删除的人是：" + whoRemove);//李小璐
        System.out.println(list);

        //获取集合的长度尺寸，也就是其中元素的个数!!!
        int size/* <-返回值（可变）*/ = list.size();
        System.out.println("集合的长度是：" + size);


    }

}
