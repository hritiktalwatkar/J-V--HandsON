import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a character: ");

        char ch = reader.next().charAt(0);

        
        if(ch == 'a' || ch=='A' || ch == 'e' || ch == 'E' || ch == 'i' ||ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}
