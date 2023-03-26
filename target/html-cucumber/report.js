$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/login.feature");
formatter.feature({
  "name": "Login feature scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "This scenario is to login the medicare application",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef_POM.RegisterStepDef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef_POM.LoginStepDef.i_click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the valid Login credentials",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef_POM.LoginStepDef.i_enter_the_Login_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef_POM.LoginStepDef.i_should_be_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/feature/register.feature");
formatter.feature({
  "name": "Register Feature Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "This scenario is to register in the medicare application",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef_POM.RegisterStepDef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the SignUp button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef_POM.RegisterStepDef.i_click_on_the_SignUp_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the User Details",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef_POM.RegisterStepDef.i_enter_the_User_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the Password details",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef_POM.RegisterStepDef.i_enter_the_Password_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the Address details",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef_POM.RegisterStepDef.i_enter_the_Address_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on confirm button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef_POM.RegisterStepDef.i_click_on_confirm_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be registered as a medicare user",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef_POM.RegisterStepDef.i_should_be_registered_as_a_medicare_user()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});