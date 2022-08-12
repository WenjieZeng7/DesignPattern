import javafx.geometry.Pos;

import java.security.PrivateKey;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-13 0:35
 */
public abstract class PostHandler {
    // 每一个处理器都会包含下一个处理器，这样才能成链。
    // 下一个下一个
    private PostHandler nextHandler;

    public void setNextHandler(PostHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 当前处理器处理完post之后，传给下一个处理器。
    // 这里只是传内容，具体怎么做，还得看下一个处理器怎么重写handlerRequest()方法。
    protected final void next(Post post){
        if(this.nextHandler!= null){
            nextHandler.handlerRequest(post);
        }
    }

    // 每一个处理器中的操作
    public abstract void handlerRequest(Post post);


}
