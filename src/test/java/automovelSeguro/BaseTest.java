package automovelSeguro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    protected static WebDriverWait wait;
    protected  static String url = "http://sampleapp.tricentis.com/101/app.php";

    public BaseTest() {
        startDriver(true);
    }
    protected void startDriver(boolean maximizar){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\lnv\\IdeaProjects\\Seguro\\src\\test\\resources\\chromeWindows\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, 20);

            if (maximizar == true){
                driver.manage().window().maximize();
            }
        }
    }

}
