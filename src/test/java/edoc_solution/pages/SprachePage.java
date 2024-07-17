package edoc_solution.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SprachePage extends BasePage{
    @FindBy(xpath = "//span[text()='EN']")
    public WebElement languageENG;
    @FindBy(xpath = "//span[text()='DE']")
    public WebElement languageDE;
    @FindBy(xpath = "(//*[contains(text(), 'ECM specialist for all ERP systems')])[2]")
    public WebElement TextEnglisch;
    @FindBy(xpath = "//*[contains(text(), 'ECM-Spezialist für alle ERP-Systeme')]")
    public WebElement TextDeutsch;
    public void ClickENG() {
        languageENG.click();
    }
    public void ClickDE() {
        languageDE.click();
    }
}
