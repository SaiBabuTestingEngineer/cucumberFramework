Feature: verifying complete loginFunctionality

Scenario: verify loginFunction with valid credentials
             Given openBrowser and enter Url
             When user entered valid username 
             And user Enter valid password
             When user clicked on loginBtn
             Then It should  naviagte to Dashboard page 
             
Scenario: verify loginFuntion with invalid credentials
             Given openbrowser and enterUrl
             When user entered invalid username 
             And user Enterd invalid password
             When user clicked on log button
             Then it should throw error as "username and password is invalid"
             
Scenario: verify loginFuntion with valid username and invalid password
              Given openbrowser and enteru url
              When user entere valid username 
              And User Enterd invalid password
              When user clicked on log buttone
              Then It should throw error as "password is invalid "
             
Scenario: verify loginFuntion with invalid username and valid password
              Given openbrowser and enterurl
             When user Entered invalid username 
             And User Enterd valid password
             When user clicke on log button 
             Then it should throw errors as "username is invalid "
            
 Scenario: verify loginFuntion with Empty credentials
              Given  openbrowser and entereUrl
              When user keep empty fileds  for user and password  
              When user clicked on login button 
              Then it should  throw  error as "username and password is required"
              
             
             
              