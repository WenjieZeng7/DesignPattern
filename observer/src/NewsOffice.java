import java.util.ArrayList;
import java.util.List;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 23:45
 */
// 被观察者。
public class NewsOffice {
    private List<Customer> customers = new ArrayList<>(); //被观察者要有所有观察者的信息。

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    // 通知！
    public void notifyAllObservers(){
        for (Customer customer : customers) {
            customer.updata();
        }
    }

    // 触发条件，出了新的报纸
    public void newsPaper(){
        this.notifyAllObservers();
    }
}
