# Railway-Ticket-Booking-System

On running the program. The user is taken to the starting screen where the user has to select 
either the Admin System or the User System. 
 
The Admin Screen is used to add a new Train, delete a Train, update the existing records of the 
Train or to display all Trains in the system. 
 
The User Screen has 2 options: 
New User : Where a user id is created and the state if the user is maintained for the period the 
user is logged in. 
Returning User: Existing Users can log in to the system to make a booking, cancel a booking or 
to make enquiries about the train schedules. 
 
The User class has a field called bookings which maintains the current bookings of the user. On a 
successful booking, the users get allocated a unique booking number which he can use to cancel 
his ticket. 
A new user is also randomly allocated a certain amount of debit balance which he can use for 
booking the tickets.  
Each booking results in the reduction of the total number of available seats on a particular train. 
The user can also cancel his or her booking which results in the increase in the total number of 
seats and also, an increase in the debit balance of the user. 
 
If the user doesn’t have sufficient balance or the train does not have available seats then, in 
either of these scenarios, booking is not possible. 
  
Booking a ticket, cancelling a ticket or enquiry can be done only after logging into the User 
System. 
The User can inquire about the schedule, fare and seat availability of a particular train in the 
system. Each train in the system has a unique train number which aids the user in booking and 
cancelling the tickets.

# User Manual:
There is a default user already in the system:
Username : admin
Password : admin
Which can be used to login directly or else for login, a new user has to be created first.

By default, there are 4 trains which travel on a daily basis from the following destination city
to the end city (not symmetric)
Buffalo -> Rochester
Buffalo -> New York City
Buffalo -> Boston
Buffalo -> Syracuse
Buffalo -> New Jersey

Also, when adding a new train, the date has to be selected by entering numbers between 1
to 7;
Here 1 corresponds to Sunday, 2 to Monday and so on (7 being Saturday).
So if the user enters 145 -> it means that the train runs on Sunday, Wednesday and
Thursday daily.
