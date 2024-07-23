package edoc_solution.pages;

import edoc_solution.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginPage extends BasePage {
    @FindBy(xpath = "//a[text()='Anmelden']")
    public WebElement ButtonAnmelden;
    @FindBy(xpath = "//input[@type='email']")
    public WebElement FeldEMail;
    @FindBy(xpath= "//input[@name='Passwd']")
    public WebElement FeldPasswort;
    @FindBy(xpath = "//span[text()='Weiter']")
    public WebElement ButtonWeiter;
    @FindBy (id = ":3s")
    public WebElement verifyEmail;

    public void MainPage() {
        ButtonAnmelden.click();
        BrowserUtils.waitFor(2);
    }
    public void LoginEmailData(String EMail) {
        FeldEMail.sendKeys(EMail);
        BrowserUtils.waitFor(1);
    }
    public void LoginPasswortData(String Passwort) {
        FeldPasswort.sendKeys(Passwort);
        BrowserUtils.waitFor(1);
    }
    public void ClickWeiterButton() {
        ButtonWeiter.click();
    }





}
