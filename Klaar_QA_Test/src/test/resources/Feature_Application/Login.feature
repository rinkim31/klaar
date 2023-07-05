Feature: Login functionality with data
Scenario Outline: Login with valid Credentials
Given user is at the application login screen
When User click on the Login with klaar 
And user enters "<username>" in username field
And user enters "<password>" in password field
And Click on the signin button
Then user should redirect to Profile page "<Name>"

Examples:
|username | password | Name|
|deepa.nayak@gamma.klaar.team|Klaar2021 |Deepa Nayak|