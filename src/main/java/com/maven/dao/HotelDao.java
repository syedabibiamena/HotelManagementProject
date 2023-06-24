//method implementation of IHotelDao interface

package com.maven.dao;

import java.util.List;

import org.hibernate.*;

import com.maven.model.Hotel;
import com.maven.util.HibernateUtil;

public class HotelDao implements IHotelDao
{
	// save Hotel
    // get All Hotels
    // get Hotel By Id
    // Update Hotel
    // Delete Hotel
	
	public void saveHotel(Hotel hotel) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            // start the transaction
            transaction = session.beginTransaction();

            // save hotel object
            session.save(hotel);

            // commit the transaction
            transaction.commit();
        }
        catch (Exception e) 
        {
            if (transaction != null) 
            {
                transaction.rollback();
            }
        }
    }
	public void updateHotel(Hotel hotel) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save hotel object
            session.saveOrUpdate(hotel);

            // commit the transaction
            transaction.commit();
        } 
        catch (Exception e)
        {
            if (transaction != null)
            {
                transaction.rollback();
            }
        }
    }
	public Hotel getHotelById(long id) 
	{
        Transaction transaction = null;
        Hotel hotel = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get hotel object
            hotel = session.get(Hotel.class, id);
            //hotel = session.load(Hotel.class, id);
            // commit the transaction
            transaction.commit();
        } 
        catch (Exception e)
        {
            if (transaction != null)
            {
                transaction.rollback();
            }
        }
        return hotel;
    }
	//indicates the named complier warning should be suppressed
	@SuppressWarnings("unchecked")
    public List < Hotel > getAllHotels() 
	{
        Transaction transaction = null;
        List < Hotel > hotels = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get hotels
            hotels = session.createQuery("from Hotel").list();
            //hotel = session.load(Hotel.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return hotels;
    }
	public void deleteHotel(int id) {
        Transaction transaction = null;
        Hotel hotel = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            hotel = session.get(Hotel.class, id);
            // get hotel object
            session.delete(hotel);
            //hotel = session.load(Hotel.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
               // transaction.rollback();
            }
        }
    }
}
