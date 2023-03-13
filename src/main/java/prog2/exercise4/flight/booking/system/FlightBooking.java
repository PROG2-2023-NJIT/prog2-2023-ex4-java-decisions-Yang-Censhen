package prog2.exercise4.flight.booking.system;

import java.util.Random;
import java.time.LocalDate;
import java.util.Date;

public class FlightBooking{
    private BookingClass bookingClass;
    private String FlightCompany;
    private LocalDate DepartureDate;
    private LocalDate ReturnDate;
    private TripSource tripSource;
    private TripDestination tripDestination;
    private String SourceAirport;
    private String DestinationAirport;
    private SourceAirport sourceAirport;
    private DestinationAirport destinationAirport;
    private String PassengerFullName;
    private String TicketNumber;
    private int ChildPassengers;
    private int AdultPassengers;
    private int TotalPassengers;
    private double TotalTicketPrice;
    private double DepartingTicketPrice;
    private double ReturnTicketPrice;
    private TripType tripType;
    private int TripDate;

    public FlightBooking(String aNull,LocalDate depart,LocalDate returnDate,int X,int Y){
        this.PassengerFullName=aNull;
        this.DepartureDate=depart;
        this.ReturnDate=returnDate;
        this.ChildPassengers=X;
        this.AdultPassengers=Y;
    }

    String sdepart="2023-03-04";
    LocalDate departureDate = LocalDate.parse(sdepart);

    String sreturn="2023-03-05";
    LocalDate returnDate = LocalDate.parse(sreturn);

    enum BookingClass{
        FIRST,BUSINESS,ECONOMY
    }
    public void setBookingClass(String bookingclass){
        switch(bookingclass){
            case "1":
                this.bookingClass=bookingClass.FIRST;
                break;
            case "2":
                this.bookingClass=bookingClass.BUSINESS;
                break;
            case "3":
                this.bookingClass=bookingClass.ECONOMY;
                break;
            default:
        }
    }

    enum TripType {
        ONE_WAY,RETURN
    }
    public void setTripType(String triptype){
        switch(triptype){
            case "1":
                this.tripType=tripType.ONE_WAY;
                break;
            case "2":
                this.tripType=tripType.RETURN;
                break;
            default:
        }
    }
    enum TripSource{
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS;
    }
    public TripSource getTripSource(){
        return tripSource;
    }
    public void setTripSource(String source){
        switch(source){
            case "1":
                this.tripSource=tripSource.NANJING;
                break;
            case "2":
                this.tripSource=tripSource.BEIJING;
                break;
            case "3":
                this.tripSource=tripSource.SHANGHAI;
                break;
            case "4":
                this.tripSource=tripSource.OULU;
                break;
            case "5":
                this.tripSource=tripSource.HELSINKI;
                break;
            case "6":
                this.tripSource=tripSource.PARIS;
                break;
            default:
        }
    }
    enum TripDestination{
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS;
    }
    public TripDestination getTripDestination(){
        return tripDestination;
    }
    public void setTripDestination(String tripdestination,String tripdestination2){

        switch(tripdestination){
            case "1":
                this.tripDestination=tripDestination.NANJING;
                break;
            case "2":
                this.tripDestination=tripDestination.BEIJING;
                break;
            case "3":
                this.tripDestination=tripDestination.SHANGHAI;
                break;
            case "4":
                this.tripDestination=tripDestination.OULU;
                break;
            case "5":
                this.tripDestination=tripDestination.HELSINKI;
                break;
            case "6":
                this.tripDestination=tripDestination.PARIS;
                break;
            default:
        }
    }
    enum SourceAirport{
        NanjingLuKouInternationalAirport,BeijingCapitalInternationalAirport,
        ShanghaiPuDongInternationalAirport,OuLuAirport,HelsinkiAirport,ParisCharlesdeGaulleAirport;
    }
    public String getSourceAirport(){
        return SourceAirport;
    }
    public void setSourceAirport(String sourceAirport){
        if (tripSource==tripSource.NANJING){
            this.SourceAirport="Nanjing LuKou International Airport";
        }
        if (tripSource==tripSource.BEIJING){
            this.SourceAirport="Beijing Capital International Airport";
        }
        if (tripSource==tripSource.SHANGHAI){
            this.SourceAirport="Shanghai PuDong International Airport";
        }
        if (tripSource==tripSource.OULU){
            this.SourceAirport="OuLu Airport";
        }
        if (tripSource==tripSource.HELSINKI){
            this.SourceAirport="Helsinki Airport";
        }
        if (tripSource==tripSource.PARIS){
            this.SourceAirport="Paris Charles de Gaulle Airport";
        }
    }
    enum DestinationAirport{
        NanjingLuKouInternationalAirport,BeijingCapitalInternationalAirport,
        ShanghaiPuDongInternationalAirport,OuLuAirport,HelsinkiAirport,ParisCharlesdeGaulleAirport;
    }
    public String getDestinationAirport(){
        return DestinationAirport;
    }
    public void setDestinationAirport(String destinationAirport){
        DestinationAirport=String.valueOf(tripDestination);
        if (tripDestination==tripDestination.NANJING){
            this.DestinationAirport="Nanjing LuKou International Airport";
        }
        if (tripDestination==tripDestination.SHANGHAI){
            this.DestinationAirport="Beijing Capital International Airport";
        }
        if (tripDestination==tripDestination.SHANGHAI){
            this.DestinationAirport="Shanghai PuDong International Airport";
        }
        if (tripDestination==tripDestination.OULU){
            this.DestinationAirport="OuLu Airport";
        }
        if (tripDestination==tripDestination.HELSINKI){
            this.DestinationAirport="Helsinki Airport";
        }
        if (tripDestination==tripDestination.PARIS){
            this.DestinationAirport="Paris Charles de Gaulle Airport";
        }
    }
    public int getTripDate(){
        return TripDate;
    }
    public void setTripDate(int tripDate){
           /*long u=departureDate.toEpochDay()-returnDate.toEpochDay();
           if(u>=1&&u<2){
    LocalDate returnDate=departureDate.plusDays(1);
           }else if(u>=0&&u<1){
    LocalDate returnDate=departureDate.plusDays(2);
           }*/
    }
    public String getFlightCompany(){
        return FlightCompany;
    }
    public void setFlightCompany(String FlightCompany){
        this.FlightCompany=FlightCompany;
    }
    public String getTicketNumber(){
        return TicketNumber;
    }
    public void setTicketNumber(String TicketNumber){
        this.TicketNumber=TicketNumber;
}
    public LocalDate getDepartureDate(){
        return DepartureDate;
    }
    public void setDepartureDate(LocalDate departureDate){
        String sdepart="2023-03-04";
        this.DepartureDate=LocalDate.parse(sdepart);
    }
    public LocalDate getReturnDate(){
        return ReturnDate;
    }
    public void setReturnDate(LocalDate returnDate){
        String sreturn = "2023-03-05";
        this.ReturnDate = DepartureDate.plusDays(2);
        /*long u=departureDate.toEpochDay()-returnDate.toEpochDay();
           if(u>=1&&u<2){
    LocalDate returnDate=departureDate.plusDays(1);
           }else if(u>=0&&u<1){
    LocalDate returnDate=departureDate.plusDays(2);
           }*/
    }
    public String getPassengerFullName(){
        return PassengerFullName;
    }
    public void setPassengerFullName(String PassengerFullName){
        this.PassengerFullName=PassengerFullName;
    }
    public int getTotalPassengers(){
        return TotalPassengers;
    }
    public void setTotalPassengers(int tp1, int tp2){
        this.TotalPassengers=ChildPassengers+AdultPassengers;
    }
    public double getDepartingTicketPrice(){
        return DepartingTicketPrice;
    }
    public void setDepartingTicketPrice(int cpp1, int app1) {
        this.DepartingTicketPrice=DepartingTicketPrice;
    }
    public double getReturnTicketPrice(){
        return ReturnTicketPrice;
    }
    public void setReturnTicketPrice(){
        this.ReturnTicketPrice=ReturnTicketPrice;
    }
    public double getTotalTicketPrice(){
        return TotalTicketPrice;
    }
    public void setTotalTicketPrice(){
        this.TotalTicketPrice=Math.abs((((2*((300+(0.1*300))+(0.05*300)))+(5*((300+(0.1*300))+(0.05*300))))+250)*2);
    }

    public String toString() {
        return "Dear " + PassengerFullName + ". Thank you for booking your flight with " +
                FlightCompany + ". \nFollowing are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + TicketNumber + "\n" +
                "From " + tripSource + " to " + TripDestination.values().toString() + "\n" +
                "Date of departure: " + DepartureDate + "\n" +
                "Date of return: " + ReturnDate + "\n" +
                "Total passengers: " + TotalPassengers + "\n" +
                "Total ticket price in Euros: " + TotalTicketPrice;
    }
    public void setTicketNumber() {
        String ticketNumber = null;
        switch (tripType) {
            case ONE_WAY:
                ticketNumber = "11";
                break;
            case RETURN:
                ticketNumber = "22";
                break;
        }
    Random random = new Random();
        switch (bookingClass){
            case FIRST:
                ticketNumber=ticketNumber + "F";
                break;
            case BUSINESS:
                ticketNumber=ticketNumber + "B";
                break;
            case ECONOMY:
                ticketNumber=ticketNumber + "E";
                break;
        }
        for (int q=0;q<4;q++){
            char g=(char)((random.nextInt(26)+65));
            ticketNumber=ticketNumber+g;
        }
        this.TicketNumber = ticketNumber + "DOM";
        if (tripSource == tripSource.NANJING && tripDestination == tripDestination.BEIJING) {
            this.TicketNumber = ticketNumber + "DOM";
        }
        if (tripSource == tripSource.BEIJING && tripDestination == tripDestination.NANJING) {
            this.TicketNumber = ticketNumber + "DOM";
        }
        if (tripSource == tripSource.OULU && tripDestination == tripDestination.HELSINKI) {
            this.TicketNumber = ticketNumber + "DOM";
        }
        if (tripSource == tripSource.HELSINKI && tripDestination == tripDestination.OULU) {
            this.TicketNumber = ticketNumber + "DOM";
        }
        if (tripSource == tripSource.NANJING && tripDestination == tripDestination.OULU) {
            this.TicketNumber = ticketNumber + "INT";
        }
        if (tripSource == tripSource.OULU && tripDestination == tripDestination.NANJING) {
            this.TicketNumber = ticketNumber + "INT";
        }
        if (tripSource == tripSource.NANJING && tripDestination == tripDestination.HELSINKI) {
            this.TicketNumber = ticketNumber + "INT";
        }
        if (tripSource == tripSource.HELSINKI && tripDestination == tripDestination.NANJING) {
            this.TicketNumber = ticketNumber + "INT";
        }
        if (tripSource == tripSource.BEIJING && tripDestination == tripDestination.OULU) {
            this.TicketNumber = ticketNumber + "INT";
        }
        if (tripSource == tripSource.OULU && tripDestination == tripDestination.BEIJING) {
            this.TicketNumber = ticketNumber + "INT";
        }
        if (tripSource == tripSource.BEIJING && tripDestination == tripDestination.NANJING) {
            this.TicketNumber = ticketNumber + "INT";
        }
        if (tripSource == tripSource.HELSINKI && tripDestination == tripDestination.BEIJING) {
            this.TicketNumber = ticketNumber + "INT";
        }
    }

    private ConfirmationMessage confirmationMessage;
    enum ConfirmationMessage{
        CHANGE,SAVE
    }

    public void setConfirmationMessage(String confirmationmessage) {
        switch (confirmationmessage) {
            case "1":
                this.confirmationMessage = confirmationMessage.CHANGE;
                System.out.println("Thank you for booking your flight with " + FlightCompany + ". Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + TicketNumber + "\n" +
                        "Passenger Name: " + PassengerFullName + "\n" +
                        "From TripSource to " + TripDestination.values().toString() + "\n" +
                        "Date of departure: " + DepartureDate + "\n" +
                        "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
                        ReturnDate + ")\n" +
                        "Total passengers: " + TotalPassengers + "\n" +
                        "Total ticket price in Euros: " + TotalTicketPrice + "\n" +
                        "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                        "less than two days apart from your departure date");
                break;
            case "2":
                this.confirmationMessage = confirmationMessage.SAVE;
                System.out.println("Thank you for booking your flight with " + FlightCompany + ".Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + TicketNumber + "\n" +
                        "Passenger Name: " + PassengerFullName + "\n" +
                        "From TripSource to " + TripDestination.values().toString() + "\n" +
                        "Date of departure: " + DepartureDate + "\n" +
                        "Date of return: " + ReturnDate + "\n" +
                        "Total passengers: " + TotalPassengers + "\n" +
                        "Total ticket price in Euros: " + TotalTicketPrice + "\n");
                break;
        }
    }
}
















