package com.todo.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


@SuppressWarnings("deprecation")
public class HibernateUtils {

	private static HibernateUtils instance=new HibernateUtils();
    private SessionFactory sessionFactory;
    
    public static HibernateUtils getInstance(){
            return instance;
    }
    
    private HibernateUtils(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml"); 
                
        sessionFactory = configuration.buildSessionFactory();
    }
    
    public static Session getSession(){
        Session session =  getInstance().sessionFactory.openSession();
        
        return session;
    }
}