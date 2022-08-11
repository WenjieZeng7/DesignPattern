/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 22:15
 */
public class Test4 {
    public static void main(String[] args) {
        // 多线程场景
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                Single4.getInstance();
            }).start();
        }
    }
}
