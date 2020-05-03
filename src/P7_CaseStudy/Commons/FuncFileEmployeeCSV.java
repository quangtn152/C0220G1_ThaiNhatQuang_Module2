package P7_CaseStudy.Commons;

import P7_CaseStudy.Models.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileEmployeeCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameEmployee = "src/P7_CaseStudy/data/Employee.csv";
    //HEADER FILE Employee CSV
    private static final String FILE_HEADER_BOOKING = "id,fullName,age,address";


    public static ArrayList<Employee> getfileCSVtoListEmployee() {
        BufferedReader bufferedReader = null;
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        Path path = Paths.get(fileNameEmployee);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameEmployee);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileNameEmployee));

            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setFullName(splitData[0]);
                employee.setAge(Integer.parseInt(splitData[1]));
                employee.setAddress(splitData[2]);
                listEmployee.add(employee);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listEmployee;
    }
}
