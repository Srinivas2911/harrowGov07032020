package threeBrowsers_harrowGov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxBrowser_HarGov {               // class

    public static void main(String[] args) {        // main method

        // setting up url as String
        String baseUrl = "https://www.harrow.gov.uk/ ";

        //setting up the webdriver to run the url
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        /* maximising the view to max level / setting time of web browser to display
        and getting the base url
         */
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        // getting the title of the main page and printing it on console.
        String title = driver.getTitle();
        System.out.println("Main page : " + title);
        System.out.println(driver.getTitle());

        driver.quit();              // exit the driver after display
    }
}
