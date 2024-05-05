package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static Browser.BrowserMethods.*;
public class LoginStepdefs {

    @Given("User enters bad username")
    public void user_enters_bad_username() {
        findelementbyxpathandsendkeys("//input[@name='email' and @placeholder='Enter User Name']", "Test");
    }

    @And("User enters bad password")
    public void user_enters_bad_password() {
        findelementbyxpathandsendkeys("//input[@name='password' and @placeholder='Enter password']", "test@test");

    }

    @When("User hits login button")
    public void user_hits_login_button() {
        findelementByXpathandClick("//button[@class='btn btn-blue text-center' and @type='submit']/span[text()='Login']");
    }

    @Then("User is Restricted from entering into web")
    public void user_is_restricted_from_entering_into_web() {
        checkElementIsDisplayedByXPath("//h5[@class='error text-danger' and text()='Invalid Credentials']");
    }
    @Given("User enter the valid username")
    public void User_enterthevalidusername() {
        findelementbyxpathandsendkeys("//input[@name='email' and @placeholder='Enter User Name']", "sandeep");
    }

    @And("User enters the valid password")
    public void Userentersthevalidpassword() {
        findelementbyxpathandsendkeys("//input[@name='password' and @placeholder='Enter password']", "2sandeep13");

    }

    @When("User clicks the login button")
    public void Userclickstheloginbutton() {
        findelementByXpathandClick("//button[@class='btn btn-blue text-center' and @type='submit']/span[text()='Login']");
    }

    @Then("user enters into the site")
    public void userentersintothesite() {
        checkElementIsDisplayedByXPath("//h2[text()=' CQRA Services']");
    }

}
