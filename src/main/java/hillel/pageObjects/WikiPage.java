package hillel.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage {
    @FindBy(xpath = "//li[@id = 'ca-talk']")
    WebElement talkTab;
    @FindBy(xpath = "//li[@id = 'ca-view']")
    WebElement readTab;
    @FindBy(xpath = "//li[@id = 'ca-viewsource']")
    WebElement viewSourceTab;
    @FindBy(xpath = "//li[@id = 'ca-history']")
    WebElement viewHistoryTab;

    public String getTalkTabText(){
        return talkTab.getText();
    }
    public String getReadTabText(){
        return readTab.getText();
    }
    public String getViewSourceTabText(){
        return viewSourceTab.getText();
    }
    public String getViewHistoryTabText(){
        return viewHistoryTab.getText();
    }


    public String getPageInfo(){
        talkTab.getText();
        readTab.getText();
        viewSourceTab.getText();
        viewHistoryTab.getText();
        return "tab1= " + talkTab.getText()+", "+ "tab2= "+ readTab.getText()+", "+"tab3= "
                +viewSourceTab.getText()+", "+"tab4= "+viewHistoryTab.getText();
    }

    public WikiPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

}
