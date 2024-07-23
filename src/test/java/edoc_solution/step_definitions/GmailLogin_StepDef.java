package edoc_solution.step_definitions;

import edoc_solution.pages.GmailLoginPage;
import edoc_solution.utilities.BrowserUtils;
import edoc_solution.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class GmailLogin_StepDef {
    GmailLoginPage gmailLoginPage = new GmailLoginPage();

    @Given("Der Benutzer befindet sich auf der Startseite und klickt auf den Anmelden-Button")
    public void derBenutzerBefindetSichAufDerStartseiteUndKlicktAufDenAnmeldenButton() {
        gmailLoginPage.MainPage();
    }

    @When("Der Benutzer gibt eine gültige E-Mail-Adresse  ein {string}")
    public void derBenutzerGibtEineGültigeEMailAdresseEin(String Email) {
        gmailLoginPage.LoginEmailData(Email);
    }

    @And("Der Benutzer klickt auf die  Weiter Button")
    public void derBenutzerKlicktAufDieWeiterButton() {
        gmailLoginPage.ClickWeiterButton();
    }

    @When("Der Benutzer gibt eine  gültiges Password ein {string}")
    public void derBenutzerGibtEineGültigesPasswordEin(String Passwort) {
        gmailLoginPage.LoginPasswortData(Passwort);
    }

    @Then("Der Benutzer sollte die Startseite sehen")
    public void derBenutzerSollteDieStartseiteSehen() {
        BrowserUtils.verifyElementDisplayed(gmailLoginPage.verifyEmail);
        BrowserUtils.waitFor(4);
        Driver.closeDriver();
    }


}
