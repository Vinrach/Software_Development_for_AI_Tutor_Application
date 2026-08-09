# AI Tutor Platform — Enterprise Web Application

### Java-based University Tutoring Platform with RESTful Services, Course Management, Student Enrollment & AI-Tutor Interface

<p align="center">

<img src="https://img.shields.io/badge/Java-Enterprise-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
<img src="https://img.shields.io/badge/Jakarta%20EE-Enterprise%20Application-007396?style=for-the-badge" alt="Jakarta EE">
<img src="https://img.shields.io/badge/JAX--RS-REST%20API-007396?style=for-the-badge" alt="JAX-RS">
<img src="https://img.shields.io/badge/JPA-Persistence-59666C?style=for-the-badge" alt="JPA">
<img src="https://img.shields.io/badge/JDBC-Database%20Connectivity-007396?style=for-the-badge" alt="JDBC">
<img src="https://img.shields.io/badge/PostgreSQL-Database-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL">
<img src="https://img.shields.io/badge/JavaScript-Frontend-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black" alt="JavaScript">
<img src="https://img.shields.io/badge/HTML5-Frontend-E34F26?style=for-the-badge&logo=html5&logoColor=white" alt="HTML5">
<img src="https://img.shields.io/badge/CSS3-UI-1572B6?style=for-the-badge&logo=css3&logoColor=white" alt="CSS3">
<img src="https://img.shields.io/badge/Figma-UI%2FUX-F24E1E?style=for-the-badge&logo=figma&logoColor=white" alt="Figma">

</p>

---

## 📌 Overview

**AI Tutor Platform** is a university-oriented enterprise web application designed to connect students and professors through a centralized learning platform.

The system provides separate workflows for **students and professors**, allowing professors to create and manage courses while students can register, access courses, enroll in courses, and interact with an AI-tutor interface.

The project was developed as part of a Master's-level **Software Development for AI Tutor Application** project, with a focus on enterprise Java development, RESTful APIs, relational database persistence, frontend/backend integration, and AI-assisted education.

> **Project Type:** Master's Degree — Enterprise Software Development / AI Application

---

# 🎯 Project Objectives

The platform was designed to address the need for a user-friendly online tutoring environment for university students.

The main objectives were to:

* Develop an enterprise web application using Java.
* Provide separate workflows for students and professors.
* Allow professors to create and manage courses.
* Allow students to register and enroll in courses.
* Provide RESTful backend services for application functionality.
* Persist application data using PostgreSQL.
* Connect the frontend and backend through REST APIs.
* Design an intuitive and visually appealing user interface.
* Provide an AI-based tutoring interface for course-related questions.
* Design the platform with potential multi-university / white-label usage in mind.

The original project scope specifies Java, Jakarta EE, JPA, JDBC, PostgreSQL, a JavaScript-based frontend, JAX-RS communication, and multi-tenancy as core requirements.

---

# 🏗️ System Architecture

```text
                         ┌─────────────────────────┐
                         │       Web Browser        │
                         │                         │
                         │   HTML / CSS /          │
                         │      JavaScript         │
                         └────────────┬────────────┘
                                      │
                                      │ REST / JSON
                                      ▼
                         ┌─────────────────────────┐
                         │     Jakarta EE Backend  │
                         │                         │
                         │         JAX-RS          │
                         └────────────┬────────────┘
                                      │
                    ┌─────────────────┼─────────────────┐
                    │                 │                 │
                    ▼                 ▼                 ▼
             ┌────────────┐   ┌────────────┐   ┌────────────┐
             │ StudentWS  │   │  CourseWS  │   │ProfessorWS │
             │            │   │            │   │            │
             │ Student   │   │ Courses    │   │ Professor  │
             │ Operations│   │ Enrollment │   │ Operations │
             └─────┬──────┘   └──────┬─────┘   └─────┬──────┘
                   │                 │                 │
                   └─────────────────┼─────────────────┘
                                     │
                                     ▼
                         ┌─────────────────────────┐
                         │          JPA            │
                         │    EntityManager        │
                         └────────────┬────────────┘
                                      │
                                      ▼
                         ┌─────────────────────────┐
                         │       PostgreSQL        │
                         │      Relational DB      │
                         └─────────────────────────┘
```

The current implementation defines a JAX-RS application under the `/api` path and implements dedicated REST resources for students, courses, and professors.

---

# 👥 User Roles

The platform is designed around two primary user roles.

## 👨‍🎓 Student

Students can:

* Register for the platform.
* Log into the application.
* Access their student interface.
* View available courses.
* Enroll in courses.
* Access course information.
* Interact with the AI-tutor interface.
* Navigate between learning areas.
* Log out of the platform.

### Student Workflow

```text
Registration
      │
      ▼
    Login
      │
      ▼
Student Homepage
      │
      ├───────────────┐
      │               │
      ▼               ▼
 View Courses      AI Tutor
      │               │
      ▼               ▼
 Enroll Course    Ask Questions
      │               │
      └───────┬───────┘
              ▼
         Learning
```

---

# 👨‍🏫 Professor

Professors can:

* Register for the platform.
* Log into the application.
* Access the professor interface.
* Create courses.
* Provide course descriptions.
* Manage course-related information.
* Provide learning materials as part of the intended platform workflow.

### Professor Workflow

```text
Registration
      │
      ▼
    Login
      │
      ▼
Professor Homepage
      │
      ▼
Create / Manage Courses
      │
      ├── Course Information
      ├── Course Description
      └── Learning Materials
```

The original project scope specifically defines professor course creation and management and student course registration and AI-chat interaction as core application requirements.

---

# 🤖 AI Tutor

The platform is designed around an AI-assisted tutoring experience.

The intended workflow is:

```text
Student
   │
   ▼
Course Selection
   │
   ▼
AI Tutor
   │
   ▼
Course-Related Question
   │
   ▼
AI-Generated Response
   │
   ├── Course Materials
   │
   └── General Knowledge
```

The project specification describes the robot tutor as a generative AI intended to answer student questions using uploaded course materials and general knowledge.

### Implementation Scope

The current GitHub repository contains the **application architecture, REST backend, database-oriented services, frontend interfaces, and AI-tutor UI/prototype**.

The repository does **not currently contain a visible production LLM/RAG implementation**. Therefore, this README intentionally describes the AI tutor as the platform's intended/implemented interface and project scope rather than claiming a specific LLM, RAG pipeline, vector database, or model API that is not present in the repository.

---

# 🔌 RESTful Backend

The backend exposes RESTful services using **JAX-RS**.

The application is registered under:

```text
/api
```

The main REST resources are:

```text
/api/student
/api/course
/api/professor
```

---

## Student API

`StudentWS.java` provides student-related REST functionality.

The service uses:

* `@Stateless`
* `@Path`
* `@POST`
* `@GET`
* `@Consumes`
* `@Produces`
* `EntityManager`
* JSON-based request/response handling

The student service supports creating students and retrieving student records using a matriculation number.

Example endpoint:

```http
POST /api/student
```

and:

```http
GET /api/student/{matrNr}
```

---

# 📚 Course API

`CourseWS.java` provides course management functionality.

The current implementation supports:

### Create Course

```http
POST /api/course
```

### Retrieve Course

```http
GET /api/course/{courseId}
```

### Delete Course

```http
DELETE /api/course/{courseId}
```

### Enroll Student

```http
POST /api/course/{matrNr}/{courseId}
```

The course service persists course entities and updates student-course relationships through JPA's `EntityManager`.

---

# 👨‍🏫 Professor API

`ProfessorWS.java` provides the backend service layer for professor-related application functionality.

The professor service forms part of the role-based backend architecture alongside the student and course services.

---

# 🗄️ Database & Persistence

The application uses a relational persistence architecture based on:

```text
Java Application
       │
       ▼
      JPA
       │
       ▼
EntityManager
       │
       ▼
     JDBC
       │
       ▼
 PostgreSQL
```

The project scope specifies **PostgreSQL** as the relational database and **JPA/JDBC** as part of the required Java persistence and database technology stack.

The REST services inject the persistence context using:

```java
@PersistenceContext(unitName = "AiTutorDB")
private EntityManager em;
```

The course and student services use the persistence context for creating, retrieving, updating, and deleting application entities.

---

# 🖥️ Frontend

The frontend uses standard web technologies:

* **HTML5**
* **CSS3**
* **JavaScript**

The repository contains dedicated pages and stylesheets for:

```text
Student Login
Student Registration

Professor Login
Professor Registration
Professor Dashboard

General Login
Welcome / Success Pages
```

The frontend is designed around separate student and professor workflows.

---

# 🎨 UI/UX Design

The application was designed with emphasis on:

* User-friendliness
* Simple navigation
* Role-based entry points
* Course accessibility
* Student learning workflows
* AI-tutor interaction
* Registration and login
* Password-reset flow
* Clear visual hierarchy

The repository contains UI assets including:

```text
ai_logo.jpeg
AiTutor_Picture.jpeg
chatbot.JPG
```

as well as multiple HTML and CSS files supporting the application's interfaces.

---

# 🎨 Figma Prototype

The project's UI/UX was also designed and documented using Figma.

## 🔗 View the Figma Prototype

**[Open AI Tutor Figma Prototype](https://www.figma.com/proto/XyniVHhoPCDhYTIOGSGEV2/AI-Tutor?page-id=3%3A34&node-id=3-35&node-type=canvas&viewport=229%2C745%2C0.09&t=LBGCD6ILjPlYtUCZ-1&scaling=min-zoom&content-scaling=fixed&starting-point-node-id=3%3A35)**

### Prototype Includes

* Student / Professor role selection
* Student homepage
* Course overview
* Assignment deadlines
* Interactive AI chatbot interface
* Home navigation
* Logout flow
* Registration wireframes
* Password-reset wireframes

The repository's original Figma documentation specifically describes the role-selection screen, student homepage, courses, assignment deadlines, chatbot, navigation, registration, and password-reset wireframes.

---

# 🔄 End-to-End Application Flow

```text
                    ┌───────────────┐
                    │     User      │
                    └───────┬───────┘
                            │
                            ▼
                  ┌───────────────────┐
                  │ Role Selection    │
                  └─────────┬─────────┘
                            │
                 ┌──────────┴──────────┐
                 │                     │
                 ▼                     ▼
            👨‍🎓 Student           👨‍🏫 Professor
                 │                     │
                 ▼                     ▼
              Register              Register
                 │                     │
                 ▼                     ▼
               Login                 Login
                 │                     │
                 ▼                     ▼
          Student Homepage      Professor Homepage
                 │                     │
          ┌──────┴──────┐              │
          │             │              ▼
          ▼             ▼        Course Management
       Courses       AI Tutor
          │             │
          ▼             ▼
       Enroll       Ask Questions
          │             │
          └──────┬──────┘
                 ▼
             Learning
```

---

# 🧱 Technology Stack

| Category              | Technology               | Usage                            |
| --------------------- | ------------------------ | -------------------------------- |
| Programming Language  | **Java**                 | Backend application              |
| Enterprise Framework  | **Jakarta EE / Java EE** | Enterprise architecture          |
| REST Framework        | **JAX-RS**               | RESTful web services             |
| Business Services     | **EJB / Stateless EJB**  | Backend service components       |
| Persistence           | **JPA**                  | Object-relational mapping        |
| Database Connectivity | **JDBC**                 | Database connectivity            |
| Database              | **PostgreSQL**           | Relational persistence           |
| API Format            | **JSON**                 | Frontend/backend data exchange   |
| Frontend              | **JavaScript**           | Client-side functionality        |
| Markup                | **HTML5**                | Web interface                    |
| Styling               | **CSS3**                 | UI styling                       |
| UI/UX                 | **Figma**                | Prototyping and interface design |
| Architecture          | **REST**                 | Backend/frontend communication   |

The technology choices align with the original project requirements, which specify Java, Jakarta EE, JPA, JDBC, PostgreSQL, JavaScript, and JAX-RS.

---

# 📂 Repository Structure

```text
.
├── AiTutorApp.java
├── CourseWS.java
├── ProfessorWS.java
├── StudentWS.java
├── TestCourse.java
│
├── login.html
├── student_login.html
├── student_register.html
├── professor_login.html
├── professor_register.html
├── professor_logged.html
├── sucessfull.html
│
├── login.css
├── student_login.css
├── student_register.css
├── professor_login.css
├── professor_register.css
├── professor_logged.css
├── newstyle.css
├── styles.css
├── sucessfull.css
│
├── ai_logo.jpeg
├── AiTutor_Picture.jpeg
├── chatbot.JPG
│
├── postgresql-42.7.1.jar
│
└── README.md
```

The current repository contains the Java REST services, frontend HTML/CSS files, UI assets, test class, PostgreSQL driver JAR, and README shown above.

---

# 🧪 Testing

The repository includes:

```text
TestCourse.java
```

which provides a starting point for testing course-related functionality.

Potential areas for extending automated testing include:

* Student API tests
* Course CRUD tests
* Course enrollment tests
* Professor API tests
* Persistence tests
* REST endpoint validation
* Frontend integration testing

---

# 🚀 Getting Started

## Prerequisites

The application requires an environment capable of running:

* Java
* Jakarta EE / Java EE
* JAX-RS
* JPA
* PostgreSQL
* HTML/CSS/JavaScript frontend

A compatible Java enterprise application server is required to deploy the backend REST services.

---

## 1. Clone the Repository

```bash
git clone https://github.com/Vinrach/Software_Development_for_AI_Tutor_Application.git

cd Software_Development_for_AI_Tutor_Application
```

## 2. Configure PostgreSQL

Create and configure the PostgreSQL database required by the application's persistence configuration.

The persistence unit used by the Java services is:

```text
AiTutorDB
```

## 3. Deploy the Backend

Deploy the Java enterprise application to a compatible Jakarta EE / Java EE application server.

The REST API is exposed under:

```text
/api
```

## 4. Launch the Frontend

Serve the HTML, CSS, and JavaScript files through the configured web application environment.

Then access the application through a web browser.

---

# 🔐 Security Considerations

The current repository represents an academic application prototype and should not be considered production-ready.

For production deployment, the platform should be extended with:

* Secure authentication
* Password hashing
* Role-based authorization
* Session management
* JWT or equivalent API authentication
* Input validation
* HTTPS
* Database credential management
* Environment-based configuration
* Secure secret management

---

# 🌍 Multi-Tenancy

The original project scope specifies support for **multi-tenancy** to allow the platform to potentially be licensed or white-labelled for multiple universities.

A production implementation could isolate university-specific:

```text
University
   │
   ├── Users
   ├── Professors
   ├── Students
   ├── Courses
   └── Learning Materials
```

while maintaining a shared application architecture.

This would allow the platform to evolve from a university-specific prototype into a reusable education technology platform.

---

# 💡 Key Software Engineering Concepts

This project demonstrates practical experience with:

* Enterprise Java development
* RESTful API design
* JAX-RS
* Stateless EJB services
* JPA persistence
* JDBC
* PostgreSQL
* CRUD operations
* Entity management
* Student-course relationships
* Frontend/backend integration
* JSON-based API communication
* Role-based application workflows
* UI/UX prototyping
* Database-driven web applications
* Enterprise application architecture

---

# 🔮 Future Improvements

## AI / Machine Learning

* Integrate an LLM provider.
* Implement Retrieval-Augmented Generation (RAG).
* Index course materials for retrieval.
* Add embeddings and semantic search.
* Maintain conversation history.
* Add response evaluation.
* Implement hallucination detection and grounding.
* Add personalized tutoring based on student progress.

## Backend

* Add authentication and authorization.
* Introduce DTOs and validation.
* Improve exception handling.
* Add API documentation with OpenAPI/Swagger.
* Introduce automated unit and integration testing.
* Improve service/repository separation.
* Add structured logging.

## Database

* Formalize entity relationships.
* Add database migrations.
* Improve indexing.
* Add transaction management.
* Support university-level tenant isolation.

## Frontend

* Convert the prototype into a fully integrated SPA.
* Improve responsive design.
* Add reusable UI components.
* Connect all frontend workflows to REST services.
* Add client-side validation.
* Improve accessibility.

## DevOps

* Maven/Gradle dependency management.
* Dockerize the application.
* Add CI/CD with GitHub Actions.
* Add automated testing pipelines.
* Introduce environment-specific configuration.

---

# 🎓 Academic Context

This project was developed as part of a Master's-level **Software Development for AI Tutor Application** project.

The project combines:

```text
Enterprise Software Development
            +
RESTful Web Services
            +
Database Persistence
            +
Frontend Development
            +
UI/UX Design
            +
AI-Assisted Education
```

The project specification targeted a German university use case and required an enterprise Java backend, PostgreSQL persistence, JavaScript frontend, JAX-RS communication, and potential multi-tenancy for future white-label deployment.

---

# 📚 Project Resources

### GitHub Repository

**[AI Tutor Platform — GitHub Repository](https://github.com/Vinrach/Software_Development_for_AI_Tutor_Application)**

### Figma Prototype

**[Open AI Tutor Figma Prototype](https://www.figma.com/proto/XyniVHhoPCDhYTIOGSGEV2/AI-Tutor?page-id=3%3A34&node-id=3-35&node-type=canvas&viewport=229%2C745%2C0.09&t=LBGCD6ILjPlYtUCZ-1&scaling=min-zoom&content-scaling=fixed&starting-point-node-id=3%3A35)**

---

# 👨‍💻 Author

**Vinrach**

Master's Degree Project

GitHub: **[@Vinrach](https://github.com/Vinrach)**

---

<div align="center">

### Java • Enterprise Software • REST APIs • PostgreSQL • AI Applications

</div>
