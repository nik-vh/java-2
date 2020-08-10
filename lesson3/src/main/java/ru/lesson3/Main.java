package ru.lesson3;

public class Main {
    public static void main(String... args) {
        String[] testArray = {"Альфа", "Бета", "Альфа", "Этa", "Гамма", "Эпсилон", "Омега", "Гамма", "Эпсилон"};
        CheckArray.printUniqueWorld(testArray);
        CheckArray.printRepeatWorld(testArray);

        PhoneBook phBook = new PhoneBook();
        phBook.add("Иван", "222333");
        phBook.add("Иван", "555555");
        phBook.add("Иван", "666666");
        phBook.add("Николай", "999999");
        phBook.add("Андрей", "222333");
        phBook.add("Андрей", "222333");
        phBook.add("Ашот", "111111");
        phBook.add("Александр", "222111");
        phBook.add("Петр", "444444");
        phBook.add("Денис", "222222");
        phBook.add("Денис", "222222");
        phBook.add("Денис", "777777");

        phBook.get("Денис");
        phBook.get("Иван");
        System.out.println(phBook.toString());
    }
}
