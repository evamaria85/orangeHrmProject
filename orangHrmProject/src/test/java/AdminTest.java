import org.testng.annotations.Test;

public class AdminTest extends TestBase {

    @Test
    public void test002(){
        startLoginPage()
                .loginToDashboard()
                .navigateToAdminPage("Aaliyah.Haq")
                .validateUserName("Aaliyah.Haq");

    }
}
