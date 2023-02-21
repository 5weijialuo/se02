package stearmTest;

import java.util.*;

public class Demo {
    public  static double money=0;
    public static double moneyTwo=0;
    public static double ZMoney=0;
    public static void main(String[] args) {
        List<Staff> list1 = new ArrayList<>();
        List<Staff> list2 = new ArrayList<>();

        Staff staff = new Staff("赵公明", true, 110000, 2000, "");
        Staff staff1 = new Staff("李元刚", false, 8000, 1000, "");
        Staff staff2 = new Staff("呢咋", true, 3000, 500, "");
        Staff staff3 = new Staff("拿抓", true, 10000, 2000, "-100");
        Staff staff4 = new Staff("姜子呀", true,96000, 2000, "-50");

        list1.add(staff);
        list1.add(staff1);
        list1.add(staff2);
        list1.add(staff3);
        list1.add(staff4);

        Staff dom = new Staff("dom", true, 5000, 2000, "");
        Staff d1 = new Staff("joPan", true, 6000, 2000, "-50");
        Staff d2 = new Staff("si", true, 7800, 2000, "-50");
        Staff d3 = new Staff("jerry", true, 6000, 2000, "-");

        list2.add(dom);
        list2.add(d1);
        list2.add(d2);
        list2.add(d3);

        /*最高工资*/
        System.out.println("一部优秀员工：----------->>>");
        Staff s5 = list1.stream().max(Comparator.comparingDouble(o -> o.getSalary() + o.getBonus())).get();
        Staff s6 = list2.stream().max(Comparator.comparingInt(o -> o.getSalary() + o.getBonus())).get();
        System.out.println(s5);
        System.out.println("二部优秀员工：----------->>>");
        System.out.println(s6);

/*统计两个部门的平均工资，去掉最高和最低工资*/
/*最低工资*/
        Staff e1 = list1.stream().min(Comparator.comparingInt(o -> o.getSalary() + o.getBonus())).get();
        Staff e2 = list2.stream().min(Comparator.comparingInt(o -> o.getSalary() + o.getBonus())).get();


        System.out.println("-----------------------");
       list1.stream().sorted(Comparator.comparingDouble(o -> o.getSalary() + o.getBonus())).skip(1).limit(list1.size()-2).forEach(e->{
                   money+=e.getBonus()+e.getSalary();
    } );
        System.out.println(money/(list1.size()-2)+"一部平均工资为");

        list2.stream().sorted(Comparator.comparingDouble(o->o.getBonus()+o.getSalary())).skip(1).limit(list2.size()-2).forEach(e->{
            moneyTwo+=e.getBonus()+e.getSalary();
        });
        System.out.println("二部平均工资为："+moneyTwo/(list2.size()-2));

        List<Staff> l3=new ArrayList<>();
        l3.addAll(list1);
        l3.addAll(list2);
        /*求两部平均工资*/
        l3.stream().sorted(Comparator.comparingDouble(o-> o.getSalary()+o.getBonus())).skip(1).limit(l3.size()-2).forEach(e->{
            ZMoney+=e.getBonus()+e.getSalary();
                });
        System.out.println(ZMoney/(l3.size()-2)+"两部平均工资！！！");

      //  list2.stream().sorted(Comparator.comparingDouble(o->o.getSalary()+o.getBonus())).skip(1).limit()


    }




}
class Staff{
    private String name;
    private boolean sex;
    private Integer salary;
    private Integer bonus;
    private String address;



    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Staff() {
    }




    public Staff(String name, boolean sex, int salary, int bonus, String address) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.bonus = bonus;
        this.address = address;
    }


}
