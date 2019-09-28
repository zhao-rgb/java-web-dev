package listener;

import entity.Book;
import entity.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhao
 * @className ContextLoaderListener
 * @Description TODO
 * @Date 2019/9/28
 * @Version 1.0
 **/
@WebListener
    public class ContextLoaderListener implements ServletContextListener {

        /**
         * @Description 容器初始化方法
         * @param sce
         */
        @Override
        public void contextInitialized(ServletContextEvent sce) {
            System.out.println("容器启动");
            //创建并生成用户数据列表
            List<User> userList = new ArrayList<>(3);
            User[] users = {
                    new User(1, "aaa@qq.com", "698d51a19d8a121ce581499d7b701668", "开到荼蘼", "user1.jpg", "江苏南京", LocalDate.of(2018, 6, 11)),
                    new User(2, "bbb@qq.com", "698d51a19d8a121ce581499d7b701668", "小幸运", "user2.jpg", "浙江杭州", LocalDate.of(2019, 2, 18)),
                    new User(3, "ccc@qq.com", "698d51a19d8a121ce581499d7b701668", "往后余生", "user3.jpg", "湖北武汉", LocalDate.of(2019, 8, 19))
            };
            userList = Arrays.asList(users);

            //创建并生成图书数据列表
            List<Book> bookList = new ArrayList<>(10);
            Book[] books = {
                    new Book(1, "漫长的婚约", "book1.jpg", "[法] 塞巴斯蒂安"),
                    new Book(2, "庸人自扰", "book2.jpg", "[英]戴伦•麦加维"),
                    new Book(3, "绿山墙的安妮", "book3.jpg", "[美]理查德·耶茨"),
                    new Book(4, "敌人与邻居", "book4.jpg", "[英]伊恩·布莱克"),
                    new Book(5, "哀伤纪", "book5.jpg", "钟晓阳"),
                    new Book(6, "漫长的婚约", "book1.jpg", "[法] 塞巴斯蒂安"),
                    new Book(7, "庸人自扰", "book2.jpg", "[英]戴伦•麦加维"),
                    new Book(8, "绿山墙的安妮", "book3.jpg", "[美]理查德·耶茨"),
                    new Book(9, "敌人与邻居", "book4.jpg", "[英]伊恩·布莱克"),
                    new Book(10, "哀伤纪", "book5.jpg", "钟晓阳"),
                    new Book(11, "漫长的婚约", "book1.jpg", "[法] 塞巴斯蒂安"),
                    new Book(12, "庸人自扰", "book2.jpg", "[英]戴伦•麦加维")

            };
            bookList = Arrays.asList(books);

            //获得全局变量
            ServletContext servletContext = sce.getServletContext();
            //设置全局变量属性，将用户和图书列表数据记入，整个应用可以共享
            servletContext.setAttribute("userList", userList);
            servletContext.setAttribute("bookList", bookList);
        }

        /**
         * 销毁方法
         *
         * @param sce
         */
        @Override
        public void contextDestroyed(ServletContextEvent sce) {

        }
    }