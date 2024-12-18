package Waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait
{
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.xpath("//button[@id='btn1']")).click();
      //  driver.findElement(By.xpath("//button[@id='btn2']")).click();

        driver.findElement(By.xpath("//input[@id='txt1']")).sendKeys("Hello World");
      //  driver.findElement(By.xpath("//input[@id='txt2']")).sendKeys("Hello World");


       Thread.sleep(5000);
       driver.close();


    }
}
