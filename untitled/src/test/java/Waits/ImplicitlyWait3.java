package Waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class ImplicitlyWait3
{
    public static WebDriver driver;

    public static void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.manage().window().maximize();

    }

    public static void main(String[] args)
    {
        setUp();

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .ignoring(NoSuchElementException.class)
                .pollingEvery(Duration.ofMillis(500))
               .withTimeout(Duration.ofSeconds(10));

        wait.until(new Function<WebDriver,WebElement>()
        {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return null;
            }
        }
        );

        wait.until(driver1 -> driver1.findElement(By.id("dynamicElement")));



    }

}
