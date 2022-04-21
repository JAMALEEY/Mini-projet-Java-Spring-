#[Java] [Spring] Dream Case App - Restful APIs


## Objectif

L’objectif de ce mini projet est de créer une application Restful Web Serviceà l'aide de Spring Boot, et ayant 4 fonctionnements Create, Read, Update, Delete (CRUD): 

Read (GET method)
We will build an URI that is assigned to return the user an employee list and defines another URI that returns the user the information of a particular employee. The data that the user will be received is in XML or JSON format. These URIs only accept the requests with GET method.
GET http://localhost:8080/cases/E01

Update (PUT method)
Build an URI to process the request for changing an employee's information. This URI accepts only the requests with PUT method. The data attached with the request is the new information of the employee, which is in XML or JSON format.
PUT http://localhost:8080/cases/E01

Create (POST method)
Construire un URI pour traiter les demandes (request) dans but de créer un employé (employee). Ce URI n'accepte que les demandes avec la méthode POST. Les données attachées de cette demande est l'information du case crée. Elle est sous format deJSON.
POST http://localhost:8080/cases/

Delete (DELETE method).
Construisez un URI pour traiter une demande (request) de suppression d'un employé (employee). Ce URI n'accepte que les demandes utilisant la méthode DELETE.
 

## Structure de données  

Chaque rendez-vous doit avoir les informations suivantes : 
    Une date du rendez-vous 
    Une heure de début 
    Une heure de fin
    Une liste de notes 
    Id de l’utilisateur accompagné

## Prérequis

|Langage   |Framework    | Base de données| Pattern|                     
|:--------:|:-----------:|:--------------:|:------:|
| Java 11  | Spring Boot |  SQL           | MVC.   | 


## Livraison attendue 

- Zip conteant le projet Spring Boot  compilable avec Maven ou Gradle avec le code source en JAVA.

## Références

https://spring.io/projects/spring-boot
