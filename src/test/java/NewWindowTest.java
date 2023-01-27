import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

import static java.lang.Thread.sleep;

public class NewWindowTest {

    @Test
    public void testNewWindow() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        String currentWindow = driver.getWindowHandle();
        driver.findElement(By.id("newPage")).click();

        Set<String> windowNames = driver.getWindowHandles();
        for (String window : windowNames) {
            if(!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }}

        driver.findElement(By.xpath("//button[@id=\"L2AGLb\"]")).click();

        driver.findElement(By.name("q")).sendKeys("Selenium");

        // Alert alert =  driver.switchTo().alert();
        // alert.accept();
        //WebElement agreeButton = driver.findElement(By.className("QS5gu sy4vM"));
        //WebElement agreeButton = driver.findElement(By.xpath("//div[1][contains(text(),'Zaakceptuj wszystko')]"));
        //sleep?
        //agreeButton.click();
        //driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div")).click();
        //driver.findElement(By.cssSelector("#L2AGLb > div")).click();

       //
    }
}
