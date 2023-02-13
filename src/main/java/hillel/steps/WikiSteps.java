package hillel.steps;

import hillel.config.BaseClass;
import hillel.pageObjects.WikiPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;

public class WikiSteps extends BaseClass {

    WikiPage wikiPage=new WikiPage(getDriver());

    @When("I open WikiPage {string}")
    public void iOpenWikiPage(String url) {
        getDriver().get(url);
    }

    @Then("check the text of all tabs")
    public void checkTheTab(Map<String, Map<String, String>> stringMap) throws InterruptedException {
        String s = wikiPage.getPageInfo();
        System.out.println(s + "\n");
        Thread.sleep(2000);
    }
}

