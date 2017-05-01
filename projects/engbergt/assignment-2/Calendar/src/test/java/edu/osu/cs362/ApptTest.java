package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 /**
		* Test that the sets methods work as expected (engbergt)
		*/
	@Test
	 public void test02() throws Throwable  {
		 int startHour = 0;
		 int startMinute = 0;
		 int startDay = 0;
		 int startMonth = 0;
		 int startYear = 0;
		 String title = "";
		 String description = "";

		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);

		 //Exercise the setters
		 appt.setStartHour(12);
		 appt.setStartMinute(15);
		 appt.setStartDay(8);
		 appt.setStartMonth(5);
		 appt.setStartYear(2017);
		 appt.setTitle("Vacation");
		 appt.setDescription("My Vacation Starts.");
		 appt.setTitle(null);
		 appt.setDescription(null);

		 // Assertions
		 assertEquals(12, appt.getStartHour());
		 assertEquals(15, appt.getStartMinute());
		 assertEquals(8, appt.getStartDay());
		 assertEquals(5, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());

	 }

	 @Test
 	 public void test03() throws Throwable  {
		 int startHour = 15;
		 int startMinute = 20;
		 int startDay = 1;
		 int startMonth = 2;
		 int startYear = 2017;
		 String title = "Homework Due";
		 String description = "Turn the HW in by midnight.";

		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);

		 // Assertions
		 assertTrue(appt.toString() != null);

	 }

	 @Test
 	 public void test04() throws Throwable  {
		 int startHour = -1;
		 int startMinute = 60;
		 int startDay = 32;
		 int startMonth = 13;
		 int startYear = 2017;
		 String title = "Homework Due";
		 String description = "Turn the HW in by midnight.";

		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);

		 // Assertions
		 // since isValid is private, this is my sneaky way of getting to it.
		 assertTrue(appt.toString() == null);

	 }

}
