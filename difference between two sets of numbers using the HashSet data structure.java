import java.util.HashSet; // For HashSet, a data structure that stores unique elements
import java.util.Set; // For the Set interface, which represents a collection of unique elements

// Main class to demonstrate the difference between two sets
class DiffOfTwoSets {
    public static void main(String[] args) {

        // Creating the first set to store numbers
        Set<Integer> numbers = new HashSet<>(); // We create a set named 'numbers' to hold some integers
        numbers.add(1); // Adding 1 to the 'numbers' set
        numbers.add(2); // Adding 2 to the 'numbers' set
        numbers.add(3); // Adding 3 to the 'numbers' set
        numbers.add(4); // Adding 4 to the 'numbers' set
        System.out.println("Numbers: " + numbers); // Printing the contents of the 'numbers' set

        // Creating the second set to store prime numbers
        Set<Integer> primeNumbers = new HashSet<>(); // We make another set named 'primeNumbers' to hold prime numbers
        primeNumbers.add(2); // Adding 2 to the 'primeNumbers' set
        primeNumbers.add(3); // Adding 3 to the 'primeNumbers' set
        System.out.println("Prime Numbers: " + primeNumbers); // Printing the contents of the 'primeNumbers' set

        // Finding the difference between the two sets
        numbers.removeAll(primeNumbers); // We find the difference between 'numbers' and 'primeNumbers', removing prime numbers from 'numbers'
        System.out.println("Numbers without prime numbers: " + numbers); // Printing the remaining numbers in 'numbers' after removing primes
    }
}  
