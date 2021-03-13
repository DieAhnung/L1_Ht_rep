import java.util.Scanner;

public class FirstHomeWork {

    public static void main(String[] args) {
      /*
+ 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
+ 2. Создать переменные всех пройденных типов данных и инициализировать их значения.*/

        byte byteValue = -127; //  от -128 до 127, 8 бит, целое число
        short shortValue = 1258; //от -32768 до 32767, 16 бит, целое число
        int intValue = 10000; // от -2147483648 до 2147483647, 32 бита, целое число
        long longValue = 500000L; // от -9223372036854775808 до 9223372036854775807, 64 бита, целое число
        float floatValue = 2.85f; // от -3,4 х 10 ^ 38 до 3,4 х 10 ^ 38, 32 бита, число с плавающей запятой
        double doubleValue = 125.1254; // от +-5,0 х 10 ^ -324 до +- 1.7 x 10 ^ 308, 64 бита, число с плавающей запятой
        char charValue = 'q'; // 16 бит, один символ
        boolean boolValue = false; // или true, логический тип данных

        calculateSum(1.5f, 5.8f, 7.5f, 7.8f);
        isSumInTheRange(); // выполнен с классом Scanner
        isNumberPositiveOrNegative(); // выполнен с классом Scanner
        isNumberPositiveOrNegativeBoolean();  // выполнен с классом Scanner
        gteetingsName(); // выполнен с классом Scanner
    }

    public static float calculateSum(float a, float b, float c, float d) {
       /*//+ 3. Написать метод вычисляющий выражение a * (b + (c / d))
       и возвращающий результат, где a, b, c, d – аргументы этого метода, имеющие тип float.*/

        float sum = a * (b + (c / d));
        System.out.println(sum);

        return sum;

    }


    public static int isSumInTheRange() {
/* + 4. Написать метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно),
если да – вернуть true, в противном случае – false.
      */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();

        int amount = firstNumber + secondNumber;


        if (10 >= amount && amount <= 20) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }
        return amount;
    }

    public static int isNumberPositiveOrNegative() {

        /*+ 5. Написать метод, которому в качестве параметра передается целое число,
        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        Замечание: ноль считаем положительным числом. */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число ");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        return number;
    }

    public static int isNumberPositiveOrNegativeBoolean() {
        /*+ 6. Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число ");
        int newNumber = scanner.nextInt();

        if (newNumber >= 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        return newNumber;
    }

    public static String gteetingsName() {
        /*+ 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя ");
        String name = scanner.nextLine();

        System.out.println("Привет, " + name);
        return name;
    }

}
/*
+ 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
+ 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
+ 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – аргументы этого метода, имеющие тип float.
+ 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
+ 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
+ 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
+ 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

 */
