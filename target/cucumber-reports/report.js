$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CreateCompany.feature");
formatter.feature({
  "line": 1,
  "name": "Create a company through the invitation email",
  "description": "",
  "id": "create-a-company-through-the-invitation-email",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 78,
  "name": "Verify for the reports",
  "description": "",
  "id": "create-a-company-through-the-invitation-email;verify-for-the-reports",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 77,
      "name": "@NewTest"
    }
  ]
});
formatter.step({
  "line": 79,
  "name": "Login to existing companny for verifying reports",
  "keyword": "Given "
});
formatter.step({
  "line": 80,
  "name": "User downloads the reports",
  "keyword": "When "
});
formatter.step({
  "line": 81,
  "name": "Report should have the correct value with that of UI",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateCompany.login_to_existing_companny_for_verifying_reports()"
});
formatter.result({
  "duration": 30251835890,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.user_downloads_the_reports()"
});
formatter.result({
  "duration": 306549471520,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.report_should_have_the_correct_value_with_that_of_ui()"
});
formatter.result({
  "duration": 138707221941,
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\tCount of rows in verified user report is not equal to the number of users on UI  expected [46] but found [17],\n\tCount of rows in incomplete survey results report is not equal to the number of users on UI  expected [77] but found [72],\n\tTRX_RCVD and processed count is not correct. expected [1] but found [2],\n\tCompleted count is not correct. expected [1] but found [0],\n\tCompleted percentage is not correct. expected [(100%)] but found [(0%)],\n\tIncompleted count is not correct. expected [0] but found [2],\n\tIncompleted percentage is not correct. expected [(0%)] but found [(100%)],\n\tTRX_RCVD and processed count is not correct. expected [1] but found [5],\n\tCompleted count is not correct. expected [1] but found [5],\n\tCompleted percentage is not correct. expected [(100%)] but found [100],\n\tIncompleted percentage is not correct. expected [(0%)] but found [0]\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\r\n\tat com.stepdefinitions.ss.CreateCompany.report_should_have_the_correct_value_with_that_of_ui(CreateCompany.java:4481)\r\n\tat ✽.Then Report should have the correct value with that of UI(features/CreateCompany.feature:81)\r\n",
  "status": "failed"
});
});