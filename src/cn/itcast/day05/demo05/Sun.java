package cn.itcast.day05.demo05;

public class Sun {
    //Sun one = new Sun(); 注意，类里面不能写此行
    String color;
    int Size;
    String Regular;

    public void Me(String who){
        System.out.println("乔布斯请" + who + "吃饭");

      //  System.out.println("我们聊的很高兴"); 注意：这个不应该放在这个成员方法里面，应重新建一个成员方法！


    }
    //另一个成员方法
    public void Text(){
        System.out.println("我们聊的很高兴");
    }
}
