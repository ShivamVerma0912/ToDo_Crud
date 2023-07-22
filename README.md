# TODO-MVC
The ToDo application is a simple Spring Boot project that allows users to manage their todo tasks. It provides endpoints to perform CRUD (Create, Read, Update, Delete) operations on todo items.

## Prerequisites
* MySql
* SpringBoot
* Java
## Getting Started
- Clone or download the project from the repository.
-Import the project into your preferred Java Integrated Development Environment (IDE).
- Ensure that the required dependencies are resolved and imported correctly.
## Data flow
The application is built using the SpringBoot framework and consists of three layers: model, service, and repository.-

- Controller - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
- Service -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
- Repository - This layer mainatains the h2-database thing on which CRUD operations are performed
- Model - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.
Running the Application
Locate the ToDoMVCApplication class in your IDE.
Run the main method within the ToDoMVCApplication class.
## Endpoints

- Get All Todos
- GET /getAllTodos
- Retrieves all the todo items in the present todo-list.

- Get Todos by Status
- GET TodoByStatus
- Retrieves todo items based on their status.

## Query Parameters:

- status: The status of the todo items. (e.g., completed, incomplete)

Add a Todo

POST /addTodo

Adds a new todo item.

Request Body:

Todo object: The todo item to be added.

Get Todo by ID

GET /getTodoById/{id}

Retrieves a todo item based on its ID.

## Project Summary
This project is inspired by the popular TodoMVC application and is meant for educational purposes. Feel free to enhance and customize it to suit your needs.
