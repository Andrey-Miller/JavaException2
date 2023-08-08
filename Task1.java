// Реализуйте метод, который запрашивает у пользователя ввод 
// дробного числа(типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению 
// приложения, вместо этого необходимо повторно запросить у 
// пользователя ввод данных.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
		float number = 0;

		while (true) {
			try {
				System.out.print("Введите дробное число: ");
				number = Float.parseFloat(scanner.nextLine());
                break;
				
			} catch (NumberFormatException e) {
				System.out.println("Введено неверное значение, попробуйте еще раз.");
			}
        }
        scanner.close();
        System.out.println(number);
    }
}