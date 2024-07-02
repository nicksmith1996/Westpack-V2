package cucumberJava; 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Age;
import Pages.Balance;
import Pages.Calculators;
import Pages.Contribution;
import Pages.Employed;
import Pages.Fund;
import Pages.Home;
import Pages.Income;
import Pages.Retirement;
import Users.User1;
import Users.User2;
import Users.User3;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class annotation { 
   WebDriver driver = new ChromeDriver();
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
   @Given("^I have opened the browser$") 
   public void openURL() { 
	   driver.get(Home.URL); 
	   
   } 
	
   @Then("^I go to the Kiwisaver Link") 
   public void kiwiwsaver() throws InterruptedException { 
	   driver.findElement(By.xpath(Calculators.Kiwisaver_calculator)).click();
		Thread.sleep(2000);
   		} 
	
   @Then("^I go to savings Calculator") 
   public void kiwisavercalc() throws InterruptedException{
	   Thread.sleep(2000);
		js.executeScript("scroll(0, 860)");
			Thread.sleep(500);
		driver.findElement(By.xpath(Calculators.Check_contr)).click();
			Thread.sleep(1000);
   		}
 
   @Then("^I open savings Calculator") 
   public void savingsCalc() throws InterruptedException { 
	   Thread.sleep(1000);
	   driver.findElement(By.className(Calculators.Open_calc)).click();
		Thread.sleep(500);
   		} 
   
   @Then("^I enter User 1s Age")
   public void age_User1() {
		  driver.findElement(By.id(Age.Age_Label)).sendKeys(User1.age + Keys.ENTER);
   		}

   @Then("^I enter User 2s Age")
   		public void age_User2() {
	   		driver.findElement(By.id(Age.Age_Label)).sendKeys(User2.age + Keys.ENTER);
   		}
   		
   @Then("^I enter User 3s Age")
		public void age_User3() {
  			driver.findElement(By.id(Age.Age_Label)).sendKeys(User3.age + Keys.ENTER);
   			}

   @Then("I select Retirement")
	public void retired() {
		driver.findElement(By.xpath(Retirement.Button)).click();

			}
   <!-- these "I select" steps can be merged into one and pass through the value entered instead -->
   @Then("I select Employed")
 	public void employed() throws InterruptedException {
	   driver.findElement(By.xpath(Employed.Feild)).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(Employed.Employeed)).click();
 			}
   
   @Then("I select Self-Employed")
	public void self_employed() throws InterruptedException {
	   driver.findElement(By.xpath(Employed.Feild)).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(Employed.Self_Employeed)).click();
			}

<!--To Pass through from same user details used above -->
   @Then("I Enter Salary for User1")
	public void salary_User1() throws InterruptedException {
	   driver.findElement(By.id(Income.Feild)).sendKeys(User1.salary + Keys.ENTER);
		Thread.sleep(1000);
   		}
   
   @Then("I Enter Starting Balance  for User1")
	public void balance_User1() throws InterruptedException {
	   driver.findElement(By.id(Balance.Feild)).sendKeys(User1.starting + Keys.ENTER);
		Thread.sleep(1000);
  		}
   
   @Then("I Enter Starting Balance  for User2")
	public void balance_User2() throws InterruptedException {
	   driver.findElement(By.id(Balance.Feild)).sendKeys(User2.starting + Keys.ENTER);
		Thread.sleep(1000);
 		}
   
   @Then("I Enter Starting Balance  for User3")
	public void balance_User3() throws InterruptedException {
	   driver.findElement(By.id(Balance.Feild)).sendKeys(User3.starting + Keys.ENTER);
		Thread.sleep(1000);
		}
<!-- Pass through contribution time to an When or an IF statemnt -->
   @Then("I select Fortnightly contribution")
	public void fornightly() throws InterruptedException {
	   driver.findElement(By.xpath(Contribution.Frequency_feild_b)).click();
		driver.findElement(By.xpath(Contribution.Frequency_Fortnightly_b)).click();
  		}
   
   @Then("I select Annual Contribution")
	public void annual() throws InterruptedException {
	   driver.findElement(By.xpath(Contribution.Frequency_feild_b)).click();
		driver.findElement(By.xpath(Contribution.Frequency_Anually_b)).click();
 		}
<!-- if user was xxxx enter value -->
   @Then("I enter Contribution Value for User2")
	public void contibutionValue_User2() throws InterruptedException {
	   driver.findElement(By.id(Contribution.Text_Feild)).sendKeys(User2.contributionDollar + Keys.ENTER);
 		}
   
   @Then("I enter Contribution Value for User3")
  	public void contibutionValue_User3() throws InterruptedException {
  	   driver.findElement(By.id(Contribution.Text_Feild)).sendKeys(User3.contributionDollar + Keys.ENTER);
   		}
   
   @Then("I Enter 4% contribution")
 	public void fourPercent() throws InterruptedException {
	   driver.findElement(By.xpath(Contribution.Feild)).click();
		driver.findElement(By.xpath(Contribution.Percent_4)).click();
   		}
 <!-- to update to allow specified fund type to be passed through -->
   @Then("I select Defensive\\/Cash Fund")
 	public void defensive_Fund() throws InterruptedException {
		driver.findElement(By.xpath(Fund.Feild)).click();
		driver.findElement(By.xpath(Fund.Defensive)).click();
			Thread.sleep(5000);
   		}
   
   @Then("I select Conservative Fund")
  	public void conservative_Fund() throws InterruptedException {
	   driver.findElement(By.xpath(Fund.Feild)).click();
		driver.findElement(By.xpath(Fund.Conservative)).click();
				Thread.sleep(5000);
    		}
   
   @Then("I select Balanced Fund")
 	public void balanced_Fund() throws InterruptedException {
	   driver.findElement(By.xpath(Fund.Feild)).click();
		driver.findElement(By.xpath(Fund.Conservative)).click();
				Thread.sleep(5000);
   		}
   
   
   
   
   
}