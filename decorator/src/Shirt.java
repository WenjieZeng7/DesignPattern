/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 23:00
 */
// 具体的装饰者
public class Shirt extends ClothesDecorator {

    public Shirt(Person person) { // 注入被装饰对象
        super(person);
    }

    @Override
    public int cost() {
        return person.cost() + 100;
    }

    @Override
    public void show() {
        this.person.show(); // 被装饰者的方法
        System.out.println("买了件衬衫，累计消费" + this.cost());
    }
}
