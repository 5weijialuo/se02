package s4;
/*懒汉单例模式*/
public class Simp2 {
    private static Simp2 simp2;
    private Simp2(){

    }
    public static Simp2 getSimp2(){
        if (simp2==null){
             simp2 = new Simp2();
        }
        return simp2;
    }
}
