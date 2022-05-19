package class02;

import org.testng.annotations.*;

public class testing {

    @BeforeTest
    public void beforetest(){
        System.out.println("                                                  before test");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("                                                   after test");
    }

    @BeforeClass
    public void beforeclass() {
        System.out.println("before class method");
    }

    @AfterClass
    public void afterclass() {
        System.out.println("aafter class method");
    }

    @Test
    public void Test(){
        System.out.println("          test1");
    }

    @Test
    public void Test2(){
        System.out.println("          test2");
    }

    @BeforeMethod
    public void before(){
        System.out.println("     before method ");
    }
    @AfterMethod
    public void after(){
        System.out.println("     aafter method");
    }





}
