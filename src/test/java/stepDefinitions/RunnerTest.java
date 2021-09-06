package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



/*@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue={"stepDefinitions"},
        monochrome = true,//results will be organized//without this also no pblm
        publish=true,//to get cucumber reports
        tags="@SanityFlow",
        plugin={"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber.json", "junit:target/cucumber.xml", "rerun:target/rerun.txt"})
*/
public class RunnerTest {
    public static void main(String[] args) {
        System.out.println("git");
    }
}

//console-click on cucumber reports link-you can also share reports
//to rename project-go to file exporer and rename it

//mvn test
//view-tool windows-maven
//make sure that classname has test in it(runnerTest and not runner)-otherwise maven won't run
//add maven compiler and surefire plugin
//mvn clean & mvn test-mvn clean clears all the previous results-no target
//mvn -version -to check maven

//another way

//go to path of project
//type cmd
//type -mvn clean test

//sending to github
//-mvn clean-vcs-share project on github-share if login
//commit msg should have proper info of what change we are making
//click on git-commit,push,pull everything wiill be there
//2 teammembers changed same session of code at same time
//if they tried to push to git repository at the same time there is a conflict,resolutions are done by test lead
//git commit and push
//we will be pushing multiple times a day
//to get a new one we have to pull it
//just pull every time

//file-new-project from version control-you can paste git url here
//change path-directory
//to update it -git-pull-you can slct branch you want to update

//merge-to join 2 branches
//rebase-to make a sudden change to already changed project
//branches-to create new branch


