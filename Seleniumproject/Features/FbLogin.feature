Feature: User want to Login Facebook Account.

Scenario Outline:

Given user go to Facebook website page
When UserType "<Email Address>"and"<password>"
When userclick Login or Signup option
Then user able to open the won facebook page.

Examples:
|Email Address|password|
|basnyetb@yahoo.com|password@fb|