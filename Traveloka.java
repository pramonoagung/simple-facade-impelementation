import java.util.Scanner;

public class Traveloka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelokaTerminal traveloka;
        String nameOfUser;
        System.out.println("===Sign In To Traveloka===");
        System.out.print("Username (user): ");
        String username = sc.nextLine();
        System.out.print("Password (user): ");
        String password = sc.nextLine();
        traveloka = new TravelokaTerminal(username, password);
        if (traveloka.isAccountValid()) {
            nameOfUser = traveloka.getRealName();
            System.out.println("===Welcome To Traveloka===");
            System.out.println("Hi " + nameOfUser);
            System.out.println("==========================");
            menu(sc, traveloka, nameOfUser);
        } else {
            System.out.println("Login Failed");
            System.out.println("This credentials doesn't match our records");
        }
        System.out.println("Thank you for using Traveloka :)");
    }

    private static void menu(Scanner sc, TravelokaTerminal traveloka, String nameOfUser) {
        System.out.println("1. Hotel Booking");
        System.out.println("2. Flight Booking");
        System.out.print("Choose Menu : ");
        int menu = sc.nextInt();
        sc.nextLine();
        if (menu == 1) {
            System.out.println("===Hotel Booking==");
            System.out.print("Your name : " + nameOfUser);
            System.out.println();
            System.out.print("City Destination : ");
            String city = sc.nextLine();
            System.out.print("Duration (Day(s)) : ");
            int duration = sc.nextInt();
            sc.nextLine();
            traveloka = new TravelokaTerminal(nameOfUser, city, duration);
            if (traveloka.hotelCheck()) {
                if (traveloka.decision()) {
                    traveloka.booking();
                }
            }
        } else if (menu == 2) {
            System.out.println("===Flight Booking==");
            System.out.print("Your name : " + nameOfUser);
            System.out.println();
            System.out.print("From : ");
            String from = sc.nextLine();
            System.out.print("To : ");
            String to = sc.nextLine();
            System.out.print("Number of Passanger(s) : ");
            int passg = sc.nextInt();
            sc.nextLine();
            traveloka = new TravelokaTerminal(nameOfUser, from, to, passg);
            if (traveloka.flightCheck()) {
                traveloka.flightMenu();
                int chosen = traveloka.flightChosen();
                switch (chosen) {
                    case 1:
                        break;
                    case 2:
                        break;
                    default:
                        break;
                }
                if (traveloka.decision()) {
                    traveloka.booking();
                }
            }
        } else {
            System.out.println("Command Not found");
        }
    }
}
