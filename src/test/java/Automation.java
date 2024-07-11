import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class Automation {

    @Test
    public void test() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://localhost:3000/register");
        WebElement nameArea = driver.findElement(By.id(":r1:"));
        nameArea.sendKeys("Ferdi Can");
        WebElement surnameArea = driver.findElement(By.id(":r3:"));
        surnameArea.sendKeys("Çif");
        WebElement emailArea = driver.findElement(By.id(":r5:"));
        emailArea.sendKeys("ferdi@gmail.com");
        WebElement passArea = driver.findElement(By.id(":r7:"));
        passArea.sendKeys("19071907");
        WebElement uploadElement = driver.findElement(By.id("attach-resume"));
        uploadElement.sendKeys("C:\\Users\\ALANYA\\Desktop\\AAA.pdf");
        Thread.sleep(3000);
        WebElement registerArea = driver.findElement(new By.ByCssSelector(".MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-colorPrimary.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-colorPrimary.css-sghohy-MuiButtonBase-root-MuiButton-root"));
        registerArea.click();

        WebElement loginArea = driver.findElement(new By.ByCssSelector("a[class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit css-1y942vo-MuiButtonBase-root-MuiButton-root']"));
        loginArea.click();
        WebElement emailArea2 = driver.findElement(By.id(":r9:"));
        emailArea2.sendKeys("ferdi@gmail.com");
        WebElement passArea2 = driver.findElement(By.id(":rb:"));
        passArea2.sendKeys("19071907");
        Thread.sleep(3000);
        WebElement loginArea2 = driver.findElement(By.id(":rd:"));
        loginArea2.click();
        WebElement companyArea = driver.findElement(new By.ByCssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
        companyArea.click();
        WebElement detailArea = driver.findElement(new By.ByCssSelector("div[class='MuiBox-root css-obyr3s'] div:nth-child(2) div:nth-child(1) div:nth-child(2) a:nth-child(1)"));
        detailArea.click();
        WebElement applyArea = driver.findElement(new By.ByCssSelector(".MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeSmall.MuiButton-containedSizeSmall.MuiButton-colorPrimary.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeSmall.MuiButton-containedSizeSmall.MuiButton-colorPrimary.css-17wg92v-MuiButtonBase-root-MuiButton-root"));
        applyArea.click();
        driver.quit();


    }





}

