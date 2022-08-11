/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-12 0:54
 */
// 骨架，这就是模板！
public abstract class Cook {
    public void open(){
        System.out.println("开油烟机");
    }

    public void fire(){
        System.out.println("生火");
    }

    // 这个方法在子类中确认
    public abstract void doCook();

    public void offFire(){
        System.out.println("关火");
    }

    public void close(){
        System.out.println("关油烟机");
    }

    // 算法的骨架，且子类不能修改，所以用final修饰
    public final void cook(){
        this.open();
        this.fire();
        this.doCook();
        this.offFire();
        this.close();
    }
}
