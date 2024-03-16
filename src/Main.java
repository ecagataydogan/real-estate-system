import modal.Home;
import modal.House;
import modal.SummerHouse;
import modal.Villa;
import factory.HouseFactory;
import service.HouseService;
import utils.HouseTypeFilter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Singleton service
        HouseService houseService = HouseService.getInstance();
        //Singleton factory
        HouseFactory houseFactory = HouseFactory.getInstance();
        //Creates random houses (Home,Villa,SummerHouse) takes as a parameter how many houses wants to create.
        List<House> houses =  houseFactory.createHouses(50);
        //Takes a list of houses as parameters and returns objects of type Home.
        List<Home> homes = HouseTypeFilter.getHomes(houses);
        //Takes a list of houses as parameters and returns objects of type Villa.
        List<Villa> villas = HouseTypeFilter.getVillas(houses);
        //Takes a list of houses as parameters and returns objects of type SummerHouse.
        List<SummerHouse> summerHouses = HouseTypeFilter.getSummerHouses(houses);

        //Prints how many of the object type have been created
        System.out.println("Created\n" + homes.size()+ " " + "Home objects\n"
                + villas.size() + " " +  "Villa objects \n"
                + summerHouses.size() + " " + "SummerHouse objects");
        System.out.println("*".repeat(50));
        System.out.println(" ");

        //Prints the contents of objects
        System.out.println("Concents of houses: ");
        System.out.println(houses);
        System.out.println("Contents of homes: ");
        System.out.println(homes);
        System.out.println("Contents of villas: ");
        System.out.println(villas);
        System.out.println("Contents of summer houses: ");
        System.out.println(summerHouses);
        System.out.println("*".repeat(50));
        System.out.println(" ");

        // Prints the total price of houses
        System.out.println("Total price of all houses: " + houseService.calculateHousesTotalPrice(houses));
        // Prints the total price of villas
        System.out.println("Total price of villas: " + houseService.calculateVillasTotalPrice(villas));
        // Prints the total price of summer houses
        System.out.println("Total price of summer houses: " + houseService.calculateSummerHousesTotalPrice(summerHouses));
        // Prints the total price of homes
        System.out.println("Total price of homes: " + houseService.calculateHomesTotalPrice(homes));
        System.out.println("*".repeat(50));
        System.out.println(" ");

        // Prints the average floor area of houses
        System.out.println("Average floor area of all houses: "
                + String.format("%.2f",houseService.calculateHousesAverageFloorArea(houses)));
        System.out.println("Average floor area of homes: "
                + String.format("%.2f",houseService.calculateHomesAverageFloorArea(homes)));
        System.out.println("Average floor area of villas: "
                + String.format("%.2f",houseService.calculateVillasAverageFloorArea(villas)));
        System.out.println("Average floor area of summer houses: "
                + String.format("%.2f",houseService.calculateSummerHousesAverageFloorArea(summerHouses)));
        System.out.println("*".repeat(50));
        System.out.println(" ");

        // Prints filtered all type of houses according to the number of rooms and number of halls (You can change them)
        int numberOfRooms = 2;
        int numberOfHalls = 1;
        System.out.println("List of houses with "+ numberOfRooms + " rooms and "
                + numberOfHalls +" halls:\n"
                +houseService.filterHousesByRoomsAndHalls(houses,numberOfRooms,numberOfHalls));







    }
}
