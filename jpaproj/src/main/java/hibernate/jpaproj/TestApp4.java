package hibernate.jpaproj;
import java.util.Date;

import hibernate.jpaproj.dao.ServiceDao;
import hibernate.jpaproj.model.Booking;
import hibernate.jpaproj.model.Flight;

public class TestApp4 {
public static void main(String args[])
{
	Flight flight=new Flight();
	flight.setFlightid("f1");
	flight.setAirline("airindia");
	flight.setSource("delhi");
	flight.setDestination("jaipur");
	
	Booking b1=new Booking();
	b1.setBookingdate(new Date());
	b1.setBookingid(1);
	b1.setPage(11);
	b1.setPname("sneha");
	
	Booking b2=new Booking();
	b2.setBookingdate(new Date());
	b2.setBookingid(2);
	b2.setPage(12);
	b2.setPname("anku");
	
	flight.getList().add(b1);
	flight.getList().add(b2);
	boolean flag=new ServiceDao().addFlight(flight);
	System.out.println(flag);
}
}
