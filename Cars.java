import java.util.Scanner;

public class Cars extends Showroom {

    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    public void get_details() {

        System.out.println("NAME : " +car_name);
        System.out.println("COLOR : " +car_color);
        System.out.println("FUEL TYPE : " +car_fuel_type);
        System.out.println("PRICE : " +car_price);
        System.out.println("TYPE : " +car_type);
        System.out.println("TRANSMISSION : " +car_transmission);
    }

    public void set_details() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("================================== *** ENTER CAR DETAILS *** ==================================");
        System.out.println();
        System.out.print("CAR NAME : ");
        car_name = scanner.nextLine();
        System.out.print("CAR COLOR : ");
        car_color = scanner.nextLine();
        System.out.print("CAR FUEL TYPE : ");
        car_fuel_type = scanner.nextLine();
        System.out.print("CAR PRICE : ");
        car_price = scanner.nextInt();
        System.out.print("CAR TYPE (SEDAN/SUX/HATCHBACK) : " );
        car_type = scanner.nextLine();
        scanner.nextLine();
        System.out.print("TRANSMISSION TYPE (AUTOMATIC/MANUAL) : ");
        car_transmission = scanner.nextLine();
    }
}