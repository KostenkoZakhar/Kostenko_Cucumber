package hillel.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/main/java/hillel/features",//path to feature files
        glue = "hillel.steps",//package path
        tags = "@ALL",//list feature files for run
        publish = true,
        dryRun = false,
        monochrome = true


)
public class RunnerWiki {

    @BeforeClass
    public static void createDriver() {
        //,CUCUMBER_PUBLISH_TOKEN=4634b17e-a0cd-4811-bc62-3f5f98da054d
        System.setProperty("CUCUMBER_PUBLISH_TOKEN", "4634b17e-a0cd-4811-bc62-3f5f98da054d");
    }

}
