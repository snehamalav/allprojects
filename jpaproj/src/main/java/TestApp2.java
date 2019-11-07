import hibernate.jpaproj.dao.ServiceDao;
import hibernate.jpaproj.model.Places;

public class TestApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Places place=new Places();
place.setPlaceid(100);
Places p=new ServiceDao().getPlace(place);
if(p==null){
	System.out.println("not found");
}
else
{
	System.out.println(p.getPlacename());
}

System.exit(0);
	}

}
