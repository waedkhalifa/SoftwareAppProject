Feature: Search about suitable home
    
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_CITY_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |HOUSE_STONE_CITY_YES_AIRCONDITIONING,SWIMMINGPOOL|300_145_5_3_6|
                |APARTMENT_BRICK_CITY_NO_BALCONY|230_120_4_2_12|
                |APARTMENT_WOOD_VILLAGE_YES_BALCONY|233_120_4_3_12|


Scenario: Search home by type 
When I search about home by "APARTMENT" 
Then A list of homes that matches the type specification should be returned and printed on the console 
And email with result should be send to user "waed.khalifa1@gmail.com" with type information

Scenario: Search home by type 
When I search about home by "HOUSE" 
Then A list of homes that matches the type specification should be returned and printed on the console 
And email with result should be send to user "waed.khalifa1@gmail.com" with type information

Scenario: Search home by material 
When I search about home by "WOOD" 
Then A list of homes that matches the material specification should be returned and printed on the console 
And email with result should be send to user "waed.khalifa1@gmail.com" with material information

Scenario: Search home by material 
When I search about home by "STONE" 
Then A list of homes that matches the material specification should be returned and printed on the console 
And email with result should be send to user "waed.khalifa1@gmail.com" with material information

Scenario: Search home by material 
When I search about home by "BRICK" 
Then A list of homes that matches the material specification should be returned and printed on the console 
And email with result should be send to user "waed.khalifa1@gmail.com" with material information

Scenario: Search about home with less than a specific price
When I search about home with price less than 400
Then A list of homes that matches the price specification should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with price information

Scenario: Search about home with less than a specific area 
When I search about home with area less than 140
Then A list of homes that matches the area specification should be returned and printed on the console  
And email with result should be send to user "waed.khalifa1@gmail.com" with area information

Scenario: Search home by placement 
When I search about home by "CITY" 
Then A list of homes that matches the placement specification should be returned and printed on the console 
And email with result should be send to user "waed.khalifa1@gmail.com" with placement information

Scenario: Search home by placement 
When I search about home by "VILLAGE" 
Then A list of homes that matches the placement specification should be returned and printed on the console 
And email with result should be send to user "waed.khalifa1@gmail.com" with placement information

Scenario: Search home between range of prices 
When I search about home by between range 231 and 550 of prices
Then A list of homes that matches between range of prices should be returned and printed on the console  
And email with result should be send to user "waed.khalifa1@gmail.com" with range of prices information

Scenario: Search home by Allow Pets 
When I search about home by "YES" 
Then A list of homes that matches the allow pets should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with pets information

Scenario: Search home by Allow Pets 
When I search about home by "NO" 
Then A list of homes that matches the allow pets should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with pets information

Scenario: Search home by amenities
When I search about home by "GARAGEPARKING,ELEVATOR,FIREPLACE" 
Then A list of homes that matches the amenities specification should be returned and printed on the console 
And email with result should be send to user "waed.khalifa1@gmail.com" with amenities information

Scenario: Search home by amenities
When I search about home by "AIRCONDITIONING" 
Then A list of homes that matches the amenities specification should be returned and printed on the console 
And email with result should be send to user "waed.khalifa1@gmail.com" with amenities information

Scenario: Search home by amenities
When I search about home by "BALCONY" 
Then A list of homes that matches the amenities specification should be returned and printed on the console 
And email with result should be send to user "waed.khalifa1@gmail.com" with amenities information

Scenario: Search home by amenities
When I search about home by "SWIMMINGPOOL" 
Then A list of homes that matches the amenities specification should be returned and printed on the console 
And email with result should be send to user "waed.khalifa1@gmail.com" with amenities information

Scenario: Search home between range of area 
When I search about home by area between 121 and 250 
Then A list of homes that matches the range of area should be returned and printed on the console 
And email with result should be send to user "waed.khalifa1@gmail.com" with range of area information

Scenario: Search home by number of bedrooms
When I search about home by number of bedrooms 1
Then A list of homes that matches the number of bedrooms should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with bedrooms information

Scenario: Search home by number of bedrooms
When I search about home by number of bedrooms 2
Then A list of homes that matches the number of bedrooms should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with bedrooms information

Scenario: Search home by number of bedrooms
When I search about home by number of bedrooms 3
Then A list of homes that matches the number of bedrooms should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with bedrooms information

Scenario: Search home by number of bedrooms
When I search about home by number of bedrooms 4
Then A list of homes that matches the number of bedrooms should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with bedrooms information

Scenario: Search home by number of bedrooms
When I search about home by number of bedrooms 5
Then A list of homes that matches the number of bedrooms should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with bedrooms information

Scenario: Search home by number of bathrooms
When I search about home by number of bathrooms 1
Then A list of homes that matches the number of bathrooms should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with bathrooms information

Scenario: Search home by number of bathrooms
When I search about home by number of bathrooms 2
Then A list of homes that matches the number of bathrooms should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with bathrooms information

Scenario: Search home by number of bathrooms
When I search about home by number of bathrooms 3
Then A list of homes that matches the number of bathrooms should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with bathrooms information

Scenario: Search home by lease length
When I search about home by lease length 6
Then A list of homes that matches the lease length should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with leaselength information

Scenario: Search home by lease length
When I search about home by lease length 7
Then A list of homes that matches the lease length should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with leaselength information

Scenario: Search home by lease length
When I search about home by lease length 8
Then A list of homes that matches the lease length should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with leaselength information

Scenario: Search home by lease length
When I search about home by lease length 9
Then A list of homes that matches the lease length should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with leaselength information

Scenario: Search home by lease length
When I search about home by lease length 10
Then A list of homes that matches the lease length should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with leaselength information

Scenario: Search home by lease length
When I search about home by lease length 11
Then A list of homes that matches the lease length should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with leaselength information


Scenario: Search home by lease length
When I search about home by lease length 12
Then A list of homes that matches the lease length should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with leaselength information

Scenario: Search home by combiniation of specifications
When I search about home by combination "type:HOUSE,material:WOOD,placement:CITY,amenities:GARAGEPARKING-FIREPLACE-ELEVATOR,bathrooms:2,range of area:121-250,range of price:231-551,bedrooms:3,leaselength:6,area:140,price:400,pets:YES"
Then A list of homes that matches these specifications should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with combination information

Scenario: Search home by combiniation of specifications
When I search about home by combination "type:HOUSE,placement:CITY"
Then A list of homes that matches these specifications should be returned and printed on the console
And email with result should be send to user "waed.khalifa1@gmail.com" with combination information