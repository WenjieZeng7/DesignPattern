import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-15 11:21
 */
public class BBQMenu {
    private List<Item> menu = new ArrayList<>();

    public void addItem(Item item){
        menu.add(item);
    }

    public Iterator createIterator(){
        return menu.iterator();
    }
}
