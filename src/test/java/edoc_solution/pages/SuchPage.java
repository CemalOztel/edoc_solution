package edoc_solution.pages;

import edoc_solution.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SuchPage extends BasePage{

    @FindBy(xpath = "//a[@class='searchtoggle']")
    public WebElement SearchIcon;
    @FindBy(id = "ke_search_sword")
    public WebElement Suchbegriffsfeld;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement ButtonSuchen;
    @FindBy(xpath = "//div[@id='kesearch_results']/a")
    public List<WebElement> resultList;


    public void SearchIconClick() {
        ButtonCokie.click();
        SearchIcon.click();
    }
    public void Suchbegriff(String Schlusselwort) {
        Suchbegriffsfeld.sendKeys(Schlusselwort);
    }
    public void SuchenButtonClick() {
        ButtonSuchen.click();
        BrowserUtils.waitFor(2);
    }
    public void SuchResult(String TextResult) {
        boolean found = false;
        for (WebElement result : resultList) {
            if (result.getText().contains(TextResult)) {
                found = true;
                //break;
            }
        }

        if (found) {
            System.out.println("Search results contain '" + TextResult + "'. Test passed!");
        } else {
            System.out.println("Search results do not contain '" + TextResult + "'. Test failed!");
        }
    }
}
