package cources.mainSteps;

import cources.data.DriverPool;
import cources.pages.DeliveryClubMainPageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_lol.AN;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SearchAddressSteps {
    private DeliveryClubMainPageObject page = new DeliveryClubMainPageObject();
    private WebDriver driver;


    @Given("^get DeliveryClub main page$")
    public void preCondition() {
        WebDriver driver = DriverPool.instance.pollDriver();
//        page = new DeliveryClubMainPageObject();
        page.init(driver);
        driver.get("https://www.delivery-club.ru/");
    }

    @When("^enter address (.*) and click search$")
    public void searchByAddrAndClick(String address) {
//        page = new DeliveryClubMainPageObject();
        page.searchByAddr(address);
    }
    @When("^only enter address (.*)$")
    public void searchByAddr(String address) {
//        page = new DeliveryClubMainPageObject();

        page.fillAddrField(address);
    }



    @Then("^i see vendors list")
    public void checkVenorsList(List<String> name) {
        for (String vendorName :
                name) {
            page.findVendors(vendorName);
        }
    }

//    @And("^quit from page$")
//    public void quitFromPage() {
//        driver.quit();
//    }

    @Then("^i see validation message$")
    public void invalidAddressMessage() {
        page.findInvalidMessage();
    }

    @Then("^i don't see validation message$")
    public void noInvalidAddressMessage() {
        page.notFindInvalidMessage();
    }

}
