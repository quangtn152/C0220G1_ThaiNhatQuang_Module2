package P7_CaseStudy.Commons;

import P7_CaseStudy.Models.Customer;
import P7_CaseStudy.Models.House;
import P7_CaseStudy.Models.Room;
import P7_CaseStudy.Models.Villa;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;

import static P7_CaseStudy.Controllers.MainController.displayMainMenu;

public class FuncGeneric {
    public enum EntityType {
        VILLA,
        HOUSE,
        ROOM,
        CUSTOMER,
        EMPLOYEE,
    }

    public static <E> void displayList(ArrayList<E> list) {
        int i = 1;
        System.out.println("----------- List ----------");

        for (E item : list) {
            System.out.println("No:" + i);

            if (item instanceof Villa) {
                ((Villa) item).showInfo();
            } else if (item instanceof House) {
                ((House) item).showInfo();
            } else if (item instanceof Room) {
                ((Room) item).showInfo();
            }else if (item instanceof Customer){
                ((Customer) item).showInfo();
            }
//            else if(item instanceof Employee){
//                System.out.println();
//            }

            i++;
            System.out.println("-------------------------");
        }
    }
    public static void showAllNameNotDuplicate(EntityType entityType){
        String csvPath = "";
        switch (entityType){
            case VILLA:{
                csvPath = "src/P7_CaseStudy/data/Villa.csv";
                break;
            }
            case ROOM:{
                csvPath = "src/P7_CaseStudy/data/Room.csv";
                break;
            }
            case HOUSE:{
                csvPath = "src/P7_CaseStudy/data/House.csv";
                break;
            }
        }
        Path path = Paths.get(csvPath);
        if(!Files.exists(path)){
            System.out.println("---- File CSV path does not Exists! -----");
            displayMainMenu();
        }
        TreeSet<String> treeSet = FuncWriteAndReadFileCSV.getAllNameServiceFromCSV(csvPath);
        System.out.println("------ List Name Service Not Duplicate ------");
        for(String str : treeSet){
            System.out.println(str);
            System.out.println("----------------");
        }
        displayMainMenu();
    }
}
