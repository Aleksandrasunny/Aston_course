public class ArrayCalc {
    public static int sumStringArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4. Получено строк: " + array.length);
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Массив должен быть размером 4x4. Найдена строка с длиной: " + row.length);
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            String.format("Неверные данные в ячейке [%d][%d]: '%s'", i, j, array[i][j])
                    );
                }
            }
        }

        return sum;
    }

    public static void generateArrayIndexOutOfBoundsException() {
        try {
            int[] arr = new int[5];
            int value = arr[19];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}