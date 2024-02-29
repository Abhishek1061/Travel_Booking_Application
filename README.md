# Travel Booking Application REST API

This REST API is designed for a Travel Booking application. It performs all the essential CRUD operations. The application serves as a platform for customers to find and book vacation and travel packages. It also aids agencies in expanding their reach and providing services to a larger audience.

## Application E-R Diagram
The E-R Diagram for the application is also available in the repository.
<img src="https://github.com/Abhishek1061/Travel_Booking_Application/blob/master/ER_Diagram/Travel%20Booking%20API%20ER%20Diagram.jpg" width=600, height=450>

## Technology Stack

The application is built using the following technologies:

* Java
* Spring Framework
* Spring Boot
* Spring Data JPA
* MySQL

## Application Modules

The application consists of the following modules:

* Login
* Registration
* Contact

## Key Features

The application provides several features for both travel agencies and customers:

* **Agency Features:**
    * Access to customer data.
    * Ability to track and develop strategies to increase profitability.
* **Customer Features:**
    * Access to various family packages.
    * Ability to login to the website.
    * Option to maintain their membership.

## Setup & Execution

1. Clone the repository to your local machine.
2. Import the project into your preferred Java IDE.
3. Configure the database connection properties in `application.properties`.
4. Run the application.

Before running the API server, ensure to update the database configuration in the application.properties file. Adjust the port number, username, and password according to your local database configuration.

```
server.port=9090

spring.datasource.url=jdbc:mysql://localhost:3306/Pravass
spring.datasource.username=root
spring.datasource.password=*******

#Hibernet Configuration
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

#DevTools
spring.devtools.livereload.enabled=true
spring.devtools.restart.enabled=true 
spring.devtools.remote.debug.enabled=true
```

Once the application is running, you can access it at `http://localhost:9090`.

## Usage

### Login
- `GET localhost:9090/loginform`: Displays the login form.
- `POST localhost:9090/homepage`: Handles login requests and redirects to the home page.
- `DELETE localhost:9090/del/{email}`: Deletes a user's login information based on email.
- `PUT localhost:9090/setValue/{email}/{password}`: Updates a user's password based on email.

### Registration
- `GET localhost:9090/reg`: Displays the registration form.
- `POST localhost:9090/addReg`: Handles registration requests and redirects to the home page.
- `DELETE localhost:9090/delete/{email}`: Deletes a user's registration information based on email.
- `PUT localhost:9090/update/{email}`: Updates a user's registration information based on email.
- `PUT localhost:9090/updateName/{email}/{name}`: Updates a user's name based on email.
- `PUT localhost:9090/updatePassword/{email}/{password}`: Updates a user's password based on email.
- `PUT localhost:9090/updateDOB/{email}/{dob}`: Updates a user's date of birth based on email.
- `PUT localhost:9090/updateCountry/{email}/{country}`: Updates a user's country based on email.
- `PUT localhost:9090/updateState/{email}/{state}`: Updates a user's state based on email.

<!--
### Login
- Endpoint: `/loginform`
  - Description: Displays the login form.
  - Method: GET

- Endpoint: `/homepage`
  - Description: Handles login requests and redirects to the home page.
  - Method: POST

- Endpoint: `/del/{email}`
  - Description: Deletes a user's login information based on email.
  - Method: DELETE

- Endpoint: `/setValue/{email}/{password}`
  - Description: Updates a user's password based on email.
  - Method: PUT

### Registration
- Endpoint: `/reg`
  - Description: Displays the registration form.
  - Method: GET

- Endpoint: `/addReg`
  - Description: Handles registration requests and redirects to the home page.
  - Method: POST

- Endpoint: `/delete/{email}`
  - Description: Deletes a user's registration information based on email.
  - Method: DELETE

- Endpoint: `/update/{email}`
  - Description: Updates a user's registration information based on email.
  - Method: PUT

- Endpoint: `/updateName/{email}/{name}`
  - Description: Updates a user's name based on email.
  - Method: PUT

- Endpoint: `/updatePassword/{email}/{password}`
  - Description: Updates a user's password based on email.
  - Method: PUT

- Endpoint: `/updateDOB/{email}/{dob}`
  - Description: Updates a user's date of birth based on email.
  - Method: PUT

- Endpoint: `/updateCountry/{email}/{country}`
  - Description: Updates a user's country based on email.
  - Method: PUT

- Endpoint: `/updateState/{email}/{state}`
  - Description: Updates a user's state based on email.
  - Method: PUT  -->
