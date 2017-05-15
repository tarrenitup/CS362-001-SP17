package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Iterator;

import java.lang.NullPointerException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;


public class CalDayTest {

	// @Test
	// public void test01() throws Throwable {
	//
	// 	//Construct a new Appointment object with the initial data
	// 	CalDay calDay = new CalDay();
	//
	// 	//Assertions
	// 	assertNotNull(calDay.iterator());
	// 	assertNull(calDay.toString());
	// }

	@Test
	public void test02() throws Throwable {

		//Construct a new Appointment object with the initial data
		CalDay calDay = new CalDay();

		//Assertion
		assertFalse(calDay.isValid());
	 }

	// @Test
 // 	public void test03() throws Throwable {
	//
 // 		//Construct a new Appointment object with the initial data
 // 		CalDay calDay = new CalDay();
	// 	Appt appt = new Appt(-12, 21, 14, 4, 2017, "Vacation", "Start of Vacation."); // low start hour
	// 	calDay.addAppt(appt);
	//
 // 		//Assertion
 // 		assertNull(calDay.getSizeAppts());
	//
 // 	 }

	 @Test
  	public void test04() throws Throwable {

  	//Construct a new Appointment object with the initial data
		GregorianCalendar cal = new GregorianCalendar();
  	CalDay calDay = new CalDay(cal);

 		Appt appt = new Appt(12, 21, 14, 4, 2017, "Vacation", "Start of Vacation."); // low start hour
		Appt appt1 = new Appt(11, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");
		Appt appt2 = new Appt(13, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");

		calDay.addAppt(appt);
		calDay.addAppt(appt1);
		calDay.addAppt(appt2);

  		//Assertion
  		assertNotNull(calDay.getSizeAppts());

  	 }

	@Test
	public void test05() throws Throwable {

		//Construct a new Appointment object with the initial data
		GregorianCalendar cal = new GregorianCalendar();
		CalDay calDay = new CalDay(cal);

		//Assertions
		assertTrue(calDay.isValid());

	}

	@Test
	public void test06() throws Throwable {

		GregorianCalendar cal = new GregorianCalendar();
		CalDay calDay = new CalDay(cal);
		Appt appt = new Appt(7, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");
		Appt appt1 = new Appt(8, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");
		Appt appt2 = new Appt(9, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");
		Appt appt3 = new Appt(10, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");

		calDay.addAppt(appt);
		calDay.addAppt(appt1);
		calDay.addAppt(appt2);
		calDay.addAppt(appt3);

		assertTrue(calDay.toString() != null);
		assertEquals(calDay.getSizeAppts(), 4);

	}

	@Test
	public void test07() throws Throwable {

		//Construct a new Appointment object with the initial data
		GregorianCalendar cal = new GregorianCalendar();
		CalDay calDay = new CalDay(cal);
		Appt appt = new Appt(7, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");
		Appt appt1 = new Appt(8, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");

		calDay.addAppt(appt);
		calDay.addAppt(appt1);

		assertNotNull(calDay.iterator());

	}


	/* Additions for assinment 3 */

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, 0, 31, 0, 31, 31);
      CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
      LinkedList<Appt> linkedList0 = calDay0.getAppts();
      Appt appt0 = new Appt((-115), (-115), (-115), (-115), (-115), "", ";sbwr");
      linkedList0.add(appt0);
      String string0 = calDay0.toString();
      assertEquals("\t --- 0/31/1 --- \n --- -------- Appointments ------------ --- \nnull \n", string0);
  }		// adapted from EvoSuite generated tests

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Iterator<?> iterator0 = calDay0.iterator();
      assertNull(iterator0);
  }		// adapted from EvoSuite generated tests

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Appt appt0 = new Appt(2, 5, 1, 1, 2, "", "");
      // Undeclared exception!
      try {
        calDay0.addAppt(appt0);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         assertNotNull(e);
      }	// adapted from EvoSuite generated tests
  }


}
