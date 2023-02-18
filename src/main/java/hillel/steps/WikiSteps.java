package hillel.steps;

import hillel.config.BaseClass;
import hillel.pageObjects.WikiPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WikiSteps extends BaseClass {

    WikiPage wikiPage=new WikiPage(getDriver());

    @When("I open WikiPage {string}")
    public void iOpenWikiPage(String url) {
        getDriver().get(url);
    }

    @Then("check the text of all tabs")
    public void checkTheTabEN(Map<String, Map<String, String>> stringMap) throws InterruptedException {
        Assert.assertEquals(stringMap.get("it").toString(),wikiPage.getPageInfo());
        Thread.sleep(2000);
    }
}

