package ru.lesson3;

import java.util.*;

public class CheckArray {
    public static void printUniqueWorld(String... array) {
        Set<String> uniqueSet = new TreeSet<String>(new HashSet<String>(Arrays.asList(array)));
        System.out.println("Уникальные элементы массива - " + uniqueSet);
    }

    public static void printRepeatWorld(String... array) {
        //List<String> arrayList = new ArrayList<String>(Arrays.asList(array));
        List<String> arrayList = Arrays.asList(array);
        Set<String> uniqueSet = new HashSet<String>(Arrays.asList(array));
        HashMap<String, Integer> repeatMap = new HashMap<String, Integer>();
        for (String key : uniqueSet) {
            repeatMap.put(key, Collections.frequency(arrayList, key));
        }
        System.out.println("Количество повторений - " + new TreeMap<String, Integer>(repeatMap));
    }
}
