package class01;

import org.testng.annotations.Test;

public class DependsOn {

    @Test
    public void login(){
        System.out.println("YAS YAS YAS");
    }


    @Test(dependsOnMethods = "login")
    public  void  verificationOfDashboard(){

        System.out.println("This is Dashboard");

    }
}
