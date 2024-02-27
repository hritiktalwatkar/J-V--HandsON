import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int n1= scanner.nextInt();
        System.out.print("Enter a number 2: ");
        int n2= scanner.nextInt();
        int gcd=1;
        for (int i = 1; i <= n1 && i <= n2; ++i) {

          // check if i perfectly divides both n1 and n2
          if (n1 % i == 0 && n2 % i == 0)
            gcd = i;
        }
    
        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
    }
}


///////////////////////////////////////////
Find GCD of two numbers using while loop and if else statement

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int n1= scanner.nextInt();
        System.out.print("Enter a number 2: ");
        int n2= scanner.nextInt();
        while(n1 != n2) {
    
      if(n1 > n2) {
        n1 -= n2;
      }
      
      else {
        n2 -= n1;
      }
    }

    System.out.println("GCD: " + n1);
    }
}

//////////////////////////////////////////
GCD for both positive and negative numbers


import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int n1= scanner.nextInt();
        System.out.print("Enter a number 2: ");
        int n2= scanner.nextInt();
        n1 = ( n1 > 0) ? n1 : -n1;
        n2 = ( n2 > 0) ? n2 : -n2;
    
        while(n1 != n2) {
            
          if(n1 > n2) {
            n1 -= n2;
          }
          
          else {
            n2 -= n1;
          }
        }
        
        System.out.println("GCD: " + n1);
        }
}
