import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;



public class ActionPage extends BasePage{

    By FirstName = By.xpath("/html/body/div/form/input[1]");
    By LastName = By.xpath("//input[@name=\"lastName\"]");
    By Level = By.xpath("//select[@name=\"level\"]") ;
    By Type = By.xpath("//label[@for=\"web\"]");
    By SubmitBtn = By.xpath("//button[@type=\"submit\"]");

    public ActionPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }


    public void FillData (){

        driver.element().type(FirstName,"Dina");
        driver.element().type(LastName,"Ahmed");
        driver.element().select(Level,"Senior");
        driver.element().click(Type);
        driver.element().click(SubmitBtn);

    }
}
