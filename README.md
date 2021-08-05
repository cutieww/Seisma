# Seisma
This is the java code for the coding execise: Employee monthly pay slip
- The code contains a contructor with all the possible inputs.
- The code contains multiple get functions for the final output: getFullName, getPayPeriod, getIncomeTax, getNetIncome, getSuper
- The code contians a main class for performing 3 different tests

## In my code, I assume:
- All the inputs are valid (If they are invalid, then we can simply throw exceptions)
- The input type: 
    - first name, last name and starting date are String
    - annual salary is a normal Integer (we assume the salary wouldn't be too large for a bigInt)
    - super rate is a float type
- Each test is performed sequentially, there is no mutithreading involved.

## How to run the code:
It's just a simple piece of java code. 
You could just run it on your terminal: 
- go to the path that you downloaded the code
- Type 'javac Seisma.java' and press enter to compile the code. 
- Type ' java Seisma ' to run the program
- There are three test cases in the main function of the code already. You could try more.
