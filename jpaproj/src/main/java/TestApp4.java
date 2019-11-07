
import java.util.Date;

import hibernate.jpaproj.dao.ServiceDao;
import hibernate.jpaproj.model.Booking;
import hibernate.jpaproj.model.Flight;

public class TestApp4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight flight = new Flight();
		flight.setFlightid(86);
		flight.setAirline("GoAijj");
		flight.setSource("Lucknof");
		flight.setDestination("Hydd");
		
		Booking b1 = new Booking();
		b1.setBookingid(86);
		b1.setPname("fii");
		b1.setPage(15);
		b1.setBookingdate(new Date());
		
		Booking b2 = new Booking();
		b2.setBookingid(166);
		b2.setPname("bob");
		b2.setPage(18);
		b2.setBookingdate(new Date());
		
		flight.getBookinglist().add(b1);
		flight.getBookinglist().add(b2);
		
		boolean flag = new ServiceDao().addFlight(flight);
		System.out.println(flag);
		System.exit(0);
	}

}
