Feature: feature to test the redbus manage ticket functionality 
Scenario: to validate whether user is able to get ticket on email/sms
Given user in on the email/sms page of redbus.in
When user enters valid details
And Clicks send email/sms
Then the user receives ticket on specified email 
 