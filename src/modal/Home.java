package modal;

public class Home extends House{
    public Home(Long price, Long floorArea,int numberOfRooms,int numberOfHalls) {
        super(price,floorArea,numberOfRooms,numberOfHalls);
    }

    @Override
    public String toString() {
        return "Home{" +
                "price=" + super.getPrice() +
                ", floorArea=" + super.getFloorArea() +
                ", numberOfRooms=" + super.getNumberOfRooms() +
                ", numberOfHalls=" + super.getNumberOfHalls() +
                '}';
    }
}
