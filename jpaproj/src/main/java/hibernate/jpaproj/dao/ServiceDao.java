package hibernate.jpaproj.dao;
import hibernate.jpaproj.model.Flight;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




public class ServiceDao {

/*	public boolean addPlace(Places place)
	{
		boolean result=false;
		try{
		
		//code for jpa
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(place);
		em.getTransaction().commit();
		 result=true;
		
	}
		catch(Exception e)
		{
			System.out.println("error:"+e);
		}
		return result;
}
	public Places getPlace(Places place)
	{
		Places p=null;
		try{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
			EntityManager em=emf.createEntityManager();
			p=em.find(Places.class, place.getPlaceid());
			
			
		}
		catch(Exception ee)
		{
			System.out.println("error"+ee);
		}
		return p;
	}*/
	
public boolean addFlight(Flight flight){
		
		boolean result = false;
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(flight);
			em.getTransaction().commit();
			result = true;
		}
		
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}
		
		
		return result;
	}
	
}
