package CaseStudy.Controllers;
import CaseStudy.Commons.FuncGeneric;
import CaseStudy.Commons.FuncValidation;
import CaseStudy.Commons.FuncWriteAndReadFileCSV;
import CaseStudy.Commons.ScannerUtils;
import CaseStudy.Models.Customer;
import CaseStudy.Models.SortNameAndYear;

import java.util.ArrayList;

import static CaseStudy.Commons.FuncGeneric.displayList;
import static CaseStudy.Controllers.MainController.backMainMenu;

public class CustomerControllers {
    private static final String ENTER_CUSTOMER_NAME = "Enter Customer Name: ";
    private static final String INVALID_CUSTOMER_NAME = "First Character Is UpperCase. Format Xxxxxx";
    private static final String ENTER_BIRTHDAY = "Enter Birthday:";
    private static final String INVALID_BIRTHDAY = "Birthday Format is dd/mm/yyyy. Year > 1900 and < 2002";
    private static final String ENTER_GENDER = "Enter Gender: ";
    private static final String INVALID_GENDER = "Gender Must Be Male|Female|Unknow";
    private static final String ENTER_ID_CARD = "Enter ID Card: ";
    private static final String INVALID_ID_CARD = "ID Card Format is XXX XXX XXX";
    private static final String ENTER_EMAIL = "Enter Email: ";
    private static final String INVALID_EMAIL = "Email Format is abc@abc.abc";

    public static void addNewCustomer(){
        Customer customer = new Customer();

        ScannerUtils.scanner.nextLine();

        customer.setFullName(FuncValidation.getValidCustomerName(ENTER_CUSTOMER_NAME,INVALID_CUSTOMER_NAME));

        customer.setBirthDay(FuncValidation.getValidBirthday(ENTER_BIRTHDAY,INVALID_BIRTHDAY));

        String gender = FuncValidation.getValidGender(ENTER_GENDER,INVALID_GENDER);
        customer.setGender(Character.toUpperCase(gender.charAt(0)) +gender.substring(1,gender.length()).toLowerCase());

        customer.setIdCard(FuncValidation.getValidIdCard(ENTER_ID_CARD,INVALID_ID_CARD));

        System.out.println("Enter Phone Number Customer: ");
        customer.setPhone(ScannerUtils.scanner.nextLine());

        customer.setEmail(FuncValidation.getValidEmail(ENTER_EMAIL,INVALID_EMAIL));

        System.out.println("Enter Type Customer: ");
        customer.setCustomerType(ScannerUtils.scanner.nextLine());

        System.out.println("Enter Address Customer");
        customer.setAddress(ScannerUtils.scanner.nextLine());

        ArrayList<Customer> customerList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.CUSTOMER);

        customerList.add(customer);

        FuncWriteAndReadFileCSV.writeCustomerToFileCSV(customerList);

        System.out.println("------Add Customer: " + customer.getFullName() + " Successfully !!");

        backMainMenu();


    }
    public static void showInformationCustomers(){
        ArrayList<Customer> customerList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.CUSTOMER);
        customerList.sort(new SortNameAndYear());
        displayList(customerList);
        backMainMenu();
    }
}