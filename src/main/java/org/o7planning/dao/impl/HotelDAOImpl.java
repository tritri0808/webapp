package org.o7planning.dao.impl;

import java.util.ArrayList;
import java.util.List;


import org.o7planning.configuration.HibernateUtil;
import org.o7planning.dao.HotelDAO;
import org.o7planning.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HotelDAOImpl implements HotelDAO {
	
	public HotelDAOImpl() {
		System.out.println("HotelDAOImpl");
		}

		@Autowired
		private HibernateUtil hibernateUtil;


		public void createHotel(Hotel hotel) { 
		hibernateUtil.create(hotel);
		}

		
		public Hotel updateHotel(Hotel hotel) { 
		return hibernateUtil.update(hotel);
		}

		
		public void deleteHotel(int idhotel) {
		Hotel hotel = new Hotel();
		hotel.setIdhotel(idhotel);
		hibernateUtil.delete(hotel);
		}

		
		public List<Hotel> getAllHotel() { 
		return hibernateUtil.fetchAll(Hotel.class);
		}

		
		public Hotel getHotel(int idhotel) {
		return hibernateUtil.fetchById(idhotel, Hotel.class);
		}
		
		@SuppressWarnings("unchecked")

		public List<Hotel> getAllHotel(String hotelName) { 
		String query = "SELECT e.* FROM Hotel e WHERE e.namehotel like '%"+ hotelName +"%';";
		List<Object[]> hotelObjects = hibernateUtil.fetchAll(query);
		List<Hotel> hotels = new ArrayList<Hotel>();
		for(Object[] hotelObject: hotelObjects) {
			Hotel hotel = new Hotel();
		int idhotel = (int) hotelObject[0];
		String namehotel = (String) hotelObject[1];
		String namelocal = (String) hotelObject[2];
		String namecity = (String) hotelObject[3];
		int countreview = (int) hotelObject[4];
		int rank = (int) hotelObject[5];
		float star = (float) hotelObject[6];
		String description = (String) hotelObject[7];
		String phone = (String) hotelObject[8];
		String website = (String) hotelObject[9];
		String address = (String) hotelObject[10];
		String email = (String) hotelObject[11];
		String status = (String) hotelObject[12];
		int quantityroom = (int) hotelObject[13];
		String cooperation1 = (String) hotelObject[14];
		String cooperation2 = (String) hotelObject[15];
		String cooperation3 = (String) hotelObject[16];
		String cooperation4 = (String) hotelObject[17];
		String cooperation5 = (String) hotelObject[18];
		String cooperation6 = (String) hotelObject[19];
		 
		hotel.setIdhotel(idhotel);
		hotel.setNamehotel(namehotel);
		hotel.setNamelocal(namelocal);
		hotel.setNamecity(namecity);
		hotel.setCountreview(countreview);
		hotel.setRank(rank);
		hotel.setStar(star);
		hotel.setDescription(description);
		hotel.setPhone(phone);
		hotel.setWebsite(website);
		hotel.setAddress(address);
		hotel.setEmail(email);
		hotel.setStatus(status);
		hotel.setQuantityroom(quantityroom);
		hotel.setCooperation1(cooperation1);
		hotel.setCooperation2(cooperation2);
		hotel.setCooperation3(cooperation3);
		hotel.setCooperation4(cooperation4);
		hotel.setCooperation5(cooperation5);
		hotel.setCooperation6(cooperation6);
		hotels.add(hotel);
		}
		System.out.println(hotels);
		return hotels;
		}
		}