import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

    @Test
    public void findSeleniumTurorial(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumdemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"menu-item-21\"]/a/span")).click();
        WebElement seleniumProduct = driver.findElement(By.xpath("//h2[text()='Java Selenium WebDriver']"));
        Assert.assertTrue(seleniumProduct.isDisplayed());
        driver.quit();
    }
}
