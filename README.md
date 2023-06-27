---
topic: 
  - Basic springboot application for Azure App Service
languages:
  - java
products:
  - Azure App Service
Difficulty:
  - Easy
---

# Basic springboot application for Azure App Service
This application is an Azure App service based on Springboot and synced with Git repository.

# prerequisites:
  - Azure a/c
  - Github a/c
  - java 8
  - any editor like - Eclipse, STS, Intellij

# How to set up initial project:
Follow the Microsoft(or other) document to create a java app on azure app service

# How to update the project:
Any java editor(you can even use Github editor) can be used to update according to the business need. E.g., Eclipse, STS, Intellij

# A basic project structure:
  ![image](https://user-images.githubusercontent.com/20474367/233970093-46c7a52a-907e-4697-aa54-0e38de0f8524.png)

# Escalation Matrix:
  - ranadip.das@abzooba.com

# How to check the app on internet:
  - **URL** - https://azure-default-domain-name/api/v1/products/ **Method** - Get
  - **URL** - https://azure-default-domain-name/api/v1/products/{id} **Method** - Get
  - **URL** - https://azure-default-domain-name/api/v1/products/{id} **Method** - Delete
  - **URL** - https://azure-default-domain-name/api/v1/products/ **Method** - Post **Request Body** -{"id":1,"name":"xxx","quantity":1,"price":1}
NB - Here the azure-default-domain-name is - demojavawinwebapp.azurewebsites.net
