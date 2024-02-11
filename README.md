# Employee CRUD Spring Project

This project is a simple CRUD (Create, Read, Update, Delete) application built using Spring framework for managing employees.

## Prerequisites

- Java JDK (17 or 21)
- Maven 
- MySQL 

## Setup(You can directly open the project in any IDE)

1. **Clone the repository**:
   ```bash
   git clone https://github.com/pushkar132/Employee-Management.git
2. **Navigate to the Directory**:
   ```bash
   cd employee-crud-spring
3. **Run the SQL scripts**:<br>
   SQL script is present under 'employee_directory_sql-scripts'
4. **Update the application.properties**:<br>
   Inside the 'employeecrud/src/main/resources/application.properties' change the following properties:<br>
   <ol>
   <li>spring.datasource.url</li>
   <li>spring.datasource.username</li>
   <li>spring.datasource.password</li>
   </ol>
5. **Build the project**:
   ```bash
   mvn clean install
6. **Run the project**:
   ```bash
   mvn spring-boot:run
7. **Access the application**:<br>
Open a web browser and go to http://localhost:8080

## Usage
The application provides endpoints for performing CRUD operations on employees.
Use appropriate HTTP methods (GET, POST, PUT, DELETE) to interact with the API.
## Contributing
Contributions are welcome! Please feel free to fork the repository and submit pull requests.


   
