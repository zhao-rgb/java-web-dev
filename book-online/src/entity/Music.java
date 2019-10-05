package entity;

/**
 * @author zhao
 * @className music
 * @Description TODO
 * @Date 2019/10/5
 * @Version 1.0
 **/
public class Music {
    private  Integer id;
    private String cover;
    private String music;
    private String author;
    private String  specialedition;
    public Music(Integer id,String cover,String music, String author, String specialedition ) {
        this.id=id;
        this.cover=cover;
        this.music=music;
        this.author = author;
        this.specialedition=specialedition;
    }

    public Music() {
    }

    public Integer getId(){
        return id;
    }
    public  void setId(Integer id){
        this.id=id;
    }
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getSpecialedition(){
        return specialedition;
    }
    public void setSpecialedition(String specialedition){
        this.specialedition=specialedition;
    }


    @Override
    public String toString() {
        return "Music{" +
                "id="+id+
                "cover="+cover+'\''+
                "music=" + music +'\''+
                ", author='" + author + '\'' +
                ", specialedition='" + specialedition + '\'' +
                '}';
    }
}
