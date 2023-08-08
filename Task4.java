// Разработайте программу, которая выбросит Exception, когда 
// пользователь вводит пустую строку. Пользователю должно показаться 
// сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            stringInput();
        } catch (Exception e) {
            System.out.println("Введена пустая строка");
        }
    }

    public static void stringInput() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new Exception();
        } else {
            System.out.println("ОК");
        }
        scanner.close();
    }    
}
