Feature: Validation for book store data

#Scenario: test Git Pocket Guide is present in respponse
#	Given hit the bookstore api
#	Then validate as status code
#	Then validate Git Pocket Guide title present
#	Then validate Learning JavaScript Design Patterns title present
#	Then validate Designing Evolvable Web APIs with ASP.NET
#	Then validate Speaking JavaScript
	
#	Scenario: test Git Pocket Guide is present in respponse
#	Given hit the bookstore api
#	Then validate as status code
#	Then validate "Git Pocket Guide" at jsonpath "books[0].title" title present
#	Then validate "Learning JavaScript Design Patterns" at jsonpath "books[1].title" title present
	
#	Scenario: test page number is present in respponse
#	Given hit the bookstore api
#	Then validate as status code
#	Then validate "234" at jsonpath "books[0].pages" pageNumbers present

	Scenario: test data in json respponse
	Given hit the bookstore api
	Then validate as status code
	Then validate "Git Pocket Guide" at jsonpath "books[0].title" present
	Then validate "A Working Introduction" at jsonpath "books[0].subTitle" present
	Then validate "Richard E. Silverman" at jsonpath "books[0].author" present
	


