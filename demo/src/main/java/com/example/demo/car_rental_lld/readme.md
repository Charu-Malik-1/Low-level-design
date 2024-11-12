- This service is provide in different cities, multiple store in different locations in city.
- User can rent/reserve a vehicle.
- user have to submit a vehicle.
----------------------------------------------
Create basic flow and identify objects and operations:

Objects:
    User
    Vehicle -> is tightly bound to store
    Store -> is tightly bound to location
    City
    Reserve - after user reserve a vehicle , bill is generated and he have to pay the amount
    Bill
    Payment
    VehicleInventoryManagement

Operations:
    - User can search based on city.
    - User can reserve a vehicle
    - User can submit/return the vehicle.

Flow:
![car_rental.drawio.png](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2FDownloads%2Fcar_rental.drawio.png)