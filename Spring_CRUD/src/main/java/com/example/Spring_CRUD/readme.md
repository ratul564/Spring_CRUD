# User Management System
* This is a Spring Boot project where we can see all user, any particular user or we can update and delete user as well.
# Dependency Use
* I used two depency in this project 1. Spring Web and 2. Spring Dev Tools. </br>
   with the help of Spring Web dependency we can contains common web specific utilities for both Servlet and Portlet environments<br>
   and with the help of Spring Dev Tools dependency we can trigger a browser refresh when a resource is changed.
# Annotation used
* @RestController
* @RequestMapping
* @Service
* @GetMapping
* @PostMapping
* @PutMapping
* @DeleteMapping
# what I did in this project?
* Basically I did in this project, first made three package name as model, controller and service. and then made three class under this three package. model class under model package
  same as other two as well. then use @RestController,@RequestMapping annotation in controller class. then @GetMapping for find user,
  @PostMapping for add user, @PutMapping for update user data from previous data, @DeleteMapping for delete user data.
# How many layer I used in this project?<br>
 Three layer I have used in this project 1. Model, 2, Controller and 3. Service. <br>
 <bolt>1. Model layer</bolt> - In this layer I declared some User parameter, parameterised Constructor, (Getter & Setter because Used parameter as private),
 and toString.<br>
 <bolt>2. Controller</bolt> - In this layer I passed all these annotation like @GetMapping, @PostMapping etc.
 <bolt>3. Service</bolt> - In this layer i wroth all Business Logic of this project.<br>
 THANK YOU