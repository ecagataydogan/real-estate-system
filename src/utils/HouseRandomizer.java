package utils;

import java.util.Random;

public class HouseRandomizer {

    private static final Random random = new Random();

    public static long randomPrice() {
        long rangeStart = 1_000_000L;
        long rangeEnd = 3_000_000L;
        return rangeStart + ((long) (random.nextDouble() * (rangeEnd - rangeStart)));
    }

    public static long randomFloorArea() {
        return 50 + random.nextInt(450);
    }

    public static int randomNumberOfRooms() {
        return 1 + random.nextInt(5);
    }

    public static int randomNumberOfHalls() {
        return 1 + random.nextInt(3);
    }
}

