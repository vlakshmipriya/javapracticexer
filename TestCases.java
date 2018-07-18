package com.exertwo.test;

import java.io.*;

import com.exertwo.code.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class TestCases {

    private static Palindrome pal;
    private static MemberVariable memOb;
    private static GradeStudent grade;
    private static UpperCase uCase;
    private static ListFolders list;
    private static Occurance fact;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        pal = new Palindrome();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        pal = null;
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testCheckPalindrome() {
        assertEquals("testCheckPalindrome(),check number is palindrome or not "
                , 101, pal.checkPalindrome(101));

    }

    @Test
    public void testCheckPalindromeFailure() {
        assertNotEquals("testCheckPalindrome(),check number is palindrome or not "
                , 123, pal.checkPalindrome(101));
    }

    @Test
    public void testPowerOfFour() {
        assertEquals("testPowerOfFour(),check number is power of four or not "
                , 1, pal.powerOfFour(16));

    }

    @Test
    public void testPowerOfFourFailure() {
        assertNotEquals("testPowerOfFour(),check number is power of four or not "
                , 0, pal.powerOfFour(16));

    }

    @Test
    public void testIsEven() {
        assertEquals("testIsEven(),check number is even number or not "
                , true, pal.isEven(16));

    }

    @Test
    public void testIsEvenFailure() {
        assertNotEquals("testIsEven(),check number is even number or not "
                , false, pal.isEven(16));

    }

    @Test
    public void testDisplayProperties() {
        assertArrayEquals(new String[]{"Members name:Harry Potter", "member salary:2500.3", "member age:30"}, memOb.displayProperties(new String[]{"Members name:", "member salary:", "member age:"}));
    }

    @Test
    public void testDisplayPropertiesFailure() {
        assertNotEquals(new String[]{"Members name:Harry Potter", "member salary:2500.3", "member age:30"}, memOb.displayProperties(new String[]{"Members name:", "member salary:", "member age:"}));
    }
    @Test
    public void testAvgMinMax() {
        String[] expected = {"67.5", "65", "88"};
        int[] array = {60, 65, 88, 57};
        String[] actual = grade.findAvgMinMax(4, array);
        assertArrayEquals(expected, actual);


    }
    @Test
    public void testAvgMinMaxFailure() {
        String[] expected = {"67.5", "65", "88"};
        int[] array = {60, 65, 88, 57};
        String[] actual = grade.findAvgMinMax(4, array);
        assertNotEquals(expected, actual);

    }

   @Test
    public void testFact() {


        assertEquals("hdafadai", 479001600, pal.printIntFactorials(1, 1));
        assertEquals("hdafadaidha", 2432902008176640000L, pal.printLongFactorials(1, 1));
    }
    @Test
    public void testFactFailure() {


        assertNotEquals("hdafadaidha", 56778, pal.printIntFactorials(1, 1));
        assertNotEquals("hdafadaidha", 243290200L, pal.printLongFactorials(1, 1));
    }

    @Test
    public void testFileUpperLength() {
        String expect = "HELLOHIALL";
        assertEquals(expect, uCase.changeToUpper("/home/lakshmi/Desktop/priya/maha.txt"));
        assertEquals("11.0", uCase.Length("/home/lakshmi/Desktop/priya/maha.txt"));

    }
    @Test
    public void testFileFilter() {
        File folder = new File("/home/lakshmi/Desktop/javaexerp/");
        assertEquals("test1test2",list.listFilesForFolder(folder));

    }
    @SuppressWarnings("static-access")
    @Test
  public  void testMain() throws FileNotFoundException {
        assertEquals("{sleep=1, a=2, home.=1, like=1, have=1, i=3, man=1, to=1, am=1, ,=2}",fact.main(null));
    }
}

