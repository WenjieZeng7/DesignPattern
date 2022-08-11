/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 22:14
 */
//懒汉式。双重检测，volatile。
public class Single4 {
    private static  Single4 instance;

    private Single4(){
        System.out.println("创建了Single对象");
    }

    public static Single4 getInstance(){
        if(instance == null){ //第一次检查instance不为null，那就不需要执行下面的加锁和初始化操作。可以大幅降低synchronized带来的性能开销。
            synchronized (Single4.class){
                if(instance == null){  //为什么这里还要检查一次呢？！
                    instance = new Single4();
                    /**
                     * instance不加volatile，这里就有问题！
                     * 因为这行代码其实可以分解成3个步骤：
                     *  memory=allocate();        //1:分配对象的内存空间
                     *  ctorInstance(memory);     //2:初始化对象
                     *  instance = memory;        //3:设置instance指向刚分配的内存地址
                     * 其中23步可能会发生重排！
                     * 这就导致线程A虽然读取到instance不为null，但可能是因为重排问题，instance引用的对象只完成了13步，却还没有完成初始化。
                     * 这是线程B访问instance所引用的对象，但此时这个对象可能还没有被A线程初始化！这就有问题！
                     * 这个问题并不是说会产生非单例，而是说线程B拿到的对象不对。
                     *
                     * 解决这个问题，就需要使用volatile修饰instance
                     */

                }
            }
        }
        return instance;
    }
}
