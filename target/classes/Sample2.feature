Feature: To validate the create new account function in Facebook Login page

Scenario: To create new account in facebook
Given To launch the browser and maximize the window
When To launch the facebook url
And To click create new account button

And To pass the firstname in the Firstname text box
|firstname1|Vasanth|
|firstname2|Vijay|
|firstname3|Kamal|
|firstname4|Rajni|

And To pass the second name in the surname text box

And To pass the username in mobie or email text box
|password1|password2|password3|
|@vasanthfb|vasanth@fb|fb@vasanth|
|@vijayfb	 |vijay@fb  |fb@vijay  |
|@Kamalfb  |Kamal@fb  |fb@Kamal  |
|@Rajnifb  |Rajni@fb  |fb@Rajni  |

And To pass new password using new password text box
Then To close the browser