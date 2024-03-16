package service;

import modal.Home;
import modal.House;
import modal.SummerHouse;
import modal.Villa;

import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    //Singleton HouseService
    private static volatile HouseService instance;
    private HouseService() {
    }

    // Double check singleton
    public static HouseService getInstance() {
        if (instance == null) {
            synchronized (HouseService.class) {
                if (instance == null) {
                    instance = new HouseService();
                }
            }
        }
        return instance;
    }
    public Long calculateHousesTotalPrice(List<House> houses) {
        return houses.stream()
                .mapToLong(House::getPrice) //
                .sum();
    }

    public Long calculateVillasTotalPrice(List<Villa> villas) {
        return villas.stream()
                .mapToLong(House::getPrice)
                .sum();
    }

    public Long calculateHomesTotalPrice(List<Home> homes) {
        return homes.stream()
                .mapToLong(House::getPrice)
                .sum();
    }

    public Long calculateSummerHousesTotalPrice(List<SummerHouse> summerHouses) {
        return summerHouses.stream()
                .mapToLong(House::getPrice)
                .sum();
    }

    public Double calculateHomesAverageFloorArea(List<Home> homes) {
        return homes.stream()
                .mapToLong(Home::getFloorArea)
                .average().orElse(0.0);
    }

    public Double calculateHousesAverageFloorArea(List<House> houses) {
        return houses.stream()
                .mapToLong(House::getFloorArea)
                .average().orElse(0.0);
    }

    public Double calculateVillasAverageFloorArea(List<Villa> villas) {
        return villas.stream()
                .mapToLong(House::getFloorArea)
                .average().orElse(0.0);
    }

    public Double calculateSummerHousesAverageFloorArea(List<SummerHouse> summerHouses) {
        return summerHouses.stream()
                .mapToLong(House::getFloorArea)
                .average().orElse(0.0);
    }

    public List<House> filterHousesByRoomsAndHalls(List<House> houses,int numberOfRooms,int numberOfHalls) {
        return houses.stream()
                .filter(house -> house.getNumberOfRooms() == numberOfRooms && house.getNumberOfHalls() == numberOfHalls)
                .collect(Collectors.toList());

    }





}
