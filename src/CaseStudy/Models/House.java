package CaseStudy.Models;

public class House extends Services {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String id, String name, String email, int maxNumberOfPeople, int numberOfDay, double area, String roomStandard, int numberOfFloors) {
        super(id, name, email, maxNumberOfPeople, numberOfDay, area);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInfo() {
        System.out.println("ID Service: " + super.getId() +
                "\nName Service: " + super.getName() +
                "\nEmail: " + super.getEmail() +
                "\nNumber Of People: " + super.getMaxNumberOfPeople() +
                "\nNumber Of Day: " + super.getNumberOfDay() +
                "\nArea: " + super.getArea() +
                "\nRoom Standard: " + this.getRoomStandard() +
                "\nNumber Of Floor: " + this.getNumberOfFloors() +
                "\nRental Cost:" + super.getRentalCost());
    }
}
