Feature: user select product from facebook
In order to User Put Date of Birth
As a user click select Month Dat and Year
I want to User fillup all selected option

Scenario Outline:
Given the new user is in the facebook homepage
When Usertype <"Bashudev">and<"Basnyet">
When User type <"basnyetb@yahoo.com">and<"password">
When user click select month to select month
Then user click select day to select day 
Then User click year to selectyear
Then User click Gender  
Examples:
|emailaddress|password|
|basnyetb@yahoo.com|bashudev|
