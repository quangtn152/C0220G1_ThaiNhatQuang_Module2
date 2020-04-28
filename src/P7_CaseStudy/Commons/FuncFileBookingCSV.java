package P7_CaseStudy.Commons;

import P7_CaseStudy.Models.Customer;
import P7_CaseStudy.Models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileBookingCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameBooking = "src/P7_CaseStudy/data/Booking.csv";
    //HEADER FILE Booking CSV
    private static final String FILE_HEADER_BOOKING = "FullName,Birthday, Gender, ID Card, Phone, Email, Customer Type, Address, ID";

    public static void writeBookingtoCSV(ArrayList<Customer> listCustomer) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameBooking);
            fileWriter.append(FILE_HEADER_BOOKING);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for ( Customer customer : listCustomer) {
                fileWriter.append(customer.getFullName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getBirthDay());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getGender()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getIdCard()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getPhone()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getEmail()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getCustomerType()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("error in csvFileWriter");
        } finally {
            try {
                fileWriter.flush(); // xoa bo nho dem
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("error when flush or close");
            }
        }
    }

    public static ArrayList<Customer> getfileCSVtoListBooking() {
        BufferedReader bufferedReader = null;
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        Path path = Paths.get(fileNameBooking);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameBooking);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileNameBooking));

            while ((line = bufferedReader.readLine()) != null) {
                String[] spliData = line.split(",");
                if (spliData[0].equals("id")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setFullName(spliData[0]);
                customer.setBirthDay(spliData[1]);
                customer.setGender(spliData[2]);
                customer.setIdCard(spliData[3]);
                customer.setPhone(spliData[4]);
                customer.setEmail(spliData[5]);
                customer.setCustomerType(spliData[6]);
                customer.setAddress((spliData[7]));
                listCustomer.add(customer);
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
        return listCustomer;
    }
}
