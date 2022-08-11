/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 22:14
 */
public class Test3 {
    public static void main(String[] args) {
        // 多线程场景
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                Single3.getInstance();
            }).start();
        }
    }
}