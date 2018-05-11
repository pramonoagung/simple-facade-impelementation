public class HotelBooker {
    private int duration;
    private String name, city, hotelName = "SwissBel";

    public HotelBooker(String name, String city, int duration) {
        this.name = name;
        this.city = city;
        this.duration = duration;
    }

    public void booker() {
        System.out.println("============ Detail Hotel Booking ============");
        System.out.println("Name : " + this.name);
        System.out.println("City Destination : " + this.city);
        System.out.println("Duration : " + this.duration + " day(s)");
        System.out.println("Hotel Name : " + getHotelName());
        System.out.println("======================================================");
        System.out.println("Yay, The " + getHotelName() + " Hotel has been Booked");
        System.out.println("======================================================");
    }

    public void hotelSearchResult() {
        System.out.println("=========Hotel Result=========");
    }

    public void getHotelResultFound() {
        System.out.println("The Hotel name is " + getHotelName());
        System.out.println("=====================================");
    }

    public void getHotelResultNotFound() {
        System.out.println("Whoops! Sorry, There is no Hotel Found");
        System.out.println("=====================================");
    }

    public int hotelAvailability() {
        return (int) (Math.random() * 2) + 0;
    }

    public String getHotelName() {
        return hotelName;
    }

}
