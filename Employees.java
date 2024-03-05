import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements Utility {

    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    public void get_details() {

        System.out.println("ID : " +emp_id);
        System.out.println("NAME : " +emp_name);
        System.out.println("AGE : " +emp_age);
        System.out.println("DEPARTMENT : " +emp_department);
        System.out.println("SHOWROOM NAME : " +showroom_name);
    }

    public void set_details() {

        Scanner scanner = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        System.out.println("======================== *** ENTER EMPLOYEE DETAILS *** ========================");
        System.out.println();
        System.out.print("EMPLOYEE NAME : ");
        emp_name = scanner.nextLine();
        System.out.print("EMPLOYEE AGE : ");
        emp_age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT : ");
        emp_department = scanner.nextLine();
        System.out.print("SHOWROOM NAME : ");
        showroom_name = scanner.nextLine();
    }
}