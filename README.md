# [Java][Spring] Dream Case App - Restful APIs

## Objectif

L’objectif de ce mini projet est de créer une application Restful Web Service à l'aide de Spring Boot, et ayant 4 fonctionnements Create, Read, Update, Delete (CRUD): 

### Read (GET method)
Construire un URI pour traiter les demandes (request) dans le but de retourner un case (dossier) avec son unique ID. Ce URI n'accepte que les demandes avec la méthode GET. Les données attachées de cette demande est l'information du case crée. Elle est sous format de JSON.

=> GET http://localhost:8080/cases/E01

### Update (PUT method)
Construire un URI pour traiter les demandes (request) dans le but de modifier les informations d'un case (dossier). Ce URI n'accepte que les demandes avec la méthode PUT.

=> PUT http://localhost:8080/cases/E01

### Create (POST method)
Construire un URI pour traiter les demandes (request) dans le but de créer un case (dossier). Ce URI n'accepte que les demandes avec la méthode POST. Les données attachées de cette demande est l'information du case crée. Elle est sous format de JSON.

=> POST http://localhost:8080/cases/

### Delete (DELETE method).
Construisez un URI pour traiter une demande (request) de suppression d'un case (dossier). Ce URI n'accepte que les demandes utilisant la méthode DELETE.

=> DELETE http://localhost:8080/cases/E01

## Structure de données  

Chaque case doit avoir les informations suivantes : 

|   Nom du champ  |     Type        |     Description               |                    
|:---------------:|:---------------:|:-----------------------------:|
| caseId          | BIGINT (PK)     |  Id du case                   |
| creationDate    | DATETIME        |  Date de création du case     |
| lastUpdateDate  | DATETIME        |  Date de modification du case |
| title           | VARCHAR(255)    |  Titre du case                |
| description     | VARCHAR(2056)   |  Description  du case         |
 

## Prérequis

|Langage   |Framework    | Type de Base de données   | Pattern|                     
|:--------:|:-----------:|:-------------------------:|:------:|
| Java 11  | Spring Boot |  SQL (MySQL ou PotgreSQL) | MVC    | 


## Livraison attendue 

- Zip conteant le projet Spring Boot compilable avec Maven ou Gradle avec le code source en JAVA.

## Durée de réalisation 

La développement de ce mini projet est estimé à 1H15

## Références

=> https://spring.io/projects/spring-boot
=> https://www.javatpoint.com/restful-web-services-spring-boot
