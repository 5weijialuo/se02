package Demo.entity;


public class Client extends User{
        private int score;//评分
        private int purchase;//购买的电影票的信息

    public Client() {
    }

    @Override
    public String toString() {
        return super.toString()+"Client{" +
                "score=" + score +
                ", purchase=" + purchase +
                '}';
    }

    public Client(String userName, String account, boolean id, int password, int score, int purchase) {
        super(userName, account, password,id);
        this.score = score;
        this.purchase = purchase;
    }

    public Client(String userName, String account, int password, boolean id, int score, int purchase) {
        super(userName, account, password, id);
        this.score = score;
        this.purchase = purchase;
    }

    public Client(int score, int purchase) {
        this.score = score;
        this.purchase = purchase;
    }

    public Client(String userName, String account, int password) {
        super(userName, account, password);
    }
    public Client(String userName, String account, int password,boolean id) {
        super(userName, account, password,id);
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPurchase() {
        return purchase;
    }

    public void setPurchase(int purchase) {
        this.purchase = purchase;
    }
}
