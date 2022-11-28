import java.util.Arrays;

public class Flight {

    String flightId;
    String flightDestination;
    String flightSource;
    boolean is_Direct;
    boolean is_Transit;

    int maxPassengers;

    float ticketPrice;

    String passengersList[];


    public void setFlightSource(String flightSource) {
        this.flightSource = flightSource;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public void setIs_Transit(boolean Transit) {
        is_Transit = Transit;
    }

    public void setFlightId(String Id) {
        this.flightId = Id;
    }

    public void totalPassengers(int maxPassengersNumber ){

        passengersList = new String[maxPassengersNumber];
        maxPassengers = maxPassengersNumber;

    }

    public void addPassenger(String passengerName, int seatId){
        passengersList[seatId] = passengerName;
        System.out.println("passenger added ");
    }

    public int numberOfAvailableSeats(){
int count=0;
        for (String passenger: passengersList) {

            if (passenger ==  null){

                count+=1;
            }

        }
        return count;
    }



    public void removePassenger(String passengerName, int seatId){
        passengersList[seatId] = null;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float Price) {
        ticketPrice = Price;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public String[] getPassengersList() {
        return passengersList;
    }


    public String getFlightDestination() {
        return flightDestination;
    }

    public String getFlightSource() {
        return flightSource;
    }


}
