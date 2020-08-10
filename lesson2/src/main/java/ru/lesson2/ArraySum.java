package ru.lesson2;

public class ArraySum {
    public int convertArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if(array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        }
        for(int i = array.length - 1; i >= 0; i--) {
            if(array[i].length != 4) {
                throw new MyArraySizeException("Неверный размер массива");
            }
        }
        int summa = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    summa += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return summa;
    }

}
