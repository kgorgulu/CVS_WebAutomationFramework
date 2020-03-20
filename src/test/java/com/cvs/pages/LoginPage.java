package com.cvs.pages;

import com.cvs.utilities.ConfigurationReader;
import com.cvs.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends com.cvs.pages.BasePage {

    @FindBy(id = "email") //this line will initialize web element
    public WebElement userEmailInput;

    @FindBy(className = //*[contains(@class, 'btn btn-outline-continue twoStep-create-account')])

    public WebElement continueClick;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(className = //*[contains(@class, 'btn btn-outline-continue twoStep-create-account')])

    public WebElement signinClick;

    public LoginPage(){

            PageFactory.initElements(Driver.get(), this);
            }


     /**
     * reusable login method
     * just call this method to login
     * provide userEmail and password as parameters
     *
     * @param userEmail
     * @param password
     */
    public void emailLogin(String userEmail) {

        userEmailInput.sendKeys(userEmail);
        emailLogin(ConfigurationReader.getProperty("Sign_in_name"){
    }
    public void passwordLogin(String password){
        passwordInput.sendKeys(password, Keys.ENTER);
    }

    public void passwordLogin() {
        ConfigurationReader.getProperty("password"));
    }

    public void roleLogin(String role){
            String userEmail = ConfigurationReader.getProperty("userEmail");
            ;
            String password = ConfigurationReader.getProperty("password");
        }
        switch (role) {
            case "user":
                userEmail = ConfigurationReader.getProperty("Sign_in_name");
                break;
                default:
                throw new RuntimeException("Invalid role!");
        }
        login(userEmail,password);
    }

    public void login(String userName, String password) {
        userNameInput.sendKeys(userName);
        //Keys.ENTER to replace login click
        passwordInput.sendKeys(password, Keys.ENTER);
    }

    public void login() {
        login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }

    public void login(String role) {
        String userName = "";
        String password = "";

        switch (role) {
            case "user":
                userName = ConfigurationReader.getProperty("userEmail");
                break;
            case "store manager":
                userName = ConfigurationReader.getProperty("store.manager.username");
                break;
            case "sales manager":
                userName = ConfigurationReader.getProperty("sales.manager.username");
                break;
            default:
                throw new RuntimeException("Invalid role!");
        }
        login(userName, password);
    }

}
