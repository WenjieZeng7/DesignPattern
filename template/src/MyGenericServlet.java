import javax.servlet.*;
import java.io.IOException;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-12 1:50
 */
// 在这个类中，处理了除service()方法外的其他方法。
public class MyGenericServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    // 其他方法假设在本类已经处理，只有这个方法留给子类MyHttpServlet处理
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
