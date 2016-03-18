package org.o7planning.restcontroller;

import java.util.List;

import org.jboss.logging.Logger;
import org.o7planning.controller.HotelController;
import org.o7planning.dao.HotelDAO;
import org.o7planning.entity.Hotel;
import org.o7planning.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@RestController
//@RequestMapping("/service")
public class RestServiceController {

//	private static final Logger logger = Logger.getLogger(HotelController.class);
//
//	public RestServiceController() {
//		System.out.println("RestServiceController()");
//	}
//	private HotelDAO hotelDAO;
//	
//	public void createHotel(Hotel hotel) {
//	 hotelDAO.createHotel(hotel);
//	}
//
//	@RequestMapping(value="/createHotel", method=RequestMethod.GET)
//	public ModelAndView createHotel(@ModelAttribute Hotel hotel) {
//		logger.info("Creating Employee. Data: " + hotel);
//		return new ModelAndView("hotelForm");
//	}
//	
//	
//	public Hotel updateHotel(Hotel hotel) {
//	return hotelDAO.updateHotel(hotel);
//	}
//
//	public void deleteHotel(int idhotel) {
//		hotelDAO.deleteHotel(idhotel);
//	}
//
//	public List<Hotel> getAllHotel() {
//	return hotelDAO.getAllHotel();
//	}
//
//	public Hotel getHotel(int idhotel) {
//	return hotelDAO.getHotel(idhotel);
//	} 
//
//	public List<Hotel> getAllHotel(String hotelName) {
//	return hotelDAO.getAllHotel(hotelName);
//	}
//	
//	
//	
//
//
//
//	@RequestMapping("editHotel")
//	public ModelAndView editHotel(@RequestParam int idhotel, @ModelAttribute Hotel hotel) {
//		logger.info("Updating the Employee for the Id " + idhotel);
//		hotel = hotelService.getHotel(idhotel);
//		return new ModelAndView("hotelForm", "hotelObject", hotel);
//	}
//
//	@RequestMapping("saveHotel")
//	public ModelAndView saveHotel(@ModelAttribute Hotel hotel) {
//		logger.info("Saving the Employee. Data : " + hotel);
//		if (hotel.getIdhotel() == 0) { // if employee id is 0 then creating the
//										// employee other updating the employee
//			hotelService.createHotel(hotel);
//		} else {
//			hotelService.updateHotel(hotel);
//		}
//		return new ModelAndView("redirect:getAllHotel");
//	}
//
//	@RequestMapping("deleteHotel")
//	public ModelAndView deleteHotel(@RequestParam int id) {
//		logger.info("Deleting the Employee. Id : " + id);
//		hotelService.deleteHotel(id);
//		return new ModelAndView("redirect:getAllHotel");
//	}
//
//	@RequestMapping(value = { "getAllHotel", "/" })
//	public ModelAndView getAllHotel() {
//		logger.info("Getting the all Employees.");
//		List<Hotel> hotelList = hotelService.getAllHotel();
//		return new ModelAndView("index", "hotelList", hotelList);
//	}
//
//	@RequestMapping("searchHotel")
//	public ModelAndView searchHotel(@RequestParam("searchName") String searchName) {
//		logger.info("Searching the Employee. Employee Names: " + searchName);
//		List<Hotel> hotelList = hotelService.getAllHotel(searchName);
//		return new ModelAndView("index", "hotelList", hotelList);
//	}
	
	
}
