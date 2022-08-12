import javafx.geometry.Pos;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-13 0:53
 */
public class Test {
    public static void main(String[] args) {
        PostHandler handlerA = new HandlerA();
        PostHandler handlerB = new HandlerB();
        handlerA.setNextHandler(handlerB); // 这样成链
        Post post = new Post();
        post.setContent("这是一个广告，需要进行推广");
        System.out.println("过滤前："+post.getContent());
        handlerA.handlerRequest(post);
        System.out.println("过滤后: "+post.getContent());
    }
}
