$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CreateCompany.feature");
formatter.feature({
  "line": 1,
  "name": "Create a company through the invitation email",
  "description": "",
  "id": "create-a-company-through-the-invitation-email",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 36,
  "name": "Verify that review is moved to different tabs after performing the actions in social monitor",
  "description": "",
  "id": "create-a-company-through-the-invitation-email;verify-that-review-is-moved-to-different-tabs-after-performing-the-actions-in-social-monitor",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@RegressionTest4"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "Login to existing company admin",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "SS Admin performs actions on the reviews in Social Monitor",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "Review is moved to resolutions",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 40,
      "value": "#And Emails should be received and user should be able to reply"
    }
  ],
  "line": 41,
  "name": "Company admin should be able to see the reviews in social monitor",
  "keyword": "And "
});
formatter.match({
  "location": "CreateCompany.login_to_existing_company_admin()"
});
formatter.result({
  "duration": 31492896770,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.ss_admin_performs_actions_on_the_reviews_in_social_monitor()"
});
formatter.result({
  "duration": 64328200758,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.review_is_moved_to_resolutions()"
});
formatter.result({
  "duration": 27443596105,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.company_admin_should_be_able_to_see_the_reviews_in_social_monitor()"
});
formatter.result({
  "duration": 37002,
  "status": "passed"
});
});