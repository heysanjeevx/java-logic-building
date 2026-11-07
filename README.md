# Java Logic Building

My practice solutions for the **Master Java Logic Building Sheet** (7 modules: Operators -> Pre-DSA).

Problem set: _add the link or creator of the original sheet here_

> The sheet is not part of this repo. Files describe each question in my own
> words and refer to it by number (Q1, Q2...). Every solution is my own work.

## What each solution file looks like

Plain and short - one file per question, the question as a one-line comment on top:

```java
// Q07 | Section 2.1 | print "Positive" only if the number is above zero
public class Q07_PositiveCheck {
    public static void main(String[] args) {
        int n = 5;
        if (n > 0) System.out.println("Positive");
    }
}

// Approach: a single condition, no else branch needed.   (optional)
```

Module 1 ("predict the output") files hold just the code from the sheet.
I predict on paper, run the file, and note every wrong answer in
[mistakes-log.md](mistakes-log.md).

## Structure

```
java-logic-building/
├── README.md
├── mistakes-log.md            every wrong prediction / bug, with one line on why
├── .gitignore                 .class, IDE files, PDFs
├── templates/
│   └── QXX_Template.java      copy this to start a new question
├── module-1-operators/
│   └── 1.1-arithmetic-output/ Q01_Precedence.java, Q02_Precedence.java ...
├── module-2-conditionals/
│   └── 2.1-simple-if/         Q01_<Title>.java, Q02_<Title>.java ...
├── module-3-loops/
├── module-4-functions/
├── module-5-arrays/
├── module-6-strings/
└── module-7-pre-dsa/
```

Naming: `Q<two-digit number>_<WhatItDoes>.java` (the class has the same name),
so a file can be understood without opening it.

## Run

```bash
# any module (example)
cd module-1-operators/1.1-arithmetic-output
javac Q01_Precedence.java
java Q01_Precedence
```

Requires JDK 17 or newer.

## Commit style

```
Add Section 1.1 arithmetic output (30/30, 4 wrong)
Add Q01-Q10 simple if programs
Fix Q07 - missing negative case
```

One commit per small batch, with a message that says what was added.

## Progress

| Section | Topic | Folder | Done |
|---------|-------|--------|------|
| 1.1 | Arithmetic Output | `module-1-operators/` | 0 / 30 |
| 1.2 | Logical Output | `module-1-operators/` | 0 / 25 |
| 1.3 | Relational Output | `module-1-operators/` | 0 / 22 |
| 1.4 | Increment & Decrement Output | `module-1-operators/` | 0 / 42 |
| 2.1 | Simple If | `module-2-conditionals/` | 0 / 25 |
| 2.2 | If-Else | `module-2-conditionals/` | 0 / 42 |
| 2.3 | If-Else-If Ladder | `module-2-conditionals/` | 0 / 48 |
| 2.4 | Ternary | `module-2-conditionals/` | 0 / 38 |
| 2.5 | Switch-Case | `module-2-conditionals/` | 0 / 35 |
| 3.1 | While Loop | `module-3-loops/` | 0 / 48 |
| 3.2 | Do-While Loop | `module-3-loops/` | 0 / 25 |
| 3.3 | For Loop | `module-3-loops/` | 0 / 50 |
| 3.4 | Break & Continue | `module-3-loops/` | 0 / 30 |
| 3.5 | Pattern Printing | `module-3-loops/` | 0 / 50 |
| 4.1 | Basic Functions | `module-4-functions/` | 0 / 43 |
| 4.2 | Function Overloading | `module-4-functions/` | 0 / 25 |
| 5.1 | 1D Array Basics | `module-5-arrays/` | 0 / 40 |
| 5.2 | 1D Array Operations | `module-5-arrays/` | 0 / 45 |
| 5.3 | 2D Arrays | `module-5-arrays/` | 0 / 35 |
| 6.1 | String Basics | `module-6-strings/` | 0 / 40 |
| 6.2 | String Manipulation | `module-6-strings/` | 0 / 38 |
| 6.3 | Word-Level Operations | `module-6-strings/` | 0 / 35 |
| 7.1 | Conditional Thinking | `module-7-pre-dsa/` | 0 / 60 |
| 7.2 | Looping Logic | `module-7-pre-dsa/` | 0 / 60 |
| 7.3 | Recursion | `module-7-pre-dsa/` | 0 / 55 |
| 7.4 | Arrays Logic | `module-7-pre-dsa/` | 0 / 50 |

_Update the "Done" column after each section._
