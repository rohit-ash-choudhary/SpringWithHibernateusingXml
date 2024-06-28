package com.sp.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.sp.beans.Account;

import jakarta.transaction.Transactional;

public class AccountDaoImpl implements AccountDao {
	
	private HibernateTemplate hibernatetemp;

	public void setHibernatetemp(HibernateTemplate hibernatetemp) {
		this.hibernatetemp = hibernatetemp;
	}

	@Transactional
	@Override
	public void createAccount(Account acc) {
		// TODO Auto-generated method stub
		
		try{
			
			hibernatetemp.save(acc);
			System.out.println("Successfully");
		}
		catch(Exception e)
		{
			
			System.out.println("Failed");
			e.printStackTrace();
		}
	}

}
