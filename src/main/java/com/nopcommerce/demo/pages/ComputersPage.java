package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputersPage.class.getName());

    /******************************** All Elements' Path on Computers page ***********************************************/

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement welcomeText;

    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement desktopsMenuLink;

    /******************************** All Elements' Action Methods on Computers page *************************************/

    public String getWelcomeText() {
        log.info("Getting Computers Text : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnDesktopsLink() {
        clickOnElement(desktopsMenuLink);
        log.info("Clicking On Desktops menu : " + desktopsMenuLink.toString());
    }

}
