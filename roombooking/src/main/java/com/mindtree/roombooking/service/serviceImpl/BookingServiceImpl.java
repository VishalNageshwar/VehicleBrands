package com.mindtree.roombooking.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.roombooking.entity.Booking;
import com.mindtree.roombooking.entity.User;
import com.mindtree.roombooking.repository.BookingRepository;
import com.mindtree.roombooking.repository.UserRepository;
import com.mindtree.roombooking.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	UserRepository userrepo;
	@Autowired
	BookingRepository bookingrepo;

	@Override
	public void insertbookingdetails(Booking booking, String userName) {
		User user = userrepo.findByuserName(userName);
		booking.setUser(user);
		int bookingprice = booking.getBookingDistance() * 10;
		if (user.getUserAge() > 30 && user.getUserAge() <= 50) {
			booking.setBookingPrice((int) (bookingprice -( (0.05) * bookingprice)));
			bookingrepo.saveAndFlush(booking);
		} else if (user.getUserAge() > 50) {
			booking.setBookingPrice((int)(bookingprice - ((0.1) * bookingprice)));
			bookingrepo.saveAndFlush(booking);
		} else {
			booking.setBookingPrice(bookingprice);
			bookingrepo.saveAndFlush(booking);

		}
	
	

	}

	@Override
	public List<Booking> getbookings(String userName) {
		User user=userrepo.findByuserName(userName);
		List<Booking>bookings=user.getBookings();
		return bookings;
	}

	@Override
	public List<Booking> getbookinglist() {
		List<Booking>bookinglist=bookingrepo.findAll();
		return bookinglist;
	}

	@Override
	public void setbookings(int bookingId,  String bookingFrom, String bookingTo, int bookingDistance,
			String dOJ) {
		Booking booking1=bookingrepo.findById(bookingId).get();
		User user=booking1.getUser();
		booking1.setBookingFrom(bookingFrom);
		booking1.setBookingTo(bookingTo);
		booking1.setBookingDistance(bookingDistance);
		booking1.setDOJ(dOJ);
		booking1.setUser(user);
		int bookingprice = booking1.getBookingDistance() * 10;
		if (user.getUserAge() > 30 && user.getUserAge() <= 50) {
			booking1.setBookingPrice((int) (bookingprice -( (0.05) * bookingprice)));
			bookingrepo.saveAndFlush(booking1);
		} else if (user.getUserAge() > 50) {
			booking1.setBookingPrice((int)(bookingprice - ((0.1) * bookingprice)));
			bookingrepo.saveAndFlush(booking1);
		} else {
			booking1.setBookingPrice(bookingprice);
			bookingrepo.saveAndFlush(booking1);

		}
		
	}

	

	
	
}
