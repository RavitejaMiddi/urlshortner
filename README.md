# URL Shortener - Backend

A Spring Boot based backend for a simple URL shortener service.  
It provides APIs to shorten long URLs, retrieve original URLs, and redirect to the original URL when the shortened link is visited.

## Features
- Shorten long URLs into unique short codes.
- Redirect short URLs to the original links.
- Optional: Track usage statistics (click count, creation date, expiry date).

## Tech Stack
- **Backend:** Java 8+, Spring Boot
- **Database:** PostgreSQL 
- **Build Tool:** Maven
- **Others:** Spring Data JPA

## API Endpoints
| Method | Endpoint             | Description |
|--------|----------------------|-------------|
| POST   | `/api/shorten`       | Shortens a given URL |
| GET    | `/{shortCode}`       | Redirects to the original URL |
| GET    | `/api/stats/{code}`  | (Optional) Returns usage statistics |

## Setup Instructions
<h3>1. **Clone the repository**</h3>
 
   git clone https://github.com/RavitejaMiddi/urlshortener.git</br>
   cd urlshortener


<h3>2.Configure Database</h3>
- Update application.properties with your DB credentials.
  
spring.datasource.url=jdbc:postgresql://localhost:5432/urlshortener </br>
spring.datasource.username=youruser</br>
spring.datasource.password=yourpassword</br>
spring.jpa.hibernate.ddl-auto=update


<h3>3.Build & Run</h3>

mvn clean install</br>
mvn spring-boot:run


<h3>4.Test API</h3>

Use Postman or curl to test the endpoints.
