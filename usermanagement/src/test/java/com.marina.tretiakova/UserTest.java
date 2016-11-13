package com.marina.tretiakova;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class UserTest extends TestCase {

	private User user;
	private Date dateOfBirthd;

	@Before
	protected void setUp() throws Exception {
		super.setUp();

		user = new User();
		Calendar calendar = Calendar.getInstance();
		calendar.set(1997, Calendar.NOVEMBER, 25);
		dateOfBirthd = calendar.getTime();
	}

	@Test
	public void testGetFullName() {
		user.setFirstName("Marina");
		user.setLastName("Tretiakova");
		assertEquals("Tretiakova, Marina", user.getFullName());
	}

	@Test
	public void testGetAge() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int currentYear = calendar.get(Calendar.YEAR);
		user.setDateOfBirthd(dateOfBirthd);
		assertEquals(currentYear - 1997, user.getAge());
	}
}
