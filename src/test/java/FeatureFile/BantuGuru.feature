Feature: Login

Scenario: when user opens the application and
          enters the valid credentials and
          click on login button user should be able to see the homepage

Given User Opens the Browser and Enter the URL
Then  Login page should be dislayed
When  Login credentials are entered
And  login button is clicked
Then  Home page should be displayed
Then home page should be displayed
