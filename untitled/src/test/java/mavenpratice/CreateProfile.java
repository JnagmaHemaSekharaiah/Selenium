package mavenpratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateProfile
{

//updated comment for wrbhook testing
    @Test
    public void hello()
    {

        WebDriverManager.chromedriver().setup()
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
    }

}
