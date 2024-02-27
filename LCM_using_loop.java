import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int n1= scanner.nextInt();
        System.out.print("Enter a number 2: ");
        int n2= scanner.nextInt();
         int lcm;
         lcm = (n1 > n2) ? n1 : n2;
    
        // Always true
        while(true) {
          if( lcm % n1 == 0 && lcm % n2 == 0 ) {
            System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
            break;
          }
          ++lcm;
        }
    }
}


//////////////////////////////////
Calculate LCM using GCD


import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int n1= scanner.nextInt();
        System.out.print("Enter a number 2: ");
        int n2= scanner.nextInt();
        int gcd=1;
        for(int i = 1; i <= n1 && i <= n2; ++i) {
          // Checks if i is factor of both integers
          if(n1 % i == 0 && n2 % i == 0)
            gcd = i;
        }
    
        int lcm = (n1 * n2) / gcd;
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        }
    }

