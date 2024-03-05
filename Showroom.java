import java.util.Scanner;

public class Showroom implements Utility {

    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock = 0;
    String manager_name;

    public void get_details() {

        System.out.println("Showroom Name : " +showroom_name);
        System.out.println("Showroom Address : " +showroom_address);
        System.out.println("Manager Name : " +manager_name);
        System.out.println("Total Employees : " +total_employees);
        System.out.println("Total Cars In Stock : " +total_cars_in_stock);
    }

    public void set_details() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================== *** ENTER SHOWROOM DETAILS *** ========================");
        System.out.println();
        System.out.print("SHOWROOM NAME : ");
        showroom_name = scanner.nextLine();
        System.out.print("SHOWROOM ADDRESS : ");
        showroom_address = scanner.nextLine();
        System.out.print("MANAGER NAME : ");
        manager_name = scanner.nextLine();
        System.out.print("TOTAL NO OF EMPLOYEES : ");
        total_employees = scanner.nextInt();
        System.out.print("TOTAL CARS IN STOCK : ");
        total_cars_in_stock = scanner.nextInt();
    }
}