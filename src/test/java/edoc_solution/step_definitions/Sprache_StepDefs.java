package edoc_solution.step_definitions;

import edoc_solution.pages.SprachePage;
import edoc_solution.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sprache_StepDefs {
    SprachePage sprachePage = new SprachePage();


    @Given("Der Benutzer befindet sich auf der Startseite und klickt auf die Englische Sprachoption.")
    public void derBenutzerBefindetSichAufDerStartseiteUndKlicktAufDieEnglischeSprachoption() {
        sprachePage.ClickENG();
    }

    @Then("Die Seite sollte auf Englisch sein")
    public void dieSeiteSollteAufEnglischSein() {
        BrowserUtils.verifyElementDisplayed(sprachePage.TextEnglisch);
        System.out.println(sprachePage.TextEnglisch.getText());
    }

    @When("Der Benutzer klickt auf die Deutsch Sprachoption")
    public void derBenutzerKlicktAufDieDeutschSprachoption() {
        sprachePage.ClickDE();
    }

    @Then("Die Seite sollte wieder auf Deutsch sein")
    public void dieSeiteSollteWiederAufDeutschSein() {
        BrowserUtils.verifyElementDisplayed(sprachePage.TextDeutsch);
        System.out.println(sprachePage.TextDeutsch.getText());
    }
}