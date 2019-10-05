package service;
import entity.Music;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhao
 * @className MusicService
 * @Description TODO
 * @Date 2019/10/5
 * @Version 1.0
 **/
public class MusicService {

    public static List<Music> init(){
        List<Music> musicList=new ArrayList<>(10);
        Music[] musics={
                new Music(1,"music2.jpg","你还怕大雨吗","周柏豪","8"),
                new Music(2,"music3.jpg","够钟","周柏豪","Follow"),
                new Music(3,"music1.jpg","离水的鱼","乔洋","乔试牛刀")
        };
        musicList= Arrays.asList(musics);
        return musicList;
    }
    public static void main(String[] args) {
        List<Music> musicList = MusicService.init();
        for (Music music : musicList) {
            System.out.println(music);
        }
    }
}
