# bookeeper

### Objective
This library management web application, Bookeeper, aims to create a platform in which books can be recorded in a collection and the status of the materials can be accessed with ease. 
Bookeeper is suitable for library managers who want to record the books that are being carried in their library as well as manage the materials being checked out and returned.

### Abstract 
The objective of our project is to create a library management system with several key features depending upon whether one is a user or an admin. The features of a user account will consist of a book database, a database search function, and a user account database. First, the book database will be comprised of a book’s title, author, and ISBN number. Secondly, our database search function will allow users to search for a specific book by its title. Our search function will then return the results that match the search criteria entered by the user. Lastly, a user account database will contain information such as the borrower’s name, username, and four-digit PIN number.
 
Much like the user, the admin will have similar features, but with some added functions. The features of an admin account will consist of the same book database, database search function, and an admin account database. The admin book database contains all of the above features in addition to an add new item function, which allows an admin to add books to the database, and a remove item function, which allows an admin to remove books from the database. The admin database search function is identical to that of the user. The admin account database will also contain the admin’s name, username, and four-digit PIN number information. 

### User Requirements
- As a new user, I would like to be able to register for a new account with my name, username, and four-digit PIN number. I would like to be able to log onto my personal profile using my username and four-digit PIN number. After logging in, it will bring me to a page with different menu options. The menu options will be different depending on whether I am a user or an admin.
- As a general user, I would like to be able to search for specific books in the database using the title.
- As an admin, I would like to be able to add new books into the database, remove books from the database. Similar to a general user, I can also search for specific books in the database using the title. 

### System Requirements
- A user database will be created to track the list of signed up users by their name, username, and four-digit PIN number.
- An admin database will be created to track the list of admins by their name, username, and four-digit PIN number.
- A book database will be created to track the list of books by the title, author, and ISBN number. 
- The software will be implemented in JAVA
- The front end development will be implemented in HTML & CSS
