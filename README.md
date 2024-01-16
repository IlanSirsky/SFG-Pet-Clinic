[![CircleCI](https://dl.circleci.com/status-badge/img/gh/IlanSirsky/SFG-Pet-Clinic/tree/main.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/IlanSirsky/SFG-Pet-Clinic/tree/main)
# SFG-Pet-Clinic

Welcome to the Spring Pet Clinic project! This is a simple web application built with the Spring Framework, showcasing the functionality of a pet clinic management system.

This Project is based on SFG Pet Clinic - Spring Boot Udemy Course [SFG-Pet-Clinic](https://github.com/springframeworkguru/sfg-pet-clinic)

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
- [Technologies Used](#technologies-used)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Spring Pet Clinic is a sample project that demonstrates various aspects of building a web application using the Spring Framework. It includes features like managing veterinarians, owners, and their pets, along with an error page to showcase exception handling.

## Features

- View a list of veterinarians
- Search for owners and their pets
- Explore the list of pets associated with a veterinarian
- Trigger a runtime exception to see exception handling

## Getting Started

To run this project locally, you'll need to have Java and Maven installed. Follow these steps:

1. Clone this repository: `git clone https://github.com/IlanSirsky/SFG-Pet-Clinic.git`
2. Navigate to the project directory: `cd spring-pet-clinic`
3. Run the application: `mvn spring-boot:run`
4. Access the application in your browser: [http://localhost:8080](http://localhost:8080)

## Technologies Used

- Spring Framework
- Spring Boot
- Thymeleaf (for server-side templating)
- Hibernate (for data persistence)
- Maven (as a build tool)
- CircleCI (for continuous integration)

## Usage

Once the application is running, you can explore the various features by navigating through the provided links in the user interface. Additionally, you can trigger a runtime exception by visiting [http://localhost:8080/oups](http://localhost:8080/oups) to see how exception handling is implemented.

_Home Page_
![](https://i.imgur.com/U9pAFWl.jpg)

_Find Owners_
![](https://i.imgur.com/w95oJSN.jpg)

_Owners List_
![](https://i.imgur.com/dEyOPSf.jpg)

_Owner Page_
![](https://i.imgur.com/THynFdx.jpg)

_Add/Update Owner_
![](https://i.imgur.com/ZX8nxAJ.jpg)

_Add/Update Pet_
![](https://i.imgur.com/RHoWBp3.jpg)

_Add Pet Visit_
![](https://i.imgur.com/3pP9nAk.jpg)

_Vets List_
![](https://i.imgur.com/EEXspbs.jpg)

_Error Page_
![](https://i.imgur.com/09agVb3.jpg)

## Contributing

Contributions are welcome! If you find a bug or have suggestions for improvement, please open an issue or submit a pull request.

## License

The Spring PetClinic sample application is released under version 2.0 of the [Apache License](https://www.apache.org/licenses/LICENSE-2.0).
