# Java Logic Building

My practice solutions for the **Master Java Logic Building Sheet** (7 modules, Operators -> Pre-DSA).

> The sheet contains questions only. Everything in this repo is my own work.
> The sheet's PDF and question text are **not** included; files refer to
> questions by number (Q1, Q2...).

## How I practice

1. Read the concept, then **predict / solve on paper first**.
2. Write the code, run it, compare.
3. Every wrong answer goes into [mistakes-log.md](mistakes-log.md) with one line on *why*.
4. Commit after each section (or day), with a meaningful message.

## Structure

```
java-logic-building/
├── README.md
├── mistakes-log.md
├── .gitignore
├── module-1-operators/        <- output-prediction (uses Check.java)
├── module-2-conditionals/
│   └── 2.1-simple-if/ ...     <- one file per problem, e.g. Q05_EvenOdd.java
├── module-3-loops/
├── module-4-functions/
├── module-5-arrays/
├── module-6-strings/
└── module-7-pre-dsa/
```

## Run (Module 1)

```bash
cd module-1-operators
javac *.java
java ArithmeticOutput
```

For other modules: `javac Q05_EvenOdd.java && java Q05_EvenOdd`

## Commit message style

```
Add Section 1.1 arithmetic output (30/30, 4 wrong)
Add Q05-Q12 simple if programs
Fix Q17 - integer division trap
```

## Progress

### Module 1 — Operators & Output

- [ ] **1.1** Arithmetic Operator Output - 30 Qs - `module-1-operators/ArithmeticOutput.java`
- [ ] **1.2** Logical Operator Output - 25 Qs - `module-1-operators/LogicalOutput.java`
- [ ] **1.3** Relational Operator Output - 22 Qs - `module-1-operators/RelationalOutput.java`
- [ ] **1.4** Increment & Decrement Output - 42 Qs - `module-1-operators/IncrementDecrementOutput.java`

### Module 2 — Conditional Logic

- [ ] **2.1** Simple If Statement - 25 Qs - `module-2-conditionals/2.1-simple-if/`
- [ ] **2.2** If-Else Statement - 42 Qs - `module-2-conditionals/2.2-if-else/`
- [ ] **2.3** If-Else-If Ladder - 48 Qs - `module-2-conditionals/2.3-if-else-if-ladder/`
- [ ] **2.4** Ternary Operator - 38 Qs - `module-2-conditionals/2.4-ternary/`
- [ ] **2.5** Switch-Case - 35 Qs - `module-2-conditionals/2.5-switch-case/`

### Module 3 — Loops

- [ ] **3.1** While Loop - 48 Qs - `module-3-loops/3.1-while-loop/`
- [ ] **3.2** Do-While Loop - 25 Qs - `module-3-loops/3.2-do-while-loop/`
- [ ] **3.3** For Loop - 50 Qs - `module-3-loops/3.3-for-loop/`
- [ ] **3.4** Break and Continue - 30 Qs - `module-3-loops/3.4-break-continue/`
- [ ] **3.5** Pattern Printing (Nested Loops) - 50 Qs - `module-3-loops/3.5-pattern-printing/`

### Module 4 — Functions and Methods

- [ ] **4.1** Basic Functions - 43 Qs - `module-4-functions/4.1-basic-functions/`
- [ ] **4.2** Function Overloading - 25 Qs - `module-4-functions/4.2-function-overloading/`

### Module 5 — Arrays

- [ ] **5.1** 1D Array Basics - 40 Qs - `module-5-arrays/5.1-1d-array-basics/`
- [ ] **5.2** 1D Array Operations - 45 Qs - `module-5-arrays/5.2-1d-array-operations/`
- [ ] **5.3** 2D Arrays (sheet mein 2 versions hain, 35 + 35) - 35 Qs - `module-5-arrays/5.3-2d-arrays/`

### Module 6 — Strings

- [ ] **6.1** String Basics - 40 Qs - `module-6-strings/6.1-string-basics/`
- [ ] **6.2** String Manipulation - 38 Qs - `module-6-strings/6.2-string-manipulation/`
- [ ] **6.3** Word-Level String Operations - 35 Qs - `module-6-strings/6.3-word-level-operations/`

### Module 7 — Pre-DSA Logic Building

- [ ] **7.1** Conditional Thinking - 60 Qs - `module-7-pre-dsa/7.1-conditional-thinking/`
- [ ] **7.2** Looping Logic - 60 Qs - `module-7-pre-dsa/7.2-looping-logic/`
- [ ] **7.3** Recursion - 55 Qs - `module-7-pre-dsa/7.3-recursion/`
- [ ] **7.4** Arrays Logic Building - 50 Qs - `module-7-pre-dsa/7.4-arrays-logic/`

_Total listed in sheet: 1036 (includes both versions of Section 5.3)._
