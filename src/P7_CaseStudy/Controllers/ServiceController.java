package P7_CaseStudy.Controllers;

import P7_CaseStudy.Commons.*;
import P7_CaseStudy.Models.House;
import P7_CaseStudy.Models.Room;
import P7_CaseStudy.Models.Services;
import P7_CaseStudy.Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

import static P7_CaseStudy.Commons.FuncGeneric.showAllNameNotDuplicate;
import static P7_CaseStudy.Controllers.MainController.displayMainMenu;

public class ServiceController {
    public static ArrayList<Villa> listVilla = new ArrayList<Villa>();
    public static ArrayList<House> listHouse = new ArrayList<House>();
    public static ArrayList<Room> listRoom = new ArrayList<Room>();
    public static Scanner scn = new Scanner(System.in);

    public static void addNewServices() {
        System.out.println("Chon menu:"
                + "\n1.Add New Villa"
                + "\n2.Add New House"
                + "\n3.Add New Room"
                + "\n4.Back to menu"
                + "\n5.Exit"
        );
        System.out.println("Nhap lua chon:");
        Scanner scn = new Scanner(System.in);
        String choose = scn.nextLine();
        switch (choose) {
            case "1":
                addNewVilla();
                break;
            case "2":
                addNewHouse();
                break;
            case "3":
                addNewRoom();
                break;
            case "4":
                displayMainMenu();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Failed: please choose again!!!! Enter to continue...");
                scn.nextLine();
                addNewServices();
        }
    }

    //    id,usedArea,rentCost,maxPeople,poolArea,soTang
    private static void addNewVilla() {
        listVilla = FuncFileVillaCSV.getfileCSVtoListVilla();

        Villa villa = new Villa();
        System.out.println("Dien Thong tin Villa: ");
        System.out.println("Id Service: ");
        idService(villa);
        System.out.println("Ten Dich vu: ");
        nameService(villa);
        System.out.println("Dien tich su dung: ");
        usedArea(villa);
        System.out.println("Gia villa: ");
        rentCost(villa);
        System.out.println("So nguoi toi da: ");
        maxPepple(villa);
        System.out.println("Tieu chuan phong: ");
        tieuChuanPhongVilla(villa);
        System.out.println("Tien Nghi: ");
        tienNghiVilla(villa);
        System.out.println("Dien tich ho boi: ");
        usedPoolArea(villa);
        System.out.println("So tang: ");
        soTangVilla(villa);
        listVilla.add(villa);
        FuncFileVillaCSV.writeVillatoCSV(listVilla);
        System.out.println("Add new Villa completed! Enter to continue...");
        scn.nextLine();
        displayMainMenu();
    }


    private static void addNewHouse() {
        listHouse = FuncFileHouseCSV.getfileCSVtoListHouse();
//        Scanner scn = new Scanner(System.in);
        House house = new House();
        System.out.println("Dien Thong tin House: ");
        System.out.println("Id House: ");
        idService(house);
        System.out.println("Ten Dich vu: ");
        nameService(house);
        System.out.println("Tieu chuan phong: ");
        tieuChuanPhongHouse(house);
        System.out.println("Tien Nghi: ");
        tienNghiHouse(house);
        System.out.println("Dien tich: ");
        usedArea(house);
        System.out.println("Gia house: ");
        rentCost(house);
        System.out.println("So nguoi toi da: ");
        maxPepple(house);
        System.out.println("So tang: ");
        soTangHouse(house);
        listHouse.add(house);
        FuncFileHouseCSV.writeHousetoCSV(listHouse);
        System.out.println("Add new House completed! Enter to continue...");
        scn.nextLine();
        displayMainMenu();
    }

    private static void addNewRoom() {
        listRoom = FuncFileRoomCSV.getfileCSVtoListRoom();
//        Scanner scn = new Scanner(System.in);
        Room room = new Room();
        System.out.println("Dien Thong tin Room: ");
        System.out.println("Id Room: ");
        idService(room);
        System.out.println("Ten Dich vu: ");
        nameService(room);
        System.out.println("Dien tich: ");
        usedArea(room);
        System.out.println("Gia room: ");
        rentCost(room);
        System.out.println("So nguoi toi da: ");
        maxPepple(room);
        System.out.println("Dich vu mien phi: ");
        freeServiceRoom(room);
        listRoom.add(room);
        FuncFileRoomCSV.writeRoomtoCSV(listRoom);
        System.out.println("Add new Room completed! Enter to continue...");
        scn.nextLine();
        displayMainMenu();
    }

    private static void freeServiceRoom(Room room) {
        String idTempRoom = scn.next();
        while (!FunctionValidation.checkFreeService(idTempRoom)) {
            System.out.println("Free service is invalid! Enter Free service again:");
            idTempRoom = scn.next();
        }
        room.setFreeService(idTempRoom);
    }

    private static void soTangVilla(Villa villa) {
        int idTemp = scn.nextInt();
        while (!FunctionValidation.checkRentCost(idTemp)) {
            System.out.println("So Tang is invalid! Enter So Tang again: (So Tang > 0)");
            idTemp = scn.nextInt();
        }
        villa.setSoTang(idTemp);
    }

    private static void soTangHouse(House house) {
        int idTemp = scn.nextInt();
        while (!FunctionValidation.checkRentCost(idTemp)) {
            System.out.println("So Tang is invalid! Enter So Tang again: (So Tang > 0)");
            idTemp = scn.nextInt();
        }
        house.setSoTang(idTemp);
    }

    private static void maxPepple(Services services) {
        int idTemp = scn.nextInt();
        while (!FunctionValidation.checkMaxPeople(idTemp)) {
            System.out.println("Max people is invalid! Enter Max people again: (0 < Max people < 20 )");
            idTemp = scn.nextInt();
        }
        services.setMaxPeople(idTemp);
    }

    private static void rentCost(Services services) {
        int idTemp = scn.nextInt();
        while (!FunctionValidation.checkRentCost(idTemp)) {
            System.out.println("Rent Cost is invalid! Enter Rent Cost again: (Rent Cost > 0)");
            idTemp = scn.nextInt();
        }
        services.setRentCost(idTemp);
    }

    private static void usedArea(Services services) {
        int idTemp = scn.nextInt();
        while (!FunctionValidation.checkArea(idTemp)) {
            System.out.println("Area is invalid! Enter Area again: (area > 30)");
            idTemp = scn.nextInt();
        }
        services.setUsedArea(idTemp);
    }

    private static void usedPoolArea(Villa villa) {
        int idTemp = scn.nextInt();
        while (!FunctionValidation.checkArea(idTemp)) {
            System.out.println("Area is invalid! Enter Area again: (area > 30)");
            idTemp = scn.nextInt();
        }
        villa.setPoolArea(idTemp);
    }

    private static void nameService(Services services) {
        String idTempHouse = scn.nextLine();
        while (!FunctionValidation.checkServiceName(idTempHouse)) {
            System.out.println("Service Name is invalid! Enter Name again: ( EX: Villa)");
            idTempHouse = scn.nextLine();
        }
        services.setServicesNames(idTempHouse);
    }

    private static void tieuChuanPhongHouse(House house) {
        String idTemp = scn.nextLine();
        while (!FunctionValidation.checkServiceName(idTemp)) {
            System.out.println("tieuChuanPhong is invalid! Enter tieuChuanPhong again:");
            idTemp = scn.nextLine();
        }
        house.setTieuChuanPhong(idTemp);
    }

    private static void tieuChuanPhongVilla(Villa villa) {
        String idTemp = scn.next();
        while (!FunctionValidation.checkServiceName(idTemp)) {
            System.out.println("tieuChuanPhong is invalid! Enter tieuChuanPhong again:");
            idTemp = scn.next();
        }
        villa.setTieuChuanPhong(idTemp);
    }

    private static void tienNghiVilla(Villa villa) {
        String idTemp = scn.next();
        while (!FunctionValidation.checkServiceName(idTemp)) {
            System.out.println("tienNghi is invalid! Enter tienNghi again:");
            idTemp = scn.next();
        }
        villa.setTienNghi(idTemp);
    }

    private static void tienNghiHouse(House house) {
        String idTemp = scn.nextLine();
        while (!FunctionValidation.checkServiceName(idTemp)) {
            System.out.println("tienNghi is invalid! Enter tienNghi again:");
            idTemp = scn.nextLine();
        }
        house.setTienNghi(idTemp);
    }

    private static void idService(Services services) {
        String idTemp = scn.nextLine();
        while (!FunctionValidation.checkID(services, idTemp)) {
            System.out.println("Id is invalid! Enter id again: ( EX: SVXX-1111 ,XX: VL or HO or RO)");
            idTemp = scn.nextLine();
        }
        services.setId(idTemp);
    }

    public static void showServices() {
        System.out.println("Chon menu:"
                + "\n1.Show All Villa"
                + "\n2.Show All House"
                + "\n3.Show All Room"
                + "\n4.Show All Villa not duplicate"
                + "\n5.Show All House not duplicate"
                + "\n6.Show All Room not duplicate"
                + "\n7.Back to menu"
                + "\n8.Exit"
        );
        System.out.println("Nhap lua chon:");
//        Scanner scn = new Scanner(System.in);
        String choose = scn.nextLine();
        switch (choose) {
            case "1":
                showAllVilla();
                break;
            case "2":
                showAllHouse();
                break;
            case "3":
                showAllRoom();
                break;
            case "4":
                showAllVillaNotDup();
                break;
            case "5":
                showAllHouseNotDup();
                break;
            case "6":
                showAllRoomNotDup();
                break;
            case "7":
                displayMainMenu();
                break;
            case "8":
                System.exit(0);
                break;
            default:
                System.out.println("Failed: please choose again!!!! Enter to continue...");
                scn.nextLine();
                addNewServices();
        }

    }
//    id,usedArea,rentCost,maxPeople,poolArea,soTang

    private static void showAllVilla() {
        listVilla = FuncFileVillaCSV.getfileCSVtoListVilla();
        for (Villa villa : listVilla) {
            System.out.println("---------------------------");
            System.out.println("ID Villa: " + villa.getId());
            System.out.println("Dien tich  Villa: " + villa.getUsedArea());
            System.out.println("Gia Villa: " + villa.getRentCost());
            System.out.println("So nguoi toi da: " + villa.getMaxPeople());
            System.out.println("Dien tich ho boi : " + villa.getPoolArea());
            System.out.println("So Tang: " + villa.getSoTang());
            System.out.println("Tieu Chuan Phong: " + villa.getTieuChuanPhong());
            System.out.println("Tien Nghi: " + villa.getTienNghi());
            System.out.println("---------------------------");
        }
//        Scanner scn = new Scanner(System.in);
        System.out.println(("Enter to continue...."));
        scn.nextLine();
        displayMainMenu();
    }

    private static void showAllHouse() {
        listHouse = FuncFileHouseCSV.getfileCSVtoListHouse();
        for (House house : listHouse) {
            System.out.println("---------------------------");
            System.out.println("ID House: " + house.getId());
            System.out.println("Dien tich  House: " + house.getUsedArea());
            System.out.println("Gia House: " + house.getRentCost());
            System.out.println("So nguoi toi da: " + house.getMaxPeople());
            System.out.println("So Tang: " + house.getSoTang());
            System.out.println("Tieu Chuan Phong: " + house.getTieuChuanPhong());
            System.out.println("Tien Nghi: " + house.getTienNghi());
            System.out.println("---------------------------");
        }
//        Scanner scn = new Scanner(System.in);
        System.out.println(("Enter to continue...."));
        scn.nextLine();
        displayMainMenu();
    }


    private static void showAllRoom() {
        listRoom = FuncFileRoomCSV.getfileCSVtoListRoom();
        for (Room room : listRoom) {
            System.out.println("---------------------------");
            System.out.println("ID Room: " + room.getId());
            System.out.println("Dien tich  Room: " + room.getUsedArea());
            System.out.println("Gia Room: " + room.getRentCost());
            System.out.println("So nguoi toi da: " + room.getMaxPeople());
            System.out.println("Dich vu mien phi: " + room.getFreeService());
            System.out.println("---------------------------");
        }
//        Scanner scn = new Scanner(System.in);
        System.out.println(("Enter to continue...."));
        scn.nextLine();
        displayMainMenu();
    }

    private static void showAllVillaNotDup() {
        showAllNameNotDuplicate(FuncGeneric.EntityType.VILLA);
    }

    private static void showAllHouseNotDup() {
        showAllNameNotDuplicate(FuncGeneric.EntityType.HOUSE);
    }

    private static void showAllRoomNotDup() {
        showAllNameNotDuplicate(FuncGeneric.EntityType.ROOM);
    }
}
