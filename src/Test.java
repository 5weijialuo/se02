import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] dsd={1,23,4,34,2};
        for (int i=0;i<dsd.length;i++){
            for (int j = i+1; j < dsd.length; j++) {
                if (dsd[i]>dsd[j]){
                    int temp=dsd[i];
                    dsd[i]=dsd[j];
                    dsd[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(dsd));




        ArrayList<String> arrayList=new ArrayList<>();
        String s1="1.总是";
        arrayList.add(s1);
        arrayList.add("20.看到里的");
        for (String s : arrayList) {
            int i = s.indexOf(".");
            String substring = s.substring(0, i);
            int d= Integer.parseInt(substring);
            System.out.println(d);
        }

    }
}

