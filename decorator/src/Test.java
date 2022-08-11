/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 23:08
 */
public class Test {
    public static void main(String[] args) {
        Person xiaoMing = new XiaoMing();
        xiaoMing = new Shirt(xiaoMing); // 被装饰者要传入到装饰器中，之后又传回给被装饰者
        xiaoMing = new Trousers(xiaoMing);
        xiaoMing.show();
    }
}
