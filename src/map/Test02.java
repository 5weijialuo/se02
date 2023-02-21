package map;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test02 {
    public static void main(String[] args) {
        Map<User, ArrayList<String>>  userMap = new HashMap<>();
        User user = new User(10001, "go", "北京");
        ArrayList list = new ArrayList();
        list.add("Collections");
        list.add("Collections");
        list.add("Collections");
        list.add("Collections");
        list.add("Collections");
        user.setList(list);
        userMap.put(user, user.list);
        System.out.println(userMap);


    }
}

class User{
    private int id;
    private String name;
    private String address;
    ArrayList<String> list;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", list=" + 0+"---->"+(list.size()-1)+
                '}';
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    public User() {
    }

    public User(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
