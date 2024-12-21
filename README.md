# API for Quiz App

This is a Spring Boot application that includes quiz management APIs (start session, retrieve questions, submit answers, and view performance). H2 Database is used for simplicity.

**Key Features**:
   - Start a quiz session.
   - Get a multiple-choice question at random.
   - Send in your responses and verify that they are accurate.
   - Examine your performance on the quiz (right or wrong answers).

**Technologies Used**:
   - Spring Boot
   - H2 Database (pre-seeded with questions and a single user)
   - Postman (for testing the APIs)

**Setup**:
   - Clone the repo: `git clone <repository-url>`
   - Run the app: `mvn clean install && mvn spring-boot:run`
   - API available at `http://localhost:8082`.

**API Endpoints**:
   - Start quiz: `POST /api/quiz/start`
   - Get question: `GET /api/quiz/question`
   - Submit answer: `POST /api/quiz/submit`
   - Get performance: `GET /api/quiz/result`

**Assumptions**: 
  - No APIs for question management or user creation are needed.
  - H2 Database with seeded questions and a single user for quick testing.

**Improvements**: 
  - Additional features such as multiple users, scoring, and time constraints can be implemented.
