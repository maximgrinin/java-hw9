public class ClassWork {
    public static void main(String[] args) {
        //вывести числа от 1000 до 10000, которые кончаются на 4
        //усложнение: вывести числа от 1000 до 10000, которые кончаются на 4 и на 9
        System.out.println();
        for (int i = 1000; i < 10000; i++) {
            if (i % 10 == 4 || i % 10 == 9) {
                System.out.printf("%d\n", i);
                i += 4;
            }
        }

        System.out.println();
        for (int i = 1004; i < 10000; i+=5) {
            System.out.printf("%d\n", i);
        }

        System.out.println();
        for (int i = 1000; i < 10000; i += 10) {
            System.out.printf("%d\n%d\n", i + 4, i + 9);
        }

    }
}
