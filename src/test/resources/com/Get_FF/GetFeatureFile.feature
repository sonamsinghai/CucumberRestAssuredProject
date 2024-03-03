Feature: Validation for book store data

Scenario: test Git Pocket Guide is present in respponse
	Given hit the bookstore api
	Then validate as status code
	Then validate Git Pocket Guide title present
	Then validate Learning JavaScript Design Patterns title present


