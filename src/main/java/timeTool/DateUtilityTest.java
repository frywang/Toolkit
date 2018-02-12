package main.java.timeTool;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class DateUtilityTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("开始测试");
	}

	@Test
	public void testGetTime() throws Exception {
		DateUtility test = new DateUtility();
		System.out.println(test.getTime());
		fail("Not yet implemented");
	}

	@Test
	public void testGetDate() throws Exception {
		DateUtility test = new DateUtility();
		System.out.println(test.getDate());
		fail("Not yet implemented");
	}

	@Test
	public void testTimeToString() throws Exception {
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        System.out.println(now);
		DateUtility test = new DateUtility();
		System.out.println(test.getDate().equals(test.timeToString(now)));
		fail("Not yet implemented");
	}

	@Test
	public void testDateToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testDateOfDate() {
		fail("Not yet implemented");
	}

}
