import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class selintro {
    public static void main(String [] args) {
        // invoking Browser
        System.setProperty("webdriver.chrome.driver", "E:\\Java\\introduction\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.ca");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }
}
