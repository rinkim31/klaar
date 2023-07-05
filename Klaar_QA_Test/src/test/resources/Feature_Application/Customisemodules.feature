Feature: Customise modules Functionality 
Background:
Given user is at the application login screen
When User click on the Login with klaar 
And user enters "deepa.nayak@gamma.klaar.team" in username field
And user enters "Klaar2021" in password field
And Click on the signin button
Then user should redirect to Profile page "Deepa Nayak"

Scenario: Verify the Toggle on/off Strength
Given Navigate to the Settings module
And Navigate to the Customize modules page
When Test toggle on/off for profile module My Strength
Then User should be able see the Toggle on/off effect on the profile page 

Scenario: Verify the Toggle on/off Skill
Given Navigate to the Settings module
And Navigate to the Customize modules page
When Test toggle on/off for profile module  My Skills
Then User should be able see the Toggle on/off effect on the profile page 

Scenario: Verify the Toggle on/off Teams module
Given Navigate to the Settings module
And Navigate to the Customize modules page
When Test toggle on/off for profile module Teams module
Then User should be able see the Toggle on/off effect on the profile page 

Scenario: Verify the Toggle on/off Strength profile page
Given Navigate to the Settings module
And Navigate to the Customize modules page
When Test toggle on/off for profile module Health module
Then User should be able see the Toggle on/off effect on the profile page 
