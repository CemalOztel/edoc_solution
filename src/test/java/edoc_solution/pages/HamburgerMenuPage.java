package edoc_solution.pages;

import edoc_solution.utilities.BrowserUtils;
import edoc_solution.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HamburgerMenuPage extends BasePage {
    @FindBy(xpath = "//a[@class='navtoggle']")
    public WebElement ButtonHamMenu;
    @FindBy(xpath = "(//*[contains(text(), 'Digitale Lösungen für Ihre Geschäftsprozesse')])[2]")
    public WebElement TextDigitaleLösungen;
    @FindBy(xpath = "//*[contains(text(), 'ECM Integrationen mit edoc')]")
    public WebElement TextIntegrationen;
    @FindBy(xpath = "//*[contains(text(), 'edoc Managed Services für Enterprise Content Management')]")
    public WebElement TextManagedServices;
    @FindBy(xpath = "//*[contains(text(), 'edoc-Kunden und ihre ECM-Projekte')]")
    public WebElement TextUnsereKunden;
    @FindBy(xpath = "//*[contains(text(), 'Deshalb Enterprise Content Management mit edoc:')]")
    public WebElement TextWarumEdoc;

    public void MainItemClick(String subCategory) {
        WebElement Item = Driver.get().findElement(By.xpath("//a[text()='" + subCategory + "']"));
        BrowserUtils.waitFor(1);
        Item.click();
        BrowserUtils.waitFor(2);
    }
}
