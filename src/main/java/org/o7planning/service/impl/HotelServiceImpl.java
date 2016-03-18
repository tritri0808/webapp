package org.o7planning.service.impl;


import java.util.List;

import org.o7planning.dao.HotelDAO;
import org.o7planning.entity.Hotel;
import org.o7planning.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HotelServiceImpl implements HotelService {
	public HotelServiceImpl() {
		System.out.println("HotelServiceImpl()");
		}
		@Autowired
		private HotelDAO hotelDAO;


		public void createHotel(Hotel hotel) {
		 hotelDAO.createHotel(hotel);
		}

		public Hotel updateHotel(Hotel hotel) {
		return hotelDAO.updateHotel(hotel);
		}
	
		public void deleteHotel(int idhotel) {
			hotelDAO.deleteHotel(idhotel);
		}
	
		public List<Hotel> getAllHotel() {
		return hotelDAO.getAllHotel();
		}

		public Hotel getHotel(int idhotel) {
		return hotelDAO.getHotel(idhotel);
		} 

		public List<Hotel> getAllHotel(String hotelName) {
		return hotelDAO.getAllHotel(hotelName);
		}
}
