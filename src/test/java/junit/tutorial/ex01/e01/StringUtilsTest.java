package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void testToSnakeCase1() {
		String result = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa",result,("aaa"));
	}
	
	@Test
	void testToSnakeCase2() {
		String result = StringUtils.toSnakeCase("HelloWorld");
		assertEquals(StringUtils.toSnakeCase("HelloWorld"), result,("Hello_world"));
	}
	
	@Test
	void testToSnakeCase3() {
		String result = StringUtils.toSnakeCase("practiceJunit");
		assertEquals(StringUtils.toSnakeCase("practiceJunit"), result,("practice_junit"));
	}

}



