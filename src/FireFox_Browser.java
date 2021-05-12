import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFox_Browser {

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/";

        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");//System setProperty (key,driver path)
        WebDriver driver = new FirefoxDriver(); //Create an object and open baseUrl
        driver.manage().window().maximize(); //maximize the window
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Wait until 20 second Url is loading
        driver.get(baseUrl); //Open the chrome browser with baseUrl
        String title = driver.getTitle(); //to get the title
        System.out.println(title);   //Print tiltle
        driver.close();  //close driver
    }
}
