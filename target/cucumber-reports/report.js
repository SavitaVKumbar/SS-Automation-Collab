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
      "name": "@NewTest1"
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
  "duration": 170761747095,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//div[@id\u003d\u0027admin-com-list\u0027]/div/div[@class\u003d\u0027v-tbl-name\u0027])[1]\"}\n  (Session info: chrome\u003d73.0.3683.86)\n  (Driver info: chromedriver\u003d2.46.628402 (536cd7adbad73a3783fdc2cab92ab2ba7ec361e1),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027INFLAP117\u0027, ip: \u0027192.168.0.137\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628402 (536cd7adbad73a..., userDataDir: C:\\Users\\savita\\AppData\\Loc...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:61048}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 73.0.3683.86, webStorageEnabled: true}\nSession ID: f477235821acbb3002201d5f9cadc3e7\n*** Element info: {Using\u003dxpath, value\u003d(//div[@id\u003d\u0027admin-com-list\u0027]/div/div[@class\u003d\u0027v-tbl-name\u0027])[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.getText(Unknown Source)\r\n\tat com.stepdefinitions.ss.CreateCompany.login_to_existing_company_admin(CreateCompany.java:1281)\r\n\tat ✽.Given Login to existing company admin(features/CreateCompany.feature:37)\r\n",
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
formatter.scenario({
  "line": 78,
  "name": "Test1",
  "description": "",
  "id": "create-a-company-through-the-invitation-email;test1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 77,
      "name": "@NewTest1"
    }
  ]
});
formatter.step({
  "line": 79,
  "name": "Test",
  "keyword": "And "
});
formatter.match({
  "location": "CreateCompany.test()"
});
formatter.result({
  "duration": 9587523,
  "status": "passed"
});
});