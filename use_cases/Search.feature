Feature: Search about suitable home
    
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |HOUSE_STONE_CITY_YES_AIRCONDITIONING,SWIMMINGPOOL|300_145_5_3_6|
                |APARTMENT_BRICK_CITY_NO_GARAGEPARKING|230_120_4_2_12|
                |APARTMENT_WOOD_CITY_YES_BALCONY|233_120_4_3_12|
               

Scenario: Search home by type 
When I search about home by "APARTMENT" 
Then A list of homes that matches the type specification should be returned and printed on the console 


Scenario: Search home by material 
When I search about home by "WOOD" 
Then A list of homes that matches the material specification should be returned and printed on the console 


Scenario: Search about home with less than a specific price
When I search about home with price less than 400
Then A list of homes that matches the price specification should be returned and printed on the console

Scenario: Search about home with less than a specific area 
When I search about home with area less than 140
Then A list of homes that matches the area specification should be returned and printed on the console  

Scenario: Search home by placement 
When I search about home by "CITY" 
Then A list of homes that matches the placement specification should be returned and printed on the console 

Scenario: Search home between range of prices 
When I search about home by between range 231 and 550 of prices
Then A list of homes that matches between range of prices should be returned and printed on the console  

Scenario: Search home by Allow Pets 
When I search about home by "YES" 
Then A list of homes that matches the allow pets should be returned and printed on the console

Scenario: Search home by amenities
When I search about home by "GARAGEPARKING,ELEVATOR" 
Then A list of homes that matches the amenities specification should be returned and printed on the console 

Scenario: Search home between range of area 
When I search about home by area between 121 and 250 
Then A list of homes that matches the range of area should be returned and printed on the console 

Scenario: Search home by number of bedrooms
When I search about home by number of bedrooms 4
Then A list of homes that matches the number of bedrooms should be returned and printed on the console

Scenario: Search home by number of bathrooms
When I search about home by number of bathrooms 3
Then A list of homes that matches the number of bathrooms should be returned and printed on the console

Scenario: Search home by lease length
When I search about home by lease length 6
Then A list of homes that matches the lease length should be returned and printed on the console

Scenario: Search home by type and by material
When I search about home by "APARTMENT" and by "WOOD"
Then A list of homes that matches the type and material specification should be returned and printed on the console
