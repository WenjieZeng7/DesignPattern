/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-12 0:02
 */
public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int doOperation(int num1, int num2){
        return operation.doOperation(num1,num2);
    }
}
