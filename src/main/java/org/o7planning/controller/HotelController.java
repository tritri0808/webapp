package org.o7planning.controller;

import java.util.List;


import org.jboss.logging.Logger;
import org.o7planning.entity.Hotel;
import org.o7planning.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by SONY on 12/17/2015.
 */
@Controller
public class HotelController {

	private static final Logger logger = Logger.getLogger(HotelController.class);

	public HotelController() {
		System.out.println("HotelController()");
	}

	@Autowired
	private HotelService hotelService;

	@RequestMapping("createHotel")
	public ModelAndView createHotel(@ModelAttribute Hotel hotel) {
		logger.info("Creating Employee. Data: " + hotel);
		return new ModelAndView("hotelForm");
	}

	@RequestMapping("editHotel")
	public ModelAndView editHotel(@RequestParam int idhotel, @ModelAttribute Hotel hotel) {
		logger.info("Updating the Employee for the Id " + idhotel);
		hotel = hotelService.getHotel(idhotel);
		return new ModelAndView("hotelForm", "hotelObject", hotel);
	}

	@RequestMapping("saveHotel")
	public ModelAndView saveHotel(@ModelAttribute Hotel hotel) {
		logger.info("Saving the Employee. Data : " + hotel);
		if (hotel.getIdhotel() == 0) { // if employee id is 0 then creating the
										// employee other updating the employee
			hotelService.createHotel(hotel);
		} else {
			hotelService.updateHotel(hotel);
		}
		return new ModelAndView("redirect:getAllHotel");
	}

	@RequestMapping("deleteHotel")
	public ModelAndView deleteHotel(@RequestParam int id) {
		logger.info("Deleting the Employee. Id : " + id);
		hotelService.deleteHotel(id);
		return new ModelAndView("redirect:getAllHotel");
	}

	@RequestMapping(value = { "getAllHotel", "/" })
	public ModelAndView getAllHotel() {
		logger.info("Getting the all Employees.");
		List<Hotel> hotelList = hotelService.getAllHotel();
		return new ModelAndView("index", "hotelList", hotelList);
	}

	@RequestMapping("searchHotel")
	public ModelAndView searchHotel(@RequestParam("searchName") String searchName) {
		logger.info("Searching the Employee. Employee Names: " + searchName);
		List<Hotel> hotelList = hotelService.getAllHotel(searchName);
		return new ModelAndView("index", "hotelList", hotelList);
	}
}