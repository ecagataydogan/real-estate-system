package modal;

public class Villa extends House{
    public Villa(Long price, Long floorArea,int numberOfRooms,int numberOfHalls) {
        super(price,floorArea,numberOfRooms,numberOfHalls);
    }

    @Override
    public String toString() {
        return "Villa{" +
                "price=" + super.getPrice() +
                ", floorArea=" + super.getFloorArea() +
                ", numberOfRooms=" + super.getNumberOfRooms() +
                ", numberOfHalls=" + super.getNumberOfHalls() +
                '}';
    }
}
