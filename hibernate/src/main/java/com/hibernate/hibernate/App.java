package com.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App extends table_model2
{

    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	table_model m=new table_model();
    	m.setName("Narayan");
    	m.setRn(4);
    	m.setBranch("Info Tech");
    	
    	Configuration con=new Configuration().configure("config.cfg.xml").addAnnotatedClass(table_model.class);
    	ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(sr);
    	Session session=sf.openSession();
    	Transaction  tran=session.beginTransaction();	
//    	session.delete(m);
    	session.saveOrUpdate(m);
//    	m=(table_model)session.get(table_model.class,m.getRn());
    	tran.commit();
    	System.out.println(m);
    	
    	
    	
    }
}
