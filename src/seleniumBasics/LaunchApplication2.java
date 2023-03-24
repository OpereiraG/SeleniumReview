package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchApplication2 {
    public static void main(String[] args) {

       // System.setProperty("webdriver.chrome.driver","C:\\Users\\nelpe\\IdeaProjects\\LearningSeleniumBasics\\Driver\\chromedriver.exe");
// only possible to use selenium without the path if you are using version 4.6 and up
        //WebDriver driver = new FirefoxDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://www.google.com/");
        //driver.get("https://www.google.com/"



    }
}
