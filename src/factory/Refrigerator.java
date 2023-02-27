package factory;

/*冰箱*/
public interface Refrigerator {
    void pri(String name);
}

class HaiErRefrigerator implements Refrigerator{
    public void pri(String name){
        System.out.println("生产"+name+"冰箱");
    }
}

class GeLiRefrigerator implements Refrigerator{
  public   void pri(String name){
      System.out.println("生产"+name+"冰箱");
  }
}