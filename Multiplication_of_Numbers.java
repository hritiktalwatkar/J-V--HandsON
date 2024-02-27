import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        float first= reader.nextFloat();
        System.out.print("Enter a second number: ");
        float second= reader.nextFloat();

        float product = first * second;

        System.out.println("The product is: " + product);
    }
}


