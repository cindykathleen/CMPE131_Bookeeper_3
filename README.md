# bookeeper
SJSU CmpE 131 Project
Library Management System

Objective
This library management web application, Bookeeper, aims to create a platform in which books can be recorded in a collection and the status of the materials can be accessed with ease. 
Bookeeper is suitable for library managers who want to record the books that are being carried in their library as well as manage the materials being checked out and returned.


Project Abstract
The objective of our project is to create a library management system with several key features depending upon whether one is a user or an admin. 
The features of a user account will consist of a book database, a database search function, check out system, and a user account database. 
First, the book database will be comprised of a book’s title, author, ISBN number, and availability information. 
Secondly, our database search function will allow users to search for a specific book by choosing whether they want to conduct the search by title, author, or ISBN number. 
Our search function will then return the results that match the search criteria entered by the user. 
Next, a check out system will be implemented to allow a user to borrow items until a specific due date. 
A borrower must be logged into their user account in order to check out items. 
Lastly, a user account database will be added in order for users to check out items and view their currently borrowed books along with their respective due dates. 
This database will contain information such as the borrower’s name, username, and four-digit PIN number.
Much like the user, the admin will have similar features, but with some added functions. 
The features of an admin account will consist of the same book database, database search function, a check in system, and an admin account database. 
The admin book database contains all of the above features in addition to an add new item function, which allows an admin to add books to the database, and a remove item function, which allows an admin to remove books from the database. 
The admin database search function is identical to that of the user. 
The admin check in feature will allow the admin to check in books from any user in the user database by changing the availability status of a book from “checked out”, to “available”. 
The admin account database will be added in order to provide admins the ability to add new admin accounts. 
This admin account database will also contain the admin’s name, username, and four-digit PIN number information. 

User Requirements
1. As a new user, I would like to be able to register for a new account with my name, username, and four-digit PIN number.
2. I would like to be able to log onto my personal profile using my username and four-digit PIN number. There will be a dropdown menu where I can choose if I am a user or an admin. After logging in, it will bring me to a page with different menu options. The menu options will be different depending on whether I am a user or an admin.
3. As a general user, I would like to check out books and view the due dates. I would also like to be able to search for specific books in the database using the title, author, or ISBN number, and view their availability. 
4. As an admin, I would like to be able to add new books into the database, remove books from the database. I would also like the ability to add users into the admin database to grant access to new admins. Similar to a general user, I can also search for specific books in the database by title, author, or ISBN number. I would like to check in returned books from users by marking the book status from “checked out” to “available.”

System Requirements
1. A user database will be created to track the list of signed up users by their name, username, and four-digit PIN number.
2. An admin database will be created to track the list of admins by their name, username, and four-digit PIN number.
3. A book database will be created to track the list of books by the title, author, and ISBN number. It will also show the availability and due date.
4. The software will be implemented in JAVA
5. The front end development will be implemented in JavaScript / HTML / CSS
