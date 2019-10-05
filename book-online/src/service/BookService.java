package service;

import entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhao
 * @className BookService
 * @Description TODO
 * @Date 2019/9/28
 * @Version 1.0
 **/
public class BookService {

    public static List<Book> init() {
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
        return bookList;
    }

    public static void main(String[] args) {
        List<Book> bookList = BookService.init();
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
