package com.todos.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.todos.entity.Task;
import com.todo.utils.HibernateUtils;
import org.hibernate.Query;


public class TaskDao {
	
	public void saveTask(String name,String desc, String status, String time, int userId){
        Session session = HibernateUtils.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Task tasks = new Task();
      	    tasks.setName(name);
      	    tasks.setDesc(desc);
      	    tasks.setStatus(status);
      	    tasks.setTime(time);
      	    tasks.setUserId(userId);
            transaction.commit();
            System.out.println("Records inserted sucessessfully");
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
	
    public List<Task> getTasks(){
    	Session session = HibernateUtils.getSession(); 
        Query query = session.createQuery("from Tasks");
        List<Task> tasks = query.list();
        session.close();
        return tasks;
    }
	
    public int updateTask(Task b){
        if(b.getId() <=0)  
              return 0;  
           Session session = HibernateUtils.getSession(); 
           Transaction tx = session.beginTransaction();
           String hql = "update Tasks set name = :name, desc= :desc, status= :status, time = :time where id = :id";
           Query query = session.createQuery(hql);
           query.setInteger("id",b.getId());
           query.setString("name",b.getName());
           query.setString("desc",b.getDesc());
           query.setString("status",b.getStatus());
           query.setString("time",b.getTime());
           int rowCount = query.executeUpdate();
           System.out.println("Rows affected: " + rowCount);
           tx.commit();
           session.close();
           return rowCount;
   }
    
    public int deleteTask(int id) {
    	Session session = HibernateUtils.getSession(); 
        Transaction tx = session.beginTransaction();
        String hql = "delete from Tasks where id = :id";
        Query query = session.createQuery(hql);
        query.setInteger("id",id);
        int rowCount = query.executeUpdate();
        System.out.println("Rows affected: " + rowCount);
        tx.commit();
        session.close();
        return rowCount;
    }
	
}