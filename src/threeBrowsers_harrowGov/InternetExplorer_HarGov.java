package threeBrowsers_harrowGov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class InternetExplorer_HarGov {                  // class

    public static void main(String[] args) {            // main method

        // setting up the url
        String baseUrl = "https://www.harrow.gov.uk/";
        // setting up the webdriver
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        // managing the window and the time out
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);                // getting the url

        //setting up the title and printing the Title name
        String title = driver.getTitle();
        System.out.println("Main page : "+ title);
        System.out.println(driver.getTitle());

        driver.quit();              // exit after use.

    }
}