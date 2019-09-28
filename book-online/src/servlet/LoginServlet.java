package servlet;

import entity.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author zhao
 * @className LoginServlet
 * @Description TODO
 * @Date 2019/9/28
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        //创建UserService实例，传递账号和密码参数，调用登录功能
        UserService userService = new UserService();
        User user = userService.signIn(account, password);
        if (user != null) {
            //登录成功，将用户对象记入session
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            //重定向到/index，进入IndexController
            resp.sendRedirect("/index");
        } else {
            //登录失败，设置好响应对象字符集和响应类型
            resp.setContentType("text/html;charset=UTF-8");
            resp.setCharacterEncoding("UTF-8");
            //获得response对象的字符输出流
            PrintWriter out = resp.getWriter();
            //输出js脚本，弹出登录失败的信息
            out.print("<script>alert('账号或密码错误');location.href='/';</script>");
        }
    }
}
