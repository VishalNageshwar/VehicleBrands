package com.mindtree.roombooking.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Booking {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int bookingId;
private String bookingFrom;
private String bookingTo;
private String DOJ;
private int bookingDistance;
private int bookingPrice;
@ManyToOne
private User user;
public Booking() {
	super();
	// TODO Auto-generated constructor stub
}
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public String getBookingFrom() {
	return bookingFrom;
}
public void setBookingFrom(String bookingFrom) {
	this.bookingFrom = bookingFrom;
}
public String getBookingTo() {
	return bookingTo;
}
public void setBookingTo(String bookingTo) {
	this.bookingTo = bookingTo;
}
public String getDOJ() {
	return DOJ;
}
public void setDOJ(String dOJ) {
	DOJ = dOJ;
}
public int getBookingDistance() {
	return bookingDistance;
}
public void setBookingDistance(int bookingDistance) {
	this.bookingDistance = bookingDistance;
}
public int getBookingPrice() {
	return bookingPrice;
}
public void setBookingPrice(int bookingPrice) {
	this.bookingPrice = bookingPrice;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Booking(int bookingId, String bookingFrom, String bookingTo, String dOJ, int bookingDistance, int bookingPrice,
		User user) {
	super();
	this.bookingId = bookingId;
	this.bookingFrom = bookingFrom;
	this.bookingTo = bookingTo;
	DOJ = dOJ;
	this.bookingDistance = bookingDistance;
	this.bookingPrice = bookingPrice;
	this.user = user;
}


}
