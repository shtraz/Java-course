import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

//* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in, "cp866");
        boolean mainCycle = true;
        
        while (mainCycle) {
            System.out.println();
            System.out.print("Enter command:\n\t1 - Show all contacts\n\t2 - Add contact\n\t0 - Exit: ");
            String decisision = sc.nextLine();
            
            switch (decisision) {
                case "1":
                    showPhoneBook(phoneBook);
                    if (phoneBook.size() == 0){
                        System.out.print("Contacts not found! Please, Add contacts");
                    } 
                    break;
                    
                case "2":
                    addContact(phoneBook, sc);
                    break;
                    
                case "0":
                    mainCycle = false;
                    System.out.println("Exit");
                    break;
                    
                default:
                System.out.println("Command not found!");
            }
        }
        sc.close();
    }
    
    public static void addContact(Map<String, ArrayList<String>> map, Scanner scanner) {
        int index = 1;
        Object[] names = map.keySet().toArray();
        System.out.println();
        System.out.println("Select a contact to add a number:");
        
        for (Object el: names) {
            System.out.println("\t" + index + ". " + el);
            index++;
        }
        
        System.out.print("\t0. Add new contact\n Select: ");
        int decision = scanner.nextInt();
        scanner.nextLine();
        
        if (decision <= names.length && decision > 0) {
            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();
            map.get(names[decision - 1]).add(phoneNumber);
        }
        
        else if (decision == 0) {
            System.out.print("Enter the name of the new contact: ");
            String name = scanner.nextLine();
            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            map.put(name, numbers);
        }
        
        else System.out.println("Command not found!");
    }
    
    public static void showPhoneBook(Map<String, ArrayList<String>> map) {
        System.out.println();
        
        for (var el: map.entrySet()) {
            System.out.println(el.getKey() + ":");
            for (String inner: el.getValue()) System.out.println("\t" + inner);
            System.out.println();
        }
    }
}
