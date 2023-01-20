package com.onlinebusadda.serviceImpl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onlinebusadda.exception.AdminException;
import com.onlinebusadda.exception.BusException;
import com.onlinebusadda.exception.ReservationException;
import com.onlinebusadda.exception.UserException;
import com.onlinebusadda.model.Bus;
import com.onlinebusadda.model.CurrentUserSession;
import com.onlinebusadda.model.Reservation;
import com.onlinebusadda.model.User;
import com.onlinebusadda.repository.BusRepo;
import com.onlinebusadda.repository.ReservationRepo;
import com.onlinebusadda.repository.SessionRepo;
import com.onlinebusadda.repository.UserRepo;
import com.onlinebusadda.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Override
	public Reservation addReservation(Reservation reservation, Integer busId, Integer userLoginId)
			throws ReservationException, BusException, UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation deleteReservation(Integer reservationId, String key)
			throws ReservationException, BusException, UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation viewReservation(Integer reservationId, String key) throws ReservationException, AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> viewAllReservation(String key) throws ReservationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> getAllReservation(LocalDate date) throws ReservationException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
