package Demo.entity;

/**
 * 需要电影名字，主角名称，上映时间，电影院名称,价格,状态,评分
 * */
public class Film {
    private String name;//电影名称
    private String protagonist;//主角
    private String date;//上映时间
    private String movie;//上映的电影院
    private int money;//电影票的价格
    private boolean is;//对电影的状态进行定义
    private String score;


    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public boolean isIs() {
        return is;
    }

    public boolean getIs() {
        return is;
    }

    public String  setIs(boolean is){
        this.is=is;
        return is?"上架":"下架";
    }


    public Film(String name, String protagonist, String date, String movie, int money, boolean is) {
        this.name = name;
        this.protagonist = protagonist;
        this.date = date;
        this.movie = movie;
        this.money = money;
        this.is = is;
    }

    public Film(String name, String protagonist, String date, String movie, int money) {
        this.name = name;
        this.protagonist = protagonist;
        this.date = date;
        this.movie = movie;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    @Override
    public String toString() {
        return "" +
                "\n电影名字='" + name + '\'' +
                ", \t主演='" + protagonist + '\'' +
                ", \t上映时间='" + date + '\'' +
                ", \t播放影院='" + movie + '\'' +
                ", \t票价=" + money+
                "\t状态="+setIs(is)+"\t"+score
                +"\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProtagonist() {
        return protagonist;
    }

    public void setProtagonist(String protagonist) {
        this.protagonist = protagonist;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }



    public Film() {
    }

    public Film(String name, String protagonist, String date) {
        this.name = name;
        this.protagonist = protagonist;
        this.date = date;
    }

    public Film(String name, String protagonist, String date, String movie) {
        this.name = name;
        this.protagonist = protagonist;
        this.date = date;
        this.movie = movie;
    }
}
