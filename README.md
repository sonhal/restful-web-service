# RESTful Web Service


Social Media Application

User -> Posts

- Retrieve all Users    - GET    /users
- Create a User         - POST   /users
- Retrieve one User     - GET    /users/{id}  ->  /users/1
- Delete a User         - DELETE /users/{id}  ->  /users/1

- Retrieve all posts a User  ->   - GET   /users/{id}/posts
- Create a post for a User   ->   - GET   /user/{id}/posts
- Retrieve details of a post ->   - GET   /users/{id}/posts/{post_id}
