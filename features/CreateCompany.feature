Feature: Create a company through the invitation email

@RegressionTest1
Scenario: Create a company hierarchy
Given Login as Social Survey Admin
And Send Invite by entering all the details and logout
And Login to gmail account of the customer
And Click on link in the email and enter all company details
When Login with Company credentials entered
Then Company admin should be able to login to the company
And Company admin should be able to add region, office and user

@RegressionTest1
Scenario: Send and Submit Survey
Given Login as Company Admin
And Social monitor is enabled in company admin
And User is added in manage team
And Edit the survey with all type of questions
And Social medias are connected in settings page
And Survey is sent to the user navigating to dashboard and logout
When User submits the survey from the email sent
Then Review should be displayed under reviews section in dashboard
And Review should also be displayed in Edit profile page
And Review should also be displayed in Public page
And Survey completed email should be delivered
#And Review should be auto posted in linked in
And Review should be auto posted in twitter

@RegressionTest3
Scenario: Verify if all the screens are loading properly
Given Login as SS Admin or Company Admin or Agent
When Company Admin clicks on any link or tab
Then Screens should load properly

@RegressionTest4
Scenario: Verify that review is moved to different tabs after performing the actions in social monitor
Given Login to existing company admin
When SS Admin performs actions on the reviews in Social Monitor
Then Review is moved to resolutions
#And Emails should be received and user should be able to reply
And Company admin should be able to see the reviews in social monitor

@RegressionTest5
Scenario: Verify for the reports and adding a monitor in social monitor
Given Login to existing company admin
When Comp Admin adds a monitor and verifies reports
Then Monitor added should be displayed
And Count should be correct with the count of posts

@RegressionTest6
Scenario: Verify that survey score count and dates are proper
Given Login to existing company admin for survey reports
When Company admin selects date range and generates the survey result report
Then Date ranges should not be less than start date and greater than end date
And Survey score count should be equal in dashboard

@RegressionTest7
Scenario: Verify for the public pages of Company Region, Office and Agent 
Given Login to existing company admin for public pages verification
When Option Hide Public Page is enabled
Then Public pages for all should be hidden
And Public pages are dispalyed when unchecked

@RegressionTest8
Scenario: Verify for the javascript pages of Company Region, Office and Agent 
Given Login to existing company admin for javascript pages verification
When Company admin makes changes in java script widget and save by overriding
Then Values of the fields should be overridden for lower hierarchy
And Javascript widget should be locked when comp admin saves by overriding and locking

@RegressionTest9
Scenario: Verify for the search results in LO search
Given Launch the LO search URL
When User searches with different parameters
Then Results should be proper

@RegressionTest10
Scenario: Verify for the reports
Given Login to existing companny for verifying reports
When User downloads the reports
Then Report should have the correct value with that of UI

@RegressionTest11
Scenario: Verify for the quick edits
Given Login to existing company for verifying quick edits
When Created a new agent and update the logo
Then Details should be updated in agent login
