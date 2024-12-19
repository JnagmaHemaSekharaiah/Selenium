package screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Example
{


    public static WebDriver driver;

    public static void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public static void main(String args[]) throws IOException
    {
        setUp();
        File src = new File("C:\\Users\\Windows\\OneDrive\\Desktop\\Selenium\\Selenium\\untitled\\src\\Files\\abc.png");
            try
            {
                WebElement ele = driver.findElement(By.xpath("//img[@alt ='Google']"));
                File des =  ele.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(des,src);
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

            driver.close();
      }


    }


