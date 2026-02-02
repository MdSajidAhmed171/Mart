## Mart – Core Java Console Application

**Mart** is a simple **console-based Java application** built using **pure Core Java (OOP) concepts**.

The project simulates a basic shopping system with **Users**, **Admins**, **Products**, and a **Purchase flow**
This project focuses on **code quality**, **object-oriented design**, **error handling**, and **clean architecture**, aligning strongly with **Core Java backend job requirements**.

---

## Key Objectives

* Practice **Core Java & OOP fundamentals**
* Apply **clean separation of concerns**
* Write **maintainable and readable code**
* Demonstrate **real-world business logic without frameworks**

---

## Core Concepts Used

* Object-Oriented Programming (OOP)

  * Encapsulation
  * Inheritance
  * Polymorphism
  * Abstraction
* Constructor validation
* Exception handling (custom exceptions)
* Service-based architecture
* Console-based user interaction

---

## 📁 Project Structure

```text
src/
└── com/mart
    ├── main
    │   └── Main.java          # Application entry point
    ├── model
    │   ├── Product.java       # Product entity
    │   ├── User.java          # User entity
    │   └── Admin.java         # Admin entity
    ├── service
    │   ├── ProductService.java
    │   ├── CartService.java
    │   └── PurchaseService.java
    ├── util
    │   └── IdGenerator.java   # Helper utilities
    └── exception
        └── InvalidProductException.java
```

---

## Roles

* **Admin**

  * Add / manage products
* **User**

  * View products
  * Buy products

---
