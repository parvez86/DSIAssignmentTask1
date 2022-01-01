# My E-Products
A simple OOP based java project where users can add, update, delete, get individual and overall information of different e-products (book, movie and series) with MVC design pattern.

# Features
* **Product Information:** Product type, consumtion time (in hours), total consumption days, consumption starting date, consumption end date and rating.
* **Product Management:**
  + Add: 
    - Name
    - Consumption starting date in YY-MM-DD (could be blank).
    - Consumption ending date in same format (could be blank).
    - Total conssumption time in hours (will be 0 by default at first).
    - Your personal rating out of 10 (could be blank)
    - Total days of consumption (will be 0 by default at first)
  + Edit:
    - When a product is being edited. One will have the option to add a time in hrs which will be added to the total consumption time. 
    - While adding consumption time one will have an option to add a day to days of consumption.
    - Can change the rating.
    - Can add the consumption ending date. But, once added, the consumable can not be edited anymore.
  + Delete:
    - When a consumable is deleted, it will not show in the list but the times and days added because of it will still be there in total consumption time and days.
  + View the list of consumables and individually:
    - If one choose a specific type, the list will include the name of the consumable, total days of consumption, total hrs of consumption, rating in a tabular format. 
    - Anyone can pick one and see the full details.
  + View overall info:
    - The total consumption time in hours across all types.
    - Individual consumption time in hours of each type.
    - The total days of consumption across all types.
    - Individual days of consumption of each type.
    - Average rating across all types.
    - Average individual rating of each type.
    - Total number of consumable across all types.
    - Individual number of consumable of each type.

# Files
* **Product.java:** Contains product definition.
* **E_Product.java:** MVC model file. Contains e-products definition like product type, rating, and consumption-time etc.
* **Views.java:** MVC view file.
* **ProductsController.java:** MVC controller file.
* **DSIAssignmentTask1.java:** Project entry file.

# Run Projects
* **DSIAssignmentTask1.java:** Run the file.

