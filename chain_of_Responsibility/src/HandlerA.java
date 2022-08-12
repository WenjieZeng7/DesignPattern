/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-13 0:50
 */
public class HandlerA extends PostHandler {
    @Override
    public void handlerRequest(Post post) {
        String content = post.getContent();
        content = content.replace("广告", "**");
        post.setContent(content);
        System.out.println("过滤广告");
        // 将post传给下一个处理器
        next(post);
    }
}
