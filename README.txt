# DemoBank API

Demo banking backend built with Spring Boot.
Provides basic endpoints for account validation and service health checks.

---

## Requirements

* Java 17+
* Maven

---

## Run locally

Start the application:

```bash
mvn spring-boot:run
```

Server will be available at:

```
http://localhost:8080
```

---

## Health check

Check if the server is running.

**Request**

```
GET /health
```

**Response**

```
200 OK
server is alive
```

---

## Account validation

Check whether an account is valid for operations.

**Request**

```
GET /account/{id}/validation
```

**Path parameters**

* `id` — account identifier

**Response**

```
200 OK
true | false
```

**Description**

Returns:

* `true` — if account exists and is active
* `false` — otherwise

**Example**

```
GET /account/42/validation
```

Response:

```
true
```

---

## Error handling

* `400 Bad Request` — invalid input
* `404 Not Found` — account not found
* `500 Internal Server Error` — unexpected server error

---

## Notes

* API documentation is maintained manually in this README
* Swagger/OpenAPI is intentionally not used
* API behavior is defined by contract, not UI
