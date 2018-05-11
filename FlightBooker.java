public class FlightBooker {

    private String name, from, to, fligth[] = {"Garuda Indonesia", "Lion", "Air Asia"};
    private int passg, flightChosen;

    public FlightBooker(String name, String from, String to, int passg) {
        this.name = name;
        this.from = from;
        this.to = to;
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
        System.out.println("Flight Name : " + getFlightName());
        System.out.println("======================================================");
        System.out.println("Yay, The " + getFlightName() + " Flight has been Booked");
        System.out.println("======================================================");
    }

    public void flightSearchResult() {
        System.out.println("=========Flight Result=========");
    }

    public void setFlightChosen(int flightChosen) {
        this.flightChosen = flightChosen;
    }

    public int getFlightChosen() {
        return flightChosen;
    }

    private String getFlightName() {
        int flightID = getFlightChosen() - 1;
        String flightName;
        switch (flightID) {
            case 0:
                flightName = fligth[flightID];
                break;
            case 1:
                flightName = fligth[flightID];
                break;
            case 2:
                flightName = fligth[flightID];
                break;
            default:
                flightName = "Error";
                break;
        }
        return flightName;
    }

    public void getFlightResultFound() {
        int i = 1;
        for (String flight : getFligth()) {
            System.out.println(i + ". " + flight);
            i++;
        }
        System.out.println("=====================================");
    }

    public void getFlightResultNotFound() {
        System.out.println("Whoops! Sorry, There is no Flight Found");
        System.out.println("=====================================");
    }

    private String[] getFligth() {
        return fligth;
    }
}
