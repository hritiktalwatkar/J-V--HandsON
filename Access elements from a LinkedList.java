import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements to add to the LinkedList (type 'done' to finish):");
        String input;
        while (!(input = scanner.nextLine()).equals("done")) {
            languages.add(input);
        }
        System.out.println("Enter the index to retrieve the element:");
        int index = scanner.nextInt();
        scanner.close();
        System.out.println("LinkedList: " + languages);
        if (index >= 0 && index < languages.size()) {
            String str = languages.get(index);
            System.out.println("Element at index " + index + ": " + str);
        } else {
            System.out.println("Invalid index!");
        }
    }
}
