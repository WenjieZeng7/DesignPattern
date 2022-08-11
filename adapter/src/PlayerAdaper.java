/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-12 0:26
 */
// Adapter，这里使用的是关联模式，被适配者Adaptee放入适配器Adapter中，通过访问Adapter的方法，间接调用Adaptee。
public class PlayerAdaper implements MusicPlayer{
    private MyPlayer player;

    public PlayerAdaper() {
        this.player = new MyPlayer();
    }

    @Override
    public void play(String type, String fileName) {
        if(type.equals("mp3")){
            this.player.playMp3(fileName);
        }
        if(type.equals("wma")){
            this.player.playWma(fileName);
        }
    }
}
