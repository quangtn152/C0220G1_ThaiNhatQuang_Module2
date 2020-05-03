package CaseStudy.Models;

public class Villa extends Services {
    private String roomStandard;
    private double areaPool;
    private int numberOfFloor;

    public Villa(String id, String name, String email, int maxNumberOfPeople, int numberOfDay, double area, String roomStandard, double areaPool, int numberOfFloor) {
        super(id, name, email, maxNumberOfPeople, numberOfDay, area);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }


    @Override
    public void showInfo() {
        System.out.println( "ID Service: " + super.getId() +
                "\nName Service: " + super.getName() +
                "\nEmail: " + super.getEmail() +
                "\nMax Number Of People: " + super.getMaxNumberOfPeople() +
                "\nNumber Of Day: " + super.getNumberOfDay() +
                "\nArea: " + super.getArea() +
                "\nRoom Standard: " + this.roomStandard +
                "\nArea Pool: " + this.areaPool +
                "\nNumber Of Floor: " + this.numberOfFloor +
                "\nRental Cost:" + super.getRentalCost());
    }
}