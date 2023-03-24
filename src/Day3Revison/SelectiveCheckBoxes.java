package Day3Revison;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class SelectiveCheckBoxes {
    public static void main(String[] args) {

// **
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=");
            WebDriver driver = new ChromeDriver();
// **
            driver.manage().window().maximize();
            driver.get("https://itera-qa.azurewebsites.net/home/automation%22");
// **
            String pageTitle = driver.getTitle();
            System.out.println(pageTitle);
// **
            List<WebElement> days = driver.findElements
                    (By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
            for (int i = 1; i < days.size(); i += 2) {
                days.get(i).click();
            }
            for (WebElement day : days) {
                day.click();
            }

           /* for (WebElement day : days) {
                if (day.getAttribute("id").equalsIgnoreCase("tuesday");
                day.getAttribute("id").equalsIgnoreCase("thursday");
                day.getAttribute("id").equalsIgnoreCase("saturday");
                    day.click();
                }*/
            }

        }


