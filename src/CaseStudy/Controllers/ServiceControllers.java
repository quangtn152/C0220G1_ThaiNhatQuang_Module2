package CaseStudy.Controllers;

import CaseStudy.Commons.FuncGeneric;
import CaseStudy.Commons.FuncValidation;
import CaseStudy.Commons.FuncWriteAndReadFileCSV;
import CaseStudy.Commons.ScannerUtils;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Services;
import CaseStudy.Models.Villa;

import java.util.ArrayList;

import static CaseStudy.Commons.FuncGeneric.displayList;
import static CaseStudy.Commons.FuncGeneric.showAllNameNotDuplicate;
import static CaseStudy.Commons.Menu.displayMainMenu;
import static CaseStudy.Commons.Menu.displayMenuAddNewService;
import static CaseStudy.Controllers.MainController.backMainMenu;
import static CaseStudy.Controllers.MainController.processMain;

public class ServiceControllers {
    private static final String ENTER_SERVICE_ID = "Enter Service ID: ";
    private static final String INVALID_SERVICE_ID = "Service ID Must Be Format SVXX-YYYY";
    private static final String ENTER_SERVICE_NAME= "Enter Service Name: ";
    private static final String INVALID_SERVICE_NAME = "First Character Is UpperCase. Format Xxxxxx";
    private static final String ENTER_AREA_USED = "Enter Area Used: ";
    private static final String INVALID_DOUBLE_NUMBER = "Area Used >30. Area Muse Be A Double";
    private static final String ENTER_RENTAL_COST = "Enter Rental Cost: ";
    private static final String INVALID_RENTAL_COST = "Rental Cost >0. Rental Cost Must Be A Double";
    private static final String ENTER_MAX_NUMBER_OF_PEOPLE = "Enter Max Number Of People: ";
    private static final String INVALID_MAX_PEOPLE = "Max People >0 and <20";
    private static final String ENTER_ROOM_STANDARD = "Enter Room Standard: ";
    private static final String INVALID_ROOM_STANDARD = "Room Standard Must Be Capitalized";
    private static final String ENTER_AREA_POOL = "Enter Area Pool: ";
    private static final String INVALID_AREA_POOL = "Area Pool >30. Area Pool Must Be A Double";
    private static final String ENTER_NUMBER_OF_FLOOR = "Enter Number Of Floor";
    private static final String INVALID_NUMBER_OF_FLOOR = "Number Of Floor > 0";
    private static final String ENTER_FREE_SERVICE = "Enter Free Service: ";
    private static final String INVALID_FREE_SERVICE = "Free Service Must Be Equal messenger,food,karaoke,drink,car";


    public static void addNewServies() {
        displayMenuAddNewService();
        processMenuAddNewService();
    }

    private static void processMenuAddNewService() {
        switch (ScannerUtils.scanner.nextInt()) {
            case 1: {
                addVilla();
                displayMainMenu();
                break;
            }
            case 2: {
                addHouse();
                displayMainMenu();
                break;
            }
            case 3: {
                addRoom();
                displayMainMenu();
                break;
            }
            case 4: {
                processMain();
                break;
            }
            case 5: {
                System.exit(0);
                break;
            }
        }
    }

    private static void addVilla() {
        Services villa = new Villa();
        villa = addNewService(villa);


        ((Villa)villa).setRoomStandard(FuncValidation.getValidName(ENTER_ROOM_STANDARD,INVALID_ROOM_STANDARD));

        ((Villa) villa).setAreaPool(FuncValidation.getValidNumberDouble(ENTER_AREA_POOL,INVALID_AREA_POOL,30.0));

        ((Villa) villa).setNumberOfFloor(FuncValidation.getValidNumberInteger(ENTER_NUMBER_OF_FLOOR,INVALID_NUMBER_OF_FLOOR,0));

        ArrayList<Villa> villaList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.VILLA);
        villaList.add((Villa) villa);

        FuncWriteAndReadFileCSV.writeVillaToFileCSV(villaList);

        System.out.println("----- Add Villa: " + villa.getName() + " Successfully");

        backMainMenu();
    }

    private static void addRoom() {
        Services room = new Room();
        room = addNewService(room);

        System.out.println("Enter Free Service");
        ((Room) room).setFreeService(FuncValidation.getValidFreeService(ENTER_FREE_SERVICE,INVALID_FREE_SERVICE));

        ArrayList<Room> roomList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.ROOM);
        roomList.add((Room) room);

        FuncWriteAndReadFileCSV.writeRoomToFileCSV(roomList);

        System.out.println("----- Add Room: " + room.getName() + " Successfully");

        backMainMenu();
    }

    private static void addHouse() {
        Services house = new House();
        house = addNewService(house);
        System.out.println("Enter Room Standard");
        ((House) house).setRoomStandard(FuncValidation.getValidName(ENTER_ROOM_STANDARD,INVALID_ROOM_STANDARD));
        System.out.println("Enter Number Of Floor");
        ((House) house).setNumberOfFloors(FuncValidation.getValidNumberInteger(ENTER_NUMBER_OF_FLOOR,INVALID_NUMBER_OF_FLOOR,30));

        ArrayList<House> houseList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.HOUSE);
        houseList.add((House) house);

        FuncWriteAndReadFileCSV.writeHouseToFileCSV(houseList);

        System.out.println("----- Add House: " + house.getName() + " Successfully");

        backMainMenu();
    }

    private static Services addNewService(Services services) {
        ScannerUtils.scanner.nextLine();
        services.setId(FuncValidation.getValidIdService(services,ENTER_SERVICE_ID,INVALID_SERVICE_ID));

        services.setName(FuncValidation.getValidName(ENTER_SERVICE_NAME,INVALID_SERVICE_NAME));

        services.setArea(FuncValidation.getValidNumberDouble(ENTER_AREA_USED,INVALID_DOUBLE_NUMBER,30.0));

        services.setRentalCost(FuncValidation.getValidNumberDouble(ENTER_RENTAL_COST,INVALID_RENTAL_COST,0.0));

        services.setMaxNumberOfPeople(FuncValidation.getValidNumberInteger(ENTER_MAX_NUMBER_OF_PEOPLE,INVALID_MAX_PEOPLE,0,20));

        return services;
    }

    public static void processMenuShowService() {
        switch (ScannerUtils.scanner.nextInt()) {
            case 1: {
                showVilla();
                break;
            }
            case 2: {
                showHouse();
                break;
            }
            case 3: {
                showRoom();
                break;
            }
            case 4: {
                showAllNameVilla();
                break;
            }
            case 5: {
                showAllNameRoom();
                break;
            }
            case 6: {
                showAllNameHouse();
                break;
            }
            case 7: {
                processMain();
                System.out.println("\n----------------------------");
                break;
            }
            case 8: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("------ Nhập sai -------" + "\nBack to Menu");
                backMainMenu();
                break;
            }
        }
    }

    private static void showAllNameHouse() {
        showAllNameNotDuplicate(FuncGeneric.EntityType.HOUSE);
    }

    private static void showAllNameRoom() {
        showAllNameNotDuplicate(FuncGeneric.EntityType.ROOM);
    }

    private static void showAllNameVilla() {
        showAllNameNotDuplicate(FuncGeneric.EntityType.VILLA);
    }

    private static void showRoom() {
        ArrayList<Room> roomList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.ROOM);
        displayList(roomList);
        backMainMenu();
    }

    private static void showHouse() {
        ArrayList<House> houseList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.HOUSE);
        displayList(houseList);
        backMainMenu();
    }

    private static void showVilla() {
        ArrayList<Villa> villaList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.VILLA);
        displayList(villaList);
        backMainMenu();
    }

}
