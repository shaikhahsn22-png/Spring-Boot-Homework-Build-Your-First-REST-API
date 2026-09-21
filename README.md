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
### Endpoint 1: Welcome
<img width="2261" height="1017" alt="image" src="https://github.com/user-attachments/assets/11c67ba4-c968-4515-8caf-3fd35caf5cf5" />

### Endpoint 2: get all languages
<img width="2247" height="1606" alt="image" src="https://github.com/user-attachments/assets/f800cf2a-0f80-4383-a885-fb3793dee44e" />

### Endpoint 3: get one language
<img width="2247" height="1606" alt="image" src="https://github.com/user-attachments/assets/6d2d2b93-a460-4e0a-827d-b446448ba07d" />

### Endpoint 4: search a language (sql)
<img width="2250" height="1221" alt="image" src="https://github.com/user-attachments/assets/c57dde09-2b3e-47d9-94ef-6ba2c39b3ee5" />

### Endpoint 5: filter languages by difficulty
<img width="2247" height="1215" alt="image" src="https://github.com/user-attachments/assets/17a8ad56-157a-476b-829c-199df23f6471" />

### Endpoint 6: create new language
<img width="2250" height="1271" alt="image" src="https://github.com/user-attachments/assets/de568776-81e7-4c90-83a5-b9e222bc0939" />

### Endpoint 7: update a language
<img width="2250" height="1154" alt="image" src="https://github.com/user-attachments/assets/aa3aa555-8ba0-4511-8317-cae98b0e755d" />

### Endpoint 8: delete a language
<img width="2247" height="879" alt="image" src="https://github.com/user-attachments/assets/2adec6a1-57c3-4be6-97ea-93c873cd68e7" />

### Endpoint 9: Statistics / Summary
<img width="2238" height="1163" alt="image" src="https://github.com/user-attachments/assets/287e1cef-ce23-4b01-bcb2-3f27b244a474" />

### Endpoint 10: recommendation endpoint
<img width="2252" height="1138" alt="image" src="https://github.com/user-attachments/assets/db52d41e-dbf2-45d9-8574-cc54ee27ddba" />

