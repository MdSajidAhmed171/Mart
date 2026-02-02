package com.mart.util;

public class IdGenerator {

    private static long counter = 0;

    private IdGenerator() {
        // prevent object creation
    }

    public static long generateId() {
        return ++counter;
    }
}
