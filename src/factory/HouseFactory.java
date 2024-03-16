package factory;

import modal.Home;
import modal.House;
import modal.SummerHouse;
import modal.Villa;
import utils.HouseRandomizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HouseFactory {
    private static volatile HouseFactory instance;
    private static final Random random = new Random();

    private HouseFactory() {
    }

    // Double check singleton, thread safe
    public static HouseFactory getInstance() {
        if (instance == null) {
            synchronized (HouseFactory.class) {
                if (instance == null) {
                    instance = new HouseFactory();
                }
            }
        }
        return instance;
    }

    public List<House> createHouses(int numberOfHouses) {
        List<House> houses = new ArrayList<>();
        for (int i = 0; i < numberOfHouses; i++) {
            houses.add(createRandomHouse());
        }
        return houses;
    }

    private House createRandomHouse() {
        int type = random.nextInt(3);
        return switch (type) {
            case 0 -> createRandomHome();
            case 1 -> createRandomVilla();
            case 2 -> createRandomSummerHouse();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }

    private House createRandomHome() {
        return new Home(HouseRandomizer.randomPrice(), HouseRandomizer.randomFloorArea(),HouseRandomizer.randomNumberOfRooms(),HouseRandomizer.randomNumberOfHalls());
    }

    private House createRandomVilla() {
        return new Villa(HouseRandomizer.randomPrice(), HouseRandomizer.randomFloorArea(),HouseRandomizer.randomNumberOfRooms(),HouseRandomizer.randomNumberOfHalls());
    }

    private House createRandomSummerHouse() {
        return new SummerHouse(HouseRandomizer.randomPrice(), HouseRandomizer.randomFloorArea(),HouseRandomizer.randomNumberOfRooms(),HouseRandomizer.randomNumberOfHalls());
    }

}
