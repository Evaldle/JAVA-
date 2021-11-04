package cn.itcast.day05.demo03;
//空指针异常
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
        //补上下一行new之后空指针变为正常，能正常显示了
        array = new int[3];
        System.out.println(array[0]);

    }
}
