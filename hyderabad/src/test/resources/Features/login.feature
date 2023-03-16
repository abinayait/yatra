Feature: Take the list of flights from home to destination on particular date

Scenario: Creating a scenario for ramdom list
Given I open browser 
When I type url https://www.yatra.com/
Then I close popup
Then I select "<depart>" from "<destination>" to
And I select date
Then I click search flights

 