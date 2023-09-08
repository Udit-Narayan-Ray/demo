package com.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	table_model m=new table_model();
    	m.setName("jsk");
    	m.setRn(1);
    	table_model n=new table_model();
    	n.setRn(2);
    	n.setName("RKU");
    	Configuration con=new Configuration().configure("config.cfg.xml").addAnnotatedClass(table_model.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction  tran=session.beginTransaction();
    	session.save(m);
    	tran.commit();
    }
}
