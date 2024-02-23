import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= scanner.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; ++i) {
          System.out.print(firstTerm + ", ");
    
          // compute the next term
          int nextTerm = firstTerm + secondTerm;
          firstTerm = secondTerm;
          secondTerm = nextTerm;
        }
    }
}


//////////////////////////////////
using WHILE LOOP

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= scanner.nextInt();
        int firstTerm = 0, secondTerm = 1, i=1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        while (i <= n) {
          System.out.print(firstTerm + ", ");
    
          int nextTerm = firstTerm + secondTerm;
          firstTerm = secondTerm;
          secondTerm = nextTerm;
    
          i++;
        }
    }
}
