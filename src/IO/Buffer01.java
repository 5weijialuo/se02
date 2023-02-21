package IO;

import java.io.*;

public class Buffer01 {
    public static void main(String[] args) {

        try (
                InputStream b=new FileInputStream("C:\\Users\\21355\\Pictures\\Camera Roll\\jq.jpg");
                InputStream is=new BufferedInputStream(b);
                OutputStream o=new FileOutputStream("C:\\Users\\21355\\Pictures\\小青.jpg",true);
                OutputStream os=new BufferedOutputStream(o);
        ){
            byte[] bytes=new byte[2048];
            int temp;
            while ((temp= is.read(bytes))!=-1){
                os.write(bytes,0,temp);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
