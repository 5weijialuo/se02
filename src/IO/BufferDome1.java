package IO;

import java.io.*;
import java.util.ArrayList;

/**
 * 1 建立和文件的连接
 * 2 指定需要写入的文件目录
 * 3 读出全部文件,
 * 4 截取每行的标识符
 * 5 根据每行的标识,进行排序
 * 6 写入指定文件
 * */
public class BufferDome1 {
    static ArrayList<String> arrayList=new ArrayList<>();
    public static void main(String[] args) {
        int arrL=0;
        try (
                Writer writer=new FileWriter("D:/tom.txt");
                BufferedWriter bufferedWriter=new BufferedWriter(writer);
                Reader b=new FileReader("src/four.txt");
                BufferedReader bufferedReader=new BufferedReader(b);
        ){
            /*将文章进行分离,*/
                String s;
                while ((s=bufferedReader.readLine())!=null){
                    /*如果是空行,则不写入list集合中*/
                    if (s.length()==0){
                        continue;
                    }
                    arrayList.add(s);
                    arrL++;
                }
            for (String d :arrayList) {
                System.out.println(d);
            }

                /*剥离集合中每一行的标识进行分离*/
            int[] arr=new int[arrL];
            for(int d=0;d<arrayList.size();d++){
                 int i = arrayList.get(d).indexOf(".");
                  String temp= arrayList.get(d).substring(0,i);
                  arr[d] = Integer.parseInt(temp);
            }
            /*使用冒泡排序法,对标识进行排序*/ /*对标识进行排序,和文章进行排序*/
            for (int i=0;i<arr.length;i++){
                for (int j=i+1;j<arr.length;j++){
                    int temp;
                    String tem;
                    if (arr[i]>arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        tem=arrayList.get(i);
                        arrayList.set(i,arrayList.get(j));
                        arrayList.set(j,tem);
                    }
                }
            }
            System.out.println("排序后的文件内容！！！");
            /*将排序好的每行数据写入新的文件中*/
            for (String temp : arrayList) {
                bufferedWriter.write(temp);
                bufferedWriter.newLine();
                System.out.println(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
