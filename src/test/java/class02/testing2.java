package class02;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testing2 {

    @BeforeSuite
    public void beforesuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("After Suite");
    }






    @Test
    public void TestA(){
        System.out.println("Deformersy");
    }

    @Test
    public void TestB(){
        System.out.println("Bengale");
    }
}
