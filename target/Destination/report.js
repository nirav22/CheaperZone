$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 2,
      "value": "# ( LoginFeature ) user for all scenario run"
    }
  ],
  "line": 4,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8859342000,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User Is On Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDeft.user_Is_On_Login_Page()"
});
formatter.result({
  "duration": 590793478,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "# ( LoginSuccess ) user for this scenario run only"
    }
  ],
  "line": 11,
  "name": "User Should Able to Login With Registered Mobile Number.",
  "description": "",
  "id": "login-feature;user-should-able-to-login-with-registered-mobile-number.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@LoginSuccess"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User Enter The MobileNumber.",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User Click on Login Button.",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User Enter The OTP ( Received on Mobile By Sms ).",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Click On Verify Button.",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Login SuccessFully.",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User Is on Dashboard Page.",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDeft.user_Enter_The_MobileNumber()"
});
formatter.result({
  "duration": 203857596,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.user_Click_on_Login_Button()"
});
formatter.result({
  "duration": 137353446,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.user_Enter_The_OTP_Received_on_Mobile_By_Sms()"
});
formatter.result({
  "duration": 2852785542,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.user_Click_On_Verify_Button()"
});
formatter.result({
  "duration": 123967862,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.user_Login_SuccessFully()"
});
formatter.result({
  "duration": 42773000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.user_Is_on_Dashboard_Page()"
});
formatter.result({
  "duration": 860324805,
  "status": "passed"
});
formatter.after({
  "duration": 229411815,
  "status": "passed"
});
});