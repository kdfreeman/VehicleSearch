



## Project Description
The project is a simple vehicle search application created in Spring Boot and Angular. The **Client** denotes the **Angular** project which will connect to **Server** to get the requested information. The **Server** is the backend built in **Spring Boot**. After we run the server, the data is inserted in the database from the Vehicle.json file.( I used postman for this purpose). The vehicle.json contains the details of a set of vehicles. H2 in memory database is used for this project. The tables are made accordingly the structure of the json file.

### Client

- It's an angular project which is the UI interface for the project.
- It has the following features:
- Viewing all vehicles stored in Server.
- Search Vehicles according to the model name.
- Filter vehicle according to the price range.
- Search vehicle according to internal as well as external features.
- Use ` ng serve ` to run the client after running the server.
 
 
 ### Server

- Server is made using Spring Boot.
- Have features to save vehicles, filtering vehicles according to price range, searching vehicles according to model name .
- Once the api is requested, it returns the vehicle according to the request from the client.
- After running the server, use postman or any other tool to post the **vehicle.json** to the database.
- Modify the database properties according to your database name and set username and password in properties file and you are good to go.

---
