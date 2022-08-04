Feature: iphone purchase using amazon functionality
Scenario: user login in amazon login page
Given: user lanuch the url functionality
When: user enter the username in username functionality
Then: user click the continue button and it navigate to purchase page

Scenario: search iphone functionality
Given: Select iphone12 in purchase functionality
When: user select the iphone12 black color in purchase functionality
And: user click the buy now option 
Then: user navigated to the payment page

Scenario: user select the payment method
Given: user select the gpay payment mode in payment functionality
When: user done the payment
Then: user navigated to the home page

