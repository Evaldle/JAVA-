package cn.itcast.day07.demo05;

import java.util.ArrayList;
//[10,20,30]---->{10 @ 20 @ 30}
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("冲击波");
        list.add("非常的");
        list.add("阿斯弗");
        list.add("发VS的");
        list.add("给VS");
        list.add("第三方");
        list.add("过分的");
        System.out.println(list);//[冲击波, 非常的, 阿斯弗, 发VS的, 给VS, 第三方, 过分的]

        printArrayList(list);

        }

    /*
    定义方法的三要素
    返回值类型:只是进行打印而已，没有运算，没有结果;所以用void
    方法名称，printArrayList
    参数列表: ArrayList
            */
    public static void printArrayList(ArrayList<String> list){
        //{10@20@30}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i < list.size()-1) {
                System.out.print(name + "@");
            }else
            System.out.print(name + "}");

            }

            
        }





    }