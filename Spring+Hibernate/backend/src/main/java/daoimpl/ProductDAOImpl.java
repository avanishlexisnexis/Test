package daoimpl;

import java.util.List;
import org.hibernate.Session;
import com.niit.model.Product;
import dao.ProductDAO;
import dbconfig.DBConfig;

public class ProductDAOImpl implements ProductDAO 
{
	Session session;
	
	public void addProduct(Product product) 
	{
		session=DBConfig.getSession();
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
	}

	public void updateProduct(Product product) 
	{
		session=DBConfig.getSession();
		session.beginTransaction();
		session.update(product);
		session.getTransaction().commit();
	}

	public void deleteProduct(Product product) 
	{
		session=DBConfig.getSession();
		session.beginTransaction();
		session.delete(product);
		session.getTransaction().commit();
	}

	public List<Product> displayProducts() 
	{
		session=DBConfig.getSession();
		List<Product> products=session.createQuery("from com.niit.model.Product").list();
		return products;
	}

}
