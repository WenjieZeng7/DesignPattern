/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-13 0:52
 */
public class HandlerB extends PostHandler {
    @Override
    public void handlerRequest(Post post) {
        String content = post.getContent();
        content = content.replace("推广","**");
        post.setContent(content);
        System.out.println("过滤推广");

        next(post);
    }
}
