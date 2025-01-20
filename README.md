# Calculator Application

This project is a simple Java-based calculator application that allows the user to perform basic arithmetic operations (addition, subtraction, multiplication, division), generate a Fibonacci sequence, and calculate the sum and average of an array.

## Files

1. **UserInput.java**  
2. **Calculator.java**  
3. **Main.java**

---

## UserInput.java

This class handles taking input from the user.

### Methods:
- **calcInput()**  
  - Description: Takes two integers as input from the user.  
  - Returns: An array of integers (`int[2]`).
  
- **fiboInput()**  
  - Description: Takes the number of terms for the Fibonacci sequence from the user.  
  - Returns: An integer (`int`) representing the number of terms.

- **arrInput(int size)**  
  - Description: Takes an array of integers from the user, where the size of the array is provided as an argument.  
  - Parameters: `size` (int) - The size of the array.  
  - Returns: An integer array (`int[]`).

---

## Calculator.java

This class implements several mathematical operations and utilities.

### Methods:
- **addition()**  
  - Description: Adds two integers input by the user.  
  - Returns: The sum of the two integers (`int`).

- **substraction()**  
  - Description: Subtracts the second integer from the first integer input by the user.  
  - Returns: The difference of the two integers (`int`).

- **multiplication()**  
  - Description: Multiplies two integers input by the user.  
  - Returns: The product of the two integers (`int`).

- **division()**  
  - Description: Divides the first integer by the second, handling division by zero.  
  - Returns: The quotient (`double`), or 0 if division by zero occurs.

- **fibonnaci()**  
  - Description: Generates and prints the Fibonacci sequence up to the number of terms input by the user.  
  - Returns: None.

- **sumAverageArr(int size)**  
  - Description: Takes an array of integers, calculates their sum and average, and prints the results.  
  - Parameters: `size` (int) - The size of the array.  
  - Returns: None.

---

## Main.java

This is the entry point of the application where the user can select various operations.

### Methods:
- **main(String[] args)**  
  - Description: Displays the menu and processes user input to call the relevant methods from the `Calculator` class.  
  - Options:  
    - 1) **Calculator**: Perform arithmetic operations (Addition, Subtraction, Multiplication, Division).  
    - 2) **Fibonacci**: Generate a Fibonacci sequence.  
    - 3) **Array (Sum and Average)**: Calculate the sum and average of an array of integers.  
    - 4) **Exit**: Exit the program.

---
## How to Compile the Program

### Requirements:
- **Java JDK** (Java Development Kit) version 8 or higher.

### Steps to Compile and Run:

1. **Install Java JDK**:  
   Ensure you have the Java JDK installed. You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) or use your package manager if you're on Linux/macOS.

2. **Save the Files**:
   - Save the `Main.java`, `Calculator.java`, and `UserInput.java` files in the same directory or project folder.

3. **Open a Terminal/Command Prompt**:
   - Navigate to the directory where you saved the Java files.

4. **Compile the Java Files**:
   - Run the following command to compile the Java files:
     ```
     javac *.java
     ```
     This command will compile all the `.java` files in the directory.

5. **Run the Program**:
   - After compiling, you can run the program with the following command:
     ```
     java Main
     ```
     This will start the program and display the main menu where you can select options to perform various operations.

---

### How to Use

1. **Start the program**: After running the program, a menu will be displayed with various options.

2. **Select an option**: Choose from the following options by entering the corresponding number:
   - `1` - **Calculator**: Perform arithmetic operations (Addition, Subtraction, Multiplication, Division).
   - `2` - **Fibonacci**: Generate a Fibonacci sequence.
   - `3` - **Array (Sum and Average)**: Calculate the sum and average of an array of integers.
   - `4` - **Exit**: Exit the program.

3. **Calculator operations**: If you select **1) Calculator**, you will be prompted to choose one of the following operations:
   - `a` - **Addition**: Add two numbers.
   - `b` - **Subtraction**: Subtract the second number from the first.
   - `c` - **Multiplication**: Multiply two numbers.
   - `d` - **Division**: Divide the first number by the second (note: division by zero is not allowed).
   - `e` - **Go Back**: Go back to the main menu.

4. **Perform operations**: Depending on your selection, the program will ask for further input:
   - If you choose the **Calculator** option, you'll be asked to select an operation (addition, subtraction, multiplication, or division) and provide two numbers.
   - If you choose the **Fibonacci** option, you'll be asked to input the number of terms for the Fibonacci sequence.
   - If you choose the **Array (Sum and Average)** option, you'll be asked to provide the size of the array and then input the array elements.

---

## Example Usage

### Running the Program:
1. **Start the Program**: When you run the program, the following main menu will appear:

    ```
    Select what to do
    1) Calculator
    2) Fibonacci
    3) Array (Sum and Average)
    4) Exit
    ```

2. **Select an Option**: Choose one of the options by entering the corresponding number:
    - `1` - Calculator (perform arithmetic operations)
    - `2` - Fibonacci (generate Fibonacci sequence)
    - `3` - Array (Sum and Average) (calculate sum and average of an array)
    - `4` - Exit (close the program)

---

### Example 1: **Calculator** (Addition)
- **Input**:
    ```
    Select what to do
    1) Calculator
    2) Fibonacci
    3) Array (Sum and Average)
    4) Exit
    ```
    Enter `1` to choose **Calculator**.

    ```
    Select what to do
    a) Addition
    b) Subtraction
    c) Multiplication
    d) Division
    e) Go Back
    ```
    Enter `a` to perform **Addition**.

    ```
    Enter first number: 
    5
    Enter second number: 
    3
    ```

- **Output**:
    ```
    Sum is: 8
    ```

---

### Example 2: **Fibonacci Sequence**
- **Input**:
    ```
    Select what to do
    1) Calculator
    2) Fibonacci
    3) Array (Sum and Average)
    4) Exit
    ```
    Enter `2` to choose **Fibonacci**.

    ```
    Enter the number of terms: 
    5
    ```

- **Output**:
    ```
    Fibonacci sequence: 0 1 1 2 3 
    ```

---

### Example 3: **Array Sum and Average**
- **Input**:
    ```
    Select what to do
    1) Calculator
    2) Fibonacci
    3) Array (Sum and Average)
    4) Exit
    ```
    Enter `3` to choose **Array (Sum and Average)**.

    ```
    Enter the number of elements in the array: 
    4
    Enter the numbers: 
    2 4 6 8
    ```

- **Output**:
    ```
    The Sum of Elements of Array's is: 20
    The Average of Elements in Array is: 5.0
    ```

---

### Example 4: **Exit**
- **Input**:
    ```
    Select what to do
    1) Calculator
    2) Fibonacci
    3) Array (Sum and Average)
    4) Exit
    ```
    Enter `4` to exit the program.

- **Output**:
    ```
    Exiting the code!
    ```

