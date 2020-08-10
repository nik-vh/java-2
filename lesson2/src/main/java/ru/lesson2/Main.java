package ru.lesson2;

public class Main {
    public static void main(String... args) {
        //Верный массив
        String[][] testArray1 = {{"1","2","4","4"},{"1","4","3","4"}, {"1","2","3","4"},{"1","4","3","4"}};
        //Символы в [2][2]
        String[][] testArray2 = {{"1","2","4","4"},{"1","4","3","4"}, {"1","2","rrr","4"},{"1","4","3","4"}};
        //Не верны размер
        String[][] testArray3 = {{"1","2","4","4"},{"1","4","3","4","5","6"}, {"1","2","3","4"},{"1","4","3","4"}};

        ArraySum sum = new ArraySum();

        try {
            System.out.println("Сумма элементов массива = " + sum.convertArray(testArray1));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Сумма элементов массива = " + sum.convertArray(testArray2));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Сумма элементов массива = " + sum.convertArray(testArray3));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println("Программа продолжила работать");
    }
}
