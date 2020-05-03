package CaseStudy.Commons;

public class Menu {
    public static void displayMainMenu() {
        System.out.println("MENU");
        System.out.println("1.Add New Services");
        System.out.println("2.Show Services");
        System.out.println("3.Add New Customer");
        System.out.println("4.Show Information of Customer");
        System.out.println("5.Add New Booking");
        System.out.println("6.Show Information of Employee");
        System.out.println("7.Booking Movie Ticket 4D");
        System.out.println("8.Find Employee");
        System.out.println("9.Exit");
        System.out.println("Enter your choice: ");
    }

    public static void displayMenuAddNewService(){
        System.out.println("------- Add New Service Menu -------");
        System.out.println("1.Add New Villa" + "\n2.Add New House"
                + "\n3.Add New Room" + "\n4.Back to menu" + "\n5.Exit");
        System.out.println("------- Select one -------");
    }

    public static void displayMenuBackToMain(){
        System.out.println("------ Enter to continue ------");
        ScannerUtils.scanner.nextLine();
    }

    public static void displayMenuShowServices() {
        System.out.println("1.Show all Villa");
        System.out.println("2.Show all House");
        System.out.println("3.Show all Room");
        System.out.println("4.Show All Name Villa Not Duplicate");
        System.out.println("5.Show All Name House Not Duplicate");
        System.out.println("6.Show All Name Name Not Duplicate");
        System.out.println("7.Back to menu");
        System.out.println("8.Exit");
        System.out.println("Enter your choice:");
    }

    public static void displayMenuBooking(){
        System.out.println("1.Booking Villa" +
                "\n2.Booking House" +
                "\n3.Booking Room");
        System.out.println("---- Choose Services Booking ----");
    }

    public static void displayMenuBookingMovieTicket4D(){
        System.out.println("--------- Booking Movie Ticked 4D Menu ---------");
        System.out.println("1.Booking movie ticket" +
                "\n2.Show customer booking movie ticket" +
                "\n3.Exit");
        System.out.println("----- Choose one -----");
    }
}
