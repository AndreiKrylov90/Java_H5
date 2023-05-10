import java.util.*;

public class program {
    public static void main(String[] args) {
        ex01();

    }

    static void ex01() {
        // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
        // человек может иметь несколько телефонов.

        PhoneBook phonebook = new PhoneBook();
        phonebook.add("Иванов", "978636345656");
        phonebook.add("Петров", "45634637");
        System.out.println(phonebook.getByLastName("Иванов"));
        phonebook.add("Сидоров", "78467");
        phonebook.add("Петров", "34635737");
        phonebook.add("Иванов", "47567563");
        System.out.println(phonebook.getAllBook());
        

    }

}