import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Level 1:
        // Дано целое число, не меньшее 2. Выведите его НАИБОЛЬШИЙ делитель, отличный от 1.
        // (число, на которое введенное число делится без остатка).
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число, но не меньше, чем 2: ");
        int inputValue = scanner.nextInt();
        while (inputValue < 2) {
            System.out.printf("Нужно ввести целое число, не меньше 2, а вы ввели: %d\n", inputValue);
            System.out.print("Введите целое число, но не меньше, чем 2: ");
            inputValue = scanner.nextInt();
        }

        boolean isFound = false;
        for (int i = inputValue - 1; i > 1; i--) {
            if (inputValue % i == 0) {
                System.out.printf("Наибольший делитель введенного числа: %d\n", i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Похоже, что число делится только на само себя и единицу!");
        }

        // Level 2:
        // Вклад в банке составляет x рублей. Ежегодно он увеличивается на p процентов, после чего дробная часть копеек
        // отбрасывается. Каждый год сумма вклада становится больше. Определите, сколько будет на счету через k лет.
        // До начала программирования решите эту задачу на бумаге - возьмите p=10, k=2, x = 1000
        System.out.println();
        System.out.print("Введите сумму вклада: ");
        double depositAmount = scanner.nextDouble();
        System.out.print("Введите срок вклада: ");
        int depositTerm = scanner.nextInt();
        System.out.print("Введите процентную ставку вклада: ");
        double depositInterestRate = scanner.nextDouble();

        double depositInterest = 0.0;
        for (int i = 0; i < depositTerm; i++) {
            depositInterest = depositAmount * depositInterestRate / 100;
            depositAmount = (int) (depositAmount + depositInterest);
        }

        System.out.printf("Через %d лет вы получите %,.2f\n", depositTerm, depositAmount);

    }
}
