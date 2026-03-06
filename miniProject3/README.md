\# 🧠 Mini Project 3 — Online Java Quiz App



> A console-based Quiz application built with Java using OOP principles —

> Interfaces, Models, and Services working together cleanly.



---



\## 📁 Project Structure



```

miniProject3/

│

└── src/

&nbsp;   └── quiz/

&nbsp;       ├── interfaces/

&nbsp;       │   └── Quiz.java          ← Interface defining quiz contract

&nbsp;       ├── models/

&nbsp;       │   └── Question.java      ← Question model (text, options, answer)

&nbsp;       ├── services/

&nbsp;       │   └── QuizService.java   ← Core logic, implements Quiz interface

&nbsp;       └── Main.java              ← Entry point, loads questions \& starts quiz

```



---



\## ⚙️ How It Works



```

╔══════════════════════════════════════════════════════╗

║  1. Questions are loaded with 4 options each        ║

║  2. User selects answer by entering 1, 2, 3, or 4   ║

║  3. Invalid inputs are handled gracefully           ║

║  4. Final score is shown after all questions        ║

╚══════════════════════════════════════════════════════╝

```



---



\## 💻 Sample Output



```

Welcome to the Online Quiz!



Q1: What is the size of an int data type in Java?

1\. 8 bit

2\. 16 bit

3\. 32 bit

4\. 64 bit

Enter your answer (1-4): 3



Q2: Which method is the entry point of a Java program?

1\. start()

2\. main()

3\. run()

4\. init()

Enter your answer (1-4): 2



Q3: Which of these is NOT a valid access modifier in Java?

1\. public

2\. private

3\. protected

4\. package

Enter your answer (1-4): 4



Quiz Completed!

Your score: 3 out of 3

```



---



\## 🏗️ OOP Concepts Used



| Concept | Where Used | Purpose |

|---------|-----------|---------|

| \*\*Interface\*\* | `Quiz.java` | Defines contract — `start()`, `submitAnswer()`, `showResults()` |

| \*\*Class / Model\*\* | `Question.java` | Encapsulates question data with getters |

| \*\*Service Class\*\* | `QuizService.java` | Implements Quiz interface, handles all logic |

| \*\*Encapsulation\*\* | `Question.java` | Private fields, public getters only |

| \*\*Exception Handling\*\* | `QuizService.java` | Catches invalid number input gracefully |

| \*\*Arrays\*\* | `Main.java` | Stores questions and user answers |



---



\## 🚀 How To Run



```bash

\# Compile

javac -d out src/quiz/interfaces/Quiz.java src/quiz/models/Question.java src/quiz/services/QuizService.java src/Main.java



\# Run

cd out

java quiz.Main

```



---



\## ✅ Features



\- Multiple choice questions (4 options each)

\- Input validation — handles wrong/invalid input without crashing

\- Score tracking — calculates and displays final score

\- Clean OOP architecture — Interface → Model → Service → Main

\- Easily extendable — add more questions in `Main.java`



---



\## 🎯 What This Project Shows



```

╔════════════════════════════════════════════════════════════════╗

║  WHAT YOU SEE             WHAT IT MEANS                       ║

╠════════════════════════════════════════════════════════════════╣

║  ✅ Interface used      → Understands abstraction \& contracts  ║

║  ✅ Model class         → Clean data encapsulation             ║

║  ✅ Service layer       → Separation of concerns               ║

║  ✅ Exception handling  → Writes robust, crash-proof code      ║

║  ✅ Layered structure   → Thinks like a real Java developer     ║

╚════════════════════════════════════════════════════════════════╝

```



---



\## 🔗 Part of



\[java-mini-project](https://github.com/mayankgotnolife/java-mini-project) —

a growing collection of Java projects built while learning OOP concepts step by step.

