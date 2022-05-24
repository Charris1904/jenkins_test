import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private String productName;
    private By myAccountLink = By.linkText("My Account");
    private By registerLink = By.linkText("Register");
    private By searchBar = By.xpath("//input[@type=\"text\"]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage(WebDriver driver, String productName) {
        this.driver = driver;
        this.productName = productName;
    }
}
