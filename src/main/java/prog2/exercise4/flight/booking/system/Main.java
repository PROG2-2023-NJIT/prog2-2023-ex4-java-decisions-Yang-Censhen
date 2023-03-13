package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String sdepart = "2023-03-04";
        LocalDate depart = LocalDate.parse(sdepart);
        String sreturn = "2023-03-05";
        LocalDate returnDate = LocalDate.parse(sreturn);
        String random = "FOF"+Math.random();
        String sourceAirport = "NANJING LUKOU INTERNATIONAL AIRPORT";
        String destinationAirport = "OULU AIRPORT";
        FlightBooking fb = new FlightBooking("John Doe", depart, returnDate, 1, 3);
        int expResult = 4;
        fb.setTotalPassengers(1,3);
        int result = fb.getTotalPassengers();
        fb.setPassengerFullName("John Doe");
        fb.setTicketNumber();
        fb = new FlightBooking(null, null, null, 0, 0);
        fb.setTripSource("2") ;
        fb.setTripDestination("OULU"," Helsinki");
        fb.setFlightCompany("Flights-of-Fancy");
        fb.setDepartureDate(LocalDate.parse("2023-03-04"));
        fb.setReturnDate(LocalDate.parse("2023-03-05"));


        System.out.println("Dear " + fb.getPassengerFullName() + ". Thank you for booking your flight with " +
                fb.getFlightCompany() + ".\n Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + fb.getTicketNumber() + "\n" +
                "From " + fb.getTripSource() + " to " + fb.getTripDestination() + "\n" +
                "Date of departure: " + fb.getDepartureDate() + "\n" +
                "Date of return: " + fb.getReturnDate() + "\n" +
                "Total passengers: " + fb.getTotalPassengers() + "\n" +
                "Total ticket price in Euros: " + fb.getTotalTicketPrice());


    }
}