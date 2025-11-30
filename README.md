# 🎓 Student Record Management System
### Java Programming Lab | Semester 3 | KRMU Student Records Management Project

![Java](https://img.shields.io/badge/Language-Java-orange) ![Status](https://img.shields.io/badge/Status-Completed-brightgreen) ![Semester](https://img.shields.io/badge/Semester-3-blue)

A comprehensive, persistent, and multithreaded command-line application designed to manage student records. This project serves as a consolidation of **Lab Assignments 1 - 5**, demonstrating mastery of Object-Oriented Programming, Java Collections, and File I/O.

---

## 🚀 Key Features

* **PERSISTENT STORAGE**: Automatically saves and loads student records to a local file (`students.txt`) so data is never lost.
* **MULTITHREADING**: Features a simulated "Loading..." animation using background threads to mimic real-world data processing delays.
* **SMART SORTING**: Sorts students by **Marks (Descending)** using custom `Comparator` logic.
* **ROBUST VALIDATION**: Prevents duplicate Roll Numbers and validates input (e.g., Marks must be 0-100).
* **ERROR HANDLING**: Implements custom exceptions (`StudentNotFoundException`) for safer execution.
* **MODULAR ARCHITECTURE**: Clean separation of concerns using `model`, `service`, and `util` packages.

---

## 📂 Project Structure

The project follows a strict **Modular Design** pattern as per Lab 2 & 5 guidelines:

```text
StudentManagementSystem/
├── src/
│   ├── main/
│   │   └── Main.java                       <- Entry point (Menu System)
│   ├── model/
│   │   ├── Person.java                     <- Abstract Base Class
│   │   └── Student.java                    <- Concrete Data Class
│   ├── service/
│   │   ├── RecordActions.java              <- Interface for CRUD Operations
│   │   └── StudentManager.java             <- Business Logic & File I/O
│   └── util/
│       ├── Loader.java                     <- Multithreading Simulation
│       └── StudentNotFoundException.java   <- Custom Exception
├── students.txt                            <- Data storage file
└── README.md                               <- This File
```
---

## 🛠️ Concepts Implemented

This project successfully integrates the learning outcomes from all 5 Lab Assignments:

| Concept | Implementation Details |
| :--- | :--- |
| **OOP Principles** | Inheritance (`Student extends Person`), Abstraction, and Polymorphism. |
| **Interfaces** | `RecordActions` interface defines the contract for system operations. |
| **Collections** | `ArrayList` used for memory management; `Iterator` used for traversal. |
| **File Handling** | `BufferedReader` and `BufferedWriter` for reading/writing CSV data. |
| **Multithreading** | `Runnable` interface implemented in `Loader.java`. |
| **Exception Handling** | `try-catch` blocks and custom `throw` logic for data integrity. |

---

## 💻 How to Run

### Prerequisites
* **Java Development Kit (JDK)** (Version 8 or higher).
* VS Code (with Extension Pack for Java) OR Terminal.

### Option 1: Using VS Code (Recommended)
1.  Open the `StudentManagementSystem` folder in VS Code.
2.  Open `src/main/Main.java`.
3.  Click the dropdown on **Run** or **Play** button located in the top right.
4.  Click on Run Java

### Option 2: Using Terminal / Command Line
If you prefer running it manually, follow these exact steps to avoid package errors:

1.  **Navigate to the source directory:**
    ```bash
    cd "{yourlocalpath}/StudentManagementSystem/src"
    ```

2.  **Compile the Main class:**
    ```bash
    javac main/Main.java
    ```

3.  **Run the Application:**
    ```bash
    java main.Main
    ```

---

## 👤 Author
**Name:** Aditya  
**Roll no. ** 2401010144   
**University:** K.R. Mangalam University  
**Department:** School of Engineering & Technology  