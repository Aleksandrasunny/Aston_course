public class Lesson3 {
    // Задание 1
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    // задание 2
    public static void checkSumSign() {
        int a = 5, b = -3;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        }
        else System.out.println("Сумма отрицательная");
    }

    // Задание 3
    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    // Задание 4
    public static void compareNumbers() {
        int a = 10, b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    // Задание 5
    public static boolean task_5(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // Задание 6
    public static void task_6(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }
    // Задание 7
    public static boolean task_7(int number) {
        return number < 0;
    }

    // Задание 8
    public static void task_8(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // Задание 9
    public static boolean task_9(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }

    // задание 14
    public static int[] task_14(int len, int initialValue) {
        int[] A = new int[len];
        for (int i = 0; i < len; i++) {
            A[i] = initialValue;
        }
        return A;
    }

    // Вывод массива
    public static void print(int[] A) {
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        printThreeWords();

        System.out.println("Задание 2");
        checkSumSign();

        System.out.println("Задание 3");
        printColor();

        System.out.println("Задание 4");
        compareNumbers();

        System.out.println("Задание 5");
        System.out.println(task_5(5, 7));
        System.out.println(task_5(5, 20));

        System.out.println("Задание 6");
        task_6(-5);
        task_6(0);

        System.out.println("Задание 7");
        System.out.println(task_7(-3));
        System.out.println(task_7(0));

        System.out.println("Задание 8");
        task_8("Hello", 3);

        System.out.println("Задание 9");
        System.out.println(task_9(2020));
        System.out.println(task_9(1900));

        // Задание 10
        int[] A10 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Исходный массив для задания 10: ");
        print(A10);
        for (int i = 0; i < A10.length; i++) {
            if (A10[i] == 0) A10[i] = 1;
            else A10[i] = 0;
        }
        System.out.print("Преобразованный массив: ");
        print(A10);

        // Задание 11
        int[] A11 = new int[100];
        for (int i = 0; i < 100; i++) {
            A11[i] = i + 1;
        }
        System.out.print("Массив для задания 11: ");
        print(A11);

        // Задание 12
        System.out.print("Исходный массив для задания 12: ");
        int[] A12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        print(A12);
        for (int i = 0; i < A12.length; i++) {
            if (A12[i] < 6) {
                A12[i] *= 2;
            }
        }
        System.out.print("Преобразованный массив: ");
        print(A12);

        // Задание 13
        int n = 5;
        int[][] M13 = new int[n][n];
        for (int i = 0; i < n; i++) {
            M13[i][i] = 1;
            M13[i][n - 1 - i] = 1;
        }
        System.out.println("Матрица для задания 13: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(M13[i][j] + " ");
            }
            System.out.println();
        }

        // Задание 14
        System.out.print("Массив для задания 14: ");
        int[] A14 = task_14(5, 10);
        print(A14);
    }
}