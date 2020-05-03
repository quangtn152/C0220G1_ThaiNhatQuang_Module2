package P7_CaseStudy.Controllers;

import P7_CaseStudy.Commons.FuncFileEmployeeCSV;
import P7_CaseStudy.Models.Employee;

import java.util.ArrayList;

import static P7_CaseStudy.Commons.ScannerUtils.scanner;
import static P7_CaseStudy.Controllers.MainController.displayMainMenu;

public class EmployeeController {
    public static void showInformationEmployee() {
        ArrayList<Employee> listEmployee;
        listEmployee = FuncFileEmployeeCSV.getfileCSVtoListEmployee();
        // init map
//        Map<String,Employee> map = new HashMap<>();
        for(Employee employee: listEmployee){
            System.out.println(employee);
//            map.put(employee.getId(),employee);
        }
//        displayMap(map);
        System.out.println(("Enter to continue...."));
        scanner.nextLine();
        displayMainMenu();
    }


//    private static void displayMap(Map<String, Employee> map) {
//        for (Map.Entry m : map.entrySet()) {
//            System.out.println("1");
//            System.out.println("Key : " + m.getKey() + "\n" + m.getValue().toString());
//        }
//    }

    public static void findEmployee() {
    }


}