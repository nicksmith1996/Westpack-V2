
@tag
Feature: CucumberJava
  I want to use this template for my feature file

  @user1 @retired @employeed
  Scenario: user1 wants to know what expected Kiwasaver will be
    Given I have opened the browser
		Then I go to the Kiwisaver Link
		Then I go to savings Calculator
		Then I open savings Calculator
		Then I enter User 1s Age
		Then I select Retirement
		Then I select Employed
		Then I Enter Salary for User1
		Then I Enter Starting Balance  for User1
		Then I Enter 4% contribution
		Then I select Defensive/Cash Fund

		
	@User2 @selfemployeed 
  Scenario: user2 wants to know what expected Kiwasaver will be
    Given I have opened the browser
		Then I go to the Kiwisaver Link
		Then I go to savings Calculator
		Then I open savings Calculator
		Then I enter User 2s Age
		Then I select Retirement
		Then I select Self-Employed
		Then I Enter Starting Balance  for User2
		Then I select Fortnightly contribution
		Then I enter Contribution Value for User2
		Then I select Conservative Fund
		
	@User3 @selfemployeed 
  Scenario: user3 wants to know what expected Kiwasaver will be
    Given I have opened the browser
		Then I go to the Kiwisaver Link
		Then I go to savings Calculator
		Then I open savings Calculator
		Then I enter User 3s Age
		Then I select Retirement
		Then I select Self-Employed
		Then I Enter Starting Balance  for User3
		Then I select Annual Contribution
		Then I enter Contribution Value for User3
		Then I select Balanced Fund
		


