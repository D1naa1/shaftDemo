import com.shaft.driver.SHAFT;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Instant;

public class ActionTest extends BaseTest{
    @Test
    public void AddMyData(){
        actions = new ActionPage(driver);
        actions.FillData();


        
    }
}
