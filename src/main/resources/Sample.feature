Feature: To validate login function of facebook site
Scenario: To validate the login function with valid username and invalid password

Given To launch browser and maximize window
When To launch the url of facebook site
And To pass the valid username in email field
And To pass the invalid password in the password field
And To click the login button
And To check whether the navigation occured or not
Then To close the entire browser

Scenario Outline: To validate positive and negative combination of usernames and password in facebook login function
Given User has to launch the browser and maximize the window
When User has to launch the facebook URL
And User has to pass the username "<UsernameDatas>" in the required field
And User has to pass the password "<PasswordDatas>" in the required field
And User has to click the login button 
Then User has to close the browser

Examples:
|UsernameDatas       		|PasswordDatas	 |
|vasanth@gmail.com	 		|@vasanthfb	 		 |
|vasanth.r@gmail.com 		|vasanth@fb	 		 |
|r.vasanth@gmail.com 		|@fb.vasanthr	 	 |
|vasanth123@gmail.com		|vasanth123@fb	 | 
|vasanth173@gmail.com		|vasanth173@fb	 |
|vasanth010703@gmail.com|vasanth010703@fb|