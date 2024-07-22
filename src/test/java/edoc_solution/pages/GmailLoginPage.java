package edoc_solution.pages;

import edoc_solution.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginPage extends BasePage {
    @FindBy(xpath = "//a[text()='Anmelden']")
    public WebElement ButtunAnmelden;
    @FindBy(xpath = "//input[@type='email']")
    public WebElement FeldEMail;
    @FindBy(xpath= "//input[@name='Passwd']")
    public WebElement FeldPasswort;
    @FindBy(xpath = "//span[text()='Weiter']")
    public WebElement ButtonWeiter;
    @FindBy (id = ":3s")
    public WebElement verifyEmail;

    public void MainPage() {

        ButtunAnmelden.click();
        BrowserUtils.waitFor(2);
    }
    public void LoginData(String EMail, String Passwort) {

        FeldEMail.sendKeys(EMail);
        ButtonWeiter.click();
        BrowserUtils.waitFor(1);
        FeldPasswort.sendKeys(Passwort);
    }

    public void ClickLogin() {

        ButtonWeiter.click();
    }





}
