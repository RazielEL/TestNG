package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertion {
    public static WebDriver driver;
// go to syntax login
    // enter wrong cred
    // verify if message is invalid cred


    @BeforeMethod
    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @Test
    public void verifyCredentials(){

        String expectedText = "Invalid credentials";
        //WebElement username = driver.findElement(By.id("txtUsername"));
       // username.sendKeys("123456");

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("NoAdmin");

        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();

      Assert.assertEquals(text, expectedText);

        WebElement Username = driver.findElement(By.id("txtUsername"));
       // assert if username text bo is displayed
       boolean displayed = Username.isDisplayed();   //// jak odznacze te 4 to zeby ladnie dzialalo z kodem bledu to musze zle span message dac
        // assert if it is actually displayed or not
       System.out.println("Elo");
     Assert.assertTrue(displayed);
//        check all asseertions

    }
    @Test(groups = "smoke")
    public void loginTest2(){
        System.out.println("i am test for login under smoke");
    }

    @AfterMethod
    public  void  CloseBrowser(){
        driver.quit();
    }




}
