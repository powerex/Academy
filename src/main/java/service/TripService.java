package service;

import dao.TripDao;
import model.Trip;

public class TripService {

    private TripDao tripsDao = new TripDao();

    public Trip findTrip(int id) {
        return tripsDao.findById(id);
    }

    public void saveTrip(Trip user) {
        tripsDao.save(user);
    }

}
