package org.example;

import java.util.HashSet;
import java.util.Random;

/**
 * Singleton class responsible for creating and storing unique IDs.
 */
public class IDManager {
    private final HashSet<Integer> ids = new HashSet<>();

    private static final IDManager INSTANCE = new IDManager();

    private IDManager() {}

    public static IDManager getInstance() { return INSTANCE; }

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