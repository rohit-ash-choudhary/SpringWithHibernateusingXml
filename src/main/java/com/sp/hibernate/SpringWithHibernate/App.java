package com.sp.hibernate.SpringWithHibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.sp.beans.Account;
import com.sp.dao.AccountDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
    	Account acc=new Account();
    	acc.setAcc_num(1);
    	acc.setFirst_name("K");
    	acc.setLast_name("L");
    	acc.setBalance((long) 100000);
    	acc.setCity("New wok");
    	
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("/com/sp/resources/applicationContext.xml");
    	AccountDaoImpl accdaoimp=(AccountDaoImpl)context.getBean("accimp");
    	accdaoimp.createAccount(acc);
    	
    
    
    }
    
}
