package CaseStudy.Models;

public class Room extends Services {
    private String freeService;

    public Room() {
    }

    public Room(String id, String name, String email, int maxNumberOfPeople, int numberOfDay, double area, String freeService) {
        super(id, name, email, maxNumberOfPeople, numberOfDay, area);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public void showInfo() {
        System.out.println( "ID Service: " + super.getId() +
                "\nName Service: " + super.getName() +
                "\nEmail: " + super.getEmail() +
                "\nNumber Of People: " + super.getMaxNumberOfPeople() +
                "\nNumber Of Day: " + super.getNumberOfDay() +
                "\nArea: " + super.getArea() +
                "\nFreeService: " + this.freeService +
                "\nRental Cost:" + super.getRentalCost());

    }
}
