package com.mindtree.roombooking.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int userId;
private String userName;
private int userAge;
@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
private List<Booking>bookings;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int userId, String userName, int userAge, List<Booking> bookings) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userAge = userAge;
	this.bookings = bookings;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getUserAge() {
	return userAge;
}
public void setUserAge(int userAge) {
	this.userAge = userAge;
}
public List<Booking> getBookings() {
	return bookings;
}
public void setBookings(List<Booking> bookings) {
	this.bookings = bookings;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", bookings=" + bookings
			+ "]";
}

}
