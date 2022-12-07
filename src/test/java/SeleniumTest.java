import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage() {

        WebDriver driver= getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        //znajdujemy przycisk
        WebElement agreeButton=driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']"));
        //klikniecie przycisku
        agreeButton.click();
        //znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
       //wprowadz wartosc Selenium do pola
        searchField.sendKeys("Selenium");
        //zasymuluj nacisniecie przycisku Enter
        searchField.sendKeys(Keys.ENTER);
        //znalezc rezultat
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//h3"));

        Assert.assertTrue(result.isDisplayed());
    }

           public WebDriver getDriver(String browser){
                switch (browser) {
                    case "chrome":
                        return new ChromeDriver();
                    case "firefox":
                        String firefoxPath= "C:\\Users\\kaczm\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe";
                        System.setProperty("webdriver.gecko.driver",firefoxPath);
                        return new FirefoxDriver();
                    case "ie":
                        String iePath = "C:\\Users\\kaczm\\Downloads\\IEDriverServer_x64_4.6.0\\IEDriverServer.exe";
                        System.setProperty("webdriver.ie.driver",iePath );
                        return new InternetExplorerDriver();
                    default:
                        throw new InvalidArgumentException("Invalid browser name");


                }
           }
}
