$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Cancel.feature");
formatter.feature({
  "name": "feature to test the redbus manage ticket functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to validate whether user is able to cancel the ticket",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user in on the cancellation page of redbus.in",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.CancelDefs.user_in_on_the_cancellation_page_of_redbus_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should have  ticket detail for cancellation",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.CancelDefs.user_should_have_ticket_detail_for_cancellation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters accurate details",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.CancelDefs.user_enters_accurate_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks Cancel Ticket",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.CancelDefs.clicks_cancel_ticket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the ticket cancellation page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.CancelDefs.user_is_navigated_to_the_ticket_cancellation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page displays ticket cancelled successfully.",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.CancelDefs.page_displays_ticket_cancelled_successfully()"
});
formatter.result({
  "status": "passed"
});
});