# Selenium Automation Framework (Java)

A scalable Selenium automation framework built using Java, TestNG, and Maven.  
The framework follows the Page Object Model (POM) design pattern and demonstrates best practices for UI test automation.

This project is part of my QA Automation portfolio.

![Java](https://img.shields.io/badge/Java-17-orange)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-green)
![TestNG](https://img.shields.io/badge/TestNG-Framework-red)
![Maven](https://img.shields.io/badge/Maven-Build-blue)

---

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager


---

## Framework Architecture

The framework follows the **Page Object Model (POM)** design pattern to improve maintainability and readability of test code.

Key components include:

- Base test setup
- Page classes
- Test classes
- Utility classes
- Test listeners

---

## Project Structure:

````
selenium-automation-framework/
├── src
│   ├── main
│   └── test
│        └── java
│             ├── base
│             │     └── BaseTest.java
│             │
│             ├── pages
│             │     └── LoginPage.java
│             │
│             ├── tests
│             │     └── LoginTest.java
│             │
│             ├── utilities
│             │     ├── ScreenshotUtil.java
│             │     ├── ConfigReader.java
│             │     └── ExcelReader.java
│             │
│             └── listeners
│                   └── TestListener.java
│
├── testng.xml
├── pom.xml
└── README.md

````

---

## Features

- Selenium WebDriver automation
- Page Object Model (POM)
- TestNG test execution
- Maven dependency management
- Screenshot capture on test failure
- Data-driven testing
- HTML reporting

---

## Sample Test Scenario

Automated login functionality:

1. Open login page
2. Enter username and password
3. Click login
4. Verify successful login

---

## How to Run the Tests

### Run using TestNG

Right click:

testng.xml → Run

---

### Run using Maven

Execute the following command in the terminal:

mvn clean test

---

## Reports

Test execution reports are generated after each run.

Reports can be found in:

test-output/

---

## Test Execution

---

## Future Improvements

- Parallel test execution
- CI/CD integration
- Docker-based Selenium Grid
- Advanced reporting

---

## Author

QA Automation Portfolio Project  
Created to demonstrate automation framework design and test automation skills.