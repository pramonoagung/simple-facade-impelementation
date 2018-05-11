import java.util.Scanner;

public class TravelokaTerminal {
    private String name, city, from, to, username, password;
    private int duration, bookingType, passg;

    HotelBooker hotel;
    FlightBooker flight;
    Account account;
    Scanner sc = new Scanner(System.in);

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TravelokaTerminal(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAccountValid() {
        account = new Account();
        if (account.getUsername().equalsIgnoreCase(getUsername()) && account.getPassword().equalsIgnoreCase(getPassword())) {
            return true;
        } else {
            return false;
        }
    }

    public String getRealName() {
        return account.getRealName();
    }

    public TravelokaTerminal(String name, String city, int duration) {
        setName(name);
        setCity(city);
        setDuration(duration);
        hotel = new HotelBooker(getName(), getCity(), getDuration());
        this.bookingType = 1;
        searching();
    }

    public TravelokaTerminal(String name, String from, String to, int passg) {
        this.bookingType = 2;
        setName(name);
        setFrom(from);
        setTo(to);
        setPassg(passg);
        searching();
        flight = new FlightBooker(name, from, to, passg);
    }

    public boolean hotelCheck() {
        if (hotel.hotelAvailability() == 1) {
            hotel.hotelSearchResult();
            hotel.getHotelResultFound();
            return true;
        } else {
            hotel.hotelSearchResult();
            hotel.getHotelResultNotFound();
            return false;
        }
    }

    public boolean flightCheck() {
        if (flight.flightAvailability() == 1) {
            flight.flightSearchResult();
            flight.getFlightResultFound();
            return true;
        } else {
            flight.flightSearchResult();
            flight.getFlightResultNotFound();
            return false;
        }
    }

    public void booking() {
        String typeOfBooking = getState();
        switch (typeOfBooking) {
            case "hotel":
                hotel.booker();
                break;
            case "flight":
                flight.booker();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public String getState() {
        if (bookingType == 1) {
            return "hotel";
        } else {
            return "flight";
        }
    }

    public boolean decision() {
        System.out.print("Want to booking that (y/n)? ");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public void flightMenu() {
        int chosen = 0;
        try {
            System.out.print("Flight u want : ");
            chosen = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Input must be number");
            flightMenu();
        }
        flight.setFlightChosen(chosen);
    }

    public int flightChosen() {

        return 1;
    }

    private void searching() {
        System.out.println("Searching...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getDuration() {
        return duration;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setPassg(int passg) {
        this.passg = passg;
    }
}
