# Library Management System Using Switch Statement

A Java-based library management application that demonstrates the use of switch statements for menu-driven operations. This system allows librarians to manage books and track student borrowing activities.

## Features

- **Book Management**
  - Add new books to the library
  - Search books by serial number
  - Search books by author name
  - View all available books
  - Update book quantities

- **Student Management**
  - Register students
  - View all registered students
  - Check out books (limit 3 per student)
  - Check in books

## Class Structure

- **`Library.java`** - Main application class with menu-driven interface
- **`book.java`** - Individual book class with book details
- **`books.java`** - Book collection management and operations
- **`Student.java`** - Individual student class with student details
- **`students.java`** - Student collection management and operations

## How to Compile and Run

### Compilation
```bash
javac *.java
```

### Run the Application
```bash
java Library
```

## Menu Options

1. Add Book
2. Upgrade Book Quantity
3. Search Books (by Serial No or Author Name)
4. Show All Books
5. Add Student
6. Show All Students
7. Check Out Book
8. Check In Book
0. Exit

## Requirements

- Java Development Kit (JDK) 8 or higher

## Author

Created as a mini project to demonstrate Java switch statement usage and object-oriented programming concepts.
