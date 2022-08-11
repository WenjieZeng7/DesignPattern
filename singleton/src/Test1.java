/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 22:13
 */
public class Test1 {
    public static void main(String[] args) {
        // 单线程下只会创建一个
//        for (int i = 0; i < 5; i++) {
//            Single.getInstance();
//        }

        // 多线程场景，不再只会创建一个
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                Single1.getInstance();
            }).start();
        }
    }
}