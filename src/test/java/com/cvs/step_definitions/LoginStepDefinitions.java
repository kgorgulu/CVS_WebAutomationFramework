package com.cvs.step_definitions;

import com.cvs.pages.LoginPage;
import com.cvs.utilities.ConfigurationReader;
import com.cvs.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage(); // created login page object

    @Given("user is on the Sign in page")
    public void user_is_on_the_Sign_in_page() {
        System.out.println("user is on the Sign in page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enter valid email address {string}")
    public void user_enter_valid_email_address(String string) {
        System.out.println("user enter valid email address: " + string);
        String userEmail = ConfigurationReader.getProperty("userEmail");
        loginPage.login()

            }
    @And("user enter valid password {string}")
        public void user_enter_valid_password (String string) {
        System.out.println("user enter valid password: " + string);

        https://www.cvs.com/account/login/
    }

        String password = ConfigurationReader.getProperty("password");
        loginPage.login(userEmail, password);
        }

    @Then("user sign in and verifies that {string} page title is displayed")
    public void user_sign_in_and_verifies_that_page_title_is_displayed(String string) {
        Assert.assertEquals(string, loginPage.getPageSubTitle());
        System.out.println("user sign in and verifies that page title is displayed: " + string);
    }

    @When("user enter {string} as an email address")
    public void user_enter_as_an_email_address(String string) {
        System.out.println("user enter email address: " + string);
    }

    @And("user enter {string} as a password")
    public void user_enter_as_a_password(String string) {
        System.out.println("user enter password: " + string);
    }

    @Then("user verify that {string} message is displayed")
    public void user_verify_that_message_is_displayed(String string) {
        System.out.println("user verify that message is displayed: " + string);
    }

    @When("user enter Invalid_email as {string}")
    public void user_enter_Invalid_email_as(String string) {
        System.out.println("user enter Invalid_email as: " + string);
    }

    @Then("user verify that {string} warning is displayed")
    public void user_verify_that_warning_is_displayed(String string) {
        System.out.println("user verify that warning is displayed: " + string);
    }

    @When("user enter {string} format")
    public void user_enter_format(String string) {
        System.out.println("user enter format: " + string);
    }

    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
        System.out.println("user verifies that message is displayed: " + string);
    }


}

