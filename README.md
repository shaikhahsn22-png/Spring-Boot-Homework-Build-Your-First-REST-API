# Programming Languages API

## About the Project
This is a Spring Boot REST API for exploring and managing programming languages. It allows users to view, search, filter, create, update, and delete programming language data.
## Developer Profile
- Name: Shaikha
- Theme: Programming Languages

## Technologies Used
- Java
- Spring Boot
- REST API
- Postman
- IntelliJ IDEA

## Programming Language Model
Each programming language contains:
- id
- name
- creator
- yearCreated
- difficulty
- mainUse

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/welcome` | Introduces the application |
| GET | `/languages` | Returns all programming languages |
| GET | `/languages/{id}` | Returns one language by ID |
| GET | `/languages/search?name=` | Searches languages by name |
| GET | `/languages/filter?difficulty=` | Filters languages by difficulty |
| POST | `/languages` | Creates a new programming language |
| PUT | `/languages/{id}` | Updates an existing language |
| DELETE | `/languages/{id}` | Deletes a language |
| GET | `/languages/stats` | Returns statistics about the languages |
| GET | `/languages/recommend?goal=` | Recommends a language based on its main use |

## Running the Application
1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Run the Spring Boot application.
4. The API will run on:`http://localhost:8080`
5. Test the endpoints using Postman.

## Screenshots
###Endpoint 1
<img width="2261" height="1017" alt="image" src="https://github.com/user-attachments/assets/11c67ba4-c968-4515-8caf-3fd35caf5cf5" />
