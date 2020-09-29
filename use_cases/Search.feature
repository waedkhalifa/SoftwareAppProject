Feature: Search about suitable home
    
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR|230_120_4_2_12|
                |APARTMENT_WOOD_CITY_YES_ELEVATOR|233_120_4_2_12|
               

Scenario: Search home by type 
When I search about home by "APARTMENT" 
Then A list of homes that matches the type specification should be returned and printed on the console 

Scenario: Search home by type 
When I search about home by "HOUSE" 
Then A list of homes that matches the type specification should be returned and printed on the console 

Scenario: Search home by material 
When I search about home by "BRICK" 
Then A list of homes that matches the material specification should be returned and printed on the console 

Scenario: Search home by material 
When I search about home by "WOOD" 
Then A list of homes that matches the material specification should be returned and printed on the console 

Scenario: Search home by material 
When I search about home by "STONE" 
Then A list of homes that matches the material specification should be returned and printed on the console

Scenario: Search about home with less than a specific price
When I search about home with price less than 400
Then A list of homes that matches the price specification should be returned and printed on the console

Scenario: Search about home with less than a specific area 
When I search about home with area less than 140
Then A list of homes that matches the area specification should be returned and printed on the console  

Scenario: Search home by placement 
When I search about home by "VILLAGE" 
Then A list of homes that matches the placement specification should be returned and printed on the console 

Scenario: Search home by placement 
When I search about home by "CITY" 
Then A list of homes that matches the placement specification should be returned and printed on the console 

Scenario: Search home between range of prices 
When I search about home by between range 231 and 550 
Then A list of homes that matches between range of prices should be returned and printed on the console 

Scenario: Search home by Allow Pets 
When I search about home by "YES" 
Then A list of homes that matches the allow pets should be returned and printed on the console
