package Demo;

import Demo.config.FilmMethod;
import Demo.config.LoginException;
import Demo.entity.Client;
import Demo.entity.Film;
import Demo.entity.Merchant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * 登录主页，对登录流程进行控制
 * register:注册
 * merchant：商家
 * client：用户
 *
 * pri():初始化数据
 * home()：主页，跳转各个页面
 * login()：登录方法，并判断是进行商家页面还是客户页面
 * merchantRegister()：商家注册页面
 * clientRegister():  客户注册页面
 * */

public class Login {
    public static List<Merchant> merchants=new ArrayList<>();//商家信息
    public static List<Client> clients=new ArrayList<>();//客户信息

    public static void main(String[] args) {

        pri(); System.out.println(clients);
        while (true){
            try {
                home();
            } catch (LoginException e) {
                e.printStackTrace();
                System.out.println("请正确选择！！！");
            }
        }



    }
    public static void home() throws LoginException{
        System.out.println("选择功能：");
        System.out.println("1、登录（商家或者用户）");
        System.out.println("2、商家入驻！");
        System.out.println("3、用户注册!");
        System.out.println("选择操作：");
        Scanner scanner=new Scanner(System.in);

            while (true){
                  int i = scanner.nextInt();
                switch (i){
                    case 1:
                        login();
                        return;
                    case 2:
                        merchantRegister();
                        return;
                    case 3:
                        clientRegister();
                        break;
                }

       }
    }

    /**
     * 验证账号密码后，对身份进行验证，以对其进行不同的处理！
     * boolean  = true     商家
     * false        客户
     * */
    /*登录方法*/
    public static void login(){
        while (true){

            System.out.println("输入账号：");
            Scanner scanner = new Scanner(System.in);
            String next = scanner.next();
            System.out.println("输入密码：");
            Scanner s2 = new Scanner(System.in);
            int n2 = scanner.nextInt();


            for (Merchant m : merchants) {
                    if (m.isId()){
                        if (next.equals(m.getAccount())&&n2==m.getPassword()){
                             System.out.println("欢迎------>"+m.getUserName());
                             System.out.println("你是商家，可以进行如下操作");
                             page(m);
                        }
                    }
            }
            for (Client c : clients) {
                if (next.equals(c.getAccount())&&n2==c.getPassword()){
                     System.out.println("欢迎------>"+c.getUserName());
                     System.out.println("你是客户，可以进行如下操作");
                     page(c);
                }
            }
            return;
        }
    }


/**
 * 商家页面
 * */
    public static void page(Merchant m){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("1、展示详情");
            System.out.println("2、上架电影");
            System.out.println("3、下架电影");
            System.out.println("4、修改电影");
            System.out.println("5  退出");
            System.out.print("进行选择-------->");

            int i = scanner.nextInt();
            switch (i){
                case 1:

                    System.out.println("详情页::::--->\n"+m.toString());
                    break;
                case 2:
                    Film film = FilmMethod.sYin();
                    if (film==null){
                        System.out.println("上架失败!");
                    }else {
                        ArrayList<Film> films = new ArrayList<>();
                        films.add(film);
                        films.addAll(m.getFilm());
                        m.setFilm(films);
                    }
                    break;
                case 3:
                    /*这里操作的是商家的数据,对已经上架的电影进行下架*/
                    System.out.println("输入电影名,对电影进行下架");
                    FilmMethod.xJia(m);
                    break;
                case 4:
                    String s = FilmMethod.chengYin(m);
                    System.out.println(s);
                    break;
                case 5:
                    System.out.println("亲爱的"+m.getUserName()+"成功退出系统\n\n\n\n");
                    return;
            }

        }

    }
    /*
    * 客户页面
    * */
    public static void page(Client c){
        Scanner scanner = new Scanner(System.in);
        List<Film> list=new ArrayList<>();
        for (Merchant m : merchants) {
            if (m.getFilm()!=null){
                list.addAll(m.getFilm());
            }
        }

        while (true){
            System.out.println("1展示所有影片信息!");
            System.out.println("2根据电影名对电影进行查询!");
            System.out.println("3评分功能");
            System.out.println("4购票系统");
            System.out.println("5退出系统!");
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    System.out.println("查询成功,结果如下----->");
                    System.out.println(list);
                    break;
                case 2:
                    /*
                      对可能符合条件的影片进行查询，并装载到新的集合中，以进行遍历！
                      */
                    String next = scanner.next();
                    System.out.println("输入想查询的电影名----->");
                    List<Film> list1=new ArrayList<>();
                    for (Film m :
                            list) {
                        System.out.println(m);
                    }
                    Stream<Film> filmStream = list1.stream().filter(e -> e.getName().startsWith(next));
                    List<Film> collect = filmStream.collect(Collectors.toList());
                    System.out.println(collect);
                    break;
                case 3:

                    break;
                    /*买电影票*/
                case 4:
                    FilmMethod.buyFilm(c,list);
                    break;

                case 5:
                    System.out.println("亲爱的"+c.getUserName()+"成功退出系统\n\n\n\n");
                    return;
            }

        }

    }



    /*商家注册方法*/
    public static Object merchantRegister(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("为自己取一个用户名吧");
            String name = scanner.next();
            System.out.println("输入账号--->");
            String next = scanner.next();
            System.out.println("输入密码--->");
            int i = scanner.nextInt();
            System.out.println("确定密码--->");
            int i1=scanner.nextInt();
            if (i1==i){
                Merchant merchant = new Merchant(name, next, i);
                merchants.add(merchant);
                System.out.println("注册成功!!!");
                for (Merchant m : merchants) {
                    if (m.getUserName().equals(next)){
                        page(m);
                    }
                }

                return 0;
            }else {
                System.out.println("注册失败!!!二次校验密码失败!!!\n请重试!输入1,重试,输入2,退出注册");
            }
            int i2 = scanner.nextInt();
            if (i2==1){
                return merchantRegister();
            }else {
                System.exit(0);
            }
        }

    }
    /*客户注册方法*/
    public static void clientRegister(){


    }
    /**
     * 初始化数据
     * */
public  static void pri(){
    Merchant merchant = new Merchant("王建林", "root", 123456,true);
    Merchant merchant2 = new Merchant("马云", "123", 123,true);
    merchants.add(merchant);
    merchants.add(merchant2);
    Client client = new Client("张大麻子","ww",654321,false);
    Client client1=new Client("县长","f432",987654,false);
    clients.add(client);
    clients.add(client1);
    Film film = new Film("乡村爱情", "艾力", "2015-11-11","天空影院",70,true);
    Film film2 = new Film("战锤3", "CA", "2022-2-17","大地影院",300,true);
    ArrayList<Film> films=new ArrayList<>();
    films.add(film);
    films.add(film2);
    merchant.setFilm(films);
}

}
