package P7_CaseStudy.Models;


public abstract class Services  {
    private String servicesNames;
    private String id;
    private int usedArea;
    private int rentCost;
    private int maxPeople;

    public Services(String servicesNames, String id, int usedArea, int rentCost, int maxPeople) {
        this.servicesNames = servicesNames;
        this.id = id;
        this.usedArea = usedArea;
        this.rentCost = rentCost;
        this.maxPeople = maxPeople;
    }

    public String getServicesNames() {
        return servicesNames;
    }

    public void setServicesNames(String servicesNames) {
        this.servicesNames = servicesNames;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(int usedArea) {
        this.usedArea = usedArea;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }
    public void rentType(int Ngay, int Thang, int Nam){

    }
    public abstract void showInfo();

}
