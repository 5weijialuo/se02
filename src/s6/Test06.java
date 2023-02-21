package s6;

public class Test06 {
    public static void main(String[] args) {
        int ar[] =new int[]{11,123,434,342};
        String app = Test06.app(ar);
        System.out.println(app);
    }

    public  static  String app(int[] arr){
        if (arr!=null){
            return null;
        }
        String s="";
        for (int i=0;i< arr.length;i++){
            s+=String.valueOf(arr[i]);
            if (i!=arr.length-1){
                s+=",";
            }
        }
        return "该数组的内容为:["+s+"]";
    }

}
