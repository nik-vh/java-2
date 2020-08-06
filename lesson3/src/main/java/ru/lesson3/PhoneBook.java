package ru.lesson3;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<String, HashSet<String>>();
    }

    public void add(String name, String number) {
        HashSet<String> phone = phoneBook.getOrDefault(name, new HashSet<>());
        phone.add(number);
        phoneBook.put(name, phone);
    }

    public void get(String name) {
        System.out.println("Имя: " + name + " Номер телефона - " + phoneBook.get(name));
    }

    @Override
    public String toString() {
        return "Телефонный стравочник " + phoneBook;
    }
}
