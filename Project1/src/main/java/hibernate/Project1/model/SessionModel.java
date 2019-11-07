package hibernate.Project1.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionModel{
	
	public Session getSession() {
		/*Configuration configuration = new Configuration().configure();
     	SessionFactory factory = configuration.buildSessionFactory();
	    Session session = factory.openSession();
	    return session;*/
		
		Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        final SessionFactory factory = configuration.buildSessionFactory(builder.build());
	    Session session = factory.openSession();
	    return session;
	}
	

}
