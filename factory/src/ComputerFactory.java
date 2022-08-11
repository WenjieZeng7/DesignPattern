/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 22:16
 */
public class ComputerFactory {
    public Computer createComputer(String name){
        Computer computer = null;
        if(name.equals("a")){
            computer = new ComputerA();
        }
        if(name.equals("b")){
            computer = new ComputerB();
        }
        return computer;
    }
}

