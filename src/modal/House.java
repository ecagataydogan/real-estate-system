package modal;

public abstract class House {

    private Long price;
    private Long floorArea;
    private int numberOfRooms;
    private int numberOfHalls;

    public House(Long price, Long floorArea,int numberOfRooms,int numberOfHalls) {
        this.price = price;
        this.floorArea = floorArea;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHalls = numberOfHalls;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(Long floorArea) {
        this.floorArea = floorArea;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", floorArea=" + floorArea +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfHalls=" + numberOfHalls +
                '}';
    }
}
