## Orange Talents - API REST :tangerine:

System for managing a company's clients through a REST API, created with Spring Boot. We can user to test on: https://orangetalent-api.herokuapp.com/api/v1/user

#### 👾Details

- [ ]  Spring Boot Initialzr (Maven, Java 11,Jpa, Web and PostgreSQL)
- [ ]  Operations: Registration, Reading, Updating and Removing users
- [ ]  MVC design pattern
- [ ]  Deployment of the system in the cloud through Heroku
- [ ] Postman

#### 👾Endpoints of API:

```
/api/v1/user 		   --> GET users list
/api/v1/user           --> POST new user
/api/v1/user/{userId}  --> PUT updating already registrered user
/api/v1/user/{userId}  --> DELETE user by ID
```

Exemple:

```
http://localhost:8080/
    Or
http://localhost:8080/api/v1/user
Show the list of users resgistrered
```

To add new user, go to Postaman and create a method POST.
The body of the POST is JSON and must have:

```
{
	"name": "César Cláudio Benício dos Santos",
    "email": "claudiobeniciodossantos@uou.com.br",
	"cpf": "42643311701",
	"dob": "1998-05-25",
	"adresses": [
        {"logradouro": "Rua Teodora Barbosa Ribeiro 105",
	     "numero": "425",
         "complemento": "casa",
	     "bairro": "Arrozal",
	     "cidade": "Arrozal",
	     "estado": "RJ",
         "cep": "27185970"}
    ],
    "age": "23"
}
```

#### 👾Prerequisite

Must have already installed/created on your computer:

- Java 11; - if you are not sure type `java -version` on your cmd
- Maven
- Intellj IDEA Community Edition;
- Version Control Git;
- GitHub account;
- Heroku Account;

#### 👾Deploying your app to **Heroku**

1. Create an account on the website [https://www.heroku.com] (https://www.heroku.com/)
2. If you are working with a different version of Java 8, you have to create a file on your root project System.properties and write: java.runtime.version=11
3. Create new App
4. Connect GitHub Account
5. Search for a repository to connect -> Connect
6. Enable Automatic Deploy
7. Deploy Branch



------

💬[Linkedin](https://www.linkedin.com/in/jessika-gomes/)