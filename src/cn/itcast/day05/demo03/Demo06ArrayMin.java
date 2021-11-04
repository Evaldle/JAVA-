package cn.itcast.day05.demo03;
//重要！！！！！！
public class Demo06ArrayMin {
    public static void main(String[] args) {
        int[] array = {5,15,30,20,10000,35,-20,38,27};

        int min = array[0];//初始值
        for (int i = 1; i < array.length; i++) {
            if(array[i]<min){   //判断array[i]是否小于min初始值
                min = array[i];     //成立的话就替换掉初始值
            }

        }
        System.out.println("最小值为："+ min);
    }
}
