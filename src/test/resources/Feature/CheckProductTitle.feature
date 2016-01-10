Feature: Check Product Title
	As a user
	I want to open a browser 
	And load the webpage www.amazon.com
	And search some product
	And sort results by price from Highest to Lowest
	Then check that product title contains specified string

Scenario: test1_Nikon(Firefox)
	Given User opens a browser "Firefox"
    And User opens the webpage "http://www.amazon.com/"    
	When User inputs string to search "Nikon"
	And User sorts results by price from High to Low	
	And User selects item 2
	Then Check that product topic contains text "Nikon D3X"	
	
Scenario: test2_Nikon(Chrome)
	Given User opens a browser "Chrome"
    And User opens the webpage "http://www.amazon.com/"    
	When User inputs string to search "Nikon"
	And User sorts results by price from High to Low	
	And User selects item 2
	Then Check that product topic contains text "Nikon D3X"

Scenario: test3_Nikon(InternetExplorer)
	Given User opens a browser "IE"
    And User opens the webpage "http://www.amazon.com/"    
	When User inputs string to search "Nikon"
	And User sorts results by price from High to Low	
	And User selects item 2
	Then Check that product topic contains text "Nikon D3X"
	