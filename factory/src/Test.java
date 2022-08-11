/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 22:16
 */
public class Test {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer a = factory.createComputer("a");
        Computer b = factory.createComputer("b");
    }
}
