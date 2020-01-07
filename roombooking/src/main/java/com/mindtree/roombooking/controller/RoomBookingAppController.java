package com.mindtree.roombooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.roombooking.entity.Booking;
import com.mindtree.roombooking.entity.User;
import com.mindtree.roombooking.service.BookingService;
import com.mindtree.roombooking.service.UserService;

@Controller
public class RoomBookingAppController {

	@Autowired
	UserService userservice;
	@Autowired
	BookingService bookingservice;

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	
	@RequestMapping("/insertuser")
	public String insertdetails(User user) {
		userservice.insertUser(user);
		return "index";
	}

	@RequestMapping("/travellingbooking")
	public String travellingbooking(Model model) {
		List<User> userlist = userservice.getUserlist();
		model.addAttribute("user", userlist);
		return "travellingbooking";
	}

	@PostMapping("/insertbookingdetails")
	public String insertdetails(@RequestParam("userName") String userName, @ModelAttribute Booking booking) {
		bookingservice.insertbookingdetails(booking, userName);
		return "index";
	}
	@RequestMapping("/bookingdetails")
	public String bookingdetails(Model model) {
		List<User>userlist=userservice.getUserlist();
		model.addAttribute("user", userlist);		
		return "displaybookings";
	}
	@RequestMapping("/showbookingdetails")
	public String bookingdetails(@RequestParam String userName,Model model) {
		List<Booking>bookings=bookingservice.getbookings(userName);
		model.addAttribute("booking", bookings);
		return "bookingdetails";
	}
	@RequestMapping("/updatedetails")
	public String updatedetails(Model model) {
		List<Booking>bookings=bookingservice.getbookinglist();
		model.addAttribute("booking",bookings);
		return "updatepage";
	}
	@RequestMapping("/updatebooking")
	public String updatedetails(@RequestParam("bookingId")int bookingId,@RequestParam("bookingFrom")String bookingFrom,@RequestParam("bookingTo")String bookingTo,@RequestParam("DOJ")String DOJ,@RequestParam("bookingDistance")int bookingDistance) {
		bookingservice.setbookings(bookingId,bookingFrom,bookingTo,bookingDistance,DOJ);
		return "index";
	}

	
}
