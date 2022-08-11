/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 22:56
 */
// 被装饰者
public class XiaoMing implements Person{

    @Override
    public int cost() {
        return 0;
    }

    @Override
    public void show() {
        System.out.println("还没买衣服");
    }
}
