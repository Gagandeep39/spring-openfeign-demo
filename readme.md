# OpenFeign

- Substitute to Rest Template
- Used for Interservlet COmmunication
- Declarative Rest Client
- Creates an Interface with JAX-RS anotation or MVC annotation

## Steps

- Add @EnableFeignClient on Main clas
- It will scan for all packages for fiegn clients
- Add @FeignClient to make that as a fiegnclient

eg.

```
@FeighClient(name = "user", url="http://localhost:4001") {
    // Call all microservice mapoigs from here
    // Feign will automcatically generate the logic
}
```
