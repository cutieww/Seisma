# Seisma
This is the java code for the coding execise: Employee monthly pay slip
- The code contains a contructor with all the possible inputs.
- The code contains multiple get functions for the final output: getFullName, getPayPeriod, getIncomeTax, getNetIncome, getSuper
- The code contians a main class for performing 3 different tests

## In my code, I assume:
- All the inputs are valid (for other case, not valid, then we can simply throw exceptions)
- The input type: 
    - first name, last name and starting date are String
    - annual salary is a normal Integer (we assume the salary wouldn't be too large for a bigInt)
    - super rate is a float type
- Each test are performed sequentially, there is no mutithreading involved.
