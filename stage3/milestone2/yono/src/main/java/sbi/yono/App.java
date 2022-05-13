package sbi.yono;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //registerProduct();
    	//getProductById();
    	//deleteProductById();
    	SessionFactory sf=new Configuration()
    			.configure("hibernate.cfg.xml")
    			.configure().buildSessionFactory();
    	Session session=sf.openSession();
    	session.beginTransaction();
    	Produt pro=session.get(Produt.class, 1002);
    	System.out.println(pro.getProductName()+" "+pro.getCost()+" "+pro.getProductId());
        pro.setCost(90000F);
        pro.setProductName("Sofa");
        session.update(pro);
    	session.getTransaction().commit();
    	session.close();
    	sf.close();
    }

	public static void deleteProductById() {
		SessionFactory sf=new Configuration()
    			.configure("hibernate.cfg.xml")
    			.configure().buildSessionFactory();
    	Session session=sf.openSession();
    	session.beginTransaction();
    	Produt pro=session.get(Produt.class, 1001);
    	session.delete(pro);
    	session.getTransaction().commit();
    	session.close();
    	sf.close();
	}

	public static void getProductById() {
		SessionFactory sf=new Configuration()
    			.configure("hibernate.cfg.xml")
    			.configure().buildSessionFactory();
    	Session session=sf.openSession();
    	session.beginTransaction();
    	Produt pro=session.get(Produt.class, 1001);
    	System.out.println(pro.getProductName()+" "+pro.getCost()+" "+pro.getProductId());
    	session.getTransaction().commit();
    	session.close();
    	sf.close();
	}

	public static void registerProduct() { // this method has a logic to add a product
		Produt p2=new Produt();
        p2.setProductId(1003);
        p2.setProductName("AC");
        p2.setCost(40000F);
        
        Sale s1=new Sale();
        s1.setSaleId(455);
        s1.setSaleName("Diwali Sale");
	        //p1 is object. state of an object p1-> id=1000,name=refrigerator,cost=50000 - t1

       SessionFactory sf=new Configuration()
    		   .configure("hibernate.cfg.xml")
    		   .buildSessionFactory();
       Session session=sf.openSession();
       session.beginTransaction();
       session.save(p2); 
       session.save(s1);
       session.getTransaction().commit();
       session.close();
       sf.close();
	}
}
// persistence - Permanent - we wanted to store your object state information as permanently

// Java Persistence Access(JPA)