Feature: OrangeHRM Application Functionalities testing.
Scenario: Validating OrangeHRM Application LogIn Page Test.
Given user should launch Chrome Browser.
When user should enter valid OrangeHRM Application Url address.
Then user should be navigated to OrangeHRM Application LogIn Page with "<username>" and "<password>"

Then user should close the Browser along with the Application.


Examples:
|userName|Password|
|admin|Pushp@87772|