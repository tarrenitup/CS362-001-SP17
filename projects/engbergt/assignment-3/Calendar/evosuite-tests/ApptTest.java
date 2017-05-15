/*
 * This file was automatically generated by EvoSuite
 * Wed May 10 21:10:51 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;

public class ApptTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(6, 6, 6, 6, 6, "<a", "<a");
      String string0 = appt0.toString();
      assertNotNull(string0);
      assertEquals("\t6/6/6 at 6:6am ,<a, <a\n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 12, 12, ":dojvVd/", ":dojvVd/");
      assertEquals(12, appt0.getStartDay());
      assertEquals(":dojvVd/", appt0.getTitle());
      assertEquals(12, appt0.getStartMinute());
      assertEquals(":dojvVd/", appt0.getDescription());
      assertTrue(appt0.getValid());
      assertEquals(12, appt0.getStartHour());
      assertEquals(12, appt0.getStartYear());
      assertEquals(12, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(1, 11, 23, 72, 23, "", "\n");
      appt0.setStartDay(31);
      assertEquals(31, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(23, 23, 23, 23, 23, "~e:3']9D;1", "~e:3']9D;1");
      assertEquals(23, appt0.getStartHour());
      assertEquals(23, appt0.getStartYear());
      assertEquals(23, appt0.getStartMonth());
      assertEquals(23, appt0.getStartMinute());
      assertEquals("~e:3']9D;1", appt0.getDescription());
      assertEquals(23, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals("~e:3']9D;1", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt(10, 10, 10, 10, 0, "|jcgiyHL~hsTD8", "|jcgiyHL~hsTD8");
      boolean boolean0 = appt0.getValid();
      assertEquals(10, appt0.getStartDay());
      assertEquals("|jcgiyHL~hsTD8", appt0.getDescription());
      assertEquals("|jcgiyHL~hsTD8", appt0.getTitle());
      assertEquals(0, appt0.getStartYear());
      assertTrue(boolean0);
      assertEquals(10, appt0.getStartMinute());
      assertEquals(10, appt0.getStartMonth());
      assertEquals(10, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, Integer.MIN_VALUE, Integer.MIN_VALUE, 0, "", "");
      appt0.getTitle();
      assertEquals(0, appt0.getStartHour());
      assertEquals(-2147483648, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(-2147483648, appt0.getStartDay());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt(122, 122, 1802, 122, 0, "", "");
      int int0 = appt0.getStartYear();
      assertEquals(0, int0);
      assertEquals(122, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(122, appt0.getStartMonth());
      assertEquals(1802, appt0.getStartDay());
      assertEquals(122, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt((-867), (-867), 0, 12, 0, "4MmJJT%f", "4MmJJT%f");
      assertEquals(0, appt0.getStartYear());

      appt0.setStartYear((-867));
      int int0 = appt0.getStartYear();
      assertEquals((-867), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt((-2067), (-2067), 0, 0, (-2067), "}PY38IY=e%qIoqV=", "}PY38IY=e%qIoqV=");
      int int0 = appt0.getStartMonth();
      assertEquals("}PY38IY=e%qIoqV=", appt0.getTitle());
      assertEquals(0, int0);
      assertFalse(appt0.getValid());
      assertEquals("}PY38IY=e%qIoqV=", appt0.getDescription());
      assertEquals(-2067, appt0.getStartYear());
      assertEquals(0, appt0.getStartDay());
      assertEquals(-2067, appt0.getStartHour());
      assertEquals(-2067, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt(11, (-149), (-149), 3313, 2952, ":", "");
      int int0 = appt0.getStartMonth();
      assertEquals(-149, appt0.getStartDay());
      assertEquals(-149, appt0.getStartMinute());
      assertEquals(":", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(2952, appt0.getStartYear());
      assertEquals(3313, int0);
      assertEquals(11, appt0.getStartHour());
      assertEquals("", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, (-2160), 827, "0.", "0.");
      int int0 = appt0.getStartMinute();
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, int0);
      assertEquals("0.", appt0.getDescription());
      assertEquals(827, appt0.getStartYear());
      assertEquals(0, appt0.getStartDay());
      assertEquals("0.", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(-2160, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt(2555, 43, 2555, 2555, 0, (String) null, "");
      int int0 = appt0.getStartMinute();
      assertFalse(appt0.getValid());
      assertEquals(2555, appt0.getStartDay());
      assertEquals(2555, appt0.getStartMonth());
      assertEquals(0, appt0.getStartYear());
      assertEquals(43, int0);
      assertEquals(2555, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, Integer.MIN_VALUE, Integer.MIN_VALUE, 0, "", "");
      int int0 = appt0.getStartHour();
      assertEquals(-2147483648, appt0.getStartMonth());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartMinute());
      assertEquals(-2147483648, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt(59, (-1735), 59, 59, 59, ",BmcwFNb&x3 5rX", "HMS");
      int int0 = appt0.getStartHour();
      assertFalse(appt0.getValid());
      assertEquals(",BmcwFNb&x3 5rX", appt0.getTitle());
      assertEquals(59, appt0.getStartYear());
      assertEquals(59, appt0.getStartMonth());
      assertEquals(-1735, appt0.getStartMinute());
      assertEquals(59, int0);
      assertEquals(59, appt0.getStartDay());
      assertEquals("HMS", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt(0, 1, 0, 0, (-962), "YMD", "YMD");
      int int0 = appt0.getStartDay();
      assertEquals("YMD", appt0.getDescription());
      assertEquals(-962, appt0.getStartYear());
      assertEquals(1, appt0.getStartMinute());
      assertEquals(0, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(0, int0);
      assertEquals("YMD", appt0.getTitle());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt(197, 31, 197, 31, 197, "NhMT&+ZhyfbL/vm", "NhMT&+ZhyfbL/vm");
      int int0 = appt0.getStartDay();
      assertEquals("NhMT&+ZhyfbL/vm", appt0.getDescription());
      assertEquals("NhMT&+ZhyfbL/vm", appt0.getTitle());
      assertEquals(31, appt0.getStartMonth());
      assertEquals(31, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(197, appt0.getStartHour());
      assertEquals(197, int0);
      assertEquals(197, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 1, 0, 786, (String) null, (String) null);
      String string0 = appt0.getDescription();
      assertEquals(786, appt0.getStartYear());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(1, appt0.getStartDay());
      assertEquals(0, appt0.getStartHour());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt((-1217), 12, (-1217), (-1217), 12, "\n", "\n");
      appt0.setDescription("\n");
      assertEquals(-1217, appt0.getStartDay());
      assertEquals("\n", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(12, appt0.getStartMinute());
      assertEquals(-1217, appt0.getStartMonth());
      assertEquals("\n", appt0.getDescription());
      assertEquals(-1217, appt0.getStartHour());
      assertEquals(12, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 1, 0, 786, (String) null, (String) null);
      appt0.setDescription((String) null);
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(1, appt0.getStartDay());
      assertEquals(786, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt((-1410), (-1410), (-1410), (-1410), (-1410), "%Y-%M-%DT%h:%m:%s%z", "%Y-%M-%DT%h:%m:%s%z");
      appt0.setTitle("%Y-%M-%DT%h:%m:%s%z");
      assertEquals(-1410, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals("%Y-%M-%DT%h:%m:%s%z", appt0.getDescription());
      assertEquals(-1410, appt0.getStartMinute());
      assertEquals(-1410, appt0.getStartYear());
      assertEquals(-1410, appt0.getStartHour());
      assertEquals("%Y-%M-%DT%h:%m:%s%z", appt0.getTitle());
      assertEquals(-1410, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt((-3203), (-3203), (-3203), (-3203), (-3203), "N`Tbt", "N`Tbt");
      assertEquals("N`Tbt", appt0.getTitle());

      appt0.setTitle((String) null);
      assertEquals(-3203, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt((-1217), 12, (-1217), (-1217), 12, "\n", "\n");
      String string0 = appt0.getTitle();
      assertEquals(-1217, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(12, appt0.getStartYear());
      assertEquals(-1217, appt0.getStartHour());
      assertEquals("\n", string0);
      assertEquals("\n", appt0.getDescription());
      assertEquals(12, appt0.getStartMinute());
      assertEquals(-1217, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt((-2497), (-2497), (-983), (-2497), 83, "@k_qtA1^@", "");
      int int0 = appt0.getStartDay();
      assertEquals(83, appt0.getStartYear());
      assertEquals((-983), int0);
      assertEquals(-2497, appt0.getStartMonth());
      assertEquals(-2497, appt0.getStartMinute());
      assertEquals("", appt0.getDescription());
      assertEquals("@k_qtA1^@", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(-2497, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt((-1167), 1759, 1759, (-1167), (-1167), "p@~HW=&P+3{4V>.U@Mt", "p@~HW=&P+3{4V>.U@Mt");
      boolean boolean0 = appt0.getValid();
      assertEquals(-1167, appt0.getStartHour());
      assertFalse(boolean0);
      assertEquals("p@~HW=&P+3{4V>.U@Mt", appt0.getTitle());
      assertEquals(-1167, appt0.getStartMonth());
      assertEquals(-1167, appt0.getStartYear());
      assertEquals("p@~HW=&P+3{4V>.U@Mt", appt0.getDescription());
      assertEquals(1759, appt0.getStartDay());
      assertEquals(1759, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt((-1773), (-1978), (-1978), (-1773), 1384, "", "");
      int int0 = appt0.getStartHour();
      assertEquals((-1773), int0);
      assertEquals(-1978, appt0.getStartMinute());
      assertEquals(-1978, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(-1773, appt0.getStartMonth());
      assertEquals(1384, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt((-1217), 12, (-1217), (-1217), 12, "\n", "\n");
      int int0 = appt0.getStartYear();
      assertEquals("\n", appt0.getDescription());
      assertEquals(-1217, appt0.getStartDay());
      assertEquals(12, appt0.getStartMinute());
      assertEquals("\n", appt0.getTitle());
      assertEquals(12, int0);
      assertEquals(-1217, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(-1217, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt((-1410), (-1410), (-1410), (-1410), (-1410), "%Y-%M-%DT%h:%m:%s%z", "%Y-%M-%DT%h:%m:%s%z");
      int int0 = appt0.getStartMinute();
      assertEquals(-1410, appt0.getStartMonth());
      assertEquals("%Y-%M-%DT%h:%m:%s%z", appt0.getDescription());
      assertEquals(-1410, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals((-1410), int0);
      assertEquals(-1410, appt0.getStartHour());
      assertEquals("%Y-%M-%DT%h:%m:%s%z", appt0.getTitle());
      assertEquals(-1410, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt((-1217), 12, (-1217), (-1217), 12, "\n", "\n");
      String string0 = appt0.getDescription();
      assertEquals(-1217, appt0.getStartMonth());
      assertEquals("\n", appt0.getTitle());
      assertEquals(-1217, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals("\n", string0);
      assertEquals(12, appt0.getStartYear());
      assertEquals(12, appt0.getStartMinute());
      assertEquals(-1217, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt((-1410), (-1410), (-1410), (-1410), (-1410), "%Y-%M-%DT%h:%m:%s%z", "%Y-%M-%DT%h:%m:%s%z");
      int int0 = appt0.getStartMonth();
      assertEquals("%Y-%M-%DT%h:%m:%s%z", appt0.getTitle());
      assertEquals(-1410, appt0.getStartDay());
      assertEquals(-1410, appt0.getStartMinute());
      assertEquals((-1410), int0);
      assertEquals("%Y-%M-%DT%h:%m:%s%z", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(-1410, appt0.getStartHour());
      assertEquals(-1410, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 11, 11, ":djvVd/", ":djvVd/");
      assertEquals(12, appt0.getStartHour());

      appt0.setStartHour(11);
      String string0 = appt0.toString();
      assertEquals("\t11/12/11 at 11:12am ,:djvVd/, :djvVd/\n", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(1, 11, 23, 72, 23, "", "\n");
      String string0 = appt0.toString();
      assertEquals(23, appt0.getStartYear());
      assertNull(string0);
      assertEquals(11, appt0.getStartMinute());
      assertEquals("\n", appt0.getDescription());
      assertEquals(1, appt0.getStartHour());
      assertEquals(23, appt0.getStartDay());
      assertEquals(72, appt0.getStartMonth());
      assertEquals("", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 1, 0, 786, (String) null, (String) null);
      appt0.setStartDay(556);
      appt0.setStartMonth((-872));
      assertEquals(556, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Appt appt0 = new Appt(0, 64, 0, 0, 64, (String) null, (String) null);
      assertEquals(64, appt0.getStartMinute());
      assertEquals(0, appt0.getStartDay());
      assertEquals(64, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, Integer.MIN_VALUE, Integer.MIN_VALUE, 0, "", "");
      appt0.setStartMinute(0);
      assertEquals(-2147483648, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(-2147483648, appt0.getStartMonth());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Appt appt0 = new Appt(14, 59, 14, 14, 59, (String) null, (String) null);
      assertEquals(14, appt0.getStartMonth());

      appt0.setStartMonth(59);
      assertEquals(14, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 11, 11, ":djvVd/", ":djvVd/");
      String string0 = appt0.toString();
      assertEquals("\t11/12/11 at 12:12pm ,:djvVd/, :djvVd/\n", string0);
      assertNotNull(string0);
  }
}