package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {

    public void homepageAssertion(){
        String actualHomepage = driver.getCurrentUrl();
        Assert.assertThat(actualHomepage, Matchers.containsString("iceland"));
    }

    @FindBy(id = "header-search")
    WebElement searchbox;

    public void doSearch(){
        searchbox.sendKeys("crisps");
    }

    @FindBy(xpath = "//button[@class='btn btn-dark']//*[local-name()='svg']")
    WebElement clickSearchButton;

    public void doClick(){
        clickSearchButton.click();

    }

    public void resultAssertion(){
        String actualResultPage = driver.getCurrentUrl();
        Assert.assertThat(actualResultPage, Matchers.containsString("crisps"));
    }
}
