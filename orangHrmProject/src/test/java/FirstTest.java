
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;
import pages.LoginPage;



public class FirstTest extends TestBase {
    //WebDriver driver;


    @Test
    public void test01(){
       startLoginPage().loginToDashboard();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    public void test02(){

    }
}
