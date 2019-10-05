package listener;
import entity.Book;
import entity.Music;
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
                    new User(1, "aaa@qq.com", "698d51a19d8a121ce581499d7b701668", "撒野", "user1.jpg", "江苏无锡", LocalDate.of(2017, 2, 19)),
                    new User(2, "bbb@qq.com", "698d51a19d8a121ce581499d7b701668", "啦", "user2.jpg", "贵州贵阳", LocalDate.of(2018, 3, 18)),
                    new User(3, "ccc@qq.com", "698d51a19d8a121ce581499d7b701668", "我会发光", "user3.jpg", "湖北武汉", LocalDate.of(2019, 8, 19))
            };
            userList = Arrays.asList(users);

            //创建并生成图书数据列表
            List<Book> bookList = new ArrayList<>(10);
            Book[] books = {
                    new Book(1, "沉睡者", "book7.jpg", "[法] 塞巴斯蒂安"),
                    new Book(2, "杜尚", "book8.jpg", "[英]戴伦•麦加维"),
                    new Book(3, "中央帝国的军事密码", "book10.jpg", "[美]理查德·耶茨"),
                    new Book(4, "下町火箭", "book9.jpg", "[英]伊恩·布莱克"),
                    new Book(5, "当孩子遇见书", "book12.jpg", "钟晓阳"),
                    new Book(6, "沉睡者", "book7.jpg", "[法] 塞巴斯蒂安"),
                    new Book(7, "下町火箭", "book9.jpg", "[英]戴伦•麦加维"),
                    new Book(8, "乡野闲人", "book11.jpg", "[美]理查德·耶茨"),
                    new Book(9, "敌人与邻居", "book4.jpg", "[英]伊恩·布莱克"),
                    new Book(10, "哀伤纪", "book5.jpg", "钟晓阳"),
                    new Book(11, "漫长的婚约", "book1.jpg", "[法] 塞巴斯蒂安"),
                    new Book(12, "庸人自扰", "book2.jpg", "[英]戴伦•麦加维")

            };
            bookList = Arrays.asList(books);

            List<Music> musicList=new ArrayList<>(10);
            Music[] musics={
                    new Music(1,"music2.jpg","你还怕大雨吗","周柏豪","8"),
                    new Music(2,"music3.jpg","够钟","周柏豪","Follow"),
                    new Music(3,"music1.jpg","离水的鱼","乔洋","乔试牛刀")
            };
            musicList=Arrays.asList(musics);

            //获得全局变量
            ServletContext servletContext = sce.getServletContext();
            //设置全局变量属性，将用户和图书列表数据记入，整个应用可以共享
            servletContext.setAttribute("userList", userList);
            servletContext.setAttribute("bookList", bookList);
            servletContext.setAttribute("musicList",musicList);
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