package cources.mainSteps;

import cources.data.DriverPool;
import cources.data.UsersPool;
import cources.pages.DeliveryClubMainPageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AuthorizationSteps {
    private DeliveryClubMainPageObject page = new DeliveryClubMainPageObject();
    private WebDriver driver;


    @When("^click authorization$")
    public void clickAuthButton() {
        page.clickAuthBtn();
    }

    @And("^fill user's email$")
    public void filEmail() {
        page.fillEmailField();
    }

    @And("^clik enter$")
    public void clickEnter() {
        page.clickEnterBtn();
    }

}