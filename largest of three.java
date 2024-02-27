import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a Double Number 1:");
        double n1= reader.nextDouble();
        System.out.print("Enter a Double Number 1:");
        double n2= reader.nextDouble();
        System.out.print("Enter a Double Number 1:");
        double n3= reader.nextDouble();
        

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}
