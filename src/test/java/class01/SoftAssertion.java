package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
    public static WebDriver driver;

    @BeforeMethod(alwaysRun = true) // jak tu mamy driver, to tutaj dajemy zeby po prostu inne dzialaly
    public void OpenBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }


    @Test(groups = "regression")
    public void verifyCredentials() {

        SoftAssert soft = new SoftAssert();

        String expectedText = "Invalid credentials";
        //WebElement username = driver.findElement(By.id("txtUsername"));
        // username.sendKeys("123456");

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("NoAdmin");

        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        soft.assertEquals(text,expectedText);

        WebElement Username = driver.findElement(By.id("txtUsername"));
        boolean displayed = Username.isDisplayed();
        soft.assertTrue(displayed);

        soft.assertAll();


        }

    @Test(groups = "smoke")
    public void loginTest2(){
        System.out.println("i am test for login under smoke");

    }
}




