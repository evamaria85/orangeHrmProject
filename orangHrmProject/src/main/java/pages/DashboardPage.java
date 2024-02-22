package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    @FindBy(linkText = "Recruitment")private WebElement recruitmentLink;


    @FindBy(linkText = "Admin") private WebElement adminLink;

    public RecruitmentPage navigateToRecruitmentPage(){
        recruitmentLink.click();
        return PageFactory.initElements(Browser.driver,RecruitmentPage.class);
    }
    public AdminPage navigateToAdminPage(String s){
        adminLink.click();
        return PageFactory.initElements(Browser.driver,AdminPage.class);

    }

}
