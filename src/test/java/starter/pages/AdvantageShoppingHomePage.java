package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import starter.settings.setup.SetUp;

@DefaultUrl("page:advantage.online.shopping.url")
public class AdvantageShoppingHomePage extends SetUp {

    private static final Logger logger = LoggerFactory.getLogger(AdvantageShoppingHomePage.class);

    public void openWebsite() {
        logger.info("Open website");
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();
        open();
        implicitWait(getDriver());
    }

    public void performsClickOnLoginButton() {
        logger.info("Click on 'login' button");
        alternativeClick(getDriver(), elements.getLoginButton());
        implicitWait(getDriver());
    }

    public void performsClickOnCreateNewAccount(String link) {
        logger.info("Click on '" + link + "' link");
        alternativeClick(getDriver(), elements.getCreateNewAccountLink());
        implicitWait(getDriver());
    }

}
