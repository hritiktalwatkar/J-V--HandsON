

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number < 0.0)
            System.out.println(number + " is a negative number.");

        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");

        else
            System.out.println(number + " is 0.");
        }
}





