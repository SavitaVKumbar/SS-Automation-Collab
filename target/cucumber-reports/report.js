$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CreateCompany.feature");
formatter.feature({
  "line": 1,
  "name": "Create a company through the invitation email",
  "description": "",
  "id": "create-a-company-through-the-invitation-email",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Create a company hierarchy",
  "description": "",
  "id": "create-a-company-through-the-invitation-email;create-a-company-hierarchy",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@RegressionTest1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Login as Social Survey Admin",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Send Invite by entering all the details and logout",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Login to gmail account of the customer",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on link in the email and enter all company details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Login with Company credentials entered",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Company admin should be able to login to the company",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Company admin should be able to add region, office and user",
  "keyword": "And "
});
formatter.match({
  "location": "CreateCompany.login_as_social_survey_admin()"
});
formatter.result({
  "duration": 14487078257,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.send_invite_by_entering_all_the_details_and_logout()"
});
formatter.result({
  "duration": 3328835848,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.login_to_gmail_account_of_the_customer()"
});
formatter.result({
  "duration": 9482714184,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.click_on_link_in_the_email_and_enter_all_company_details()"
});
formatter.result({
  "duration": 86743591235,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.login_with_company_credentials_entered()"
});
formatter.result({
  "duration": 7004995765,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.company_admin_should_be_able_to_login_to_the_company()"
});
formatter.result({
  "duration": 4261360732,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.company_admin_should_be_able_to_add_region_office_and_user()"
});
formatter.result({
  "duration": 55933986497,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Send and Submit Survey",
  "description": "",
  "id": "create-a-company-through-the-invitation-email;send-and-submit-survey",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@RegressionTest1"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Login as Company Admin",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Social monitor is enabled in company admin",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User is added in manage team",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Edit the survey with all type of questions",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Social medias are connected in settings page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Survey is sent to the user navigating to dashboard and logout",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User submits the survey from the email sent",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Review should be displayed under reviews section in dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Review should also be displayed in Edit profile page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Review should also be displayed in Public page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Survey completed email should be delivered",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 26,
      "value": "#And Review should be auto posted in linked in"
    }
  ],
  "line": 27,
  "name": "Review should be auto posted in twitter",
  "keyword": "And "
});
formatter.match({
  "location": "CreateCompany.login_as_company_admin()"
});
formatter.result({
  "duration": 20248997241,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.social_monitor_is_enabled_in_company_admin()"
});
formatter.result({
  "duration": 12334687211,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.user_is_added_in_manage_team()"
});
formatter.result({
  "duration": 7856403177,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.edit_the_survey_with_all_type_of_questions()"
});
formatter.result({
  "duration": 34067168899,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.social_medias_are_connected_in_settings_page()"
});
formatter.result({
  "duration": 25292752005,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.survey_is_sent_to_the_user_navigating_to_dashboard_and_logout()"
});
formatter.result({
  "duration": 19301767492,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.user_submits_the_survey_from_the_email_sent()"
});
formatter.result({
  "duration": 92265945312,
  "status": "passed"
});
formatter.match({
  "location": "CreateCompany.review_should_be_displayed_under_reviews_section_in_dashboard()"
});
formatter.result({
  "duration": 173508737,
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : }\n  (Session info: chrome\u003d74.0.3729.157)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds: null\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027INFLAP117\u0027, ip: \u0027192.168.0.169\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\savita\\AppData\\Loc...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:63567}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 74.0.3729.157, webStorageEnabled: true}\nSession ID: ae960857aac5f45a8fb10a6f1e7c5091\n*** Element info: {Using\u003did, value\u003dlogin-user-id}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:172)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:365)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.sendKeys(Unknown Source)\r\n\tat com.util.ss.CommonFunctions.fn_LoginAsSSorCompAdmin(CommonFunctions.java:55)\r\n\tat com.stepdefinitions.ss.CreateCompany.review_should_be_displayed_under_reviews_section_in_dashboard(CreateCompany.java:969)\r\n\tat ✽.Then Review should be displayed under reviews section in dashboard(features/CreateCompany.feature:22)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateCompany.review_should_also_be_displayed_in_edit_profile_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCompany.review_should_also_be_displayed_in_public_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCompany.survey_completed_email_should_be_delivered()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCompany.review_should_be_auto_posted_in_twitter()"
});
formatter.result({
  "status": "skipped"
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
      "name": "@RegressionTest1"
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
  "line": 40,
  "name": "Emails should be received and user should be able to reply",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Company admin should be able to see the reviews in social monitor",
  "keyword": "And "
});
formatter.match({
  "location": "CreateCompany.login_to_existing_company_admin()"
});
formatter.result({
  "duration": 11980624,
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : }\n  (Session info: chrome\u003d74.0.3729.157)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds: null\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027INFLAP117\u0027, ip: \u0027192.168.0.169\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\savita\\AppData\\Loc...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:63567}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 74.0.3729.157, webStorageEnabled: true}\nSession ID: ae960857aac5f45a8fb10a6f1e7c5091\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:172)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:273)\r\n\tat com.util.ss.CommonFunctions.fn_OpenURL(CommonFunctions.java:49)\r\n\tat com.stepdefinitions.ss.CreateCompany.login_to_existing_company_admin(CreateCompany.java:1341)\r\n\tat ✽.Given Login to existing company admin(features/CreateCompany.feature:37)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateCompany.ss_admin_performs_actions_on_the_reviews_in_social_monitor()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCompany.review_is_moved_to_resolutions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCompany.emails_should_be_received_and_user_should_be_able_to_reply()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCompany.company_admin_should_be_able_to_see_the_reviews_in_social_monitor()"
});
formatter.result({
  "status": "skipped"
});
});