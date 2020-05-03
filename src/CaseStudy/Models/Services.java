package CaseStudy.Models;
public abstract class Services {
    private String id;
    private String nameService;
    private String email;
    private int maxNumberOfPeople;
    private int numberOfDay;
    private double area;
    private double rentalCost;

    public Services() {
    }


    public Services(String id, String name, String email, int maxNumberOfPeople, int numberOfDay, double area) {
        this.id = id;
        this.nameService = name;
        this.email = email;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.numberOfDay = numberOfDay;
        this.area = area;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public void setNumberOfDay(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return nameService;
    }

    public void setName(String nameService) {
        this.nameService = nameService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void showInfo();

}