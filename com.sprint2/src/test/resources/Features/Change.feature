@tc3
Feature: feature to test the redbus manage ticket functionality 
Scenario: to validate whether user is able to change the journey details
Given user in on the reschedule page of redbus.in
When user enters ticket details
And Clicks confirm details
Then user is navigated to the ticket updation page
And page displays journey date updated successfully.