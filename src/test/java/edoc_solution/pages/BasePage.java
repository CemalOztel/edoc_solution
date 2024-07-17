package edoc_solution.pages;

import edoc_solution.utilities.ConfigurationReader;
import edoc_solution.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//span[text()='Alles akzeptieren']")
    public WebElement ButtonCokie;

}


