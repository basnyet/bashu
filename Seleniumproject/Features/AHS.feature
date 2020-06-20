Feature: User wants to open register AHSins Account


Scenario Outline:
Given User in AHSins my account page
Given User click MyAccount botton
When User Type <"Email Address">and<"password">
Then User click Login option
Then User able to open the this Account

Examples:
|Email Address|password|
|basnyetb@yahoo.com|Bashudev1213|