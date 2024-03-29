
Feature: validation for bookstore data 
	
#Scenario: Validate data in json response with data table
#Given Hit the bookstore api 
#Then validate as status code 
#Then validate data from response
#	|	Git Pocket Guide						|	books[0].title					|
#	|	A Working Introduction	|	books[0].subTitle		|
#	|	Richard E. Silverman				|	books[0].author			|
#	|	No Starch Press  						|	books[7].publisher	|
	
	
Scenario: Validate data in json response with data table
Given Hit the bookstore api 
Then validate as status code 
Then validate data from response
	|	Git Pocket Guide						|	books[0].title					|
	|	A Working Introduction	|	books[0].subTitle		|
	|	Richard E. Silverman				|	books[0].author			|
	|	No Starch Press  						|	books[7].publisher	|
	|	234										  						|	books[0].pages			|

