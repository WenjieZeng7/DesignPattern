/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-11 23:53
 */
public class Test {
    public static void main(String[] args) {
        NewsOffice newsOffice = new NewsOffice();
        Customer customer1 = new Customer1();
        Customer customer2 = new Customer2();
        newsOffice.addCustomer(customer1);
        newsOffice.addCustomer(customer2);
        newsOffice.newsPaper();
    }
}
