package s9;


public class User {
    private int id;
    private String name;
    private String brod;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brod='" + brod + '\'' +
                '}';
    }

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.brod="";
    }

    public User(int id, String name, String brod) {
        this.id = id;
        this.name = name;
        this.brod = brod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrod() {
        return brod;
    }

    public void setBrod(String brod) {
        this.brod = brod;
    }
}
