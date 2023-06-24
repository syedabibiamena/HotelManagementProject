//interface used to define the methods
//Hotel - Entity class
//hotel- object of entity class Hotel
//List - interface 
package com.maven.dao;

import java.util.List;

import com.maven.model.Hotel;

public interface IHotelDao 
{
	void saveHotel(Hotel hotel);

	void updateHotel(Hotel hotel);

	Hotel getHotelById(long id);

	List<Hotel> getAllHotels();

	void deleteHotel(int id);
}
