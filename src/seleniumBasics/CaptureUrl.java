package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureUrl {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String pageUrl =driver.getCurrentUrl();
        System.out.println("The page url: "+pageUrl);

    }
}
