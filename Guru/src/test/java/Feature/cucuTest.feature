Feature: Guru Login


@Test @login
Scenario: Test if login is successful
Given when user is on login page
When user enters the valid credentials
And Login is successful
Then Close the browser
