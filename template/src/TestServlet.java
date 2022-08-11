import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-08-12 1:32
 */
public class TestServlet extends MyHttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
        super.doGet(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) {
        super.doPost(req, resp);
    }
}
