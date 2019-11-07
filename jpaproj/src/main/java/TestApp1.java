import hibernate.jpaproj.dao.ServiceDao;
import hibernate.jpaproj.model.Places;

public class TestApp1 {

	public static void main(String[] args) {
		Places places =new Places();
		places.setLocation("delhi");
		places.setPlacename("red fort");
		places.setPlaceid(100);
		
		boolean flag=new ServiceDao().addPlace(places);
		System.out.println(flag);

	}

}
