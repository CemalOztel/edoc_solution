package edoc_solution.step_definitions;

import edoc_solution.pages.SuchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SuchPage_StepDefs {
    SuchPage suchseite = new SuchPage();

    @Given("Der Benutzer befindet sich auf der Startseite und klickt auf das Such Icon")
    public void der_benutzer_befindet_sich_auf_der_startseite_und_klickt_auf_das_such_icon() {

        suchseite.SearchIconClick();
    }

    @When("der Benutzer in das Suchbegriff {string} eingibt")
    public void der_benutzer_in_das_suchbegriff_eingibt(String Suchbegriff) {

        suchseite.Suchbegriff(Suchbegriff);
    }

    @When("Der Benutzer drückt den „Suchen“-Button.")
    public void der_benutzer_drückt_den_suchen_button() {
        suchseite.SuchenButtonClick();
    }


    @Then("Der Benutzer sollte bestätigen, ob der gesuchte Schlüsselwort als Result {string} angezeigt wird.")
    public void derBenutzerSollteBestätigenObDerGesuchteSchlüsselwortAlsResultAngezeigtWird(String SuchResult) {
        suchseite.SuchResult(SuchResult);
    }
}
