package com.project.todolist;

import com.todos.dao.UserDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        UserDao userDao = new UserDao();
        userDao.saveUser("Gaurav", "gairabh.singh@gmail.com", "9876543210", "qawsedrftg",1);
    }
}