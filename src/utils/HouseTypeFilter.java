package utils;

import modal.Home;
import modal.House;
import modal.SummerHouse;
import modal.Villa;

import java.util.List;

public class HouseTypeFilter {
    public static List<Home> getHomes(List<House> houses) {
        return houses.stream()
                .filter(house -> house instanceof Home)
                .map(home -> (Home) home)
                .toList();
    }

    public static List<Villa> getVillas(List<House> houses) {
        return houses.stream()
                .filter(house -> house instanceof Villa)
                .map(villa -> (Villa) villa)
                .toList();
    }

    public static List<SummerHouse> getSummerHouses(List<House> houses) {
        return houses.stream()
                .filter(house -> house instanceof SummerHouse)
                .map(summerHouse -> (SummerHouse) summerHouse)
                .toList();
    }
}
