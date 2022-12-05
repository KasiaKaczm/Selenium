import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage() {

        WebDriver driver= getDriver("asc");

           }
           public WebDriver getDriver(String browser){
                switch (browser) {
                    case "chrome":
                        String chromePath = "C:\\Users\\kaczm\\Downloads\\chromedriver_win32\\chromedriver.exe";
                        System.setProperty("webdriver.chrome.drive",chromePath);
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
