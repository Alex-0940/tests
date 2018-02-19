package simpleTask3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Task3Test {

	@Test
	public void testIsPalindrome() {
		// Тестирование некорректной строки для палиндрома.
		//
		//
		String t1 = "asdd";
		String t2 = "dfdfdddddd";
		String t3 = "d f d , , ,fdd dddd";
		String t4 = "d ,- sd---";
		//
		assertFalse(Task3.isPalindrome(t1));
		assertFalse(Task3.isPalindrome(t2));
		assertFalse(Task3.isPalindrome(t3));
		assertFalse(Task3.isPalindrome(t4));

		// Тестирование корректной строки.

		String t5 = "ssssssssss";
		String t6 = "milklim";
		String t7 = "peacecaep";
		String t8 = "Hello world ! dlrow olleH";
		String t9 = ".";
		String t10 = "...";
		String t11 = "";
		String t12 = " ";

		assertTrue(Task3.isPalindrome(t5));
		assertTrue(Task3.isPalindrome(t6));
		assertTrue(Task3.isPalindrome(t7));
		assertTrue(Task3.isPalindrome(t8));
		assertTrue(Task3.isPalindrome(t9));
		assertTrue(Task3.isPalindrome(t10));
		assertTrue(Task3.isPalindrome(t11));
		assertTrue(Task3.isPalindrome(t12));

	}

}
