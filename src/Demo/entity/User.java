package Demo.entity;

import java.util.Objects;

public class User {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return password == user.password && id == user.id && userName.equals(user.userName) && account.equals(user.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, account, password, id);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", account='" + account + '\'' +
                ", password=" + password +
                ", id=" + id +
                '}';
    }

    /**
     * 将要拥有的字段：名字，账户名，密码， 身份
     *如果是商家，则还需要上架电影，和已下架的电影  \修改电影功能           定义集合装载电影信息
     * 如果是客户的话：需要可订票，退票，电影院的信息
     * 电影的信息是公开的
     *
     */

    private  String userName;
    private  String account;
    private int password;
    private boolean id;


    public boolean isId() {
        return id;
    }

    public void setId(boolean id) {

        this.id = id;
    }

    public User(String userName, String account, int password) {
        this.userName = userName;
        this.account = account;
        this.password = password;
    }

    public User(String userName, String account, int password, boolean id) {
        this.userName = userName;
        this.account = account;
        this.password = password;
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public User() {
    }


}
