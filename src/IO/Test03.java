package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Test03 {
    public static void main(String[] args) throws Exception{
        OutputStream out=new FileOutputStream(new File("src/two.txt"));
        out.write('d');
        out.write('e');
        out.write('f');
      /*  out.flush();*/
        out.write('A');
        byte[] bytes = "在这些的日子里,我时常想到你,你的笑容仿佛眼前!\r\n\r\n".getBytes();
        out.write("\r\n".getBytes(StandardCharsets.UTF_8));
        out.write(bytes,0,bytes.length);
        out.flush();
       /* out.write('\n');
        out.write(bytes,bytes.length/2,bytes.length);*/

        out.close();

    }
}
