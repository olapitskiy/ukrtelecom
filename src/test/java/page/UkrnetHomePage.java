package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UkrnetHomePage extends UkrnetBasePage {

    @FindBy(id = "dd")
    private WebElement userIcon;

    @FindBy(xpath = "//*ddd']")
    private WebElement searchField;

    @FindBy(xpath = "//*[@ddd']")
    private WebElement searchIcon;

    public UkrnetHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
