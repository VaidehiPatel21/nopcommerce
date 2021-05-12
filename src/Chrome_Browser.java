import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Chrome_Browser {

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/";

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");//System setProperty (key,driver path)
        WebDriver driver = new ChromeDriver(); //Create an object and open baseUrl
        driver.manage().window().maximize();    //maximize the window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Wait until 10 second Url is loading
        driver.get(baseUrl);    //Open the chrome browser with baseUrl
        String title = driver.getTitle();  //to get the title
        System.out.println(title);  //Print tiltle
        driver.close(); //driver close
    }

}
