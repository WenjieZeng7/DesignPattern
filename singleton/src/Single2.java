/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 22:13
 */
// 懒汉式，获取线程方法用synchronized修饰。但是这样加锁会导致性能降低。
public class Single2 {
    private static Single2 instance;

    private Single2(){
        System.out.println("创建了Single对象");
    }

    public static synchronized Single2 getInstance(){
        if(instance == null){
            instance = new Single2();
        }
        return instance;
    }
}