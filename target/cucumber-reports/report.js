$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CreateCompany.feature");
formatter.feature({
  "line": 1,
  "name": "Create a company through the invitation email",
  "description": "",
  "id": "create-a-company-through-the-invitation-email",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 90,
  "name": "Verify for the new dashboard",
  "description": "",
  "id": "create-a-company-through-the-invitation-email;verify-for-the-new-dashboard",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 89,
      "name": "@RegressionTest12"
    }
  ]
});
formatter.step({
  "line": 91,
  "name": "Login to existing company for verifying new dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 92,
  "name": "Navigated to dashboard",
  "keyword": "When "
});
formatter.step({
  "line": 93,
  "name": "Values on UI should match with that of DB",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateCompany.login_to_existing_company_for_verifying_new_dashboard()"
});
formatter.result({
  "duration": 30763954520,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.navigated_to_dashboard()"
});
formatter.result({
  "duration": 11359814427,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.values_on_ui_should_match_with_that_of_db()"
});
formatter.result({
  "duration": 1550974289,
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\tCompleted count is incorrect expected [64] but found [69],\n\tIncomplete count is incorrect expected [80] but found [78],\n\tProcessed count is incorrect expected [144] but found [147],\n\tZillow count is incorrect expected [48] but found [47],\n\tThird Party count is incorrect expected [1510] but found [1509],\n\tCorrupted count is incorrect expected [0] but found [3]\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\r\n\tat com.stepdefinitions.ss.CreateCompany.values_on_ui_should_match_with_that_of_db(CreateCompany.java:5250)\r\n\tat ✽.Then Values on UI should match with that of DB(features/CreateCompany.feature:93)\r\n",
  "status": "failed"
});
});