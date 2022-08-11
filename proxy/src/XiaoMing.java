/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 22:18
 */
// 被代理类，小明，要租房
public class XiaoMing implements House{
    @Override
    public void findHouse() {
        System.out.println("本人租房");
    }
}
