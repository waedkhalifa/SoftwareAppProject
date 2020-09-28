Feature: Search about suitable home
  
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR|230_120_4_2_12|
                |APARTMENT_WOOD_CITY_NO_ELEVATOR|230_120_4_2_12|
               

Scenario: Search home by type 
When I search about home by "APARTMENT" 
Then A list of homes that matches the type specification should be returned and printed on the console 

Scenario: Search home by type 
When I search about home by "HOUSE" 
Then A list of homes that matches the type specification should be returned and printed on the console 
 