import java.util.Iterator;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-15 11:24
 */
public class Test {
    public static void main(String[] args) {
        Item item1 = new Item("猪肉串",2);
        Item item2 = new Item("牛肉串",3);

        BBQMenu bbqMenu = new BBQMenu();
        bbqMenu.addItem(item1);
        bbqMenu.addItem(item2);

        Iterator iterator = bbqMenu.createIterator();
        while (iterator.hasNext()){
            Item item = (Item) iterator.next();
            System.out.println(item);
        }
    }
}
