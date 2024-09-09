package de.hnu.eae;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import de.hnu.eae.data.Course;

public class TestCourse{
    private Course course = null;

    @Before
    public void setUp(){
        course = new Course(123, "Business Administration", "Description", "WS2023/2024");
    }
 
        @Test
    public void testGetName(){
       assertTrue("Business Administration".equals(course.getCourseName()));
    }

    @Test
    public void testSetName() {
        course.setCourseName("Business Administration 2");
        assertTrue("Business Administration 2".equals(course.getCourseName()));
    }
    
    @Test
    public void testGetDescription(){
       assertTrue("Description".equals(course.getCourseDescription()));
    }

    @Test
    public void testSetDescription() {
        course.setCourseDescription("Description");
        assertTrue("Description".equals(course.getCourseDescription()));
    }

    @Test
    public void testSetNameNull() {
        course.setCourseDescription(null);
        assertTrue(course.getCourseDescription() == null);
    }

    @Test
    public void testGetYear(){
       assertTrue("WS2023/2024".equals(course.getAcademicYear()));
    }

    @Test
    public void testSetYear() {
        course.setAcademicYear("Description");
        assertTrue("WS2023/2024".equals(course.getAcademicYear()));
    }

    @Test
    public void testSetYearNull() {
        course.setAcademicYear(null);
        assertTrue(course.getAcademicYear() == null);
    }
}