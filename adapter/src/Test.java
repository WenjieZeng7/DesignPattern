/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-12 0:42
 */
public class Test {
    public static void main(String[] args) {
        MusicPlayer playerAdaper = new PlayerAdaper();
        playerAdaper.play("mp3","aaa.mp3"); //使用时用Adapter，而不是Adaptee
        playerAdaper.play("wma","bbb.wma");
    }
}
