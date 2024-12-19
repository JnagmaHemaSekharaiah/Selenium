package screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;

public class Example2
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

    public static void main(String[] args) throws FileNotFoundException {
        setUp();
     //   File src = new File("C:\\Users\\Windows\\OneDrive\\Desktop\\Selenium\\Selenium\\untitled\\src\\Files\\abc1.png");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Windows\\OneDrive\\Desktop\\Selenium\\Selenium\\untitled\\src\\Files\\abc1.png");
        try
        {

            TakesScreenshot ts =  (TakesScreenshot)driver;
            byte[] des =  ts.getScreenshotAs(OutputType.BYTES);
            fos.write(des);

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        driver.quit();
    }
}
