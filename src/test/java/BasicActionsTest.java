import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class BasicActionsTest {

    @Test
    public void performAction() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        System.out.println(basicPageLink.getText());
        basicPageLink.click();
        driver.findElement(By.id("fname")).sendKeys("Kasia");
        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.clear();
        usernameInput.sendKeys("admin");
        System.out.println(usernameInput.getText());
        System.out.println(usernameInput.getAttribute("value"));
        //driver.findElement(By.name("username")).clear();
       // driver.findElement(By.name("username")).sendKeys("admin");
        usernameInput.sendKeys(Keys.ENTER);
        Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();
        driver.switchTo().alert().accept();
       // usernameInput.sendKeys(Keys.TAB);

        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        driver.findElement(By.cssSelector("[value='female']")).click();

        WebElement selectCar = driver.findElement(By.cssSelector(("select")));
        Select cars = new Select(selectCar);
        cars.selectByValue("volvo");

        List<WebElement> options = cars.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        SelectCheck selectCheck = new SelectCheck();
        System.out.println(selectCheck.checkOption("Audi",selectCar));
        System.out.println(selectCheck.checkOption("Jeep",selectCar));

        WebElement para = driver.findElement(By.cssSelector(".topSecret"));
        System.out.println("By text: " + para.getText());
        System.out.println("By attr value: " + para.getAttribute("value"));
        System.out.println("By attr text content: " + para.getAttribute("textContent"));
    }
}
