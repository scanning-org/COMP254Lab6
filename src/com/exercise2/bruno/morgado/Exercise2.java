package com.exercise2.bruno.morgado;

import maps.SortedTableMap;

public class Exercise2 {
    public static void main(String[] args) {

        SortedTableMap tableMap = new SortedTableMap();

        tableMap.put("Bruno", null);
        tableMap.put("Leonardo", 80);
        tableMap.put("Sissa", 84);


        System.out.println("Contains Bruno? \t" + tableMap.containKey("Bruno"));
        System.out.println("Contains Lucas? \t" + tableMap.containKey("Lucas"));
        System.out.println("Contains Carolina? \t" + tableMap.containKey("Carolina"));
        System.out.println("Contains Leonardo? \t" + tableMap.containKey("Leonardo"));
        System.out.println("Contains Zekhun? \t" + tableMap.containKey("Zekhun"));
        System.out.println("Contains Sissa? \t" + tableMap.containKey("Sissa"));

    }
}