Feature: Verify products


Scenario: Verify product name 
		
			Given I am on the homepage
			When I click on "Blouse"
			Then The product page should also display "Blouse"
			And  The product price should be 27.00
			
@test
Scenario Outline: Verify product info using Scenario Outline
			
			Given I am on the homepage
			When I click on "<product name>"
			Then The product page should also display "<product name>"
			And  The product price should be <price>
			
			Examples:
			 	|product name               |price |
			  |Faded Short Sleeve T-shirts|16.51 |
			  |Blouse                     |27.00 |
			  |Printed Dress              |26.00 |
			  |Printed Summer Dress       |28.98 |
			  |Printed Chiffon Dress      |16.40 |   
			