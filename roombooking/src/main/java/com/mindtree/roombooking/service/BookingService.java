package com.mindtree.roombooking.service;

import java.util.List;

import com.mindtree.roombooking.entity.Booking;
import com.mindtree.roombooking.entity.User;

public interface BookingService {

	void insertbookingdetails(Booking booking, String userName);

	List<Booking> getbookings(String userName);

	List<Booking> getbookinglist();

	void setbookings(int bookingId, String bookingFrom, String bookingTo, int bookingDistance, String dOJ);

	

	

}
