Feature: Customise modules Functionality 
Background:
Given user is at the application login screen
When User click on the Login with klaar 
And user enters "deepa.nayak@gamma.klaar.team" in username field
And user enters "Klaar2021" in password field
And Click on the signin button
Then user should redirect to Profile page "Deepa Nayak"

Scenario: Add a new user and Update and Delete
Given Navigate to the Settings module
And Navigate to the User list page
And Verify you have landed on All Users page
When 