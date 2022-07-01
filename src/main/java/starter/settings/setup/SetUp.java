package starter.settings.setup;

import com.github.javafaker.Faker;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import starter.settings.data.Data;
import starter.settings.data.formulary.CSVData;
import starter.settings.elements.Elements;

import java.util.concurrent.TimeUnit;

public class SetUp extends PageObject {

    protected Elements elements = PageFactory.initElements(getDriver(), Elements.class);
    protected CSVData formulary = new CSVData();
    protected Data data = new Data();
    protected Faker faker = new Faker();

    protected void implicitWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    protected void clickOnAction(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.click(element).build().perform();
    }

    protected void attachData(String title, String data) {
        Serenity.recordReportData().withTitle(title).andContents(data);
    }

    protected void alternativeClick(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExec = (JavascriptExecutor) driver;
        jsExec.executeScript(
                "arguments[0].click();", element
        );
    }

    protected void scrollPage(WebDriver driver, int y) {
        JavascriptExecutor jsExec = (JavascriptExecutor) driver;
        jsExec.executeScript(
                "window.scrollBy(0, " + y + ")", ""
        );
    }
}
