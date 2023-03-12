# a-RESTful-Web-Service
## HELLO World guide
### How to complete this guide
#### +  Starting with Spring Initializr ( select Spring Web dependencie )
#### +  Create a Resource Representation Class
         + '''java package com.example.restservice;
                 public record Greeting(long id, String content) { }
#### + Create a Resource Controller 
         + In Spring’s approach to building RESTful web services, HTTP requests are handled by a controller
         
         + The service will handle GET requests for /greeting, optionally with a name parameter in the query string.
         The GET request should return a 200 OK. response with JSON in the body that

         + A key difference between a traditional MVC controller and the RESTful web service controller 
             shown earlier is the way that the HTTP response body is created.
             Rather than relying on a view technology to perform server-side rendering of the greeting data to HTML, 
             this RESTful web service controller populates and returns a Greeting object. 
             The object data will be written directly to the HTTP response as JSON.
<br> </br> It will respond with a JSON representation of a greeting.
<br> </br> build a service that will accept HTTP GET requests at  [http://localhost:8085/greeting.](http://localhost:8085/greeting.)
![GIT Restfull](https://user-images.githubusercontent.com/79877072/224553930-ab7b6247-6c01-48c7-a9dd-999019f18886.PNG)

<br> </br> You can customize the greeting with an optional name parameter in the
query string [http://localhost:8085/greeting?name=mossab.](http://localhost:8085/greeting?name=mossab.),
as the following listing shows:

![GIT resful 2](https://user-images.githubusercontent.com/79877072/224554016-2ea6f00e-d149-46e4-8cdc-ba1abfc8b089.PNG)
