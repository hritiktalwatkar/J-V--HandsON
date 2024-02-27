/////////////////////////

Find Factorial of a number using for loop

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= scanner.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
        }
}

/////////////////////////////

Find Factorial of a number using BigInteger

import java.util.Scanner;
import java.math.BigInteger;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= scanner.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}


/////////////////////////////////

Find Factorial of a number using while loop


import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= scanner.nextInt();
        long factorial = 1;
        int i=1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
