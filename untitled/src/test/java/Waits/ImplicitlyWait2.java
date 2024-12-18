package Waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImplicitlyWait2
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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(4));
        wait.ignoring(NoSuchElementException.class);

        driver.findElement(By.xpath("//button[@id='btn1']")).click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='txt1']"))));

        WebElement button = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='txt1']"))));

        button.sendKeys("Hell world");



    }
}
