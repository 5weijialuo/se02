package s9;

import java.util.*;

public class Demo1 {
    static String[] bord;
    static ArrayList<User> player=new ArrayList<>();
    static{
    /*对牌进行初始化*/
        String[] strings={"3","4","5","6","7","8","9","10","J","Q","K","2","A"};
        String[] color={"♣","♠","□","♥"};
        bord=new String[54];
        int c=0;
        for (String s : color) {
            for (String string : strings) {
                bord[c] = string + s;
                c++;
            }
        }
        bord[bord.length-1]="大鬼";
        bord[bord.length-2]="小鬼";
     }



    public static void main(String[] args) {
        List<User> deal = deal();
        for (User u :
                deal) {
            System.out.println(u);
        }

    }



    /*洗牌方法*/
    public static ArrayList<Integer> pri(){
        /*将牌打乱顺序*/
        ArrayList<Integer> list=new ArrayList<>();
        Random random = new Random();
        while (true){
            int i = random.nextInt(54);
            if (list.size()==54){
                return list;
            }
            if (!list.contains(i)){
                list.add(i);
            }
        }
    }


    /*发牌*/
    public static List<User> deal(){
        ArrayList<Integer> pri = pri();
        int[] tom = new int[54];
        int dt=0;
        for (Integer integer:
             pri) {
            tom[dt]= integer;
            dt++;
        }
      /*  for (int d :
                tom) {
            System.out.print(d+"\t");
        }
        System.out.println();*/

        User diZ = new User(1, "地主","");
        User peaOne = new User(2, "农民1","");
        User peaTwo = new User(3, "农民2","");
        player.add(diZ);
        player.add(peaOne);
        player.add(peaTwo);
        int temp=0;
        String s=" ,";

        for (int i = 0; i < tom.length; i++) {
            /*保留给地主的最后三张牌*/
            if (i==tom.length-3){
             /*   System.out.println("是否保留地主牌！");*/
                int d=bord.length-3;
                diZ.setBrod(diZ.getBrod()+bord[tom[d]]+" ,");
                diZ.setBrod(diZ.getBrod()+bord[tom[++d]]+" ,");
                diZ.setBrod(diZ.getBrod()+bord[tom[++d]]);
             }
            /*为三位玩家进行随机分配牌*/
            int i1 = tom[i];
            String dz = player.get(temp).getBrod();
                  player.get(temp).setBrod(bord[i1]+s+dz);
            String p1=player.get(++temp).getBrod();
            int i2=tom[++i];
                   player.get(temp).setBrod(bord[i2]+s+p1);
            String p2=player.get(++temp).getBrod();
            int i3=tom[++i];
                    player.get(temp).setBrod(bord[i3]+s+p2);
            temp=0;
        }

        return player;
    }



    /*牌排序*/
    public static String[] sort(){

        return null;
    }
    /*玩牌规则*/
/*暂无*/
}
