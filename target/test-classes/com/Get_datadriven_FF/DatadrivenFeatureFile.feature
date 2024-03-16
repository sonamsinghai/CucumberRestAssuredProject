Feature: Validation for book store data

	Scenario Outline: test data in json respponse
	Given hit the bookstore api
	Then validate as status code
	Then validate data <ExpValue> from <jsonPath> response 
	Examples:
			|	ExpValue													|	jsonPath										|
			|	'Git Pocket Guide'						|	'books[0].title'					|
			|	'A Working Introduction'	|	'books[0].subTitle'		|
			|	'Richard E. Silverman'				|	'books[0].author'			|
			|	'No Starch Press'  						|	'books[7].publisher'	|


