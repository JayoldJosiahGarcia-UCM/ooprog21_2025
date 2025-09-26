// A Trip has three constructors
// 1 argument: destination only
// 2 arguments: destination + departure city
// 3 arguments: destination + departure + mode of transport
public class DebugTrip {
   private String destination;
   private String departure;
   private String mode;
   private static final String DEFAULT_CITY = "Atlanta";
   private static final String DEFAULT_MODE = "car";

   public DebugTrip(String destination) {
      this(destination, DEFAULT_CITY, DEFAULT_MODE);
   }

   public DebugTrip(String destination, String departure) {

      this(destination, departure, DEFAULT_MODE);//the bug was it tried to call two constructors. 
                                                  // FIX: call the 3-arg constructor with default city and mode

   }

   public DebugTrip(String destination, String departure, String mode) {
      this.destination = destination;
      this.departure = departure;
      this.mode = mode;
   }

   public String getDestination() {
      return destination;
   }

   public String getDepartureCity() {
      return departure;
   }

   public String getMode() {
      return mode;
   }
}