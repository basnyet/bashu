Feature: User want to sign in and sign off from osCommerce.
In order to Sign in and Sign off from account 
As a register user
I want to enter Email Address, Password and click sign in to login 
and click Sign off for sign out


Scenario Outline:
Given the user want to SignIn and SignOff from osCommerce
When the user visit osCommerce website
And the user click the LoginLogo for Login
Then the user can click log in option
And the User can type <"username" and <"password">
Then The User Click Login for open the page
Then user can click sign off option for logout 

Examples:
|  username  | password  |
| basnyet    | abc123    |