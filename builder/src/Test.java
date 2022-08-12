/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-13 2:18
 */
// 使用builder generator插件,但是这个不是很好用，还有一些要自己改。
public class Test {
    public static void main(String[] args) {
        House house = new House.HouseBuilder().setWall(new Wall()).build();
        System.out.println(house);
    }
}
