import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Multiple_Browser {

    static String browser = "chrome";
    static String baseUrl = "https://demo.nopcommerce.com/";
    static WebDriver driver;        //Declare Driver

    public static void main(String[] args) {

        //if else
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");//System setProperty (key,driver path)
            driver = new ChromeDriver(); //Create an object and open baseUrl
        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");//System setProperty (key,driver path)
            driver = new FirefoxDriver(); //Create an object and open baseUrl
        }else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");//System setProperty (key,driver path)
            driver = new InternetExplorerDriver(); //Create an object and open baseUrl
        }else{
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);
    }
}
