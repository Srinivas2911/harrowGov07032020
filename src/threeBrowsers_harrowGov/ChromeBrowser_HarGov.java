package threeBrowsers_harrowGov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowser_HarGov {            // class

    public static void main(String[] args) {        // main method

        // Defining the base URl
        String baseUrl = "https://www.harrow.gov.uk/";

        // setting up the Webdriver and browser drivers
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //maximising sze of window
        driver.manage().window().maximize();
        //setting url to open
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // geting url
        driver.get(baseUrl);

        //getting title page and printing main page title
        String title = driver.getTitle();
        System.out.println("Main page = " + title);
        System.out.println(driver.getTitle());

        // exiting url after getting title page
        driver.quit();

    }
}
