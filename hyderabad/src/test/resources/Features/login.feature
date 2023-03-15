#Author
#Date
#Description

@SmokeScenario
Feature: Take the list of flights from home to destination on particular date

@SmokeTest
#  Scenario: Creating a scenario for ramdom list
#Given I open browser 
#And I type url https://www.yatra.com/
#Then I select depart from destination to
#And I select date
#Then I click search flights

  Scenario Outline: Creating a scenario for ramdom list
Given I open browser 
When I type url https://www.yatra.com/
Then I close popup
Then I select <depart> from <destination> to
And I select date
Then I click search flights

 Examples:
 | depart  | destination |
 | chennai | hyderabad   |
 | mumbai  | delhi       |
 



