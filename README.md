👤 Personal Details Management (JDBC CRUD)

A simple Java JDBC console application to manage personal details using CRUD operations (Create, Read, Update, Delete).
This project connects to a MySQL database and allows users to store and manage personal information.

🚀 Features

✅ Add new person details
✅ View all records
✅ Update existing details
✅ Delete records
✅ MySQL database connectivity using JDBC
✅ Console-based menu system

🛠️ Tech Stack

Language: Java

Database: MySQL

Connectivity: JDBC

IDE (recommended): Eclipse / IntelliJ IDEA

Driver: MySQL Connector/J

📂 Project Structure
personaldetials/
│
├── src/main/java/crud/
│   └── person.java
│
├── src/main/webapp/
│   └── WEB-INF/
│       └── lib/
│           └── mysql-connector-j-9.6.0.jar
│
└── build/

⚙️ Setup Instructions
1️⃣ Create Database

Open MySQL and run:

CREATE DATABASE person_det;

2️⃣ Create Table
CREATE TABLE detials (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    phoneno BIGINT,
    address VARCHAR(255)
);

3️⃣ Update DB Credentials

In person.java, update if needed:

static final String URL ="jdbc:mysql://localhost:3306/person_det";
static final String username = "root";
static final String password = "YOUR_PASSWORD";

4️⃣ Add JDBC Driver

Make sure:

mysql-connector-j-9.6.0.jar


is added to your project libraries.

5️⃣ Run Program

Run person.java as a Java application.

▶️ How It Works

When the program runs, a menu appears:

1. Add
2. View
3. Update
4. Delete
5. Exit


User selects an option and enters details accordingly.

📌 Example Usage

Add Record

Name: Vijay
Email: vijay@gmail.com
Phone: 9876543210
Address: Chennai


View Records

Vijay | vijay@gmail.com | 9876543210 | Chennai

⚠️ Notes

Ensure MySQL server is running

Table name in code is detials (typo kept as-is)

Phone number stored as integer in code

🔮 Future Improvements

✨ GUI or Web Interface
✨ Input validation
✨ Search functionality
✨ Proper exit option
✨ Error handling improvements

👨‍💻 Author

Developed for learning JDBC and CRUD operations in Java.

If you want, I can also:

✅ Improve this into a GUI app
✅ Convert to Spring Boot REST API
✅ Add Login system
✅ Create GitHub professional README with badges

Just tell me 👍

ConController.java
File
ConRespository.java
File
ConService.java
File
ContactApplication.java
File
ContactEntity.java
File
give read me for github 

Here’s a clean, professional GitHub README.md for your Spring Boot Contact project based on the files you shared (ContactApplication, ConController, ConService, ConRepository, ContactEntity).
You can copy-paste this into your GitHub README.md.

📇 Contact Management System (Spring Boot)

A simple Contact Management REST API built using Spring Boot, Spring Data JPA, and MySQL.
This application allows users to perform CRUD operations on contacts.

🚀 Features

✅ Add new contacts
✅ View all contacts
✅ Update contact details
✅ Delete contacts
✅ RESTful API design
✅ Database integration with Spring Data JPA

🛠️ Tech Stack

Backend: Spring Boot

Language: Java

Database: MySQL

ORM: Spring Data JPA / Hibernate

Build Tool: Maven

API Testing: Postman

📂 Project Structure
contact-management/
│
├── controller/
│   └── ConController.java
│
├── service/
│   └── ConService.java
│
├── repository/
│   └── ConRepository.java
│
├── entity/
│   └── ContactEntity.java
│
└── ContactApplication.java

⚙️ Setup & Installation
1️⃣ Clone the Repository
git clone https://github.com/your-username/contact-management.git
cd contact-management

2️⃣ Configure Database

Create a MySQL database:

CREATE DATABASE contact_db;

3️⃣ Update application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/contact_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

4️⃣ Run the Application

Using Maven:

mvn spring-boot:run


Or run ContactApplication.java from your IDE.

▶️ API Endpoints
➕ Add Contact
POST /contacts

📄 Get All Contacts
GET /contacts

✏️ Update Contact
PUT /contacts/{id}

❌ Delete Contact
DELETE /contacts/{id}

📌 Sample JSON

Request Body

{
  "name": "Vijay",
  "email": "vijay@gmail.com",
  "phone": "9876543210"
}

🧪 Testing

Use Postman or any REST client to test APIs.

🔮 Future Improvements

✨ Validation using @Valid
✨ Exception handling
✨ Swagger API documentation
✨ Authentication & Authorization
✨ Frontend UI (React/Angular)

👨‍💻 Author

Developed as a learning project for Spring Boot REST APIs and JPA.

⭐ Support

If you like this project:

⭐ Star the repo
🍴 Fork it
🛠️ Contribute
