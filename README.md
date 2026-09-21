# Programming Languages API

## About the Project
Write 2–3 sentences explaining what the API does and that it was built with Spring Boot.

## Developer Profile
- Name:
- Theme:
- Short Introduction:
- Current Learning:

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
4. The API will run on:
   `http://localhost:8080`
5. Test the endpoints using Postman.

## Example Request
Add one example of an endpoint you tested in Postman.

## Screenshots
Add screenshots showing some of the endpoints working.

## Notes
Mention that the project currently uses in-memory sample data and does not use a database.
