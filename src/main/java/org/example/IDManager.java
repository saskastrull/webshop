package org.example;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Singleton class for handling object IDs.
 */
public class IDManager {
    private final Set<Integer> ids = new HashSet<>(); // HashSet to avoid duplicates

    // Eager creation
    private static final IDManager INSTANCE = new IDManager();

    private IDManager() {}

    public static IDManager getInstance() {
        return INSTANCE;
    }

    // Generate a unique ID
    public int generateID() {
        Random random = new Random();
        boolean availableID = false;
        int newID = 0;

        while (!availableID) {
            newID = random.nextInt(10000);
            if (!ids.contains(newID)) {
                availableID = true;
                ids.add(newID);
            }
        }
        return newID;
    }
}