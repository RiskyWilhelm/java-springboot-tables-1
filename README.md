# java-springboot-tables-1
In this project, i did GET, POST(CREATE), PUT(EDIT) in a table. 

- **Informations about project.**

h2 memory database can be seen in **localhost:YOURPORT/h2-console** ***By default the port is 8080***

The H2 DATABASE(IN MEMORY) id starts from 100.

Find all users

Find Specified User By Id

Edit Specified User By Id

Create New User

- **How to use it?**

Download Postman or use something else to send the data.






- 1-- Find all users-----------------------------------------------

Set the postman link type to GET

Set link to ***localhost:8080/user/getAllUsers***

Click SEND and youre done.











- 2-- Find Specified User by ID-----------------------------------------------

Set the postman link type to GET

Set link to ***localhost:8080/user/getUserById/ENTERTHEIDHERE*** ***The id starts from 100***

Click SEND and youre done.







- 3-- Create new User-----------------------------------------------

Set the postman link type to POST

Set link to ***localhost:8080/user/create***

Go to **BODY** section in postman.

Select **RAW** and set type to **JSON** instead of text.

write this:

`
{
    "firstName": "anyname",
    "lastName": "anyname"
}
`

Click SEND and youre done.










- 4-- Edit specified user by ID-----------------------------------------------

Set the postman link type to PUT

Set link to ***localhost:8080/user/editUser/ENTERIDHERE***

Go to **BODY** section in postman.

Select **RAW** and set type to **JSON** instead of text.

write this:

`
{
    "firstName": "anyname",
    "lastName": "anyname"
}
`

Click SEND and youre done.












