package com.todos.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todos.entity.User;
import com.todo.utils.HibernateUtils;

import org.hibernate.Query;



public class UserDao {
	
	public void saveUser(String name,String mail, String password, String phone, int id){
        Session session = HibernateUtils.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            User users = new User();
            users.setID(id);
      	    users.setEmail(mail);
      	    users.setName(name);
      	    users.setPassword(password);
      	    users.setPhone_no(phone);
            session.save(users);
            transaction.commit();
            System.out.println("Records inserted sucessessfully");
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
	
    public List<User> getUser(){
    	Session session = HibernateUtils.getSession(); 
        Query query = session.createQuery("from Users");
        List<User> user = query.list();
        session.close();
        return user;
    }
	
    public int updateUser(User b){
        if(b.getID() <=0)  
              return 0;  
        	Session session = HibernateUtils.getSession(); 
           Transaction tx = session.beginTransaction();
           String hql = "update Users set name = :name, password=:password where id = :id";
           Query query = session.createQuery(hql);
           query.setInteger("id",b.getID());
           query.setString("name",b.getName());
           query.setString("password",b.getPassword());
           query.setString("phone",b.getPhone_no());
           int rowCount = query.executeUpdate();
           System.out.println("Rows affected: " + rowCount);
           tx.commit();
           session.close();
           return rowCount;
   }
    
    public int deleteUser(int id) {
    	Session session = HibernateUtils.getSession(); 
        Transaction tx = session.beginTransaction();
        String hql = "delete from Users where id = :id";
        Query query = session.createQuery(hql);
        query.setInteger("id",id);
        int rowCount = query.executeUpdate();
        System.out.println("Rows affected: " + rowCount);
        tx.commit();
        session.close();
        return rowCount;
    }
	
}