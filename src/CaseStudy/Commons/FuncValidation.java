package CaseStudy.Commons;

import CaseStudy.CustomerException.*;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Services;
import CaseStudy.Models.Villa;

public class FuncValidation {
    private static String pattern = "";

    public static boolean isValidIdServices(Services services, String str) {
        if (services instanceof Villa) {
            pattern = "^SVVL-\\d{4}$";
        } else if (services instanceof House) {
            pattern = "^SVHO-\\d{4}$";
        } else if (services instanceof Room) {
            pattern = "^SVRO-\\d{4}$";
        }
        return str.matches(pattern);
    }

    public static boolean isValidFreeService(String str) {
        pattern = "^messenger|food|drink|car|karaoke";
        return str.matches(pattern);
    }

    public static boolean isValidNameService(String str) {
        String pattern = "^[A-Z][a-z]+$";
        return str.matches(pattern);
    }

    public static boolean isValidBirthday(String str){
        pattern = "^(0[1-9]|[12][0-9]|3[01])[-/.](0[1-9]|1[012])[-/.](19[0-9]{2}|200[0-2])$";
        return str.matches(pattern);
    }

    public static boolean isValidGender(String str){
        pattern = "^(?i:Male|Female|Unknow)$";
        return str.matches(pattern);
    }

    public static boolean isValidIdCard(String str){
        pattern = "^\\d{9}$";
        return str.matches(pattern);
    }

    public static boolean isValidEmail(String str){
        pattern = "^[a-z0-9_]+@[a-z]+\\.[a-z]+$";
        return str.matches(pattern);
    }

    public static String getValidFreeService(String strDisplay, String errMess) {
        System.out.println(strDisplay);
        String result = ScannerUtils.scanner.nextLine();

        if (!isValidFreeService(result)) {
            System.out.println(errMess);
            result = getValidFreeService(strDisplay, errMess);
        }
        return result;
    }

    public static double getValidNumberDouble(String strDisplay, String errMess, Double min) {
        double result = 0;
        System.out.println(strDisplay);

        try {
            result = Double.parseDouble(ScannerUtils.scanner.nextLine());
            if (min != null && result <= min) {
                throw new Exception(errMess);
            }
        } catch (Exception e) {
            System.out.println(errMess);
            result = getValidNumberDouble(strDisplay, errMess, min);
        }
        return result;
    }

    public static Integer getValidNumberInteger(String strDisplay, String errMess, Integer min) {
        return getValidNumberInteger(strDisplay, errMess, min, null);
    }

    public static Integer getValidNumberInteger(String strDisplay, String errMess, Integer min, Integer max) {
        int result = 0;
        System.out.println(strDisplay);

        try {
            result = Integer.parseInt(ScannerUtils.scanner.nextLine());
            if (min != null && result <= min) {
                throw new Exception(errMess);
            }
            if (max != null && result >= max) {
                throw new Exception(errMess);
            }
        } catch (Exception e) {
            System.out.println(errMess);
            result = getValidNumberInteger(strDisplay, errMess, min, max);
        }
        return result;
    }

    public static String getValidName(String stringDisplay, String errMess) {
        System.out.println(stringDisplay);
        String result = ScannerUtils.scanner.nextLine();
        if (!isValidNameService(result)) {
            System.out.println(errMess);
            result = getValidName(stringDisplay, errMess);
        }
        return result;
    }

    public static String getValidIdService(Services services, String strDisplay, String errMess) {
        System.out.println(strDisplay);
        String result = ScannerUtils.scanner.nextLine();
        if (!isValidIdServices(services, result)) {
            System.out.println(errMess);
            result = getValidIdService(services, strDisplay, errMess);
        }
        return result;
    }

    public static String getValidCustomerName(String strDisplay,String errMess){
        String result ="";
        System.out.println(strDisplay);
        try{
            result = ScannerUtils.scanner.nextLine();
            if(!isValidNameService(result)){
                throw new NameException(errMess);
            }
        }catch (NameException e){
            System.out.println(errMess);
            result = getValidCustomerName(strDisplay,errMess);
        }
        return result;
    }

    public static String getValidBirthday(String str,String errMess){
        String result = "";
        System.out.println(str);
        try{
            result = ScannerUtils.scanner.nextLine();
            if(!isValidBirthday(result)){
                throw new BirthdayException(errMess);
            }
        }catch (BirthdayException e){
            System.out.println(errMess);
            result = getValidBirthday(str,errMess);
        }
        return result;
    }

    public static String getValidGender(String str, String errMess){
        String result = "";
        System.out.println(str);
        try{
            result = ScannerUtils.scanner.nextLine();
            if(!isValidGender(result)){
                throw new GenderException(errMess);
            }
        }catch (GenderException e){
            System.out.println(errMess);
            result = getValidGender(str,errMess);
        }
        return result;
    }

    public static String getValidIdCard(String str,String errMess){
        String result = "";
        System.out.println(str);
        try{
            result = ScannerUtils.scanner.nextLine();
            if(!isValidIdCard(result)){
                throw new IdCardException(errMess);
            }
        }catch (IdCardException e){
            System.out.println(errMess);
            result = getValidIdCard(str,errMess);
        }
        return result;
    }

    public static String getValidEmail(String str,String errMess){
        String result = "";
        System.out.println(str);
        try{
            result = ScannerUtils.scanner.nextLine();
            if(!isValidEmail(result)){
                throw new EmailException(errMess);
            }
        }catch (EmailException e){
            System.out.println(errMess);
            result = getValidEmail(str,errMess);
        }
        return result;
    }
}
