import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Automation2 {
    @Test
    public void testAdmin() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://localhost:3000/login");

        WebElement emailArea = driver.findElement(By.id(":r1:"));
        emailArea.sendKeys("admin@tii.com");

        WebElement passArea = driver.findElement(By.id(":r3:"));
        passArea.sendKeys("123");

        WebElement company = driver.findElement(new By.ByCssSelector("button[value='company']"));
        company.click();
        Thread.sleep(3000);
        WebElement loginArea = driver.findElement(By.id(":r5:"));
        loginArea.click();



    }

}
