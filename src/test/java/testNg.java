import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Epic("UiTest")
@Feature("getGoogle")
public class testNg {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "E:\\Java\\introduction\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    @Story("testGoogle")
    @Description("test case to open a ui")
    public void testGoogleSearch() {
        // Open google.ca
        driver.get("https://www.google.ca");
        // Add additional test steps if needed
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}