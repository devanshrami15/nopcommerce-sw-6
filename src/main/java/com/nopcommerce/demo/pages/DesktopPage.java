package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    /******************************** All Elements' Path on Desktops page ***********************************************/

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerLink;


    /******************************** All Elements' Action Methods on Desktops page *************************************/

    public String getWelcomeText() {
        log.info("Getting Computers Text : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnBuildYourOwnComputerLink () {
        clickOnElement(buildYourOwnComputerLink);
        log.info("Clicking On Build Your Computer link : " + buildYourOwnComputerLink.toString());
    }
}
