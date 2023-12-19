package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    /******************************** All Elements' Path on Login page ***********************************************/

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement loginUnsuccessfulMessage;

    /******************************** All Elements' Action Methods on Login page *************************************/

    public String getWelcomeText(){
        String message = getTextFromElement(welcomeText);
        log.info("Getting text from : " + welcomeText.toString());
        return message;
    }

    public void sendDataToEmailField (String emailId) {
        sendTextToElement(emailField, emailId);
        log.info("Sending Text To : " + emailField.toString());
    }

    public void sendDataToPasswordField (String password) {
        sendTextToElement(passwordField, password);
        log.info("Sending Password : " + passwordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on login button : " + loginButton.toString());
    }

    public void loginToTheApplication(String emailID, String password) {
        sendDataToEmailField(emailID);
        sendDataToPasswordField(password);
        clickOnLoginButton();
    }

    public String getLoginUnsuccessfulMessage() {
        String message = getTextFromElement(loginUnsuccessfulMessage);
        log.info("Getting Unsuccessful Message : " + loginUnsuccessfulMessage.toString());
        return message;
    }
}
