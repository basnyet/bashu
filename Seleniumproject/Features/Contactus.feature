Feature: user want to go inside contact us for weite some massage
In order to User goin contact
As a user click contact us option to go next step
I want to User click contact us and reach the next page to write enquiry

Scenario Outline:
Given the new user is in the oscommerce homepage
When user click on contact us option to go into the contact us page
Then user can write "<Full Name>"and"<Email Address>"and"<Enquiry>"
Then User click continue botton to go next step
Examples:
|Full Name|Email Address|Enquiry|
|Bashudev Basnyet|basnyetb@yahoo.com|Hello How are you|
