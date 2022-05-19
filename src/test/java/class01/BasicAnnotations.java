package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {

    //jak dodamy a b c tam to printuje od 2 3 1 bo jedzie alfabetycznie

    @Test (groups = "smoke")
    public void cfirstTest(){
        System.out.println("This is my first test");
    }

    @Test
    public void asecondTest(){
        System.out.println("This is my second test");
    }

    @Test
    public void bthirdTest(){
        System.out.println("This is my third test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("*************** I AM PRE CONDITION ****************");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("^^^^^^^^^^^^^^^ I AM POST CONDITION ^^^^^^^^^^^^^^");
    }



}
