package io.javabrains.springbootstarter;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestApiApp {

	
	@Test
	public void testCourseApi() {
		CourseApiApp courseApiApp = new CourseApiApp();
		assertTrue(courseApiApp instanceof CourseApiApp);
	}
	
}
