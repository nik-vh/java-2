package lesson5;

import java.util.Arrays;
import static java.lang.Math.cos;

public class ChangArray {
    private final int size = 10000000;
    private final int h = size / 2;

    public void method1() {
        System.out.println("Run method #1");
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i/5) * cos(0.2f + i/5) * cos(0.4f + i/2));
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Stop method #1. Run time - " + (stopTime - startTime) + " ms");
        System.out.println("===============================");
    }

    public void method2() {
        System.out.println("Run method #2");
        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        Arrays.fill(arr, 1.0f);
        long startTime = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long splitTime = System.currentTimeMillis();
        System.out.println("Split array time - " + (splitTime - startTime) + " ms");

        Thread thread1 = new Thread(() ->this.arrayCounting(arr1, 1));
        Thread thread2 = new Thread(() ->this.arrayCounting(arr2, 2));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.getStackTrace();
        }


        long spliceTime = System.currentTimeMillis();
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long stopTime = System.currentTimeMillis();
        System.out.println("Slice time - " + (stopTime - spliceTime) + " ms");
        System.out.println("Stop method #1. Run time - " + (stopTime - startTime) + " ms");
        System.out.println("===============================");
    }

    private void arrayCounting(float[] arr, int number) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Thread #" + number + " run time - " + (stopTime - startTime) + "ms");
    }
}
