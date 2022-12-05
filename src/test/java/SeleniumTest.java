import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage() {
       System.setProperty("webdriver.chrome.drive","C:\\Users\\kaczm\\Downloads\\chromedriver_win32\\chromedriver.exe");
       System.setProperty("webdriver.gecko.driver","C:\\Users\\kaczm\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
       System.setProperty("webdriver.ie.driver","C:\\Users\\kaczm\\Downloads\\IEDriverServer_x64_4.6.0\\IEDriverServer.exe");
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.withInitialBrowserUrl("https://www.google.com");
        WebDriver driver=new InternetExplorerDriver(options);

           }
}
