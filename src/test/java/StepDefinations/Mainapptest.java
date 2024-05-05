package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Browser.BrowserMethods.*;
import static Browser.BrowserMethods.checkElementIsDisplayedByXPath;

public class Mainapptest {
    @Given("User enter the valid usernamee")
    public void User_enterthevalidusernamee() {
        findelementbyxpathandsendkeys("//input[@name='email' and @placeholder='Enter User Name']", "sandeep");
    }

    @And("User enters the valid passwordd")
    public void Userentersthevalidpasswordd() {
        findelementbyxpathandsendkeys("//input[@name='password' and @placeholder='Enter password']", "2sandeep13");

    }

    @When("User clicks the login buttonn")
    public void Userclickstheloginbuttonn() {
        findelementByXpathandClick("//button[@class='btn btn-blue text-center' and @type='submit']/span[text()='Login']");
    }

    @Then("user enters into the sitee")
    public void userentersintothesitee() {
        checkElementIsDisplayedByXPath("//h2[text()=' CQRA Services']");
    }
    @Given("User clicks the qa button")
    public void userclicktheqabutton(){
        checkElementIsDisplayedByXPath("//button[normalize-space(span)='Launch']");
    }
    @And("User Clicks the user Management button")
    public void UserClickstheuser_managementbutton(){
        checkElementIsDisplayedByXPath("//span[@class=nav-link-text and text()=User Management ]");
    }
}
