package dbconfig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.niit.model.Product;

public class DBConfig 
{
	static SessionFactory factory=null;
	
	static
	{
		loadSessionFactory();
	}
	
	private static void loadSessionFactory()
	{
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Product.class);
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		factory=configuration.buildSessionFactory(registry);
	}
	
	public static Session getSession()
	{
		return factory.openSession();
	}
}
