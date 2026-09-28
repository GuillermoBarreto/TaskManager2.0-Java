# Task Manager in Java

Simple tool used in console to manage the everyday tasks.

## Features

- Add tasks (blank descriptions are rejected)
- List tasks with their completion status
- Mark tasks as completed
- Delete tasks
- Menu input validation: non-numeric choices are rejected without crashing

## Requirements

- Java 14 or later (uses switch expressions)

## How to run

```bash
javac src/*.java
java -cp src Main
```

## Usage

Pick an option from the menu (1-5) and follow the prompts. Tasks are shown
with their index, for example:

```
0. [ ] Comprar leche
1. [✓] Enviar reporte
```

Choose option 5 to exit.
