package cn.itcast.day05.demo04;
//调用循环数组
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};

        printArray(array);
        System.out.println("========AAA=========");
        printArray(array);
        System.out.println("========BBB=========");
        printArray(array);
    }
    public static void printArray(int[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
