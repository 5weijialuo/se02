package fanShe;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {
    Ca ca = new Ca();
    @After
    public void aVoid(){
        System.out.println("--->");
    }

    @Before
    public  void bVoid(){
        System.out.println("before");
    }


    @Test
    public  void  getAll(){

        String pri = ca.pri("root","12345");

        Assert.assertEquals("结果有误","true",pri);
    }

    @Test
    public  void  getAllTwo(){
        String root = ca.pri("root", "123456");
        Assert.assertEquals("结果有误","true",root);


    }
}
