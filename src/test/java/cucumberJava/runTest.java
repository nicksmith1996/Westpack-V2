package cucumberJava;
 
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 

@Cucumber.Options(Tags = {@User3}, format = {"pretty", "html:target/cucumber"}) 

public class runTest { }