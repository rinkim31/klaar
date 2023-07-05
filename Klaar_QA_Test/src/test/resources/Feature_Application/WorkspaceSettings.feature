Feature: Workspace Settings Functionlity

Background:
Given user is at the application login screen
When User click on the Login with klaar 
And user enters "deepa.nayak@gamma.klaar.team" in username field
And user enters "Klaar2021" in password field
And Click on the signin button
Then user should redirect to Profile page "Deepa Nayak"

Scenario: Login with the admin credentials
Given Navigate to the Settings module
And Verify you have landed the Workspace settings page "https://dev.klaarhq.com/settings/workspace/details"
And Verify the workspace settings page "Workspace Settings"
When Add a new workspace logo and verify
And Edit the workspace logo and verify
And Delete the workspace logo and veify
Then User should be at workspace logo 

