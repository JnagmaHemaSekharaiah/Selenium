package mavenpratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CreateProfile2
{

    String broswer;
    @Test
    public void intilize() throws InterruptedException {
        WebDriver driver;
        Properties prop = new Properties();
        FileInputStream fis;

        System.out.println( System.getProperty("user.dir") );

        try
        {
            fis = new FileInputStream (System.getProperty("user.dir")+"//src//test//java//mavenpratice//broswername.properties");
            prop.load(fis);
            broswer = System.getProperty("broswer") !=null ?System.getProperty("broswer") :prop.getProperty("broswerName");

            System.out.println(broswer);

        }
        catch (Exception e)
        {
          System.out.println(e);
        }

        if(broswer.equalsIgnoreCase("chrome"))
        {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
           driver.get("https://www.google.co.in/");
           Thread.sleep(4000);
           driver.close();
        }

        if(broswer.equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.get("https://www.google.co.in/");
            Thread.sleep(4000);
            driver.close();
        }

    }


}
