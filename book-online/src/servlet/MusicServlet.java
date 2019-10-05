package servlet;

import entity.Music;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author zhao
 * @className MusicServlet
 * @Description TODO
 * @Date 2019/10/5
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/music/*")
public class MusicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestPath = req.getRequestURI().trim();
        int position = requestPath.lastIndexOf("/");
        String id = requestPath.substring(position + 1);
        ServletContext sc = this.getServletContext();
        List<Music> musicList = (List<Music>) sc.getAttribute("musicList");
        for (Music music : musicList) {
            if (Integer.parseInt(id) == music.getId()) {
                req.setAttribute("music", music);
                req.getRequestDispatcher("/music_detail.jsp").forward(req, resp);

            }
        }
    }
}
