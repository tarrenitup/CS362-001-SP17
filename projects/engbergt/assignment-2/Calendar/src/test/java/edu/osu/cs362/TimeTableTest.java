package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01() throws Throwable {
			//make three appointments
			Appt appt = new Appt(7, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");
			Appt appt1 = new Appt(7, 21, 15, 4, 2017, "Vacation", "Start of Vacation.");
			Appt appt2 = new Appt(7, 21, 16, 4, 2017, "Vacation", "Start of Vacation.");

			//add the appointments to a list
			LinkedList<Appt> lnklst = new LinkedList<Appt>();
			lnklst.add(appt);
			lnklst.add(appt1);
			lnklst.add(appt2);

			//add them to 3 different days
			Calendar rightnow = Calendar.getInstance();

			int thisMonth = rightnow.get(Calendar.MONTH)+1;
			int thisYear = rightnow.get(Calendar.YEAR);
			int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

			GregorianCalendar calday = new GregorianCalendar(thisYear,thisMonth,thisDay);
			GregorianCalendar calday1 = new GregorianCalendar(thisYear,thisMonth,thisDay+1);
			GregorianCalendar calday2 = new GregorianCalendar(thisYear,thisMonth,thisDay+2);

			TimeTable tmtbl = new TimeTable();

			assertTrue(tmtbl.getApptRange(lnklst, calday, calday2) != null);
			assertTrue(tmtbl.deleteAppt(lnklst, appt1).size() == 2);

	 }

	 @Test
	  public void test02() throws Throwable {
			//make three appointments
			Appt appt = new Appt(7, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");
			Appt appt1 = new Appt(7, 21, 15, 4, 2017, "Vacation", "Start of Vacation.");
			Appt appt2 = new Appt(7, 21, 16, 4, 2017, "Vacation", "Start of Vacation.");

			appt = null;
			appt1 = null;
			appt2 = null;

			//add the appointments to a list
			LinkedList<Appt> lnklst = new LinkedList<Appt>();
			lnklst.add(appt);
			lnklst.add(appt1);
			lnklst.add(appt2);

			//add them to 3 different days
			Calendar rightnow = Calendar.getInstance();

			int thisMonth = rightnow.get(Calendar.MONTH)+1;
			int thisYear = rightnow.get(Calendar.YEAR);
			int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

			GregorianCalendar calday = new GregorianCalendar(thisYear,thisMonth,thisDay);
			GregorianCalendar calday1 = new GregorianCalendar(thisYear,thisMonth,thisDay+1);
			GregorianCalendar calday2 = new GregorianCalendar(thisYear,thisMonth,thisDay+2);

			TimeTable tmtbl = new TimeTable();

			assertNull(tmtbl.deleteAppt(lnklst, appt1));

	 }

	 @Test
	  public void test03() throws Throwable {
			//make three appointments
			Appt appt = new Appt(7, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");
			Appt appt1 = new Appt(7, 21, 15, 4, 2017, "Vacation", "Start of Vacation.");
			Appt appt2 = new Appt(7, 21, 16, 4, 2017, "Vacation", "Start of Vacation.");

			//add the appointments to a list
			LinkedList<Appt> lnklst = new LinkedList<Appt>(); // null linked list

			//add them to 3 different days
			Calendar rightnow = Calendar.getInstance();

			int thisMonth = rightnow.get(Calendar.MONTH)+1;
			int thisYear = rightnow.get(Calendar.YEAR);
			int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

			GregorianCalendar calday = new GregorianCalendar(thisYear,thisMonth,thisDay);
			GregorianCalendar calday1 = new GregorianCalendar(thisYear,thisMonth,thisDay+1);
			GregorianCalendar calday2 = new GregorianCalendar(thisYear,thisMonth,thisDay+2);

			TimeTable tmtbl = new TimeTable();

			assertNull(tmtbl.deleteAppt(lnklst, appt));

	 }

	 @Test
	  public void test04() throws Throwable {
			//make three appointments
			Appt appt = new Appt(30, 21, 14, 4, 2017, "Vacation", "Start of Vacation."); // hour wrong value, trying to make invalid.
			Appt appt1 = new Appt(7, 21, 15, 4, 2017, "Vacation", "Start of Vacation.");
			Appt appt2 = new Appt(7, 21, 16, 4, 2017, "Vacation", "Start of Vacation.");

			//add the appointments to a list
			LinkedList<Appt> lnklst = new LinkedList<Appt>();
			lnklst.add(appt);
			lnklst.add(appt1);
			lnklst.add(appt2);

			//add them to 3 different days
			Calendar rightnow = Calendar.getInstance();

			int thisMonth = rightnow.get(Calendar.MONTH)+1;
			int thisYear = rightnow.get(Calendar.YEAR);
			int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

			GregorianCalendar calday = new GregorianCalendar(thisYear,thisMonth,thisDay);
			GregorianCalendar calday1 = new GregorianCalendar(thisYear,thisMonth,thisDay+1);
			GregorianCalendar calday2 = new GregorianCalendar(thisYear,thisMonth,thisDay+2);

			TimeTable tmtbl = new TimeTable();

			assertNull(tmtbl.deleteAppt(lnklst, appt));

	 }

	 @Test
	  public void test05() throws Throwable {
			//make three appointments
			Appt appt = new Appt(7, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");
			Appt appt1 = new Appt(7, 21, 15, 4, 2017, "Vacation", "Start of Vacation.");
			Appt appt2 = new Appt(7, 21, 16, 4, 2017, "Vacation", "Start of Vacation.");

			//leaving the list null to try to access the if that handles this.
			LinkedList<Appt> lnklst = new LinkedList<Appt>();
			//lnklst.add(appt);
			//lnklst.add(appt1);
			//lnklst.add(appt2);

			//add them to 3 different days
			Calendar rightnow = Calendar.getInstance();

			int thisMonth = rightnow.get(Calendar.MONTH)+1;
			int thisYear = rightnow.get(Calendar.YEAR);
			int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

			GregorianCalendar calday = new GregorianCalendar(thisYear,thisMonth,thisDay);
			GregorianCalendar calday1 = new GregorianCalendar(thisYear,thisMonth,thisDay+1);
			GregorianCalendar calday2 = new GregorianCalendar(thisYear,thisMonth,thisDay+2);

			TimeTable tmtbl = new TimeTable();

			// assertTrue(tmtbl.getApptRange(lnklst, calday, calday2) != null);
			assertNull(tmtbl.deleteAppt(lnklst, appt1));

	 }

	 @Test
	  public void test06() throws Throwable {
			//make three appointments
			Appt appt = new Appt(25, 21, 14, 4, 2017, "Vacation", "Start of Vacation."); // hour out of bounds
			Appt appt1 = new Appt(7, 21, 15, 4, 2017, "Vacation", "Start of Vacation.");
			Appt appt2 = new Appt(7, 21, 16, 4, 2017, "Vacation", "Start of Vacation.");

			//add the appointments to a list
			LinkedList<Appt> lnklst = new LinkedList<Appt>();
			lnklst.add(appt);
			lnklst.add(appt1);
			lnklst.add(appt2);

			//add them to 3 different days
			Calendar rightnow = Calendar.getInstance();

			int thisMonth = rightnow.get(Calendar.MONTH)+1;
			int thisYear = rightnow.get(Calendar.YEAR);
			int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

			GregorianCalendar calday = new GregorianCalendar(thisYear,thisMonth,thisDay);
			GregorianCalendar calday1 = new GregorianCalendar(thisYear,thisMonth,thisDay+1);
			GregorianCalendar calday2 = new GregorianCalendar(thisYear,thisMonth,thisDay+2);

			TimeTable tmtbl = new TimeTable();

			assertTrue(tmtbl.getApptRange(lnklst, calday, calday2) != null);

	 }

	 @Test
	  public void test07() throws Throwable {
			//make three appointments
			Appt appt = new Appt(25, 21, 14, 4, 2017, "Vacation", "Start of Vacation."); // hour out of bounds
			Appt appt1 = new Appt(7, 21, 15, 4, 2017, "Vacation", "Start of Vacation.");
			Appt appt2 = new Appt(7, 21, 16, 4, 2017, "Vacation", "Start of Vacation.");

			//add the appointments to a list
			LinkedList<Appt> lnklst = new LinkedList<Appt>();
			lnklst.add(appt2);
			lnklst.add(appt1);
			lnklst.add(appt);

			//add them to 3 different days
			Calendar rightnow = Calendar.getInstance();

			int thisMonth = rightnow.get(Calendar.MONTH)+1;
			int thisYear = rightnow.get(Calendar.YEAR);
			int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

			GregorianCalendar calday = new GregorianCalendar(thisYear,thisMonth,thisDay);
			GregorianCalendar calday1 = new GregorianCalendar(thisYear,thisMonth,thisDay+1);
			GregorianCalendar calday2 = new GregorianCalendar(thisYear,thisMonth,thisDay+2);

			TimeTable tmtbl = new TimeTable();

			assertTrue(tmtbl.getApptRange(lnklst, calday, calday2) != null);

	 }

	 @Test
	  public void test08() throws Throwable {
			//make three appointments
			Appt appt = new Appt(25, 21, 14, 4, 2017, "Vacation", "Start of Vacation."); // hour out of bounds
			Appt appt1 = new Appt(7, 21, 15, 4, 2017, "Vacation", "Start of Vacation.");
			Appt appt2 = new Appt(7, 21, 16, 4, 2017, "Vacation", "Start of Vacation.");

			//add the appointments to a list
			LinkedList<Appt> lnklst = new LinkedList<Appt>();
			lnklst.add(appt2);
			lnklst.add(appt1);
			lnklst.add(appt);

			//add them to 3 different days
			Calendar rightnow = Calendar.getInstance();

			int thisMonth = rightnow.get(Calendar.MONTH)+1;
			int thisYear = rightnow.get(Calendar.YEAR);
			int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

			GregorianCalendar calday = new GregorianCalendar(thisYear,thisMonth,thisDay);
			GregorianCalendar calday1 = new GregorianCalendar(thisYear,thisMonth,thisDay+1);
			GregorianCalendar calday2 = new GregorianCalendar(thisYear,thisMonth,thisDay+2);

			TimeTable tmtbl = new TimeTable();

			assertNull(tmtbl.getApptRange(lnklst, calday2, calday)); // the days are in the wrong order..

	 }

	 @Test
	  public void test09() throws Throwable {
			//make three appointments

			TimeTable tmtbl = new TimeTable();
			assertNull(tmtbl.deleteAppt(null,null));

	 }

	 @Test
	  public void test10() throws Throwable {
			//make three appointments
			Appt appt = new Appt(7, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");
			Appt appt1 = new Appt(7, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");
			Appt appt2 = new Appt(7, 21, 14, 4, 2017, "Vacation", "Start of Vacation.");

			//add the appointments to a list
			LinkedList<Appt> lnklst = new LinkedList<Appt>();
			lnklst.add(appt);
			lnklst.add(appt1);
			lnklst.add(appt2);

			//add them to 3 different days
			Calendar rightnow = Calendar.getInstance();

			int thisMonth = rightnow.get(Calendar.MONTH);
			int thisYear = rightnow.get(Calendar.YEAR);
			int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

			GregorianCalendar calday = new GregorianCalendar(thisYear,thisMonth,thisDay);
			GregorianCalendar calday1 = new GregorianCalendar(thisYear,thisMonth,thisDay);
			GregorianCalendar calday2 = new GregorianCalendar(thisYear,thisMonth,thisDay-1);

			TimeTable tmtbl = new TimeTable();

			assertNotNull(tmtbl.getApptRange(lnklst, calday2, calday));

	 }

}
