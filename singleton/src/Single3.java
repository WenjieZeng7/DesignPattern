/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 22:14
 */
// 饿汉式。
public class Single3 {
    private static Single3 instance = new Single3();

    private Single3(){
        System.out.println("创建了Single对象");
    }

    public static synchronized Single3 getInstance(){
        return instance;
    }
}
