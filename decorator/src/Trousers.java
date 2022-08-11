/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 23:06
 */
public class Trousers extends ClothesDecorator {
    public Trousers(Person person) {
        super(person);
    }

    @Override
    public int cost() {
        return this.person.cost() + 120;
    }

    @Override
    public void show() {
        this.person.show();
        System.out.println("买了裤子，累计消费" + this.cost());
    }
}
