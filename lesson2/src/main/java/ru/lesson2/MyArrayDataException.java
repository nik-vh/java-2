package ru.lesson2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int x, int y) {
        super("Неверный тип элемента массива " + "["+ x + "]" +"[" + y + "]");
    }
}