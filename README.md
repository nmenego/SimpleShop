# SimpleShop

A simple web application, which simulates a shop with two kinds of products. User can say how many items of each product he wants and clicks the “Buy” button. Application can check if there are enough items left and show the summary of the shopping. An error message is displayed in case there are not enough items available.

## Reason why you used specific frameworks and libraries for the front-end and back-end

1. For the back-end, I used Java Spring MVC. In my experience developing with this stack, code is more maintainable and extensible.
2. Aside from its power and performance, Spring gives us very well-documented libraries of functionality.
3. For the front-end, I used Spring form tags and basic JSP, HTML and CSS.

## How the persistent layer could be implemented?

1. I already created the ground work for the repository through my DAO (data access object).
2. If we were to use database for persistence, we simply have to implement the InventoryDAO and inject our implementation to the service class using it.

## How long did it take you to create the code?

1. It took me an hour and a half to write everything, make it work, push to Github and then to Heroku.

Live version: https://whispering-crag-65855.herokuapp.com/