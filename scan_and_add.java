import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int first= reader.nextInt();
        System.out.print("Enter a second number: ");
        int second= reader.nextInt();
        int sum= first+second;
        System.out.println("sum of first and second is: " + sum);
        
    }
}


