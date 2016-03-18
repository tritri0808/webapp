package org.o7planning.dao;

import java.util.List;

import org.o7planning.entity.Hotel;



public interface HotelDAO {

	public void createHotel(Hotel hotel);
	public Hotel updateHotel(Hotel hotel);
	public void deleteHotel(int idhotel);
	public List<Hotel> getAllHotel();
	public Hotel getHotel(int idhotel); 
	public List<Hotel> getAllHotel(String hotelName); 
}
