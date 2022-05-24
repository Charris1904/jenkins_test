import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertTrue;

public class GeneralTest {


    public WebDriver driver;
    protected HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testProductCurrency() {
        try {

            HomePage homePage = new HomePage(driver, "Product");

            Thread.sleep(5000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            Assert.fail();
        }
    }
}
