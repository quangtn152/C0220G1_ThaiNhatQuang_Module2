package P7_CaseStudy.Models;

public class Test {
    public static void main(String[] args) {
        Services villa = new Villa("Villa",
                "villa1",
                "villa",
                "Ho Boi",
                100,
                500,
                8,
                30,
                2);
        villa.showInfo();
        Services house = new House("House",
                "house1",
                "house",
                "Buffet",
                50,
                300,
                5,
                2);
        house.showInfo();
        Services room = new Room("Room",
                "room1",
                20,
                "xe dap",
                100,
                2);
        room.showInfo();
    }
}
