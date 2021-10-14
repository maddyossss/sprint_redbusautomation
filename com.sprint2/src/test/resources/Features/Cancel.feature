Feature: feature to test the redbus manage ticket functionality 
Scenario: to validate whether user is able to cancel the ticket
Given user in on the cancellation page of redbus.in
And user should have  ticket detail for cancellation
When user enters accurate details
And Clicks Cancel Ticket
Then user is navigated to the ticket cancellation page
And page displays ticket cancelled successfully.