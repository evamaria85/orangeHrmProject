import org.testng.annotations.Test;


public class RecruitmentTest extends TestBase {
    //WebDriver driver;


    @Test
    public void test01(){
       startLoginPage()
               .loginToDashboard()
               .navigateToRecruitmentPage()
               .selectOptionFromDropdown("QA Lead");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    public void test02(){

    }
}
