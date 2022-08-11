/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-12 0:05
 */
public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperation(new OperationAdd()); // 这里就可以在一系列的算法中挑一个。
        System.out.println(calculator.doOperation(2,1));

        calculator.setOperation(new OperationSub());
        System.out.println(calculator.doOperation(2,1));
    }
}
