#regression tag is used to run all the test cases
@regression
Feature: Post request testing

Scenario: 1Post request validation
Given Create User with data
Then validate user created.
Then validate user ID have non null value

#smoke is used to run single test case only otherthan commented others
@smoke																													
Scenario: 2Post request validation
Given Create User "Anil" with data from file
Given Create User "Sonam" with data from file
Then validate user created.
Then validate user ID have non null value

Scenario: 3Post request validation for header
Given Create User "Anil" with data from file
Then validate all headers