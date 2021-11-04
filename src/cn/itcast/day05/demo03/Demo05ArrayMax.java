package cn.itcast.day05.demo03;
//重要！！！！！！
public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5,15,30,20,10000};

        int max = array[0];//初始值
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){   //判断array[i]是否大于max初始值
                max = array[i];     //成立的话就替换掉初始值
            }

        }
        System.out.println("最大值为："+ max);
    }
}
