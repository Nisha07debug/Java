package Level1ProgramingElement;

/*
Eric Travels from Chennai to Bangalore via Vellore.
 From Chennai to Vellore distance is 156.6 km
  and the time taken is 4 Hours and 4 Mins
   and from Vellore to Bangalore is 211.8 km
    and will take 4 Hours and 25 Mins.
     Compute the total distance and total time 
     from Chennai to Bangalore
 */
public class TravelComputation {
    public static void main(String[] args) {
        String name = "Eric";
        // creating the variable 
        String fromCity = "chennai";
        String viaCity = " vellore";
        String toCity = " bangalore";
        //   create  a varaiable to show the distance moving chennai to velore
        double distanceFromToVia = 156.6;
        // create a variable to show the time from chennai to vellore
        int timeFromToVia=4*60+4;
        //   create  a varaiable to show the distance moving chennai to velore
        double distanceViaToFinal = 211.8;
        // create a variable to show the time from  vellore to bamglore
        int timeViaToFinalCity =4*60+25;
        // caluclate total distance
        double totalDistance = distanceFromToVia+distanceViaToFinal;
        // calculate total time 
        int totalTime = timeFromToVia+timeViaToFinalCity;
        // print the details
        System.out.println("the total distance travel by  : " + name+ "from "   +fromCity+   " to "  + toCity +  " via " + viaCity + "  is "+totalDistance+ "total time taken : " +  totalTime  + "minutes ");

    }
}
