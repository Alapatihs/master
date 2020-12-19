@Scenario1
Feature: Order a T-shirt and validate the details

Background: LoginSteps

Given User clicks on SignIn button
When User provide username  and password and clicks on Submit button
And User sucessfully logged into Application


  Scenario: Verify the updated personal Infomration in Myaccount.
  
  Given User navigates to personal infomration on My account page
  When User updates the first name in the personal information
  Then Validate the success message "Your personal information has been successfully updated."
   
   
    Scenario: Verify user ordered the T-shirt sucessfully and validate the details in the order History page.
    
    Then User clicks on T-shirt section and selects the first item
    Then User purchaed the T-shirt
    Then User clicks on Back to orderson the payment page
    Then Validate the order details in the order History page 