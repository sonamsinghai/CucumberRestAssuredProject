Feature: Post request testing

Scenario: 1Post request validation
Given Create User with data
Then validate user created.
Then validate user ID have non null value

Scenario: 2Post request validation
Given Create User "Anil" with data from file
Given Create User "Sonam" with data from file
Then validate user created.
Then validate user ID have non null value

Scenario: 3Post request validation for header
Given Create User "Anil" with data from file
Then validate all headers