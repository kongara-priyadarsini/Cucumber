Feature: Demo Web Shop Login feature file
Scenario Outline: Valid login for Demo Web Shop
Given the URL of the demo web shop "http://demowebshop.tricentis.com/login"
When User enters "<username>" as username
And User enters "<password>" as password
And User clicks on Login button
Then User is in a valid page

Examples:
|username|password|
|askmail@email.com|abc123|
|askmail@ymail.com|abc123|
|askmail@gmail.com|abc123|

