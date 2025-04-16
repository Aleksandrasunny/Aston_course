public class Main {
    public static void main(String[] args) {
        // Правильный массив
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Массив с ошибкой в данных
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11a", "12"},
                {"13", "14", "15", "16"}
        };

        // Массив неправильного размера
        String[][] wrongSizeArray = {
                {"1", "2", "3"},
                {"5", "6", "7"},
                {"9", "10", "11"}
        };

        // Тестируем правильный массив
        try {
            System.out.println("Сумма правильного массива: " + ArrayCalc.sumStringArray(correctArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Тестируем массив с ошибкой в данных
        try {
            System.out.println("Сумма массива с ошибкой данных: " + ArrayCalc.sumStringArray(invalidDataArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Тестируем массив неправильного размера
        try {
            System.out.println("Сумма массива неправильного размера: " + ArrayCalc.sumStringArray(wrongSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        ArrayCalc.generateArrayIndexOutOfBoundsException();
    }
}