/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 22:18
 */
// 中介，帮小明找房子信息，小明自己只要到付钱租房一部就好
public class HouseProxy implements House{
    private House house;

    public HouseProxy(House house){
        this.house = house;
    }

    @Override
    public void findHouse() {
        System.out.println("中介代理在找相关信息");  // 其他代码
        house.findHouse(); // 业务代码
    }
}
