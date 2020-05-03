package CaseStudy.FileCSV;

import CaseStudy.Commons.FuncGeneric;
import CaseStudy.Models.Employee;
import java.util.ArrayList;
import java.util.Stack;
public class Resume {
    public Resume() {
    }
    public static Stack<Employee> getAllEmployee(){
        Stack<Employee> employeeList = new Stack<Employee>();
        ArrayList<Employee> employeeArrayList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.CUSTOMER);
        for(Employee employee : employeeArrayList){
            employeeList.push(employee);
        }
        return employeeList;
    }
}