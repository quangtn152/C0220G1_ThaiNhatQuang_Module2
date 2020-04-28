package P7_CaseStudy.Commons;

import P7_CaseStudy.Models.Services;
import P7_CaseStudy.Models.House;
import P7_CaseStudy.Models.Room;
import P7_CaseStudy.Models.Villa;

public class FunctionValidation {
    private static String regex = "";

    public static boolean checkID(Services service, String str) {
        if (service instanceof Villa) {
            regex = "^SVVL-[\\d]{4}$";
        } else if (service instanceof House) {
            regex = "^SVHO-[\\d]{4}$";
        } else if (service instanceof Room) {
            regex = "^SVRO-[\\d]{4}$";
        }
        return str.matches(regex);
    }

    public static boolean checkServiceName(String str) {
        regex = "^[A-Z]([a-z])+$";
        return str.matches(regex);
    }

    public static boolean checkArea(int area) {
        boolean status = true;
        if (area < 30) {
            status = false;
        }
        return status;
    }

    public static boolean checkRentCost(int cost) {
        boolean status = true;
        if (cost < 0) {
            status = false;
        }
        return status;
    }

    public static boolean checkMaxPeople(int people) {
        boolean status = true;
        if ((people < 0) || (people > 20)) {
            status = false;
        }
        return status;
    }

    public static boolean checkFreeService(String str) {
        regex = "^massage|bar|karaoke|food|drink|car$";
        return str.matches(regex);
    }

    public static boolean checkCustomerName(String str) {
        regex = "^[A-Z][a-z]+$";
        return str.matches(regex);
    }
    public static boolean checkCustomerEmail(String str) {
        regex = "^([0-9A-Za-z]+){3}@([0-9A-Za-z]+){3}(\\.[0-9A-Za-z]+){1,2}$";
        return str.matches(regex);
    }

    public static boolean checkCustomerBirthday(String str) {
        regex = "^(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|200[0-2])$";
        return str.matches(regex);
    }
    public static boolean checkCustomerGender(String str) {
        regex = "^(male|female|unknown)$";
        return str.matches(regex);
    }
    public static boolean checkCustomerId(String str) {
        regex = "^\\d{9}$";
        return str.matches(regex);
    }
    public static boolean checkCustomerPhone(String str) {
        regex = "^\\d{10}$";
        return str.matches(regex);
    }
    public static boolean checkCustomerType(String str) {
        regex = "^[A-Z]([a-z]|[0-9]| )+$";
        return str.matches(regex);
    }
    public static boolean checkCustomerAddress(String str) {
        regex = "^[A-Z]([a-z]|[0-9]|-| )+$";
        return str.matches(regex);
    }
}
