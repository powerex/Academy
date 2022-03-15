import model.Trip;
import service.TripService;

public class Application {

    public static void main(String[] args) {
        TripService tripService = new TripService();
        Trip trip = new Trip();
        tripService.saveTrip(trip);
    }

}
