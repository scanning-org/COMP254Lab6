package com.exercise1.bruno.morgado;
import maps.ProbeHashMap;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;

public class Exercise1 {

    // Setup for random strings
    private static final int length = 10;
    private static final boolean useLetters = true;
    private static final boolean useNumbers = false;
    // limit of entries in the Hashmap
    private static final int MAX_ENTRIES = 10000;
    private static int numEntries = 0;
    // instantiate Random generator
    private static Random random = new Random();

    public static void main(String[] args) {

        int REPETITIONS = 500;
        // Instantiate ProbeHashMap and set load factor to 0.5
        ProbeHashMap<Integer, String> firstMap = new ProbeHashMap<>(0.5);
        long[] times = new long[REPETITIONS];
        long totalTime = 0;
        for(int i = 0; i < REPETITIONS; i++){
            long time = test(firstMap);
            times[i] = time;
            totalTime += time;
        }
        long averageTime = totalTime / REPETITIONS;
        System.out.println("Average Elapsed time in milliseconds (First Map): " + averageTime + " ms");
        //Print map's size
        System.out.println("Number of entries in first map: " + firstMap.size());
        System.out.println("Load Factor (First Map): " + firstMap.loadFactor);

        // Instantiate ProbeHashMap and set load factor to 0.75
        ProbeHashMap<Integer, String> secondMap = new ProbeHashMap<>(0.75);
        long[] times2 = new long[REPETITIONS];
        long totalTime2 = 0;
        for(int i = 0; i < REPETITIONS; i++){
            long time = test(secondMap);
            times2[i] = time;
            totalTime2 += time;
        }
        long averageTime2 = totalTime2 / REPETITIONS;
        System.out.println("\nAverage Elapsed time in milliseconds (Second Map): " + averageTime2 + " ms");
        //Print map's size
        System.out.println("Number of entries in second map: " + secondMap.size());
        System.out.println("Load Factor (Second Map): " + secondMap.loadFactor);

        // Instantiate ProbeHashMap and set load factor to 0.90
        ProbeHashMap<Integer, String> thirdMap = new ProbeHashMap<>(0.9);
        long[] times3 = new long[REPETITIONS];
        long totalTime3 = 0;
        for(int i = 0; i < REPETITIONS; i++){
            long time = test(thirdMap);
            times3[i] = time;
            totalTime3 += time;
        }
        long averageTime3 = totalTime3 / REPETITIONS;
        System.out.println("\nAverage Elapsed time in milliseconds (Second Map): " + averageTime3 + " ms");
        //Print map's size
        System.out.println("Number of entries in third map: " + thirdMap.size());
        System.out.println("Load Factor (Third Map): " + thirdMap.loadFactor);

//        //Print map
//        for (Entry<Integer, String> entry : firstMap.entrySet()) {
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println("key: " + key + " value: " + value);
//        }

    }
    public static long test(ProbeHashMap<Integer, String> map) {
        long start1 = System.currentTimeMillis();
        while(numEntries < MAX_ENTRIES) {
            int key = random.nextInt();
            String value = RandomStringUtils.random(length, useLetters, useNumbers);
            map.put(key, value);
            numEntries += 1;
        }
        numEntries = 0;
        long end1 = System.currentTimeMillis();
        return end1 - start1;
    }
}
