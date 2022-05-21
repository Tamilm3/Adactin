Feature: To Validating the room booking functionality in the Adactin Hotel application.

Scenario: To validating the room booking functionality in the Adactin Hotel application in Chrome browser.
When User have to enter the valid username and valid password
And User have to click the login button to get the search hotel page
And In search hotel page user have to select the locaton in the location dropdown box
And User have to select a hotel in the hotels dropdown box
And User have to select a room types in the room types dropdown box
And User have to select a number of rooms in the number of rooms dropdown box
And User have to enter the check in date
And User have to enter the check out date
And User have to select a number of adult in the adult per room dropdown box
And User have to select a number of children in the children per room dropdown box
And User have to click the search box to get the select hotel page
And User have to click the filtered hotel radio button
And User have to click the countinue button to get the book a hotel page
And User have to enter the firstname, lastname, billing address, credit card number should be in 16 digit
And User have to select a credit card type in the credit card type dropdown box
And User have to select a expiry date in the month and year dropdown box 
And User have to enter the CVV number
And User have to click the book now button
Then User should get the Booking confirmation page
