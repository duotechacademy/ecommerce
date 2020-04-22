	
Feature: Product description
		
		
		 @test
		Scenario: Verify product name 
		
			Given I am on the homepage
			When I click on Blouse
			Then The product page should also display Blouse
		
		
	@test
		Scenario: Verify default product quantity
		
			Given I am on the homepage
			When I click on Blouse
			Then I land on product page
			And The default quantity for the product should be 1
			

			
	
		
	 @test
		Scenario: Verify plus and minus buttons
		
			Given I am on the homepage
			When I click on Blouse
			And I land on product page
			When I click on plus button 10 times
			Then The quantity should be correct
			And I click on minus button 5 times
			Then The quantity should be correct
			


			
		Scenario: Verify the database
		
			Given the first step
			When I do the second step
			Then I verify the third step
			
		#Implementing a scenario without using DataTable
		 @test
		Scenario: Verify Dress page subcategories
		
					Given I am on the homepage
					When I click on Dresses link
					Then The Casual Dresses subcategory should be displayed
					
					
		#Implementing a scenario without using DataTable
		
		
		Scenario: Verify Dress page subcategories
		
					Given I am on the homepage
								
					When I click on Dresses link
							
					Then The following subcategories should be displayed
								| Casual Dresses |
								| Evening Dresses|
								| Summer Dresses |
					
			
		Scenario: Verify Dress page colors
		
					Given I am on the homepage
								
					When I click on Dresses link
							
					Then The following colors should be displayed
								| Beige  |
								| Black  |
								| Blue   |
								| Yellow |
								| White  |
								| Orange |
								| Green  |
		            | Pink   |
		
			

			
			
		
			
			
			
		
		

		
		
		
			
		
		
		
		

 