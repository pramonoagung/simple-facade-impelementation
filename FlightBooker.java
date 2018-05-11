public class FlightBooker {

    private String name, from, to, fligth = "Garuda Indonesia";
    private int passg;

    public FlightBooker(String name, String from, String to, int passg) {
        this.name = name;
        this.from = from;
        this.passg = passg;
    }

    public int flightAvailability() {
        return (int) (Math.random() * 2) + 0;
    }

    public void booker() {

        System.out.println("============ Detail Flight Booking ============");
        System.out.println("Name : " + this.name);
        System.out.println("From : " + this.from);
        System.out.println("To : " + this.to);
        System.out.println("Number of Passager(s) : " + this.passg);
        System.out.println("Flight Name : " + getFligth());
        System.out.println("======================================================");
        System.out.println("Yay, The " + getFligth() + " Hotel has been Booked");
        System.out.println("======================================================");
    }

    public void flightSearchResult() {
        System.out.println("=========Flight Result=========");
    }

    public void getFlightResultFound() {
        System.out.println("The Flight name is " + getFligth());
        System.out.println("=====================================");
    }

    public void getFlightResultNotFound() {
        System.out.println("Whoops! Sorry, There is no Flight Found");
        System.out.println("=====================================");
    }

    public String getFligth() {
        return fligth;
    }
}
