/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 22:18
 */
public class Test {
    public static void main(String[] args) {
        House xiaoMing = new XiaoMing();
        HouseProxy proxy = new HouseProxy(xiaoMing);
        proxy.findHouse();
    }
}
