package P7_CaseStudy.Models;

public class Room extends Services {
    private String freeService;

    public Room(String servicesNames, String id, int usedArea, String freeService, int rentCost, int maxPeople) {
        super(servicesNames, id, usedArea, rentCost, maxPeople);
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
        System.out.println("Services Names: " + getServicesNames() +
                "\nID Phong: " + getId() +
                "\nDien Tich Su Dung: " + getUsedArea() + " m2"+
                "\nDich vu mien phi: " + this.freeService +
                "\nGia Phong: " + getRentCost() + " $"+
                "\nSo Nguoi Toi Da: " + getMaxPeople() );
    }
}
