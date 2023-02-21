package map;


import java.util.*;


public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A",0);
        map.put("B",0);
        map.put("C",0);
        map.put("D",0);

        /*投票解法*/

        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<20;i++){
            System.out.println("开始投票:");
            System.out.println("学生"+i+":::");
            String s= scanner.next();
            switch (s) {
                case "A":
                    map.put("A", map.get("A") + 1);
                    break;
                case "B":
                    map.put("B", map.get("B") + 1);
                    break;
                case "C":
                    map.put("C", map.get("C") + 1);
                    break;
                case "D":
                    map.put("D", map.get("D") + 1);
                    break;
                default:
                    System.out.println("投票错误");
                    i--;
                    break;
            }
            System.out.println(map);
        }
       /* for (int i=0;i<80;i++){
            map.put("D", map.get("D") + 1);
        }*/
        List<Integer> list = new ArrayList<>();
        List<String>  list1=new ArrayList<>();
        map.forEach((k,v)-> {
                    list.add(v);
                    list1.add(k);
           /* Integer max = Collections.max(list);
            if(max.equals(v)){
                        System.out.println("景点"+k+"票数"+v);
                    }
                }*/
                }
        );
        System.out.println(Collections.max(list));
        for (int i=0;i<list.size();i++){
            if (Collections.max(list)==list.get(i)){
                System.out.println("景点"+list1.get(i) +"票数最多，一共"+ list.get(i)+"票！！！");
            }
        }
    }
}
