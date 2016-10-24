package com.marina.tretiakova;

import java.util.Calendar;
import java.util.Date;


import junit.framework.TestCase;
import com.marina.tretiakova.User;
public class UserTest extends TestCase{

	private User user;
	private Date dateOfBirthd;
	

	protected void setUp() throws Exception {
		super.setUp();
		user = new User();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(1995, Calendar.APRIL, 26);
		dateOfBirthd = calendar.getTime();
		
	}
	
	public void testGetFullName(){
		user.setFirstName("Marina");
		user.setLastName("Tretiakova");
		assertEquals("Tretiakova, Marina", user.getFullName());
	}
	
	public void testGetAge(){
		user.setDateOfBirthd(dateOfBirthd);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int currentYear = calendar.get(Calendar.YEAR); 
		assertEquals(currentYear - 1995, user.getAge());
	}

}