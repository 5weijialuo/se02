package Demo.config;

import Demo.entity.Client;
import Demo.entity.Film;
import Demo.entity.Merchant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilmMethod {

    public  static void buyFilm(Client c,List<Film> list){
        System.out.println("可购票的电影");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入片名,进行购票!");
        for (Film film:list) {
            System.out.println(film);
        }
            String next = scanner.next();
        Stream<Film> filmStream = list.stream().filter(e -> e.getName().startsWith(next));
        List<Film> collect = filmStream.collect(Collectors.toList());
        for (Film film:collect){
            System.out.println(film);
            System.out.println("结果如上,输入1进行确认");
            int i = scanner.nextInt();
            if (i==1){
                System.out.println("买票成功");
            }
        }


    }


/*
* 详情页,通过is属性,将上架和下架的电影进行分别
* */

    public static void particularsPage(Merchant m){
        for (Film f :
                m.getFilm()) {
            System.out.println(f.toString());
            }
        }



    /*
    * 下架电影
    * */

    public static void xJia(Merchant m){
        System.out.println(m.getFilm().toString());
        System.out.println("输入下架的电影名:");
        Scanner scanner1 = new Scanner(System.in);
        for (Film f: m.getFilm()) {
            while (true){
                String next = scanner1.next();
                if (next.equals(f.getName())){
                    f.setIs(false);
                    System.out.println("下架成功!!!");
                    System.out.println(m.getFilm().toString());
                    break;
                }else {
                    System.out.println("检查电影名,下架失败!!!");
                    return;
                }
            }
        }

    }

    /**
     * 改变上映时间的方法
     * */
    public static String chengYin(Merchant m){
        System.out.println("仅支持改变上映时间!");
        /* System.out.println("1->改变上架状态改变上架或者下架状态及");*/
        System.out.println("输入片名,对其上映时间进行改变!");
        Scanner scanner1 = new Scanner(System.in);
        String s = scanner1.next();
        Stream<Film> filmStream = m.getFilm().stream().filter(e -> e.getName().startsWith(s));
        List<Film> collect;
        collect = filmStream.collect(Collectors.toList());
        System.out.println("查询出符合条件的影片,开始进行修改");
        System.out.println(collect);
        System.out.println("输入影片的排名,开始进行修改!!!");
        int i = scanner1.nextInt();
        Film film = collect.get(i);
        System.out.println("输入日期");
        SimpleDateFormat ss=new SimpleDateFormat("yyyy-MM-mm");
        String r = null;
        try {
            r = String.valueOf(ss.parse(scanner1.next()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        film.setDate(r);
        return "成功";
    }


    public static Film sYin(){
        /*
         * 上架电影的操作步骤
         * */
        System.out.println("上架电影:");
        Film film=new Film();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("输入电影名------>");
        film.setName(scanner1.next());
        System.out.println();

        System.out.print("输入主角名------>");
        Scanner s1 = new Scanner(System.in);
        film.setProtagonist(s1.next());
        System.out.println();


        System.out.print("输入上映时间------>(如:2022-02-33)");
        /*对上映电影的日期处理*/
        Scanner s2=new Scanner(System.in);
        SimpleDateFormat ss=new SimpleDateFormat("yyyy-MM-mm");
            try {
                String r = String.valueOf(ss.parse(s2.next()));
                film.setDate(r);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        System.out.println();


        System.out.print("输入票价------>");
        Scanner s3=new Scanner(System.in);
        int i1 = s3.nextInt();
        film.setMoney(i1);
        System.out.println();

        Scanner s4=new Scanner(System.in);
        System.out.println("输入上映影院");
        film.setMovie(s4.next());


        System.out.println("成功");
        System.out.println(film.toString());
        System.out.println("输入-1,停止上架电影!");
        int i = s4.nextInt();
        if (i==-1){
            return null;
        }
        film.setIs(true);
        return film;
    }
}
