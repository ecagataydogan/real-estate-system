package modal;

public class SummerHouse extends House{
    public SummerHouse(Long price, Long floorArea,int numberOfRooms,int numberOfHalls) {
        super(price,floorArea,numberOfRooms,numberOfHalls);
    }

    @Override
    public String toString() {
        return "SummerHouse{" +
                "price=" + super.getPrice() +
                ", floorArea=" + super.getFloorArea() +
                ", numberOfRooms=" + super.getNumberOfRooms() +
                ", numberOfHalls=" + super.getNumberOfHalls() +
                '}';
    }
}
