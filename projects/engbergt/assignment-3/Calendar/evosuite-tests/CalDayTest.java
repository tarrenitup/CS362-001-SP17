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

	@Test(timeout = 4000)
  public void test001()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      calDay0.appts = linkedList0;
      calDay0.year = 2270;
      Appt appt0 = new Appt(2270, 8, 2270, 8, 5, "", "");
      linkedList0.push(appt0);
      Appt appt1 = new Appt(2, 5, 1, 1, 2, "", "");
      calDay0.addAppt(appt1);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      calDay0.appts = linkedList0;
      Appt appt0 = new Appt(2270, 8, 2270, 8, 5, "", "");
      calDay0.month = 2;
      linkedList0.push(appt0);
      Appt appt1 = new Appt(2, 5, 1, 1, 2, "", "");
      calDay0.addAppt(appt1);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      calDay0.appts = linkedList0;
      Appt appt0 = new Appt(5, 2, 5, 5, 5, "Mp k4xk9E9C\"bQ", "Mp k4xk9E9C\"bQ");
      Appt appt1 = new Appt(2, 5, 5, 2, 2, "Mp k4xk9E9C\"bQ", "Mp k4xk9E9C\"bQ");
      calDay0.addAppt(appt1);
      calDay0.addAppt(appt0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      calDay0.appts = linkedList0;
      Appt appt0 = new Appt(5, 2, 5, 5, 5, "Mp k4xk9E9C\"bQ", "Mp k4xk9E9C\"bQ");
      linkedList0.add(appt0);
      calDay0.addAppt(appt0);
      calDay0.addAppt(appt0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, 0, 0);
      CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
      calDay0.isValid();
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, 0, 31, 0, 31, 31);
      CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
      calDay0.getYear();
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.year = (-1684);
      calDay0.getYear();
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      GregorianCalendar GregorianCalendar0 = new GregorianCalendar();
      CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
      calDay0.getSizeAppts();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      Appt appt0 = new Appt(85, 475, 85, 475, 2249, "\t --- ", "\t --- ");
      linkedList0.add(appt0);
      calDay0.appts = linkedList0;
      calDay0.getSizeAppts();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.month = 1783;
      calDay0.getMonth();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.month = (-1684);
      calDay0.getMonth();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.day = 13;
      calDay0.getDay();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.day = 13;
      calDay0.day = (-1684);
      calDay0.getDay();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.getAppts();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, 0, 31, 0, 31, 31);
      CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
      LinkedList<Appt> linkedList0 = calDay0.getAppts();
      Appt appt0 = new Appt((-115), (-115), (-115), (-115), (-115), "", ";sbwr");
      linkedList0.add(appt0);
      calDay0.getAppts();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.valid = true;
      // Undeclared exception!
      try {
        calDay0.toString();
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertNotNull(e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, 0, 0);
      CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
      calDay0.appts = null;
      // Undeclared exception!
      try {
        calDay0.iterator();
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertNotNull(e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CalDay calDay0 = null;
      try {
        calDay0 = new CalDay((GregorianCalendar) null);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertNotNull(e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(334, 334, 334, 0, 334, 0);
      GregorianCalendar0.setLenient(false);
      CalDay calDay0 = null;
      try {
        calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");

      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         assertNotNull(e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      calDay0.isValid();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, 0, 31, 0, 31, 31);
      CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
      LinkedList<Appt> linkedList0 = calDay0.getAppts();
      Appt appt0 = new Appt((-115), (-115), (-115), (-115), (-115), "", ";sbwr");
      linkedList0.add(appt0);
      String string0 = calDay0.toString();
      assertEquals("\t --- 0/31/1 --- \n --- -------- Appointments ------------ --- \nnull \n", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GregorianCalendar GregorianCalendar0 = new GregorianCalendar(0, 0, 31, 0, 31, 31);
      CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
      Iterator<?> iterator0 = calDay0.iterator();
      assertNotNull(iterator0);
      assertEquals(31, calDay0.getDay());
      assertEquals(0, calDay0.getMonth());
      assertEquals(1, calDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Iterator<?> iterator0 = calDay0.iterator();
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      calDay0.appts = linkedList0;
      Appt appt0 = new Appt(2270, 8, 2270, 8, 5, "", "");
      linkedList0.push(appt0);
      Appt appt1 = new Appt(2, 5, 1, 1, 2, "", "");
      calDay0.addAppt(appt1);
      calDay0.addAppt(appt1);
      assertEquals(0, calDay0.getDay());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Appt appt0 = new Appt((-3000), 0, 13, (-1), 13, "i%", "InvalidFieldValue");
      calDay0.addAppt(appt0);
      assertEquals(0, calDay0.getDay());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      // Undeclared exception!
      try {
        calDay0.getSizeAppts();
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertNotNull(e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      int int0 = calDay0.getDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      int int0 = calDay0.getYear();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      Appt appt0 = new Appt(2, 5, 1, 1, 2, "", "");
      // Undeclared exception!
      try {
        calDay0.addAppt(appt0);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertNotNull(e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      int int0 = calDay0.getMonth();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CalDay calDay0 = new CalDay();
      String string0 = calDay0.toString();
      assertEquals("", string0);
  }

}
