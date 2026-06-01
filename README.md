# Movie Ticket Booking System

A console-based Java application that simulates a simple movie ticket booking system. This mini-project demonstrates core Java concepts, including object-oriented programming (OOP) and concurrent collections.

## Features

- **Movie Management**: Add movies to the system with details like genre and duration.
- **Theater & Showtime Management**: Register theaters and schedule showtimes for specific movies.
- **Ticket Booking**: Allow customers to book available showtimes.
- **Search & Sort**: 
  - Search for movies by name.
  - Sort movies alphabetically by name.
- **Thread-Safe Collections**: Utilizes `ConcurrentHashMap`, `CopyOnWriteArrayList`, and `CopyOnWriteArraySet` to prepare the system for multi-threaded environments.

## Project Structure

```text
miniProject5/
├── src/
│   └── com/
│       └── movieticketbooking/
│           ├── Booking.java                  # Records ticket reservations
│           ├── Movie.java                    # Represents movie details
│           ├── MovieTicketBookingSystem.java # Main driver class
│           ├── Showtime.java                 # Represents scheduled screenings
│           └── Theater.java                  # Represents movie theaters
└── README.md
```

## Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher is recommended.
- A basic terminal or an IDE (like IntelliJ IDEA, Eclipse, or VS Code) to compile and run the code.

## How to Run

1. Open your terminal or command prompt.
2. Navigate to the `src` directory of the project:
   ```bash
   cd src
   ```
3. Compile all the Java files:
   ```bash
   javac com/movieticketbooking/*.java
   ```
4. Run the main system:
   ```bash
   java com.movieticketbooking.MovieTicketBookingSystem
   ```
   
## Expected Output

When running the project, you should see output similar to this:
```text
Booking successful for Geek
Search Results: [Movie{name='Inception', genre='Sci-Fi', duration=148}]
Sorted Movies: [Movie{name='Inception', genre='Sci-Fi', duration=148}, Movie{name='The Dark Knight', genre='Action', duration=152}]
```

## Future Enhancements
- Add a user interface (CLI menu or GUI).
- Implement persistent storage (saving bookings to a database or text file).
- Add seating charts so users can pick specific seat numbers.

