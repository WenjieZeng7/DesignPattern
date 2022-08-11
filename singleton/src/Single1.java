// 懒汉式，多线程下不满足
public class Single1 {
    private static Single1 instance;

    private Single1(){
        System.out.println("创建了Single对象");
    }

    public static Single1 getInstance(){
        if(instance == null){
            instance = new Single1();
        }
        return instance;
    }
}