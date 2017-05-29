package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Iterator;


/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {

	private static final long TestTimeout = 60 * 500 * 4; /* Timeout at 60 seconds */
	private static final int NUM_TESTS=200;

    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void randomtest() throws Throwable {


			long startTime = Calendar.getInstance().getTimeInMillis();
			long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
			System.out.println("Start testing...");

			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed = 10;
				Random random = new Random(randomseed);

				int startHour = 23;
				int startMinute = 30;
				int startDay = 10;
				int startMonth = 4;
				int startYear = 2017;
				String title = "Birthday Party";
				String description = "This is a birthday party";

				//Construct a new Appointment object with the initial data
				Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
				Appt appt0 = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
				Appt appt1 = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
				Appt appt2 = new Appt(startHour, startMinute, startDay, startMonth, -22000, title, description);
				LinkedList<Appt> lnklst = new LinkedList<Appt>();
				TimeTable timetable = new TimeTable();

				for (int i = 0; i < NUM_TESTS; i++) {

						String newDesc = (String) ValuesGenerator.getString(random);
					  appt.setDescription(newDesc);
						String newTitle = (String) ValuesGenerator.getString(random);
						appt.setTitle(newTitle);
						int newHour = (int) ValuesGenerator.getRandomIntBetween(random, -50, 50);
						appt.setStartHour(newHour);
						int newMinute = (int) ValuesGenerator.getRandomIntBetween(random, -80, 80);
						appt.setStartMinute(newMinute);
						int newDay = (int) ValuesGenerator.getRandomIntBetween(random, -50, 50);
						appt.setStartDay(newDay);
						int newMonth = (int) ValuesGenerator.getRandomIntBetween(random, -15, 20);
						appt.setStartMonth(newMonth);
						int newYear = (int) ValuesGenerator.getRandomIntBetween(random, -5, 5);
						appt.setStartYear(newYear);

						lnklst.add(appt);

						String newDesc0 = (String) ValuesGenerator.getString(random);
					  appt0.setDescription(newDesc);
						String newTitle0 = (String) ValuesGenerator.getString(random);
						appt0.setTitle(newTitle);
						int newHour0 = (int) ValuesGenerator.getRandomIntBetween(random, 0, 23);
						appt0.setStartHour(newHour);
						int newMinute0 = (int) ValuesGenerator.getRandomIntBetween(random, 0, 59);
						appt0.setStartMinute(newMinute);
						int newDay0 = (int) ValuesGenerator.getRandomIntBetween(random, 1, 31);
						appt0.setStartDay(newDay);
						int newMonth0 = (int) ValuesGenerator.getRandomIntBetween(random, 1, 12);
						appt0.setStartMonth(newMonth);
						int newYear0 = (int) ValuesGenerator.getRandomIntBetween(random, 2017, 2020);
						appt0.setStartYear(newYear);

						lnklst.add(appt0);
						lnklst.add(appt1);
						//lnklst.add(null);

				}

				// Delete all the appts
				timetable.deleteAppt(null, lnklst.get(0));
				timetable.deleteAppt(lnklst, null);
				timetable.deleteAppt(lnklst, appt2);
				for(int i = 0; i < lnklst.size(); i++){
					timetable.deleteAppt(lnklst, lnklst.get(i));
				}

				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);

				if((iteration%10000) == 0 && iteration != 0)
			  	System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

			}

			System.out.println("Done testing...");


	 }



}
