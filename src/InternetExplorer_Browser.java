import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class InternetExplorer_Browser {

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/";

        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");//System setProperty (key,driver path)
        WebDriver driver = new InternetExplorerDriver(); //Create an object and open baseUrl
        driver.manage().window().maximize();  //maximize the window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl); //Open the chrome browser with baseUrl
        String title = driver.getTitle();  //to get the title
        System.out.println(title);  //Print tiltle
        driver.close();  //close driver
    }

}
