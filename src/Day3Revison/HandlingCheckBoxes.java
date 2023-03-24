package Day3Revison;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingCheckBoxes {
    public static void main(String[] args) {
        //*[@id="monday"]

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");

        driver.findElement(By.xpath("//input[@id=\"monday\"]")).click();

        //String tittle = driver.getTitle();
        //System.out.println(tittle);
    }
}