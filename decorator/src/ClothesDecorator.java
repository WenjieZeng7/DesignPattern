/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 22:58
 */
// 装饰者的抽象父类，装饰者和被装饰者要实现同一个接口。
public abstract class ClothesDecorator implements Person{
    protected Person person; // 被装饰者

    public ClothesDecorator(Person person){
        this.person = person;
    }
}
