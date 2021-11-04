package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");

        //遍历集合

        //一般for循环会这样写，而现在没有array这个数组，要想获取长度需把array.length改为ArrayList里的list.size()
//        for(int i = 0; i < array.length; i++){
//            System.out.println(array[i]/*可以改为list.get(i)*/);

            //所以可以写为
            for (int i = 0 ; i < list.size();i++){
                System.out.println(list.get(i));

                //for循环可以快捷打出来，list.fori就行了。
            }
        }

    }

