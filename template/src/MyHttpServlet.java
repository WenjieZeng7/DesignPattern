import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-12 1:51
 */
public class MyHttpServlet extends MyGenericServlet{
    // 只要对父类MyGenericServlet遗留下来的方法做处理就好了
    // 这里的处理是相当于又套了一些，给子类再去实现
    // 类型转换 + 分发

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        String method = request.getMethod();
        switch (method){
            case "GET":
                doGet(request,response);
                break;
            case "POST":
                doPost(request,response);
                break;
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response){}
    public void doPost(HttpServletRequest request, HttpServletResponse response){}
}
